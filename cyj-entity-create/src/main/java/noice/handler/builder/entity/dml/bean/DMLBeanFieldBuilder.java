package noice.handler.builder.entity.dml.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.stereotype.Component;

@Component
@Data
public class DMLBeanFieldBuilder {

    private String fieldName;

    private String fieldType;

    private String nullFlag;

    private String fieldComment;

    private String key;

    public DMLBeanFieldBuilder builder(PersistentPropertyPo persistentPropertyPo) {
        return this.builder(persistentPropertyPo, false);
    }

    public DMLBeanFieldBuilder builder(PersistentPropertyPo persistentPropertyPo, boolean end) {
        this.setFieldName(persistentPropertyPo.getPersistentPropertyCode());
        this.setFieldType(persistentPropertyPo.getPersistentPropertyType(), persistentPropertyPo.getPersistentPropertyLength(), persistentPropertyPo.getPersistentPropertyDefaultValue());
        this.setFieldComment(persistentPropertyPo.getPersistentPropertyType(), persistentPropertyPo.getPersistentPropertyName(), end);
        this.setNullFlag(persistentPropertyPo.isPersistentPropertyNull());
        this.setKey();
        return this;
    }


    public void setFieldName(String fieldName) {
        this.fieldName = fieldName + "\n";
    }

    public void setFieldType(String fieldType, int fieldLength, String defaultValue) {
        if (StrUtil.isNotEmpty(defaultValue)) {
            this.fieldType = switch (fieldType) {
                case "boolean" -> "tinyint(1) default 1\n";
                case "int" -> "int default " + defaultValue + "\n";
                case "date" -> "timestamp default " + defaultValue + "\n";
                case "id" -> "varchar(36) default " + defaultValue + "\n";
                default -> "varchar(" + fieldLength + ") default " + defaultValue + "\n";
            };
        } else {
            this.fieldType = switch (fieldType) {
                case "boolean" -> "tinyint(1)\n";
                case "int" -> "int\n";
                case "date" -> "timestamp\n";
                case "id" -> "varchar(36)\n";
                default -> "varchar(" + fieldLength + ")\n";
            };
        }
    }

    public void setNullFlag(boolean nullFlag) {
        if (nullFlag) {
            this.nullFlag = "null\n";
        } else {
            this.nullFlag = "not null\n";
        }
    }

    public void setFieldComment(String fieldType, String fieldName) {
        if ("id".equals(fieldType)) {
            this.fieldComment = "comment '主键'\n";
        } else {
            this.fieldComment = "comment '" + fieldName + "',\n";
        }
    }


    private void setFieldComment(String fieldType, String fieldName, boolean end) {
        if ("id".equals(fieldType)) {
            this.fieldComment = "comment '主键'\n";
        } else {
            if (end) {
                this.fieldComment = "comment '" + fieldName + "'\n";
            } else {
                this.fieldComment = "comment '" + fieldName + "',\n";
            }
        }
    }

    public void setKey() {
        this.key = "primary key,\n";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("    ").append(getFieldName());
        sb.append("        ").append(getFieldType());
        sb.append("        ").append(getNullFlag());
        if ("updated_date\n".equals(getFieldName())) {
            sb.append("        ").append("on update CURRENT_TIMESTAMP\n");
        }
        sb.append("        ").append(getFieldComment());
        if ("id\n".equals(getFieldName())) {
            sb.append("        ").append(getKey());
        }
        return sb.toString();
    }

}
