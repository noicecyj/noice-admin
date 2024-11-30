package noice.handler.builder.controller.relation;

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
public class ControllerRelationMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerRelationSetBuilder extends ControllerRelationMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ControllerRelationSetServiceBuilder extends ControllerRelationMethodBuilder {

            public ControllerRelationSetServiceBuilder builder(PersistentPo persistentPo) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                this.setMethodStatement(StatementEnum.PUBLIC);
                this.setMethodReturnType("void");
                this.setMethodAnnotationList();
                this.setMethodName("setService");
                this.setMethodParamSet(poName);
                this.setMethodBody();
                return this;
            }

            public void setMethodParamSet(String poName) {
                List<String> methodParamSet = new ArrayList<>();
                methodParamSet.add(poName + "Service service");
                super.setMethodParamSet(methodParamSet);
            }

            public void setMethodBody() {
                List<String> methodBodyList = new ArrayList<>();
                methodBodyList.add("this.service = service;");
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
        public static class ControllerRelationSetConverterBuilder extends ControllerRelationMethodBuilder {

            public ControllerRelationSetConverterBuilder builder(PersistentPo persistentPo) {
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
                methodParamSet.add(poName + "ControllerConverter converter");
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
        public static class ControllerRelationSetAssemblerBuilder extends ControllerRelationMethodBuilder {

            public ControllerRelationSetAssemblerBuilder builder(PersistentPo persistentPo) {
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
                methodParamSet.add(poName + "ControllerAssembler assembler");
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
    public static class ControllerRelationSetMethodBuilder extends ControllerRelationMethodBuilder {

        public ControllerRelationSetMethodBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("set");
            this.setMethodBody();
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success();");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody List<String> ids");
            methodParamSet.add("@RequestBody List<" + poName + "Vo> voList");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_保存\")");
            methodAnnotationList.add("@PostMapping(value = \"set\")");
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        public void setMethodBody() {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("service.set(ids, converter.voListToDtoList(voList));");
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
            sb.append("        ").append(getMethodReturnBody()).append("\n");
            sb.append("    }");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerRelationGetMethodBuilder extends ControllerRelationMethodBuilder {

        public ControllerRelationGetMethodBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("get");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_查询\")");
            methodAnnotationList.add("@PostMapping(value = \"get\")");
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
