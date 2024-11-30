package noice.handler.builder.entity.po.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.MethodBase;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class PoRelationMethodBuilder extends MethodBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationEqBuilder extends PoRelationMethodBuilder {

        public PoRelationEqBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            String persistentPropertyType = persistentPropertyPo.getPersistentPropertyType();
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("eq" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName, persistentPropertyType);
            return this;
        }

        public void setMethodBody(String poName, String propertyName, String persistentPropertyType) {
            String methodBody = switch (persistentPropertyType) {
                case "boolean" ->
                        "this.queryWrapper.lambda().eq(" + poName + "Po::is" + propertyName + ", is" + propertyName + "());";
                case "long", "int" ->
                        "this.queryWrapper.lambda().eq(" + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
                default ->
                        "this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
            };
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add(methodBody);
            super.setMethodBody(methodBodyList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("() {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationEqSetBuilder extends PoRelationMethodBuilder {

        public PoRelationEqSetBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            String persistentPropertyType = persistentPropertyPo.getPersistentPropertyType();
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("eq" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName, persistentPropertyType);
            this.setMethodParamSet(persistentPropertyType);
            return this;
        }

        public void setMethodBody(String poName, String propertyName, String persistentPropertyType) {
            String methodBody = switch (persistentPropertyType) {
                case "boolean" ->
                        "this.queryWrapper.lambda().eq(" + poName + "Po::is" + propertyName + ", is" + propertyName + "());";
                case "long", "int" ->
                        "this.queryWrapper.lambda().eq(" + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
                default ->
                        "this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
            };
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.set" + propertyName + "(value);");
            methodBodyList.add(methodBody);
            super.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet(String persistentPropertyType) {
            String methodParam = switch (persistentPropertyType) {
                case "boolean" -> "boolean value";
                case "long" -> "long value";
                case "int" -> "int value";
                default -> "String value";
            };
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(methodParam);
            super.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationInBuilder extends PoRelationMethodBuilder {

        public PoRelationInBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("in" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName);
            this.setMethodParamSet();
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), " + poName + "Po::get" + propertyName + ", valueList);");
            this.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<String> valueList");
            this.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationOrderByBuilder extends PoRelationMethodBuilder {

        public PoRelationOrderByBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("orderBy" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodParamSet();
            this.setMethodBody(poName, propertyName);
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().orderBy(true, isAsc, " + poName + "Po::get" + propertyName + ");");
            super.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("boolean isAsc");
            super.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationBaseBuilder extends PoRelationMethodBuilder {

        public PoRelationBaseBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("baseQueryWrapper");
            this.setMethodReturnBody("return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);");
            return this;
        }

        @Override
        public String toString() {
            return "    " + getMethodStatement().getStatement() + " " + getMethodReturnType() + " " + getMethodName() + "() {\n" +
                    "        " + getMethodReturnBody() + "\n" +
                    "    }";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationSelectBuilder extends PoRelationMethodBuilder {

        public PoRelationSelectBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            String persistentPropertyType = persistentPropertyPo.getPersistentPropertyType();
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("select" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName, persistentPropertyType);
            return this;
        }

        public void setMethodBody(String poName, String propertyName, String persistentPropertyType) {
            String methodBody;
            if ("boolean".equals(persistentPropertyType)) {
                methodBody = "this.queryWrapper.lambda().select(" + poName + "Po::is" + propertyName + ");";
            } else {
                methodBody = "this.queryWrapper.lambda().select(" + poName + "Po::get" + propertyName + ");";
            }
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add(methodBody);
            super.setMethodBody(methodBodyList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("() {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationOrBuilder extends PoRelationMethodBuilder {

        public PoRelationOrBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("or");
            this.setMethodReturnBody("return this;");
            this.setMethodBody();
            return this;
        }

        public void setMethodBody() {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().or();");
            super.setMethodBody(methodBodyList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("() {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoRelationOrConditionBuilder extends PoRelationMethodBuilder {

        public PoRelationOrConditionBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("or");
            this.setMethodParamSet();
            this.setMethodReturnBody("return this;");
            this.setMethodBody();
            return this;
        }

        public void setMethodBody() {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().or(condition);");
            super.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("boolean condition");
            super.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

}
