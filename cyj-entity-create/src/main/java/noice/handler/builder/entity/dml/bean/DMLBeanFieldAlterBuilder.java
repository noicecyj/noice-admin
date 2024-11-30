package noice.handler.builder.entity.dml.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.stereotype.Component;

@Component
@Data
public class DMLBeanFieldAlterBuilder {

    private String tableName;

    private String dateBase;

    private String fieldName;

    private String fieldType;

    private String nullFlag;

    private String fieldComment;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLBeanFieldDropAlterBuilder extends DMLBeanFieldAlterBuilder {

        public DMLBeanFieldDropAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String tableName, String dateBase) {
            super.fieldName = persistentPropertyPo.getPersistentPropertyCode();
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        @Override
        public String toString() {
            return "ALTER TABLE " + getDateBase() + "." + getTableName() + "\n" +
                    "    DROP " + getFieldName() + ";" + "\n";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLBeanFieldAddAlterBuilder extends DMLBeanFieldAlterBuilder {

        public DMLBeanFieldAddAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String tableName, String dateBase) {
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType(),
                    persistentPropertyPo.getPersistentPropertyLength(), persistentPropertyPo.getPersistentPropertyDefaultValue());
            this.setFieldComment(persistentPropertyPo.getPersistentPropertyName());
            this.setNullFlag(persistentPropertyPo.isPersistentPropertyNull());
            super.fieldName = persistentPropertyPo.getPersistentPropertyCode();
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        public void setFieldType(String fieldType, int fieldLength, String defaultValue) {
            if (StrUtil.isNotEmpty(defaultValue)) {
                super.fieldType = switch (fieldType) {
                    case "boolean" -> "tinyint(1) default 1\n";
                    case "int" -> "int default " + defaultValue + "\n";
                    case "date" -> "timestamp default " + defaultValue + "\n";
                    case "id" -> "varchar(36) default " + defaultValue + "\n";
                    default -> "varchar(" + fieldLength + ") default " + defaultValue + "\n";
                };
            } else {
                super.fieldType = switch (fieldType) {
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
                super.nullFlag = "null\n";
            } else {
                super.nullFlag = "not null\n";
            }
        }

        public void setFieldComment(String fieldName) {
            super.fieldComment = "comment '" + fieldName + "';\n";
        }

        @Override
        public String toString() {
            return "ALTER TABLE " + getDateBase() + "." + getTableName() + "\n" +
                    "    ADD " + getFieldName() + "\n" +
                    "        " + getFieldType() +
                    "        " + getNullFlag() +
                    "        " + getFieldComment();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLBeanFieldUpdateAlterBuilder extends DMLBeanFieldAlterBuilder {

        public DMLBeanFieldUpdateAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String newColumnName, String tableName, String dateBase) {
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType(),
                    persistentPropertyPo.getPersistentPropertyLength(), persistentPropertyPo.getPersistentPropertyDefaultValue());
            this.setFieldComment(persistentPropertyPo.getPersistentPropertyName());
            this.setNullFlag(persistentPropertyPo.isPersistentPropertyNull());
            this.setFieldName(persistentPropertyPo.getPersistentPropertyCode(), newColumnName);
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        public void setFieldName(String fieldName, String newColumnName) {
            if (StrUtil.isNotEmpty(newColumnName)) {
                super.fieldName = "CHANGE " + fieldName + " " + newColumnName;
            } else {
                super.fieldName = "MODIFY " + fieldName;
            }
        }

        public void setFieldType(String fieldType, int fieldLength, String defaultValue) {
            if (StrUtil.isNotEmpty(defaultValue)) {
                super.fieldType = switch (fieldType) {
                    case "boolean" -> "tinyint(1) default 1\n";
                    case "int" -> "int default " + defaultValue + "\n";
                    case "date" -> "timestamp default " + defaultValue + "\n";
                    case "id" -> "varchar(36) default " + defaultValue + "\n";
                    default -> "varchar(" + fieldLength + ") default " + defaultValue + "\n";
                };
            } else {
                super.fieldType = switch (fieldType) {
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
                super.nullFlag = "null\n";
            } else {
                super.nullFlag = "not null\n";
            }
        }

        public void setFieldComment(String fieldName) {
            super.fieldComment = "comment '" + fieldName + "';\n";
        }

        @Override
        public String toString() {
            return "ALTER TABLE " + getDateBase() + "." + getTableName() + "\n" +
                    "    " + getFieldName() + "\n" +
                    "        " + getFieldType() +
                    "        " + getNullFlag() +
                    "        " + getFieldComment();
        }

        //ALTER TABLE employees
        //CHANGE COLUMN salary base_salary DECIMAL(12, 2) DEFAULT 50000.00 COMMENT 'Base salary of the employee';
    }

}
