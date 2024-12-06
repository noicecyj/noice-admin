package noice.handler.builder.controller.bean;

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
public class ControllerBeanMethodBuilder extends MethodBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

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

    @NotNull
    private static String getString(List<String> methodAnnotationList, StatementEnum methodStatement, String methodReturnType, String methodName, List<String> methodParamSet, List<String> methodBody) {
        StringBuilder sb = new StringBuilder();
        for (String methodAnnotation : methodAnnotationList) {
            sb.append("    ").append(methodAnnotation).append("\n");
        }
        sb.append("    ").append(methodStatement.getStatement()).append(" ").append(methodReturnType).append(" ").append(methodName).append("(").append(String.join(", ", methodParamSet)).append(") {\n");
        for (String body : methodBody) {
            sb.append("        ").append(body).append("\n");
        }
        sb.append("    }");
        return sb.toString();
    }

    @NotNull
    private static String getString(List<String> methodAnnotationList, StatementEnum methodStatement, String methodReturnType, String methodName, List<String> methodParamSet, String methodReturnBody, List<String> methodBody) {
        StringBuilder sb = new StringBuilder();
        for (String methodAnnotation : methodAnnotationList) {
            sb.append("    ").append(methodAnnotation).append("\n");
        }
        sb.append("    ").append(methodStatement.getStatement()).append(" ").append(methodReturnType).append(" ").append(methodName).append("(").append(String.join(", ", methodParamSet)).append(") {\n");
        for (String body : methodBody) {
            sb.append("        ").append(body).append("\n");
        }
        sb.append("        ").append(methodReturnBody).append("\n");
        sb.append("    }");
        return sb.toString();
    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerBeanSetBuilder extends ControllerBeanMethodBuilder {

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ControllerBeanSetServiceBuilder extends ControllerBeanMethodBuilder {

            public ControllerBeanSetServiceBuilder builder(PersistentPo persistentPo) {
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ControllerBeanSetConverterBuilder extends ControllerBeanMethodBuilder {

            public ControllerBeanSetConverterBuilder builder(PersistentPo persistentPo) {
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodBody());
            }

        }

        @EqualsAndHashCode(callSuper = true)
        @Component
        @Data
        public static class ControllerBeanSetAssemblerBuilder extends ControllerBeanMethodBuilder {

            public ControllerBeanSetAssemblerBuilder builder(PersistentPo persistentPo) {
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
                return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodBody());
            }

        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerBeanAddBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanAddBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("add");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success(service.addOne(converter.voToDto(vo)));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_添加\")");
            methodAnnotationList.add("@PostMapping(value = \"add\")");
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
    public static class ControllerBeanDeleteBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanDeleteBuilder builder(PersistentPo persistentPo) {
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("delete");
            this.setMethodParamSet();
            this.setMethodReturnBody("return ResultVO.success(service.deleteOne(id));");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("String id");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_删除\")");
            methodAnnotationList.add("@PostMapping(value = \"delete\")");
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
    public static class ControllerBeanUpdateBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanUpdateBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("update");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success(service.updateOne(converter.voToDto(vo)));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_更新\")");
            methodAnnotationList.add("@PostMapping(value = \"update\")");
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
    public static class ControllerBeanFindBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanFindBuilder builder(PersistentPo persistentPo) {
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("get");
            this.setMethodParamSet();
            this.setMethodReturnBody("return ResultVO.success(assembler.dtoToVo(service.findOne(id)));");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("String id");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_id查询\")");
            methodAnnotationList.add("@PostMapping(value = \"get\")");
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
    public static class ControllerBeanFindListBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanFindListBuilder builder(PersistentPo persistentPo) {
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("getList");
            this.setMethodParamSet();
            this.setMethodReturnBody("return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<String> ids");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_ids查询\")");
            methodAnnotationList.add("@PostMapping(value = \"getList\")");
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
    public static class ControllerBeanFindPageBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanFindPageBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("page");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_分页查询所有\")");
            methodAnnotationList.add("@PostMapping(value = \"page\")");
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
    public static class ControllerBeanFindRelationBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanFindRelationBuilder builder(PersistentPo NtoNPersistentPo) {
            String NtoNPoName = StrUtil.upperFirst(StrUtil.toCamelCase(NtoNPersistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(NtoNPoName);
            this.setMethodName("getListBy" + NtoNPoName + "Ids");
            this.setMethodParamSet();
            this.setMethodReturnBody("return ResultVO.success(assembler.dtoListToVoList(service.findListBy" + NtoNPoName + "Ids(ids)));");
            return this;
        }

        public void setMethodParamSet() {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("List<String> ids");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String NtoNPoName) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + NtoNPoName + "Ids查询\")");
            methodAnnotationList.add("@PostMapping(value = \"getListBy" + NtoNPoName + "Ids\")");
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
    public static class ControllerBeanValueEnumBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanValueEnumBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("getValueEnum");
            this.setMethodParamSet(poName);
            this.setMethodReturnBody("return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(" + poName + "Vo::getId, option -> Collections.singletonMap(\"text\", option.get" + poName + "Name()))));");
            return this;
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_获取ValueEnum\")");
            methodAnnotationList.add("@PostMapping(value = \"getValueEnum\")");
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
    public static class ControllerBeanOptionsBuilder extends ControllerBeanMethodBuilder {

        public ControllerBeanOptionsBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setMethodStatement(StatementEnum.PUBLIC);
            this.setMethodReturnType("ResultVO");
            this.setMethodAnnotationList(persistentPo.getPersistentName());
            this.setMethodName("getOptions");
            this.setMethodParamSet(poName);
            this.setMethodBody(poName);
            this.setMethodReturnBody("return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.get" + poName + "Name()).value(valueEnum.getId()).build()).toList()));");
            return this;
        }

        public void setMethodBody(String poName) {
            List<String> methodBodyList = new ArrayList<>();
            methodBodyList.add("IPage<" + poName + "Vo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));");
            this.setMethodBody(methodBodyList);
        }

        public void setMethodParamSet(String poName) {
            List<String> methodParamSet = new ArrayList<>();
            methodParamSet.add("@RequestBody " + poName + "Vo vo");
            super.setMethodParamSet(methodParamSet);
        }

        public void setMethodAnnotationList(String name) {
            List<String> methodAnnotationList = new ArrayList<>();
            methodAnnotationList.add("@Operation(summary = \"" + name + "_获取Options\")");
            methodAnnotationList.add("@PostMapping(value = \"getOptions\")");
            methodAnnotationList.add("@Override");
            super.setMethodAnnotationList(methodAnnotationList);
        }

        @Override
        public String toString() {
            return getString(getMethodAnnotationList(), getMethodStatement(), getMethodReturnType(), getMethodName(), getMethodParamSet(), getMethodReturnBody(), getMethodBody());
        }

    }

}
