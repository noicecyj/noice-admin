package noice.handler.builder.controller.bean;

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
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class ControllerBeanBuilder extends ClassBase {

    private PersistentPo persistentPo;

    private List<Map<String, PersistentPo>> poList;

    private ControllerBeanFieldBuilder.ControllerBeanFieldServiceBuilder controllerBeanFieldServiceBuilder;

    private ControllerBeanFieldBuilder.ControllerBeanFieldConverterBuilder controllerBeanFieldConverterBuilder;

    private ControllerBeanFieldBuilder.ControllerBeanFieldAssemblerBuilder controllerBeanFieldAssemblerBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetServiceBuilder controllerBeanSetServiceBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetConverterBuilder controllerBeanSetConverterBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetAssemblerBuilder controllerBeanSetAssemblerBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanAddBuilder controllerBeanAddBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanDeleteBuilder controllerBeanDeleteBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanUpdateBuilder controllerBeanUpdateBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanFindBuilder controllerBeanFindBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanFindListBuilder controllerBeanFindListBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanFindPageBuilder controllerBeanFindPageBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanFindRelationBuilder controllerBeanFindRelationBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanValueEnumBuilder controllerBeanValueEnumBuilder;

    private ControllerBeanMethodBuilder.ControllerBeanOptionsBuilder controllerBeanOptionsBuilder;

    @Autowired
    public void setControllerBeanFieldServiceBuilder(ControllerBeanFieldBuilder.ControllerBeanFieldServiceBuilder controllerBeanFieldServiceBuilder) {
        this.controllerBeanFieldServiceBuilder = controllerBeanFieldServiceBuilder;
    }

    @Autowired
    public void setControllerBeanSetServiceBuilder(ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetServiceBuilder controllerBeanSetServiceBuilder) {
        this.controllerBeanSetServiceBuilder = controllerBeanSetServiceBuilder;
    }

    @Autowired
    public void setControllerBeanFieldConverterBuilder(ControllerBeanFieldBuilder.ControllerBeanFieldConverterBuilder controllerBeanFieldConverterBuilder) {
        this.controllerBeanFieldConverterBuilder = controllerBeanFieldConverterBuilder;
    }

    @Autowired
    public void setControllerBeanFieldAssemblerBuilder(ControllerBeanFieldBuilder.ControllerBeanFieldAssemblerBuilder controllerBeanFieldAssemblerBuilder) {
        this.controllerBeanFieldAssemblerBuilder = controllerBeanFieldAssemblerBuilder;
    }


    @Autowired
    public void setControllerBeanSetConverterBuilder(ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetConverterBuilder controllerBeanSetConverterBuilder) {
        this.controllerBeanSetConverterBuilder = controllerBeanSetConverterBuilder;
    }

    @Autowired
    public void setControllerBeanSetAssemblerBuilder(ControllerBeanMethodBuilder.ControllerBeanSetBuilder.ControllerBeanSetAssemblerBuilder controllerBeanSetAssemblerBuilder) {
        this.controllerBeanSetAssemblerBuilder = controllerBeanSetAssemblerBuilder;
    }

    @Autowired
    public void setControllerBeanAddBuilder(ControllerBeanMethodBuilder.ControllerBeanAddBuilder controllerBeanAddBuilder) {
        this.controllerBeanAddBuilder = controllerBeanAddBuilder;
    }

    @Autowired
    public void setControllerBeanDeleteBuilder(ControllerBeanMethodBuilder.ControllerBeanDeleteBuilder controllerBeanDeleteBuilder) {
        this.controllerBeanDeleteBuilder = controllerBeanDeleteBuilder;
    }

    @Autowired
    public void setControllerBeanUpdateBuilder(ControllerBeanMethodBuilder.ControllerBeanUpdateBuilder controllerBeanUpdateBuilder) {
        this.controllerBeanUpdateBuilder = controllerBeanUpdateBuilder;
    }

    @Autowired
    public void setControllerBeanFindBuilder(ControllerBeanMethodBuilder.ControllerBeanFindBuilder controllerBeanFindBuilder) {
        this.controllerBeanFindBuilder = controllerBeanFindBuilder;
    }

    @Autowired
    public void setControllerBeanFindListBuilder(ControllerBeanMethodBuilder.ControllerBeanFindListBuilder controllerBeanFindListBuilder) {
        this.controllerBeanFindListBuilder = controllerBeanFindListBuilder;
    }

    @Autowired
    public void setControllerBeanFindPageBuilder(ControllerBeanMethodBuilder.ControllerBeanFindPageBuilder controllerBeanFindPageBuilder) {
        this.controllerBeanFindPageBuilder = controllerBeanFindPageBuilder;
    }

    @Autowired
    public void setControllerBeanFindRelationBuilder(ControllerBeanMethodBuilder.ControllerBeanFindRelationBuilder controllerBeanFindRelationBuilder) {
        this.controllerBeanFindRelationBuilder = controllerBeanFindRelationBuilder;
    }

    @Autowired
    public void setControllerBeanValueEnumBuilder(ControllerBeanMethodBuilder.ControllerBeanValueEnumBuilder controllerBeanValueEnumBuilder) {
        this.controllerBeanValueEnumBuilder = controllerBeanValueEnumBuilder;
    }

    @Autowired
    public void setControllerBeanOptionsBuilder(ControllerBeanMethodBuilder.ControllerBeanOptionsBuilder controllerBeanOptionsBuilder) {
        this.controllerBeanOptionsBuilder = controllerBeanOptionsBuilder;
    }

    public ControllerBeanBuilder builder(PersistentPo persistentPo, AppServicePo appServicePo, List<Map<String, PersistentPo>> poList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentPo = persistentPo;
        this.poList = poList;
        this.setClassName(poName + "Controller");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.controller.bean;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList(poName, appServicePo.getAppServiceApi());
        this.setExtendsClassName("implements BeanController<" + poName + "Vo>");
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import com.baomidou.mybatisplus.core.metadata.IPage;");
        importPackageList.add("import com.baomidou.mybatisplus.extension.plugins.pagination.Page;");
        importPackageList.add("import io.swagger.v3.oas.annotations.Operation;");
        importPackageList.add("import io.swagger.v3.oas.annotations.tags.Tag;");
        importPackageList.add("import noice.assembler.bean." + poName + "ControllerAssembler;");
        importPackageList.add("import noice.common.entity.vo.OptionVO;");
        importPackageList.add("import noice.common.entity.vo.ResultVO;");
        importPackageList.add("import noice.converter.bean." + poName + "ControllerConverter;");
        importPackageList.add("import noice.entity.vo.bean." + poName + "Vo;");
        importPackageList.add("import noice.handler.bean.BeanController;");
        importPackageList.add("import noice.service.bean." + poName + "Service;");
        importPackageList.add("import org.springframework.beans.factory.annotation.Autowired;");
        importPackageList.add("import org.springframework.web.bind.annotation.CrossOrigin;");
        importPackageList.add("import org.springframework.web.bind.annotation.PostMapping;");
        importPackageList.add("import org.springframework.web.bind.annotation.RequestBody;");
        importPackageList.add("import org.springframework.web.bind.annotation.RequestMapping;");
        importPackageList.add("import org.springframework.web.bind.annotation.RestController;");
        importPackageList.add("");
        importPackageList.add("import java.util.Collections;");
        importPackageList.add("import java.util.List;");
        importPackageList.add("import java.util.stream.Collectors;");
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
        sb.append(controllerBeanFieldServiceBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanFieldConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanFieldAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanSetServiceBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanSetConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanSetAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanAddBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanDeleteBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanUpdateBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanFindBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanFindListBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanFindPageBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (Map<String, PersistentPo> NtoNMap : getPoList()) {
            sb.append(controllerBeanFindRelationBuilder.builder(NtoNMap.get("NtoN"))).append("\n");
            sb.append("\n");
        }
        sb.append(controllerBeanValueEnumBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(controllerBeanOptionsBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
