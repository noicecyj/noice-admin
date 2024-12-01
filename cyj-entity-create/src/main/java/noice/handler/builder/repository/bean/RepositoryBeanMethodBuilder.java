package noice.handler.builder.repository.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.MethodBase;
import noice.handler.base.enumType.StatementEnum;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class RepositoryBeanMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanSetBuilder extends RepositoryBeanMethodBuilder {

        public RepositoryBeanSetBuilder builder(PersistentPo persistentPo) {
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
    public static class RepositoryBeanAddBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanAddOneBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanAddOneBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("add");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanAddBatchBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanAddBatchBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("addBatch");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                this.setMethodReturnBody("return mapper.insert(poList, 100).size();");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("List<" + poName + "Po> poList");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));\n");
                this.setMethodBody(methodBodyList);
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
                for (String methodBody : getMethodBody()) {
                    sb.append("        ").append(methodBody).append("\n");
                }
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

    }


    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanDeleteBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanDeleteByIdBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanDeleteByIdBuilder builder() {
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanDeleteWrapperBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanDeleteWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("delete");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.delete(baseQueryWrapper);");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanDeleteByIdsBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanDeleteByIdsBuilder builder() {
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("deleteBatch");
                this.setMethodParamSet();
                this.setMethodReturnBody("return mapper.deleteByIds(ids);");
                return this;
            }

            public void setMethodParamSet() {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("List<String> ids");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            @Override
            public String toString() {
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanCountBuilder extends RepositoryBeanMethodBuilder {

        public RepositoryBeanCountBuilder builder(PersistentPo persistentPo) {
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
            return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanUpdateBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanUpdateOneBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanUpdateOneBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("update");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanUpdateAndAddBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanUpdateAndAddBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("boolean");
                this.setMethodAnnotationList();
                this.setMethodName("insertOrUpdate");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanUpdateBatchBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanUpdateBatchBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("int");
                this.setMethodAnnotationList();
                this.setMethodName("updateBatch");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                this.setMethodReturnBody("return mapper.updateById(poList, 100).size();");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("List<" + poName + "Po> poList");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));\n");
                this.setMethodBody(methodBodyList);
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
                for (String methodBody : getMethodBody()) {
                    sb.append("        ").append(methodBody).append("\n");
                }
                sb.append("        ").append(getMethodReturnBody()).append("\n");
                sb.append("    }");
                return sb.toString();
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanFindBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindIdBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanFindIdBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Po");
                this.setMethodAnnotationList();
                this.setMethodName("find");
                this.setMethodParamSet();
                this.setMethodReturnBody("return mapper.selectById(id);");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindWrapperBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanFindWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Po");
                this.setMethodAnnotationList();
                this.setMethodName("find");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.selectOne(baseQueryWrapper);");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanFindListBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindListIdsBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanFindListIdsBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet();
                this.setMethodReturnBody("return mapper.selectByIds(ids);");
                return this;
            }

            public void setMethodParamSet() {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("List<String> ids");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            @Override
            public String toString() {
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindListWrapperBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanFindListWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.selectList(baseQueryWrapper);");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class RepositoryBeanFindPageBuilder extends RepositoryBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindPageWrapperBuilder extends RepositoryBeanMethodBuilder {

            public RepositoryBeanFindPageWrapperBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("IPage<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findPage");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return mapper.selectPage(page, baseQueryWrapper);");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("IPage<" + poName + "Po> page");
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class RepositoryBeanFindPagePoBuilder extends RepositoryBeanMethodBuilder {


            public RepositoryBeanFindPagePoBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("IPage<" + poName + "Po>");
                this.setMethodAnnotationList();
                this.setMethodName("findPage");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("IPage<" + poName + "Po> page");
                methodParamSet.add("@NotNull " + poName + "Po po");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodAnnotationList() {
                List<String> methodAnnotationList = new ArrayList<>();
                methodAnnotationList.add("@Override");
                super.setMethodAnnotationList(methodAnnotationList);
            }

            @Override
            public String toString() {
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody());
            }

        }

    }

    @NotNull
    private static String getString(List<String> methodAnnotationList, StatementEnum methodStatement, String methodReturnType, String methodName, List<String> methodParamSet, String methodReturnBody) {
        StringBuilder sb = new StringBuilder();
        for (String methodAnnotation : methodAnnotationList) {
            sb.append("    ").append(methodAnnotation).append("\n");
        }
        sb.append("    ").append(methodStatement.getStatement()).append(" ").append(methodReturnType).append(" ").append(methodName).append("(").append(String.join(", ", methodParamSet)).append(") {\n");
        sb.append("        ").append(methodReturnBody).append("\n");
        sb.append("    }");
        return sb.toString();
    }

}
