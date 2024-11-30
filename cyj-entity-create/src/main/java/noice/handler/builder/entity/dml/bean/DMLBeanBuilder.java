package noice.handler.builder.entity.dml.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class DMLBeanBuilder {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private PersistentPo persistentPo;

    private String fileName;

    private String tableName;

    private String dateBase;

    private String comment;

    private DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder;

    private DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldUpdateAlterBuilder dmlBeanFieldUpdateAlterBuilder;

    @Autowired
    public void setDmlBeanTableDropBuilder(DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder) {
        this.dmlBeanTableDropBuilder = dmlBeanTableDropBuilder;
    }

    @Autowired
    public void setDmlBeanTableAddBuilder(DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder) {
        this.dmlBeanTableAddBuilder = dmlBeanTableAddBuilder;
    }

    @Autowired
    public void setDmlBeanFieldDropAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder) {
        this.dmlBeanFieldDropAlterBuilder = dmlBeanFieldDropAlterBuilder;
    }

    @Autowired
    public void setDmlBeanFieldAddAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder) {
        this.dmlBeanFieldAddAlterBuilder = dmlBeanFieldAddAlterBuilder;
    }

    @Autowired
    public void setDmlBeanFieldUpdateAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldUpdateAlterBuilder dmlBeanFieldUpdateAlterBuilder) {
        this.dmlBeanFieldUpdateAlterBuilder = dmlBeanFieldUpdateAlterBuilder;
    }

    public DMLBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, String dateBase) {
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
        sb.append(dmlBeanTableDropBuilder.builder(getTableName(), getDateBase()));
        sb.append("\n");
        sb.append(dmlBeanTableAddBuilder.builder(getPersistentPo(), getPersistentPropertyPoList(), getDateBase()));
        sb.append("\n");
        for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
            sb.append(dmlBeanFieldDropAlterBuilder.builder(persistentPropertyPo, getTableName(), getDateBase()));
            sb.append("\n");
            sb.append(dmlBeanFieldAddAlterBuilder.builder(persistentPropertyPo, getTableName(), getDateBase()));
            sb.append("\n");
            sb.append(dmlBeanFieldUpdateAlterBuilder.builder(persistentPropertyPo, null, getTableName(), getDateBase()));
            sb.append("\n");
        }
        return sb.toString();
    }

}
