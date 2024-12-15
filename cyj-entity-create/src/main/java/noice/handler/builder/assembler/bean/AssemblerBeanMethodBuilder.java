package noice.handler.builder.assembler.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.MethodBase;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class AssemblerBeanMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poToDtoBuilder extends AssemblerBeanMethodBuilder {

        public PersistentRepository persistentRepository;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public poToDtoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setPersistentPropertyPoList(persistentPropertyPoList);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Dto");
            this.setMethodName("poToDto");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Po po");
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            if (CollUtil.isNotEmpty(getPersistentPropertyPoList())) {
                for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationBeanCode + "Po\", source = \"po." + relationBeanCode + "Id\")");
                    }
                }
            }
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<String> methodAnnotationList = getMethodAnnotationList();
            for (String methodAnnotation : methodAnnotationList) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(");");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poToOptionDtoBuilder extends AssemblerBeanMethodBuilder {

        public PersistentRepository persistentRepository;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public poToOptionDtoBuilder builder(PersistentPo persistentPo) {
            String underPoName = StrUtil.toCamelCase(persistentPo.getPersistentCode());
            String poName = StrUtil.upperFirst(underPoName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("OptionDTO<String>");
            this.setMethodName("poToOptionDto");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList(underPoName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Po po");
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String persistentCode) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Mapping(target = \"label\", source = \"po." + persistentCode + "Name\")");
            methodAnnotationList.add("@Mapping(target = \"value\", source = \"po.id\")");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<String> methodAnnotationList = getMethodAnnotationList();
            for (String methodAnnotation : methodAnnotationList) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(");");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poToDtoNtoNBuilder extends AssemblerBeanMethodBuilder {

        public PersistentRepository persistentRepository;

        private List<Map<String, PersistentPo>> poList;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public poToDtoNtoNBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.poList = poList;
            this.setPersistentPropertyPoList(persistentPropertyPoList);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Dto");
            this.setMethodName("poToDto");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Po po");
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                String poNtoNName = StrUtil.upperFirst(underNtoNPoName);
                methodParamSet.add("List<" + poNtoNName + "Po> " + underNtoNPoName + "PoList");
            }
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            if (CollUtil.isNotEmpty(getPersistentPropertyPoList())) {
                for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationBeanCode + "Po\", source = \"po." + relationBeanCode + "Id\")");
                    }
                }
            }
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                methodAnnotationList.add("@Mapping(target = \"" + underNtoNPoName + "PoList\", source = \"" + underNtoNPoName + "PoList\")");
            }
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<String> methodAnnotationList = getMethodAnnotationList();
            for (String methodAnnotation : methodAnnotationList) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(");");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poListToDtoListBuilder extends AssemblerBeanMethodBuilder {

        public poListToDtoListBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<" + poName + "Dto>");
            this.setMethodName("poListToDtoList");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<" + poName + "Po> poList");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poListToDtoOptionListBuilder extends AssemblerBeanMethodBuilder {

        public poListToDtoOptionListBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<OptionDTO<String>>");
            this.setMethodName("poListToDtoOptionList");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<" + poName + "Po> poList");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poSetToDtoSetBuilder extends AssemblerBeanMethodBuilder {

        public poSetToDtoSetBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("Set<" + poName + "Dto>");
            this.setMethodName("poSetToDtoSet");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("Set<" + poName + "Po> poSet");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class dtoToVoBuilder extends AssemblerBeanMethodBuilder {

        public PersistentRepository persistentRepository;

        private List<Map<String, PersistentPo>> poList;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public dtoToVoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.poList = poList;
            this.setPersistentPropertyPoList(persistentPropertyPoList);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Vo");
            this.setMethodName("dtoToVo");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Dto dto");
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            if (CollUtil.isNotEmpty(getPersistentPropertyPoList())) {
                for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationBeanCode + "Dto\", source = \"dto." + relationBeanCode + "Po\")");
                    }
                }
            }
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                methodAnnotationList.add("@Mapping(target = \"" + underNtoNPoName + "DtoList\", source = \"dto." + underNtoNPoName + "PoList\")");
            }
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<String> methodAnnotationList = getMethodAnnotationList();
            for (String methodAnnotation : methodAnnotationList) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(");");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class dtoToVoNtoNBuilder extends AssemblerBeanMethodBuilder {

        public PersistentRepository persistentRepository;

        private List<Map<String, PersistentPo>> poList;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public dtoToVoNtoNBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.poList = poList;
            this.setPersistentPropertyPoList(persistentPropertyPoList);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Vo");
            this.setMethodName("dtoToVo");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Dto dto");
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                String poNtoNName = StrUtil.upperFirst(underNtoNPoName);
                methodParamSet.add("List<" + poNtoNName + "Dto> " + underNtoNPoName + "DtoList");
            }
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            if (CollUtil.isNotEmpty(getPersistentPropertyPoList())) {
                for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationBeanCode + "Dto\", source = \"dto." + relationBeanCode + "Po\")");
                    }
                }
            }
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                methodAnnotationList.add("@Mapping(target = \"" + underNtoNPoName + "DtoList\", source = \"" + underNtoNPoName + "DtoList\")");
            }
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<String> methodAnnotationList = getMethodAnnotationList();
            for (String methodAnnotation : methodAnnotationList) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(");");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class dtoListToVoListBuilder extends AssemblerBeanMethodBuilder {

        public dtoListToVoListBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<" + poName + "Vo>");
            this.setMethodName("dtoListToVoList");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<" + poName + "Dto> dtoList");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class dtoSetToVoSetBuilder extends AssemblerBeanMethodBuilder {

        public dtoSetToVoSetBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("Set<" + poName + "Vo>");
            this.setMethodName("dtoSetToVoSet");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("Set<" + poName + "Dto> dtoList");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

}
