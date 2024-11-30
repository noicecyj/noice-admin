package noice.handler.builder.entity.po.relation;

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
public class PoRelationBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private String persistentName;

    private PersistentPo persistentPo;

    private PoRelationFieldBuilder poRelationFieldBuilder;

    private PoRelationMethodBuilder.PoRelationEqBuilder poRelationEqBuilder;

    private PoRelationMethodBuilder.PoRelationEqSetBuilder poRelationEqSetBuilder;

    private PoRelationMethodBuilder.PoRelationOrBuilder poRelationOrBuilder;

    private PoRelationMethodBuilder.PoRelationOrConditionBuilder poRelationOrConditionBuilder;

    private PoRelationMethodBuilder.PoRelationInBuilder poRelationInBuilder;

    private PoRelationMethodBuilder.PoRelationOrderByBuilder poRelationOrderByBuilder;

    private PoRelationMethodBuilder.PoRelationSelectBuilder poRelationSelectBuilder;

    private PoRelationMethodBuilder.PoRelationBaseBuilder poRelationBaseBuilder;

    @Autowired
    public void setPoRelationFieldBuilder(PoRelationFieldBuilder poRelationFieldBuilder) {
        this.poRelationFieldBuilder = poRelationFieldBuilder;
    }

    @Autowired
    public void setPoRelationEqBuilder(PoRelationMethodBuilder.PoRelationEqBuilder poRelationEqBuilder) {
        this.poRelationEqBuilder = poRelationEqBuilder;
    }

    @Autowired
    public void setPoRelationEqSetBuilder(PoRelationMethodBuilder.PoRelationEqSetBuilder poRelationEqSetBuilder) {
        this.poRelationEqSetBuilder = poRelationEqSetBuilder;
    }

    @Autowired
    public void setPoRelationOrBuilder(PoRelationMethodBuilder.PoRelationOrBuilder poRelationOrBuilder) {
        this.poRelationOrBuilder = poRelationOrBuilder;
    }

    @Autowired
    public void setPoRelationOrConditionBuilder(PoRelationMethodBuilder.PoRelationOrConditionBuilder poRelationOrConditionBuilder) {
        this.poRelationOrConditionBuilder = poRelationOrConditionBuilder;
    }

    @Autowired
    public void setPoRelationInBuilder(PoRelationMethodBuilder.PoRelationInBuilder poRelationInBuilder) {
        this.poRelationInBuilder = poRelationInBuilder;
    }

    @Autowired
    public void setPoRelationOrderByBuilder(PoRelationMethodBuilder.PoRelationOrderByBuilder poRelationOrderByBuilder) {
        this.poRelationOrderByBuilder = poRelationOrderByBuilder;
    }

    @Autowired
    public void setPoRelationSelectBuilder(PoRelationMethodBuilder.PoRelationSelectBuilder poRelationSelectBuilder) {
        this.poRelationSelectBuilder = poRelationSelectBuilder;
    }

    @Autowired
    public void setPoRelationBaseBuilder(PoRelationMethodBuilder.PoRelationBaseBuilder poRelationBaseBuilder) {
        this.poRelationBaseBuilder = poRelationBaseBuilder;
    }

    public PoRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentName = poName;
        this.setClassName(poName + "Po");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.entity.po.relation;");
        this.setClassNote();
        this.setImportList();
        this.setClassAnnotationList(persistentPo.getPersistentCode());
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.persistentPo = persistentPo;
        this.extendsClassName = "extends BasePoRelation<" + getClassName() + ">";
        return this;
    }

    public void setImportList() {
        importPackageList = new ArrayList<>();
        importPackageList.add("import cn.hutool.core.collection.CollUtil;");
        importPackageList.add("import cn.hutool.core.util.StrUtil;");
        importPackageList.add("import com.baomidou.mybatisplus.annotation.TableField;");
        importPackageList.add("import com.baomidou.mybatisplus.annotation.TableName;");
        importPackageList.add("import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;");
        importPackageList.add("import com.fasterxml.jackson.annotation.JsonIgnore;");
        importPackageList.add("import lombok.Data;");
        importPackageList.add("import lombok.EqualsAndHashCode;");
        importPackageList.add("import lombok.experimental.FieldNameConstants;");
        importPackageList.add("import noice.handler.po.BasePoRelation;");
        importPackageList.add("");
        importPackageList.add("import java.util.List;");
    }

    public void setClassAnnotationList(String tableName) {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@EqualsAndHashCode(callSuper = true)");
        classAnnotationList.add("@Data");
        classAnnotationList.add("@FieldNameConstants");
        classAnnotationList.add("@TableName(\"t_" + tableName + "\")");
        classAnnotationList.add("@SuppressWarnings(\"unused\")");
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
        sb.append("    public static final String PO = \"").append(getPersistentName()).append("\";\n");
        sb.append("\n");
        List<PersistentPropertyPo> persistentPropertyPoList = getPersistentPropertyPoList();
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            sb.append(poRelationFieldBuilder.builder(persistentPropertyPo)).append("\n");
        }
        sb.append("    @JsonIgnore\n");
        sb.append("    @TableField(exist = false)\n");
        sb.append("    private QueryWrapper<").append(getPersistentName()).append("Po").append("> queryWrapper = new QueryWrapper<>();\n");
        sb.append("\n");
        sb.append(poRelationOrBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(poRelationOrConditionBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            sb.append(poRelationSelectBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            sb.append(poRelationEqBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            sb.append(poRelationEqSetBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            sb.append(poRelationInBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
        }
        PersistentPropertyPo idProperty = new PersistentPropertyPo();
        idProperty.setPersistentPropertyCode("id");
        idProperty.setPersistentPropertyType("String");
        sb.append(poRelationSelectBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationEqBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationInBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo createdByProperty = new PersistentPropertyPo();
        createdByProperty.setPersistentPropertyCode("created_by");
        createdByProperty.setPersistentPropertyType("String");
        sb.append(poRelationSelectBuilder.builder(getPersistentPo(), createdByProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationEqBuilder.builder(getPersistentPo(), createdByProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo updatedByProperty = new PersistentPropertyPo();
        updatedByProperty.setPersistentPropertyCode("updated_by");
        updatedByProperty.setPersistentPropertyType("String");
        sb.append(poRelationSelectBuilder.builder(getPersistentPo(), updatedByProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationEqBuilder.builder(getPersistentPo(), updatedByProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo createdDateProperty = new PersistentPropertyPo();
        createdDateProperty.setPersistentPropertyCode("created_date");
        createdDateProperty.setPersistentPropertyType("date");
        sb.append(poRelationSelectBuilder.builder(getPersistentPo(), createdDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationOrderByBuilder.builder(getPersistentPo(), createdDateProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo updatedDateProperty = new PersistentPropertyPo();
        updatedDateProperty.setPersistentPropertyCode("updated_date");
        updatedDateProperty.setPersistentPropertyType("date");
        sb.append(poRelationSelectBuilder.builder(getPersistentPo(), updatedDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationOrderByBuilder.builder(getPersistentPo(), updatedDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poRelationBaseBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
