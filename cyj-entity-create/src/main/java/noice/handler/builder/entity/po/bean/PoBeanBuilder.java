package noice.handler.builder.entity.po.bean;

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
public class PoBeanBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private String persistentName;

    private PersistentPo persistentPo;

    private PoBeanFieldBuilder poBeanFieldBuilder;

    private PoBeanMethodBuilder.PoBeanOrBuilder poBeanOrBuilder;

    private PoBeanMethodBuilder.PoBeanOrConditionBuilder poBeanOrConditionBuilder;

    private PoBeanMethodBuilder.PoBeanEqBuilder poBeanEqBuilder;

    private PoBeanMethodBuilder.PoBeanEqSetBuilder poBeanEqSetBuilder;

    private PoBeanMethodBuilder.PoBeanLikeBuilder poBeanLikeBuilder;

    private PoBeanMethodBuilder.PoBeanLikeSetBuilder poBeanLikeSetBuilder;

    private PoBeanMethodBuilder.PoBeanInBuilder poBeanInBuilder;

    private PoBeanMethodBuilder.PoBeanOrderByBuilder poBeanOrderByBuilder;

    private PoBeanMethodBuilder.PoBeanOrderByAscBuilder poBeanOrderByAscBuilder;

    private PoBeanMethodBuilder.PoBeanOrderByDescBuilder poBeanOrderByDescBuilder;

    private PoBeanMethodBuilder.PoBeanSelectBuilder poBeanSelectBuilder;

    private PoBeanMethodBuilder.PoBeanBaseBuilder poBeanBaseBuilder;

    private PoBeanMethodBuilder.PoBeanEqAutoBuilder poBeanEqAutoBuilder;

    private PoBeanMethodBuilder.PoBeanLikeAutoBuilder poBeanLikeAutoBuilder;

    @Autowired
    public void setPoBeanFieldBuilder(PoBeanFieldBuilder poBeanFieldBuilder) {
        this.poBeanFieldBuilder = poBeanFieldBuilder;
    }

    @Autowired
    public void setPoBeanOrBuilder(PoBeanMethodBuilder.PoBeanOrBuilder poBeanOrBuilder) {
        this.poBeanOrBuilder = poBeanOrBuilder;
    }

    @Autowired
    public void setPoBeanOrConditionBuilder(PoBeanMethodBuilder.PoBeanOrConditionBuilder poBeanOrConditionBuilder) {
        this.poBeanOrConditionBuilder = poBeanOrConditionBuilder;
    }

    @Autowired
    public void setPoBeanEqBuilder(PoBeanMethodBuilder.PoBeanEqBuilder poBeanEqBuilder) {
        this.poBeanEqBuilder = poBeanEqBuilder;
    }

    @Autowired
    public void setPoBeanEqSetBuilder(PoBeanMethodBuilder.PoBeanEqSetBuilder poBeanEqSetBuilder) {
        this.poBeanEqSetBuilder = poBeanEqSetBuilder;
    }

    @Autowired
    public void setPoBeanLikeBuilder(PoBeanMethodBuilder.PoBeanLikeBuilder poBeanLikeBuilder) {
        this.poBeanLikeBuilder = poBeanLikeBuilder;
    }

    @Autowired
    public void setPoBeanLikeSetBuilder(PoBeanMethodBuilder.PoBeanLikeSetBuilder poBeanLikeSetBuilder) {
        this.poBeanLikeSetBuilder = poBeanLikeSetBuilder;
    }

    @Autowired
    public void setPoBeanInBuilder(PoBeanMethodBuilder.PoBeanInBuilder poBeanInBuilder) {
        this.poBeanInBuilder = poBeanInBuilder;
    }

    @Autowired
    public void setPoBeanOrderByBuilder(PoBeanMethodBuilder.PoBeanOrderByBuilder poBeanOrderByBuilder) {
        this.poBeanOrderByBuilder = poBeanOrderByBuilder;
    }

    @Autowired
    public void setPoBeanOrderByAscBuilder(PoBeanMethodBuilder.PoBeanOrderByAscBuilder poBeanOrderByAscBuilder) {
        this.poBeanOrderByAscBuilder = poBeanOrderByAscBuilder;
    }

    @Autowired
    public void setPoBeanOrderByDescBuilder(PoBeanMethodBuilder.PoBeanOrderByDescBuilder poBeanOrderByDescBuilder) {
        this.poBeanOrderByDescBuilder = poBeanOrderByDescBuilder;
    }

    @Autowired
    public void setPoBeanSelectBuilder(PoBeanMethodBuilder.PoBeanSelectBuilder poBeanSelectBuilder) {
        this.poBeanSelectBuilder = poBeanSelectBuilder;
    }

    @Autowired
    public void setPoBeanBaseBuilder(PoBeanMethodBuilder.PoBeanBaseBuilder poBeanBaseBuilder) {
        this.poBeanBaseBuilder = poBeanBaseBuilder;
    }

    @Autowired
    public void setPoBeanEqAutoBuilder(PoBeanMethodBuilder.PoBeanEqAutoBuilder poBeanEqAutoBuilder) {
        this.poBeanEqAutoBuilder = poBeanEqAutoBuilder;
    }

    @Autowired
    public void setPoBeanLikeAutoBuilder(PoBeanMethodBuilder.PoBeanLikeAutoBuilder poBeanLikeAutoBuilder) {
        this.poBeanLikeAutoBuilder = poBeanLikeAutoBuilder;
    }

    public PoBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentName = poName;
        this.setClassName(poName + "Po");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.entity.po.bean;");
        this.setClassNote();
        this.setImportList();
        this.setClassAnnotationList(persistentPo.getPersistentCode());
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.persistentPo = persistentPo;
        this.extendsClassName = "extends BasePoBean<" + getClassName() + ">";
        return this;
    }

    public void setImportList() {
        importPackageList = new ArrayList<>();
        importPackageList.add("import cn.hutool.core.collection.CollUtil;");
        importPackageList.add("import cn.hutool.core.util.ObjectUtil;");
        importPackageList.add("import cn.hutool.core.util.StrUtil;");
        importPackageList.add("import com.baomidou.mybatisplus.annotation.TableField;");
        importPackageList.add("import com.baomidou.mybatisplus.annotation.TableName;");
        importPackageList.add("import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;");
        importPackageList.add("import com.fasterxml.jackson.annotation.JsonIgnore;");
        importPackageList.add("import lombok.Data;");
        importPackageList.add("import lombok.EqualsAndHashCode;");
        importPackageList.add("import lombok.experimental.FieldNameConstants;");
        importPackageList.add("import noice.handler.po.BasePoBean;");
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
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            sb.append(poBeanFieldBuilder.builder(persistentPropertyPo)).append("\n");
            sb.append("\n");
        }
        sb.append("    @JsonIgnore\n");
        sb.append("    @TableField(exist = false)\n");
        sb.append("    private QueryWrapper<").append(getPersistentName()).append("Po").append("> queryWrapper = new QueryWrapper<>();\n");
        sb.append("\n");
        sb.append(poBeanOrBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(poBeanOrConditionBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            sb.append(poBeanSelectBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            sb.append(poBeanEqBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
            sb.append("\n");
            if ("String".equals(persistentPropertyPo.getPersistentPropertyType())) {
                sb.append(poBeanInBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
            }
            if (!persistentPropertyPo.getPersistentPropertyCode().contains("id") && "String".equals(persistentPropertyPo.getPersistentPropertyType())) {
                sb.append(poBeanLikeBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
                sb.append(poBeanLikeSetBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
                sb.append(poBeanOrderByBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
                sb.append(poBeanOrderByAscBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
                sb.append(poBeanOrderByDescBuilder.builder(getPersistentPo(), persistentPropertyPo)).append("\n");
                sb.append("\n");
            }
        }
        PersistentPropertyPo idProperty = new PersistentPropertyPo();
        idProperty.setPersistentPropertyCode("id");
        idProperty.setPersistentPropertyType("String");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanInBuilder.builder(getPersistentPo(), idProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo createdByProperty = new PersistentPropertyPo();
        createdByProperty.setPersistentPropertyCode("created_by");
        createdByProperty.setPersistentPropertyType("String");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), createdByProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqBuilder.builder(getPersistentPo(), createdByProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), createdByProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo updatedByProperty = new PersistentPropertyPo();
        updatedByProperty.setPersistentPropertyCode("updated_by");
        updatedByProperty.setPersistentPropertyType("String");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), updatedByProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqBuilder.builder(getPersistentPo(), updatedByProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), updatedByProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo statusProperty = new PersistentPropertyPo();
        statusProperty.setPersistentPropertyCode("status");
        statusProperty.setPersistentPropertyType("Boolean");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), statusProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqBuilder.builder(getPersistentPo(), statusProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), statusProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo sortCodeProperty = new PersistentPropertyPo();
        sortCodeProperty.setPersistentPropertyCode("sort_code");
        sortCodeProperty.setPersistentPropertyType("Long");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), sortCodeProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanOrderByBuilder.builder(getPersistentPo(), sortCodeProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqBuilder.builder(getPersistentPo(), sortCodeProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqSetBuilder.builder(getPersistentPo(), sortCodeProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo createdDateProperty = new PersistentPropertyPo();
        createdDateProperty.setPersistentPropertyCode("created_date");
        createdDateProperty.setPersistentPropertyType("date");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), createdDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanOrderByBuilder.builder(getPersistentPo(), createdDateProperty)).append("\n");
        sb.append("\n");
        PersistentPropertyPo updatedDateProperty = new PersistentPropertyPo();
        updatedDateProperty.setPersistentPropertyCode("updated_date");
        updatedDateProperty.setPersistentPropertyType("date");
        sb.append(poBeanSelectBuilder.builder(getPersistentPo(), updatedDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanOrderByBuilder.builder(getPersistentPo(), updatedDateProperty)).append("\n");
        sb.append("\n");
        sb.append(poBeanEqAutoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
        sb.append("\n");
        sb.append(poBeanLikeAutoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
        sb.append("\n");
        sb.append(poBeanBaseBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
