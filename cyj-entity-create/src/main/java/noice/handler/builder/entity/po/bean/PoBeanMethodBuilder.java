package noice.handler.builder.entity.po.bean;

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
public class PoBeanMethodBuilder extends MethodBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class PoBeanEqBuilder extends PoBeanMethodBuilder {

        public PoBeanEqBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
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
                case "String" ->
                        "this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
                default ->
                        "this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
            };
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add(methodBody);
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanLikeBuilder extends PoBeanMethodBuilder {

        public PoBeanLikeBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("like" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName);
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().like(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());");
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanEqSetBuilder extends PoBeanMethodBuilder {

        public PoBeanEqSetBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
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
                case "String" ->
                        "this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
                default ->
                        "this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());";
            };
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.set" + propertyName + "(value);");
            methodBodyList.add(methodBody);
            this.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet(String persistentPropertyType) {
            String methodParam = switch (persistentPropertyType) {
                case "boolean" -> "boolean value";
                case "Boolean" -> "Boolean value";
                case "long" -> "long value";
                case "Long" -> "Long value";
                case "int" -> "int value";
                default -> "String value";
            };
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(methodParam);
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
    public static class PoBeanLikeSetBuilder extends PoBeanMethodBuilder {

        public PoBeanLikeSetBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("like" + propertyName);
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName);
            this.setMethodParamSet();
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.set" + propertyName + "(value);");
            methodBodyList.add("this.queryWrapper.lambda().like(StrUtil.isNotEmpty(get" + propertyName + "()), " + poName + "Po::get" + propertyName + ", get" + propertyName + "());");
            this.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("String value");
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
    public static class PoBeanInBuilder extends PoBeanMethodBuilder {

        public PoBeanInBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
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
    public static class PoBeanOrderByBuilder extends PoBeanMethodBuilder {

        public PoBeanOrderByBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
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
            this.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("boolean isAsc");
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
    public static class PoBeanOrderByAscBuilder extends PoBeanMethodBuilder {

        public PoBeanOrderByAscBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("orderBy" + propertyName + "Asc");
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName);
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().orderBy(true, true, " + poName + "Po::get" + propertyName + ");");
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanOrderByDescBuilder extends PoBeanMethodBuilder {

        public PoBeanOrderByDescBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String underPropertyName = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
            String propertyName = StrUtil.upperFirst(underPropertyName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("orderBy" + propertyName + "Desc");
            this.setMethodReturnBody("return this;");
            this.setMethodBody(poName, propertyName);
            return this;
        }

        public void setMethodBody(String poName, String propertyName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.queryWrapper.lambda().orderBy(true, false, " + poName + "Po::get" + propertyName + ");");
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanBaseBuilder extends PoBeanMethodBuilder {

        public PoBeanBaseBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("baseQueryWrapper");
            this.setMethodReturnBody(persistentPropertyPoList);
            return this;
        }

        public void setMethodReturnBody(List<PersistentPropertyPo> persistentPropertyPoList) {
            List<String> methodParamSet = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList.stream()
                    .filter(persistentPropertyPo -> StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())).toList()) {
                String propertyName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
                methodParamSet.add("orderBy" + propertyName + "()");
            }
            this.setMethodReturnBody("return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode()." + String.join(".", methodParamSet) + ".orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);");
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
    public static class PoBeanSelectBuilder extends PoBeanMethodBuilder {

        public PoBeanSelectBuilder builder(PersistentPo persistentPo, PersistentPropertyPo persistentPropertyPo) {
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
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanOrBuilder extends PoBeanMethodBuilder {

        public PoBeanOrBuilder builder(PersistentPo persistentPo) {
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
            this.setMethodBody(methodBodyList);
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
    public static class PoBeanEqAutoBuilder extends PoBeanMethodBuilder {

        public PoBeanEqAutoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("eqAuto");
            this.setMethodReturnBody(persistentPropertyPoList);
            return this;
        }

        public void setMethodReturnBody(List<PersistentPropertyPo> persistentPropertyPoList) {
            List<String> methodParamSet = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
                String propertyName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
                methodParamSet.add("eq" + propertyName + "()");
            }
            super.setMethodReturnBody("return this." + String.join(".", methodParamSet) + ";");
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
    public static class PoBeanLikeAutoBuilder extends PoBeanMethodBuilder {

        public PoBeanLikeAutoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Po");
            this.setMethodName("likeAuto");
            this.setMethodReturnBody(persistentPropertyPoList);
            return this;
        }

        public void setMethodReturnBody(List<PersistentPropertyPo> persistentPropertyPoList) {
            List<String> methodParamSet = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
                String propertyName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
                if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                    methodParamSet.add("eq" + propertyName + "()");
                } else {
                    if ("String".equals(persistentPropertyPo.getPersistentPropertyType())) {
                        methodParamSet.add("like" + propertyName + "()");
                    }
                }
            }
            super.setMethodReturnBody("return this." + String.join(".", methodParamSet) + ";");
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
    public static class PoBeanOrConditionBuilder extends PoBeanMethodBuilder {

        public PoBeanOrConditionBuilder builder(PersistentPo persistentPo) {
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
