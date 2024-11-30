package noice.handler.builder.entity.vo.relation;

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
public class VoRelationBuilder extends ClassBase {

    public PersistentRepository persistentRepository;
    private List<PersistentPropertyPo> persistentPropertyPoList;
    private String persistentName;
    private VoRelationFieldBuilder voRelationFieldBuilder;

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setVoRelationFieldBuilder(VoRelationFieldBuilder voRelationFieldBuilder) {
        this.voRelationFieldBuilder = voRelationFieldBuilder;
    }

    public VoRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentName = poName;
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.setClassName(poName + "Vo");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.entity.vo.relation;");
        this.setClassNote();
        this.setImportList(persistentPropertyPoList);
        this.setClassAnnotationList();
        this.setExtendsClassName("extends BaseVoRelation");
        return this;
    }

    public void setImportList(List<PersistentPropertyPo> persistentPropertyPoList) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import lombok.Data;");
        importPackageList.add("import lombok.EqualsAndHashCode;");
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            if (StringUtils.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String underPoName = StrUtil.toCamelCase(persistentPo.getPersistentCode());
                String poName = StrUtil.upperFirst(underPoName);
                importPackageList.add("import noice.entity.dto.bean." + poName + "Dto;");
            }
        }
        importPackageList.add("import noice.handler.vo.BaseVoRelation;");
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
        sb.append("    public static final String VO = \"").append(getPersistentName()).append("\";\n");
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            String relationBeanCode = StrUtil.replaceLast(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()), "Id", "");
            sb.append(voRelationFieldBuilder.builder(persistentPropertyPo)).append("\n");
            sb.append("\n");
            if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                PersistentPropertyPo voBean = new PersistentPropertyPo();
                voBean.setPersistentPropertyType(poName + "Dto");
                voBean.setPersistentPropertyCode(relationBeanCode + "Dto");
                sb.append(voRelationFieldBuilder.builder(voBean)).append("\n");
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
