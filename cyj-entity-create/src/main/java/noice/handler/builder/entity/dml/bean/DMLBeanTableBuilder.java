package noice.handler.builder.entity.dml.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class DMLBeanTableBuilder {

    private String fileName;

    private String tableName;

    private String dateBase;

    private String comment;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLBeanTableDropBuilder extends DMLBeanTableBuilder {

        public DMLBeanTableDropBuilder builder(String tableName, String dateBase) {
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        @Override
        public String toString() {
            return "drop table if exists " + getDateBase() + "." + getTableName() + ";\n";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLBeanTableAddBuilder extends DMLBeanTableBuilder {

        private List<PersistentPropertyPo> persistentPropertyPoList;

        private DMLBeanFieldBuilder dmlBeanFieldBuilder;

        @Autowired
        public void setDmlBeanFieldBuilder(DMLBeanFieldBuilder dmlBeanFieldBuilder) {
            this.dmlBeanFieldBuilder = dmlBeanFieldBuilder;
        }

        public DMLBeanTableAddBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, String dateBase) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFileName(poName + "DML");
            this.persistentPropertyPoList = persistentPropertyPoList;
            super.tableName = "t_" + persistentPo.getPersistentCode();
            super.dateBase = dateBase;
            super.comment = persistentPo.getPersistentName();
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("create table if not exists ").append(getDateBase()).append(".").append(getTableName()).append("\n");
            sb.append("(\n");
            PersistentPropertyPo id = new PersistentPropertyPo();
            id.setPersistentPropertyCode("id");
            id.setPersistentPropertyType("id");
            sb.append(dmlBeanFieldBuilder.builder(id));
            for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                sb.append(dmlBeanFieldBuilder.builder(persistentPropertyPo));
            }
            PersistentPropertyPo sortCode = new PersistentPropertyPo();
            sortCode.setPersistentPropertyCode("sort_code");
            sortCode.setPersistentPropertyType("int");
            sortCode.setPersistentPropertyName("排序值");
            sortCode.setPersistentPropertyDefaultValue("1");
            sb.append(dmlBeanFieldBuilder.builder(sortCode));
            PersistentPropertyPo status = new PersistentPropertyPo();
            status.setPersistentPropertyCode("status");
            status.setPersistentPropertyType("boolean");
            status.setPersistentPropertyName("状态");
            sb.append(dmlBeanFieldBuilder.builder(status));
            PersistentPropertyPo createdDate = new PersistentPropertyPo();
            createdDate.setPersistentPropertyCode("created_date");
            createdDate.setPersistentPropertyType("date");
            createdDate.setPersistentPropertyName("创建时间");
            createdDate.setPersistentPropertyDefaultValue("CURRENT_TIMESTAMP");
            sb.append(dmlBeanFieldBuilder.builder(createdDate));
            PersistentPropertyPo createdBy = new PersistentPropertyPo();
            createdBy.setPersistentPropertyCode("created_by");
            createdBy.setPersistentPropertyType("String");
            createdBy.setPersistentPropertyName("创建人");
            createdBy.setPersistentPropertyLength(255);
            sb.append(dmlBeanFieldBuilder.builder(createdBy));
            PersistentPropertyPo updatedDate = new PersistentPropertyPo();
            updatedDate.setPersistentPropertyCode("updated_date");
            updatedDate.setPersistentPropertyType("date");
            updatedDate.setPersistentPropertyName("更新时间");
            updatedDate.setPersistentPropertyDefaultValue("CURRENT_TIMESTAMP");
            sb.append(dmlBeanFieldBuilder.builder(updatedDate));
            PersistentPropertyPo updatedBy = new PersistentPropertyPo();
            updatedBy.setPersistentPropertyCode("updated_by");
            updatedBy.setPersistentPropertyType("String");
            updatedBy.setPersistentPropertyName("更新人");
            updatedBy.setPersistentPropertyLength(255);
            sb.append(dmlBeanFieldBuilder.builder(updatedBy, true));
            sb.append(")\n");
            sb.append("    comment '").append(getComment()).append("';\n");
            return sb.toString();
        }

    }

}
