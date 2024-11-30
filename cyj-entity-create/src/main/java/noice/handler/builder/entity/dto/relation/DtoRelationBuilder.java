package noice.handler.builder.entity.dto.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class DtoRelationBuilder extends ClassBase {

    public PersistentRepository persistentRepository;
    private List<PersistentPropertyPo> persistentPropertyPoList;
    private String persistentName;
    private DtoRelationFieldBuilder dtoRelationFieldBuilder;

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setDtoRelationFieldBuilder(DtoRelationFieldBuilder dtoRelationFieldBuilder) {
        this.dtoRelationFieldBuilder = dtoRelationFieldBuilder;
    }

    public DtoRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentName = poName;
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.setClassName(poName + "Dto");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.entity.dto.relation;");
        this.setClassNote();
        this.setImportList();
        this.setClassAnnotationList();
        this.setExtendsClassName("extends BaseDtoRelation");
        return this;
    }

    public void setImportList() {
        importPackageList = new ArrayList<>();
        importPackageList.add("import lombok.Data;");
        importPackageList.add("import lombok.EqualsAndHashCode;");
        List<String> poNameList = new ArrayList<>();
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            if (StringUtils.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String underPoName = StrUtil.toCamelCase(persistentPo.getPersistentCode());
                String poName = StrUtil.upperFirst(underPoName);
                if (!poNameList.contains(poName)) {
                    importPackageList.add("import noice.entity.po.bean." + poName + "Po;");
                    poNameList.add(poName);
                }
            }
        }
        importPackageList.add("import noice.handler.dto.BaseDtoRelation;");
    }

    public void setClassAnnotationList() {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@EqualsAndHashCode(callSuper = true)");
        classAnnotationList.add("@Data");
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
        sb.append("    public static final String DTO = \"").append(getPersistentName()).append("\";\n");
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
            sb.append(dtoRelationFieldBuilder.builder(persistentPropertyPo)).append("\n");
            sb.append("\n");
            if (StringUtils.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                PersistentPropertyPo dtoRelation = new PersistentPropertyPo();
                dtoRelation.setPersistentPropertyType(poName + "Po");
                dtoRelation.setPersistentPropertyCode(relationBeanCode + "Po");
                sb.append(dtoRelationFieldBuilder.builder(dtoRelation)).append("\n");
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
