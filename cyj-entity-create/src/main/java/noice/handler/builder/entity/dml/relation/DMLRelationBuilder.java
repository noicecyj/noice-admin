package noice.handler.builder.entity.dml.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class DMLRelationBuilder {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private PersistentPo persistentPo;

    private String fileName;

    private String tableName;

    private String dateBase;

    private String comment;

    private DMLRelationTableBuilder.DMLRelationTableDropBuilder dmlRelationTableDropBuilder;

    private DMLRelationTableBuilder.DMLRelationTableAddBuilder dmlRelationTableAddBuilder;

    private DMLRelationFieldAlterBuilder.DMLRelationFieldDropAlterBuilder dmlRelationFieldDropAlterBuilder;

    private DMLRelationFieldAlterBuilder.DMLRelationFieldAddAlterBuilder dmlRelationFieldAddAlterBuilder;

    @Autowired
    public void setDmlRelationTableDropBuilder(DMLRelationTableBuilder.DMLRelationTableDropBuilder dmlRelationTableDropBuilder) {
        this.dmlRelationTableDropBuilder = dmlRelationTableDropBuilder;
    }

    @Autowired
    public void setDmlRelationTableAddBuilder(DMLRelationTableBuilder.DMLRelationTableAddBuilder dmlRelationTableAddBuilder) {
        this.dmlRelationTableAddBuilder = dmlRelationTableAddBuilder;
    }

    @Autowired
    public void setDmlRelationFieldDropAlterBuilder(DMLRelationFieldAlterBuilder.DMLRelationFieldDropAlterBuilder dmlRelationFieldDropAlterBuilder) {
        this.dmlRelationFieldDropAlterBuilder = dmlRelationFieldDropAlterBuilder;
    }

    @Autowired
    public void setDmlRelationFieldAddAlterBuilder(DMLRelationFieldAlterBuilder.DMLRelationFieldAddAlterBuilder dmlRelationFieldAddAlterBuilder) {
        this.dmlRelationFieldAddAlterBuilder = dmlRelationFieldAddAlterBuilder;
    }

    public DMLRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, String dateBase) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.setFileName(poName + "DML");
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.persistentPo = persistentPo;
        this.tableName = "t_" + persistentPo.getPersistentCode();
        this.dateBase = dateBase;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dmlRelationTableDropBuilder.builder(getTableName(), getDateBase()));
        sb.append("\n");
        sb.append(dmlRelationTableAddBuilder.builder(getPersistentPo(), getPersistentPropertyPoList(), getDateBase()));
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            sb.append(dmlRelationFieldDropAlterBuilder.builder(persistentPropertyPo, getTableName(), getDateBase()));
            sb.append("\n");
            sb.append(dmlRelationFieldAddAlterBuilder.builder(persistentPropertyPo, getTableName(), getDateBase()));
            sb.append("\n");
        }
        return sb.toString();
    }

}
