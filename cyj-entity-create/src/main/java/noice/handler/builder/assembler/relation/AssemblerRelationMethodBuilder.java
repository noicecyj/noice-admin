package noice.handler.builder.assembler.relation;

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

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class AssemblerRelationMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class poToDtoBuilder extends AssemblerRelationMethodBuilder {

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
                        String relationRelationCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationRelationCode + "Po\", source = \"po." + relationRelationCode + "Id\")");
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
    public static class poListToDtoListBuilder extends AssemblerRelationMethodBuilder {

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
    public static class poSetToDtoSetBuilder extends AssemblerRelationMethodBuilder {

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
    public static class dtoToVoBuilder extends AssemblerRelationMethodBuilder {

        public PersistentRepository persistentRepository;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public dtoToVoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
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
                        String relationRelationCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationRelationCode + "Dto\", source = \"dto." + relationRelationCode + "Po\")");
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
    public static class dtoListToVoListBuilder extends AssemblerRelationMethodBuilder {

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
    public static class dtoSetToVoSetBuilder extends AssemblerRelationMethodBuilder {

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
            methodParamSet.add("Set<" + poName + "Dto> dtoSet");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

}
