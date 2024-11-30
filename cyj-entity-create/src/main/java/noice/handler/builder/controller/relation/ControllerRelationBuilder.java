package noice.handler.builder.controller.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AppServicePo;
import noice.entity.po.bean.PersistentPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class ControllerRelationBuilder extends ClassBase {

    private PersistentPo persistentPo;

    private ControllerRelationFieldBuilder.ControllerRelationFieldServiceBuilder controllerRelationFieldServiceBuilder;

    private ControllerRelationFieldBuilder.ControllerRelationFieldConverterBuilder controllerRelationFieldConverterBuilder;

    private ControllerRelationFieldBuilder.ControllerRelationFieldAssemblerBuilder controllerRelationFieldAssemblerBuilder;

    private ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetServiceBuilder controllerRelationSetServiceBuilder;

    private ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetConverterBuilder controllerRelationSetConverterBuilder;

    private ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetAssemblerBuilder controllerRelationSetAssemblerBuilder;

    private ControllerRelationMethodBuilder.ControllerRelationSetMethodBuilder controllerRelationSetMethodBuilder;

    private ControllerRelationMethodBuilder.ControllerRelationGetMethodBuilder controllerRelationGetMethodBuilder;

    @Autowired
    public void setControllerRelationFieldServiceBuilder(ControllerRelationFieldBuilder.ControllerRelationFieldServiceBuilder controllerRelationFieldServiceBuilder) {
        this.controllerRelationFieldServiceBuilder = controllerRelationFieldServiceBuilder;
    }

    @Autowired
    public void setControllerRelationSetServiceBuilder(ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetServiceBuilder controllerRelationSetServiceBuilder) {
        this.controllerRelationSetServiceBuilder = controllerRelationSetServiceBuilder;
    }

    @Autowired
    public void setControllerRelationFieldConverterBuilder(ControllerRelationFieldBuilder.ControllerRelationFieldConverterBuilder controllerRelationFieldConverterBuilder) {
        this.controllerRelationFieldConverterBuilder = controllerRelationFieldConverterBuilder;
    }

    @Autowired
    public void setControllerRelationFieldAssemblerBuilder(ControllerRelationFieldBuilder.ControllerRelationFieldAssemblerBuilder controllerRelationFieldAssemblerBuilder) {
        this.controllerRelationFieldAssemblerBuilder = controllerRelationFieldAssemblerBuilder;
    }


    @Autowired
    public void setControllerRelationSetConverterBuilder(ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetConverterBuilder controllerRelationSetConverterBuilder) {
        this.controllerRelationSetConverterBuilder = controllerRelationSetConverterBuilder;
    }

    @Autowired
    public void setControllerRelationSetAssemblerBuilder(ControllerRelationMethodBuilder.ControllerRelationSetBuilder.ControllerRelationSetAssemblerBuilder controllerRelationSetAssemblerBuilder) {
        this.controllerRelationSetAssemblerBuilder = controllerRelationSetAssemblerBuilder;
    }

    @Autowired
    public void setControllerRelationSetMethodBuilder(ControllerRelationMethodBuilder.ControllerRelationSetMethodBuilder controllerRelationSetMethodBuilder) {
        this.controllerRelationSetMethodBuilder = controllerRelationSetMethodBuilder;
    }

    @Autowired
    public void setControllerRelationGetMethodBuilder(ControllerRelationMethodBuilder.ControllerRelationGetMethodBuilder controllerRelationGetMethodBuilder) {
        this.controllerRelationGetMethodBuilder = controllerRelationGetMethodBuilder;
    }

    public ControllerRelationBuilder builder(PersistentPo persistentPo, AppServicePo appServicePo) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.setClassName(poName + "Controller");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.controller.relation;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList(poName, appServicePo.getAppServiceApi());
        this.setExtendsClassName("implements RelationController<" + poName + "Vo>");
        this.setPersistentPo(persistentPo);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import io.swagger.v3.oas.annotations.Operation;");
        importPackageList.add("import io.swagger.v3.oas.annotations.tags.Tag;");
        importPackageList.add("import noice.assembler.relation." + poName + "ControllerAssembler;");
        importPackageList.add("import noice.common.entity.vo.ResultVO;");
        importPackageList.add("import noice.converter.relation." + poName + "ControllerConverter;");
        importPackageList.add("import noice.entity.vo.relation." + poName + "Vo;");
        importPackageList.add("import noice.handler.relation.RelationController;");
        importPackageList.add("import noice.service.relation." + poName + "Service;");
        importPackageList.add("import org.springframework.beans.factory.annotation.Autowired;");
        importPackageList.add("import org.springframework.web.bind.annotation.CrossOrigin;");
        importPackageList.add("import org.springframework.web.bind.annotation.PostMapping;");
        importPackageList.add("import org.springframework.web.bind.annotation.RequestBody;");
        importPackageList.add("import org.springframework.web.bind.annotation.RequestMapping;");
        importPackageList.add("import org.springframework.web.bind.annotation.RestController;");
        importPackageList.add("");
        importPackageList.add("import java.util.List;");
    }

    public void setClassAnnotationList(String poName, String appApi) {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@CrossOrigin");
        classAnnotationList.add("@RestController");
        classAnnotationList.add("@RequestMapping(\"" + appApi + "/" + poName + "\")");
        classAnnotationList.add("@Tag(name = \"" + poName + "\")");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPackageName()).append("\n");
        sb.append("\n");
        List<String> importList = getImportPackageList();
        for (String importStr : importList) {
            sb.append(importStr).append("\n");
        }
        sb.append("\n");
        List<String> classNoteList = getClassNote();
        for (String classNote : classNoteList) {
            sb.append(classNote).append("\n");
        }
        List<String> classAnnotationList = getClassAnnotationList();
        for (String classAnnotation : classAnnotationList) {
            sb.append(classAnnotation).append("\n");
        }
        sb.append(getClassStatement().getStatement()).append(" ").append(getClassType().getClassType()).append(" ").append(getClassName()).append(" ").append(getExtendsClassName()).append(" {\n");
        sb.append("\n");
        sb.append(controllerRelationFieldServiceBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationFieldConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationFieldAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationSetServiceBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationSetConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationSetAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationSetMethodBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerRelationGetMethodBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
