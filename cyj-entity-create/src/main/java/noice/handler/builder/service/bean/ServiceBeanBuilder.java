package noice.handler.builder.service.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class ServiceBeanBuilder extends ClassBase {

    private PersistentRepository persistentRepository;

    private PersistentPo persistentPo;

    private List<Map<String, PersistentPo>> NtoN;

    private List<PersistentPo> OtoN;

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private ServiceBeanFieldBuilder.ServiceBeanFieldRepositoryBuilder serviceBeanFieldRepositoryBuilder;

    private ServiceBeanFieldBuilder.ServiceBeanFieldConverterBuilder serviceBeanFieldConverterBuilder;

    private ServiceBeanFieldBuilder.ServiceBeanFieldAssemblerBuilder serviceBeanFieldAssemblerBuilder;

    private ServiceBeanFieldBuilder.ServiceBeanRelationFieldBuilder serviceBeanRelationFieldBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetRepositoryBuilder serviceBeanSetRepositoryBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetConverterBuilder serviceBeanSetConverterBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetAssemblerBuilder serviceBeanSetAssemblerBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceRelationSetRepositoryBuilder serviceRelationSetRepositoryBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanAddBuilder serviceBeanAddBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanDeleteBuilder serviceBeanDeleteBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanUpdateBuilder serviceBeanUpdateBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindOneBuilder.ServiceBeanFindOneByIdBuilder serviceBeanFindOneByIdBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindOneBuilder.ServiceBeanFindOneByConditionBuilder serviceBeanFindOneByConditionBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindListBuilder.ServiceBeanFindListByIdsBuilder serviceBeanFindListByIdsBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindListBuilder.ServiceBeanFindListByConditionBuilder serviceBeanFindListByConditionBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanGetOptionsBuilder serviceBeanGetOptionsBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindPageBuilder serviceBeanFindPageBuilder;

    private ServiceBeanMethodBuilder.ServiceBeanFindRelationBuilder serviceBeanFindRelationBuilder;

    @Autowired
    public void setServiceBeanFieldRepositoryBuilder(ServiceBeanFieldBuilder.ServiceBeanFieldRepositoryBuilder serviceBeanFieldRepositoryBuilder) {
        this.serviceBeanFieldRepositoryBuilder = serviceBeanFieldRepositoryBuilder;
    }

    @Autowired
    public void setServiceBeanFieldConverterBuilder(ServiceBeanFieldBuilder.ServiceBeanFieldConverterBuilder serviceBeanFieldConverterBuilder) {
        this.serviceBeanFieldConverterBuilder = serviceBeanFieldConverterBuilder;
    }

    @Autowired
    public void setServiceBeanFieldAssemblerBuilder(ServiceBeanFieldBuilder.ServiceBeanFieldAssemblerBuilder serviceBeanFieldAssemblerBuilder) {
        this.serviceBeanFieldAssemblerBuilder = serviceBeanFieldAssemblerBuilder;
    }

    @Autowired
    public void setServiceRelationSetRepositoryBuilder(ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceRelationSetRepositoryBuilder serviceRelationSetRepositoryBuilder) {
        this.serviceRelationSetRepositoryBuilder = serviceRelationSetRepositoryBuilder;
    }

    @Autowired
    public void setServiceBeanRelationFieldBuilder(ServiceBeanFieldBuilder.ServiceBeanRelationFieldBuilder serviceBeanRelationFieldBuilder) {
        this.serviceBeanRelationFieldBuilder = serviceBeanRelationFieldBuilder;
    }

    @Autowired
    public void setServiceBeanSetRepositoryBuilder(ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetRepositoryBuilder serviceBeanSetRepositoryBuilder) {
        this.serviceBeanSetRepositoryBuilder = serviceBeanSetRepositoryBuilder;
    }

    @Autowired
    public void setServiceBeanSetConverterBuilder(ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetConverterBuilder serviceBeanSetConverterBuilder) {
        this.serviceBeanSetConverterBuilder = serviceBeanSetConverterBuilder;
    }

    @Autowired
    public void setServiceBeanSetAssemblerBuilder(ServiceBeanMethodBuilder.ServiceBeanSetBuilder.ServiceBeanSetAssemblerBuilder serviceBeanSetAssemblerBuilder) {
        this.serviceBeanSetAssemblerBuilder = serviceBeanSetAssemblerBuilder;
    }

    @Autowired
    public void setServiceBeanAddBuilder(ServiceBeanMethodBuilder.ServiceBeanAddBuilder serviceBeanAddBuilder) {
        this.serviceBeanAddBuilder = serviceBeanAddBuilder;
    }

    @Autowired
    public void setServiceBeanDeleteBuilder(ServiceBeanMethodBuilder.ServiceBeanDeleteBuilder serviceBeanDeleteBuilder) {
        this.serviceBeanDeleteBuilder = serviceBeanDeleteBuilder;
    }

    @Autowired
    public void setServiceBeanUpdateBuilder(ServiceBeanMethodBuilder.ServiceBeanUpdateBuilder serviceBeanUpdateBuilder) {
        this.serviceBeanUpdateBuilder = serviceBeanUpdateBuilder;
    }

    @Autowired
    public void setServiceBeanFindOneByIdBuilder(ServiceBeanMethodBuilder.ServiceBeanFindOneBuilder.ServiceBeanFindOneByIdBuilder serviceBeanFindOneByIdBuilder) {
        this.serviceBeanFindOneByIdBuilder = serviceBeanFindOneByIdBuilder;
    }

    @Autowired
    public void setServiceBeanFindOneByConditionBuilder(ServiceBeanMethodBuilder.ServiceBeanFindOneBuilder.ServiceBeanFindOneByConditionBuilder serviceBeanFindOneByConditionBuilder) {
        this.serviceBeanFindOneByConditionBuilder = serviceBeanFindOneByConditionBuilder;
    }

    @Autowired
    public void setServiceBeanFindListByIdsBuilder(ServiceBeanMethodBuilder.ServiceBeanFindListBuilder.ServiceBeanFindListByIdsBuilder serviceBeanFindListByIdsBuilder) {
        this.serviceBeanFindListByIdsBuilder = serviceBeanFindListByIdsBuilder;
    }

    @Autowired
    public void setServiceBeanFindListByConditionBuilder(ServiceBeanMethodBuilder.ServiceBeanFindListBuilder.ServiceBeanFindListByConditionBuilder serviceBeanFindListByConditionBuilder) {
        this.serviceBeanFindListByConditionBuilder = serviceBeanFindListByConditionBuilder;
    }

    @Autowired
    public void setServiceBeanFindPageBuilder(ServiceBeanMethodBuilder.ServiceBeanFindPageBuilder serviceBeanFindPageBuilder) {
        this.serviceBeanFindPageBuilder = serviceBeanFindPageBuilder;
    }

    @Autowired
    public void setServiceBeanGetOptionsBuilder(ServiceBeanMethodBuilder.ServiceBeanGetOptionsBuilder serviceBeanGetOptionsBuilder) {
        this.serviceBeanGetOptionsBuilder = serviceBeanGetOptionsBuilder;
    }

    @Autowired
    public void setServiceBeanFindRelationBuilder(ServiceBeanMethodBuilder.ServiceBeanFindRelationBuilder serviceBeanFindRelationBuilder) {
        this.serviceBeanFindRelationBuilder = serviceBeanFindRelationBuilder;
    }

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    public ServiceBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList,
                                      List<Map<String, PersistentPo>> NtoN, List<PersistentPo> OtoN) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentPo = persistentPo;
        this.NtoN = NtoN;
        this.OtoN = OtoN;
        this.setClassName(poName + "Service");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.service.bean;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList();
        this.setExtendsClassName("implements BeanService<" + poName + "Dto>");
        this.setPersistentPropertyPoList(persistentPropertyPoList);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import com.baomidou.mybatisplus.core.metadata.IPage;");
        importPackageList.add("import com.baomidou.mybatisplus.extension.plugins.pagination.Page;");
        importPackageList.add("import noice.assembler.bean." + poName + "ServiceAssembler;");
        importPackageList.add("import noice.common.entity.dto.OptionDTO;");
        importPackageList.add("import noice.converter.bean." + poName + "ServiceConverter;");
        importPackageList.add("import noice.entity.dto.bean." + poName + "Dto;");
        for (PersistentPo one : getOtoN()) {
            importPackageList.add("import noice.entity.po.bean." + StrUtil.upperFirst(StrUtil.toCamelCase(one.getPersistentCode())) + "Po;");
        }
        for (Map<String, PersistentPo> relationMap : getNtoN()) {
            importPackageList.add("import noice.entity.po.relation." + StrUtil.upperFirst(StrUtil.toCamelCase(relationMap.get("relation").getPersistentCode())) + "Po;");
        }
        importPackageList.add("import noice.handler.bean.BeanService;");
        importPackageList.add("import noice.repository.bean." + poName + "Repository;");
        for (PersistentPo one : getOtoN()) {
            importPackageList.add("import noice.repository.bean." + StrUtil.upperFirst(StrUtil.toCamelCase(one.getPersistentCode())) + "Repository;");
        }
        for (Map<String, PersistentPo> relationMap : getNtoN()) {
            importPackageList.add("import noice.repository.relation." + StrUtil.upperFirst(StrUtil.toCamelCase(relationMap.get("relation").getPersistentCode())) + "Repository;");
        }
        importPackageList.add("import org.jetbrains.annotations.NotNull;");
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
        sb.append(serviceBeanFieldRepositoryBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFieldConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFieldAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (PersistentPo one : getOtoN()) {
            sb.append(serviceBeanRelationFieldBuilder.builder(one)).append("\n");
            sb.append("\n");
        }
        for (Map<String, PersistentPo> relationMap : getNtoN()) {
            sb.append(serviceBeanRelationFieldBuilder.builder(relationMap.get("relation"))).append("\n");
            sb.append("\n");
        }
        sb.append(serviceBeanSetRepositoryBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanSetConverterBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanSetAssemblerBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (PersistentPo one : getOtoN()) {
            sb.append(serviceRelationSetRepositoryBuilder.builder(one)).append("\n");
            sb.append("\n");
        }
        for (Map<String, PersistentPo> relationMap : getNtoN()) {
            sb.append(serviceRelationSetRepositoryBuilder.builder(relationMap.get("relation"))).append("\n");
            sb.append("\n");
        }
        sb.append(serviceBeanAddBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanDeleteBuilder.builder(getPersistentPo(), getOtoN())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanUpdateBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFindOneByIdBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFindOneByConditionBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFindListByIdsBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFindListByConditionBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanFindPageBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(serviceBeanGetOptionsBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (Map<String, PersistentPo> poMap : getNtoN()) {
            sb.append(serviceBeanFindRelationBuilder.builder(getPersistentPo(), poMap.get("NtoN"), poMap.get("relation"))).append("\n");
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
