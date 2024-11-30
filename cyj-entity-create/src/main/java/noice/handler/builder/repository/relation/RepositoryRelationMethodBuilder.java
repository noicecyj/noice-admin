package noice.handler.builder.repository.relation;

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
public class RepositoryRelationMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationSetBuilder extends RepositoryRelationMethodBuilder {

        public RepositoryRelationSetBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("void");
            this.setMethodAnnotationList();
            this.setMethodName("setMapper");
            this.setMethodParamSet(poName);
            this.setMethodBody();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Mapper mapper");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodBody() {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("this.mapper = mapper;");
            this.setMethodBody(methodBodyList);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Autowired");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String methodAnnotation : getMethodAnnotationList()) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            for (String methodBody : getMethodBody()) {
                sb.append("        ").append(methodBody).append("\n");
            }
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationAddBuilder extends RepositoryRelationMethodBuilder {

        public RepositoryRelationAddBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("int");
            this.setMethodAnnotationList();
            this.setMethodName("add");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return mapper.insert(po);");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Po po");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String methodAnnotation : getMethodAnnotationList()) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationDeleteBuilder extends RepositoryRelationMethodBuilder {

        public RepositoryRelationDeleteBuilder builder() {
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("int");
            this.setMethodAnnotationList();
            this.setMethodName("delete");
            this.setMethodParamSet();
            this.setMethodReturnBody("return mapper.deleteById(id);");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("String id");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String methodAnnotation : getMethodAnnotationList()) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationCountBuilder extends RepositoryRelationMethodBuilder {

        public RepositoryRelationCountBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("long");
            this.setMethodAnnotationList();
            this.setMethodName("count");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return mapper.selectCount(baseQueryWrapper);");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("QueryWrapper<" + poName + "Po> baseQueryWrapper");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String methodAnnotation : getMethodAnnotationList()) {
                sb.append("    ").append(methodAnnotation).append("\n");
            }
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationFindBuilder extends RepositoryRelationMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryRelationFindPoBuilder extends RepositoryRelationMethodBuilder {

            public RepositoryRelationFindPoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Po");
                this.setMethodAnnotationList();
                this.setMethodName("find");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody(persistentPropertyPoList);
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("@NotNull " + poName + "Po po");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            public void setMethodReturnBody(List<PersistentPropertyPo> persistentPropertyPoList) {
                List<String> methodParamSet = new ArrayList<>();
                for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
                    String propertyName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        methodParamSet.add("eq" + propertyName + "()");
                    }
                }
                super.setMethodReturnBody("return mapper.selectOne(po.eqId()." + String.join(".", methodParamSet) + ".getQueryWrapper());");
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (String methodAnnotation : getMethodAnnotationList()) {
                    sb.append("    ").append(methodAnnotation).append("\n");
                }
                sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryRelationFindWrapperBuilder extends RepositoryRelationMethodBuilder {

            public RepositoryRelationFindWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Po");
                this.setMethodAnnotationList();
                this.setMethodName("find");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("QueryWrapper<" + poName + "Po> queryWrapper");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            public void setMethodReturnBody() {
                super.setMethodReturnBody("return mapper.selectOne(queryWrapper);");
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (String methodAnnotation : getMethodAnnotationList()) {
                    sb.append("    ").append(methodAnnotation).append("\n");
                }
                sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryRelationFindListBuilder extends RepositoryRelationMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryRelationFindListPoBuilder extends RepositoryRelationMethodBuilder {

            public RepositoryRelationFindListPoBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody(persistentPropertyPoList);
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("@NotNull " + poName + "Po po");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            public void setMethodReturnBody(List<PersistentPropertyPo> persistentPropertyPoList) {
                List<String> methodParamSet = new ArrayList<>();
                for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
                    String propertyName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        methodParamSet.add("eq" + propertyName + "()");
                    }
                }
                super.setMethodReturnBody("return mapper.selectList(po.eqId()." + String.join(".", methodParamSet) + ".getQueryWrapper());");
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (String methodAnnotation : getMethodAnnotationList()) {
                    sb.append("    ").append(methodAnnotation).append("\n");
                }
                sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryRelationFindListWrapperBuilder extends RepositoryRelationMethodBuilder {

            public RepositoryRelationFindListWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("QueryWrapper<" + poName + "Po> queryWrapper");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            public void setMethodReturnBody() {
                super.setMethodReturnBody("return mapper.selectList(queryWrapper);");
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (String methodAnnotation : getMethodAnnotationList()) {
                    sb.append("    ").append(methodAnnotation).append("\n");
                }
                sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("(").append(String.join(", ", getMethodParamSet())).append(") {\n");
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

    }

}
