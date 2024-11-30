package noice.handler.builder.converter.relation;

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
public class ConverterRelationMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class dtoToPoBuilder extends ConverterRelationMethodBuilder {

        public PersistentRepository persistentRepository;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public dtoToPoBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("dtoToPo");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Dto dto");
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
    public static class dtoListToPoListBuilder extends ConverterRelationMethodBuilder {

        public dtoListToPoListBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<" + poName + "Po>");
            this.setMethodName("dtoListToPoList");
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
    public static class dtoSetToPoSetBuilder extends ConverterRelationMethodBuilder {

        public dtoSetToPoSetBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("Set<" + poName + "Po>");
            this.setMethodName("dtoSetToPoSet");
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

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class voToDtoBuilder extends ConverterRelationMethodBuilder {

        public PersistentRepository persistentRepository;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        public voToDtoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setPersistentPropertyPoList(persistentPropertyPoList);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Dto");
            this.setMethodName("voToDto");
            this.setMethodParamSet(poName);
            this.setMethodAnnotationList();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Vo vo");
            this.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            if (CollUtil.isNotEmpty(getPersistentPropertyPoList())) {
                for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
                        methodAnnotationList.add("@Mapping(target = \"" + relationBeanCode + "Po\", source = \"vo." + relationBeanCode + "Id\")");
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
    public static class voListToDtoListBuilder extends ConverterRelationMethodBuilder {

        public voListToDtoListBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<" + poName + "Dto>");
            this.setMethodName("voListToDtoList");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<" + poName + "Vo> voList");
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
    public static class voSetToDtoSetBuilder extends ConverterRelationMethodBuilder {

        public voSetToDtoSetBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("Set<" + poName + "Dto>");
            this.setMethodName("voSetToDtoSet");
            this.setMethodParamSet(poName);
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("Set<" + poName + "Vo> voSet");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ");";
        }

    }

}
