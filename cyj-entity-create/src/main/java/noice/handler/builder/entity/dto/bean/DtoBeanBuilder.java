package noice.handler.builder.entity.dto.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class DtoBeanBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private String persistentName;

    private List<Map<String, PersistentPo>> poList;

    private PersistentRepository persistentRepository;

    private PersistentPropertyRepository persistentPropertyRepository;

    private DtoBeanFieldBuilder.DtoBeanCommonFieldBuilder dtoBeanCommonFieldBuilder;

    private DtoBeanFieldBuilder.DtoBeanListFieldBuilder dtoBeanListFieldBuilder;

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Autowired
    public void setDtoBeanCommonFieldBuilder(DtoBeanFieldBuilder.DtoBeanCommonFieldBuilder dtoBeanCommonFieldBuilder) {
        this.dtoBeanCommonFieldBuilder = dtoBeanCommonFieldBuilder;
    }

    @Autowired
    public void setDtoBeanListFieldBuilder(DtoBeanFieldBuilder.DtoBeanListFieldBuilder dtoBeanListFieldBuilder) {
        this.dtoBeanListFieldBuilder = dtoBeanListFieldBuilder;
    }

    public DtoBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.poList = poList;
        this.persistentName = poName;
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.setClassName(poName + "Dto");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.entity.dto.bean;");
        this.setClassNote();
        this.setImportList();
        this.setClassAnnotationList();
        this.setExtendsClassName("extends BaseDtoBean");
        return this;
    }

    public void setImportList() {
        importPackageList = new ArrayList<>();
        importPackageList.add("import lombok.Data;");
        importPackageList.add("import lombok.EqualsAndHashCode;");
        List<String> poNameList = new ArrayList<>();
        for (Map<String, PersistentPo> NtoNMap : getPoList()) {
            String NtoNpoName = StrUtil.upperFirst(StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode()));
            if (!poNameList.contains(NtoNpoName)) {
                importPackageList.add("import noice.entity.po.bean." + NtoNpoName + "Po;");
                poNameList.add(NtoNpoName);
            }
        }
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            if (StringUtils.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                if (!poNameList.contains(relationPo)) {
                    importPackageList.add("import noice.entity.po.bean." + relationPo + "Po;");
                    poNameList.add(relationPo);
                }
            }
        }
        importPackageList.add("import noice.handler.dto.BaseDtoBean;");
        importPackageList.add("");
        if (!getPoList().isEmpty()) {
            importPackageList.add("import java.util.List;");
        }
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
            sb.append(dtoBeanCommonFieldBuilder.builder(persistentPropertyPo)).append("\n");
            sb.append("\n");
            //填充一对多字段
            if (StringUtils.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                PersistentPropertyPo dtoBean = new PersistentPropertyPo();
                dtoBean.setPersistentPropertyType(poName + "Po");
                dtoBean.setPersistentPropertyCode(relationBeanCode + "Po");
                sb.append(dtoBeanCommonFieldBuilder.builder(dtoBean)).append("\n");
                sb.append("\n");
            }
        }
        //多对多关系字段list
        for (Map<String, PersistentPo> poMap : getPoList()) {
            String underPoName = StrUtil.toCamelCase(poMap.get("NtoN").getPersistentCode());
            String poName = StrUtil.upperFirst(underPoName);
            PersistentPropertyPo dtoBean = new PersistentPropertyPo();
            dtoBean.setPersistentPropertyType(poName + "Po");
            dtoBean.setPersistentPropertyCode(underPoName + "Po");
            sb.append(dtoBeanListFieldBuilder.builder(dtoBean)).append("\n");
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
