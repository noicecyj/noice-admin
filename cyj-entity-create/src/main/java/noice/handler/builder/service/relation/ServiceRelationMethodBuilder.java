package noice.handler.builder.service.relation;

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
public class ServiceRelationMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceRelationSetBuilder extends ServiceRelationMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ServiceRelationSetRepositoryBuilder extends ServiceRelationMethodBuilder {

            public ServiceRelationSetRepositoryBuilder builder(PersistentPo persistentPo) {
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
        public static class ServiceRelationSetConverterBuilder extends ServiceRelationMethodBuilder {

            public ServiceRelationSetConverterBuilder builder(PersistentPo persistentPo) {
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
        public static class ServiceRelationSetAssemblerBuilder extends ServiceRelationMethodBuilder {

            public ServiceRelationSetAssemblerBuilder builder(PersistentPo persistentPo) {
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

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceRelationSetMethodBuilder extends ServiceRelationMethodBuilder {

        public ServiceRelationSetMethodBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("void");
            this.setMethodAnnotationList();
            this.setMethodName("set");
            this.setMethodParamSet(poName);
            this.setMethodBody();
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<String> ids");
            methodParamSet.add("List<" + poName + "Dto> dtoList");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList() {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        public void setMethodBody() {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("ids.forEach(id -> repository.delete(id));");
            methodBodyList.add("dtoList.forEach(dto -> repository.add(converter.dtoToPo(dto)));");
            this.setMethodBody(methodBodyList);
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
    public static class ServiceRelationGetMethodBuilder extends ServiceRelationMethodBuilder {

        public ServiceRelationGetMethodBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType(poName + "Dto");
            this.setMethodAnnotationList();
            this.setMethodName("get");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return assembler.poToDto(repository.find(converter.dtoToPo(dto)));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add(poName + "Dto dto");
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
