package noice.handler.builder.service.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
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
public class ServiceRelationBuilder extends ClassBase {

    private PersistentPo persistentPo;

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private ServiceRelationFieldBuilder.ServiceRelationFieldRepositoryBuilder serviceRelationFieldRepositoryBuilder;

    private ServiceRelationFieldBuilder.ServiceRelationFieldConverterBuilder serviceRelationFieldConverterBuilder;

    private ServiceRelationFieldBuilder.ServiceRelationFieldAssemblerBuilder serviceRelationFieldAssemblerBuilder;

    private ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetRepositoryBuilder serviceRelationSetRepositoryBuilder;

    private ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetConverterBuilder serviceRelationSetConverterBuilder;

    private ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetAssemblerBuilder serviceRelationSetAssemblerBuilder;

    private ServiceRelationMethodBuilder.ServiceRelationSetMethodBuilder serviceRelationSetMethodBuilder;

    private ServiceRelationMethodBuilder.ServiceRelationGetMethodBuilder serviceRelationGetMethodBuilder;

    @Autowired
    public void setServiceRelationFieldRepositoryBuilder(ServiceRelationFieldBuilder.ServiceRelationFieldRepositoryBuilder serviceRelationFieldRepositoryBuilder) {
        this.serviceRelationFieldRepositoryBuilder = serviceRelationFieldRepositoryBuilder;
    }

    @Autowired
    public void setServiceRelationFieldConverterBuilder(ServiceRelationFieldBuilder.ServiceRelationFieldConverterBuilder serviceRelationFieldConverterBuilder) {
        this.serviceRelationFieldConverterBuilder = serviceRelationFieldConverterBuilder;
    }

    @Autowired
    public void setServiceRelationFieldAssemblerBuilder(ServiceRelationFieldBuilder.ServiceRelationFieldAssemblerBuilder serviceRelationFieldAssemblerBuilder) {
        this.serviceRelationFieldAssemblerBuilder = serviceRelationFieldAssemblerBuilder;
    }

    @Autowired
    public void setServiceRelationSetRepositoryBuilder(ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetRepositoryBuilder serviceRelationSetRepositoryBuilder) {
        this.serviceRelationSetRepositoryBuilder = serviceRelationSetRepositoryBuilder;
    }

    @Autowired
    public void setServiceRelationSetConverterBuilder(ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetConverterBuilder serviceRelationSetConverterBuilder) {
        this.serviceRelationSetConverterBuilder = serviceRelationSetConverterBuilder;
    }

    @Autowired
    public void setServiceRelationSetAssemblerBuilder(ServiceRelationMethodBuilder.ServiceRelationSetBuilder.ServiceRelationSetAssemblerBuilder serviceRelationSetAssemblerBuilder) {
        this.serviceRelationSetAssemblerBuilder = serviceRelationSetAssemblerBuilder;
    }

    @Autowired
    public void setServiceRelationSetMethodBuilder(ServiceRelationMethodBuilder.ServiceRelationSetMethodBuilder serviceRelationSetMethodBuilder) {
        this.serviceRelationSetMethodBuilder = serviceRelationSetMethodBuilder;
    }

    @Autowired
    public void setServiceRelationGetMethodBuilder(ServiceRelationMethodBuilder.ServiceRelationGetMethodBuilder serviceRelationGetMethodBuilder) {
        this.serviceRelationGetMethodBuilder = serviceRelationGetMethodBuilder;
    }

    public ServiceRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.setClassName(poName + "Service");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.service.relation;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList();
        this.setExtendsClassName("implements RelationService<" + poName + "Dto>");
        this.setPersistentPo(persistentPo);
        this.setPersistentPropertyPoList(persistentPropertyPoList);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import noice.assembler.relation." + poName + "ServiceAssembler;");
        importPackageList.add("import noice.converter.relation." + poName + "ServiceConverter;");
        importPackageList.add("import noice.entity.dto.relation." + poName + "Dto;");
        importPackageList.add("import noice.handler.relation.RelationService;");
        importPackageList.add("import noice.repository.relation." + poName + "Repository;");
        importPackageList.add("import org.springframework.beans.factory.annotation.Autowired;");
        importPackageList.add("import org.springframework.stereotype.Service;");
        importPackageList.add("import org.springframework.transaction.annotation.Transactional;");
        importPackageList.add("");
        importPackageList.add("import java.util.List;");
    }

    public void setClassAnnotationList() {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@Service");
        classAnnotationList.add("@Transactional(rollbackFor = Exception.class)");
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
        sb.append(serviceRelationFieldRepositoryBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationFieldConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationFieldAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationSetRepositoryBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationSetConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationSetAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationSetMethodBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceRelationGetMethodBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
