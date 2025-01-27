package noice.handler.builder.service.bean;

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
public class ServiceBeanMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanSetBuilder extends ServiceBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ServiceBeanSetRepositoryBuilder extends ServiceBeanSetBuilder {

            public ServiceBeanSetRepositoryBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("void");
                this.setMethodAnnotationList();
                this.setMethodName("setRepository");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add(poName + "Repository repository");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("this.repository = repository;");
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
        public static class ServiceBeanSetConverterBuilder extends ServiceBeanSetBuilder {

            public ServiceBeanSetConverterBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("void");
                this.setMethodAnnotationList();
                this.setMethodName("setConverter");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add(poName + "ServiceConverter converter");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("this.converter = converter;");
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
        public static class ServiceBeanSetAssemblerBuilder extends ServiceBeanSetBuilder {

            public ServiceBeanSetAssemblerBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("void");
                this.setMethodAnnotationList();
                this.setMethodName("setAssembler");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add(poName + "ServiceAssembler assembler");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("this.assembler = assembler;");
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
        public static class ServiceRelationSetRepositoryBuilder extends ServiceBeanSetBuilder {

            public ServiceRelationSetRepositoryBuilder builder(PersistentPo persistentPo) {
                String underPoName = StrUtil.toCamelCase(persistentPo.getPersistentCode());
                String poName = StrUtil.upperFirst(underPoName);
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("void");
                this.setMethodAnnotationList();
                this.setMethodName("set" + poName + "Repository");
                this.setMethodParamSet(poName, underPoName);
                this.setMethodBody(underPoName);
                return this;
            }

            public void setMethodParamSet(String poName, String underPoName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add(poName + "Repository " + underPoName + "Repository");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody(String underPoName) {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("this." + underPoName + "Repository = " + underPoName + "Repository;");
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

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanAddBuilder extends ServiceBeanMethodBuilder {

        public ServiceBeanAddBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("String");
            this.setMethodAnnotationList();
            this.setMethodName("addOne");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return repository.add(converter.dtoToPo(dto));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@NotNull " + poName + "Dto dto");
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
    public static class ServiceBeanDeleteBuilder extends ServiceBeanMethodBuilder {

        private List<PersistentPo> OtoN;

        public ServiceBeanDeleteBuilder builder(PersistentPo persistentPo, List<PersistentPo> OtoN) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.OtoN = OtoN;
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("String");
            this.setMethodAnnotationList();
            this.setMethodBody(poName);
            this.setMethodName("deleteOne");
            this.setMethodParamSet();
            this.setMethodReturnBody("return repository.delete(id);");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("String id");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodBody(String poName) {
            List<String> methodBodyList = new ArrayList<>();
            for (PersistentPo one : OtoN) {
                String underOnePoName = StrUtil.toCamelCase(one.getPersistentCode());
                String onePoName = StrUtil.upperFirst(underOnePoName);
                methodBodyList.add(underOnePoName + "Repository.findList(new " + onePoName + "Po().eq" + poName + "Id(id).getQueryWrapper()).forEach(po -> " + underOnePoName + "Repository.update(po.eq" + poName + "Id(null)));");
            }
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
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanUpdateBuilder extends ServiceBeanMethodBuilder {

        public ServiceBeanUpdateBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("int");
            this.setMethodAnnotationList();
            this.setMethodName("updateOne");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return repository.update(converter.dtoToPo(dto));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@NotNull " + poName + "Dto dto");
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
    public static class ServiceBeanFindOneBuilder extends ServiceBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ServiceBeanFindOneByIdBuilder extends ServiceBeanMethodBuilder {

            public ServiceBeanFindOneByIdBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Dto");
                this.setMethodAnnotationList();
                this.setMethodName("findOne");
                this.setMethodParamSet();
                this.setMethodReturnBody("return assembler.poToDto(repository.find(id));");
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
        public static class ServiceBeanFindOneByConditionBuilder extends ServiceBeanMethodBuilder {

            public ServiceBeanFindOneByConditionBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType(poName + "Dto");
                this.setMethodAnnotationList();
                this.setMethodName("findOne");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("@NotNull " + poName + "Dto dto");
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

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanFindListBuilder extends ServiceBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ServiceBeanFindListByIdsBuilder extends ServiceBeanMethodBuilder {

            public ServiceBeanFindListByIdsBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Dto>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet();
                this.setMethodReturnBody("return assembler.poListToDtoList(repository.findList(ids));");
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
        public static class ServiceBeanFindListByConditionBuilder extends ServiceBeanMethodBuilder {

            public ServiceBeanFindListByConditionBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("List<" + poName + "Dto>");
                this.setMethodAnnotationList();
                this.setMethodName("findList");
                this.setMethodParamSet(poName);
                this.setMethodReturnBody("return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));");
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add("@NotNull " + poName + "Dto dto");
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

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanFindPageBuilder extends ServiceBeanMethodBuilder {

        public ServiceBeanFindPageBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("IPage<" + poName + "Dto>");
            this.setMethodName("findPage");
            this.setMethodAnnotationList();
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@NotNull " + poName + "Dto dto");
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
    public static class ServiceBeanFindRelationBuilder extends ServiceBeanMethodBuilder {

        public ServiceBeanFindRelationBuilder builder(PersistentPo persistentPo, PersistentPo NtoNPersistentPo, PersistentPo relationPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            String NtoNPoName = StrUtil.upperFirst(StrUtil.toCamelCase(NtoNPersistentPo.getPersistentCode()));
            String underRelationPoName = StrUtil.toCamelCase(relationPo.getPersistentCode());
            String relationPoName = StrUtil.upperFirst(underRelationPoName);
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<" + poName + "Dto>");
            this.setMethodName("findListBy" + NtoNPoName + "Ids");
            this.setMethodParamSet();
            this.setMethodReturnBody("return assembler.poListToDtoList(repository.findList(" + underRelationPoName + "Repository.findList(new " + relationPoName + "Po().in" + NtoNPoName + "Id(ids)).stream().map(" + relationPoName + "Po::get" + poName + "Id).toList()));");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<String> ids");
            super.setMethodParamSet(methodParamSet);
        }

        @Override
        public String toString() {
            return "    " + getMethodStatement().getStatement() + " " + getMethodReturnType() + " " + getMethodName() + "(" + String.join(", ", getMethodParamSet()) + ") {\n" +
                    "        " + getMethodReturnBody() + "\n" +
                    "    }";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanGetOptionsBuilder extends ServiceBeanMethodBuilder {

        public ServiceBeanGetOptionsBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("List<OptionDTO<String>>");
            this.setMethodName("getOptions");
            this.setMethodAnnotationList();
            this.setMethodReturnBody("return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new " + poName + "Dto()).getQueryWrapper()));");
            return this;
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
            sb.append("    ").append(getMethodStatement().getStatement()).append(" ").append(getMethodReturnType()).append(" ").append(getMethodName()).append("() {\n");
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

}
