package noice.handler.builder.entity.dml.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPropertyPo;
import org.springframework.stereotype.Component;

@Component
@Data
public class DMLRelationFieldAlterBuilder {

    private String tableName;

    private String dateBase;

    private String fieldName;

    private String fieldType;

    private String nullFlag;

    private String fieldComment;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DMLRelationFieldDropAlterBuilder extends DMLRelationFieldAlterBuilder {

        public DMLRelationFieldDropAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String tableName, String dateBase) {
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
    public static class DMLRelationFieldAddAlterBuilder extends DMLRelationFieldAlterBuilder {

        public DMLRelationFieldAddAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String tableName, String dateBase) {
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType(), persistentPropertyPo.getPersistentPropertyLength());
            this.setFieldComment(persistentPropertyPo.getPersistentPropertyName());
            this.setNullFlag(persistentPropertyPo.isPersistentPropertyNull());
            super.fieldName = persistentPropertyPo.getPersistentPropertyCode();
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        public DMLRelationFieldAddAlterBuilder builder(PersistentPropertyPo persistentPropertyPo, String defaultValue, String tableName, String dateBase) {
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType(), persistentPropertyPo.getPersistentPropertyLength(), defaultValue);
            this.setFieldComment(persistentPropertyPo.getPersistentPropertyName());
            this.setNullFlag(persistentPropertyPo.isPersistentPropertyNull());
            super.fieldName = persistentPropertyPo.getPersistentPropertyCode();
            super.tableName = tableName;
            super.dateBase = dateBase;
            return this;
        }

        public void setFieldType(String fieldType, int fieldLength) {
            super.fieldType = switch (fieldType) {
                case "boolean" -> "tinyint(1)\n";
                case "int" -> "int\n";
                case "date" -> "timestamp\n";
                case "id" -> "varchar(36)\n";
                default -> "varchar(" + fieldLength + ")\n";
            };
        }

        public void setFieldType(String fieldType, int fieldLength, String defaultValue) {
            super.fieldType = switch (fieldType) {
                case "boolean" -> "tinyint(1) default 1\n";
                case "int" -> "int default " + defaultValue + "\n";
                case "date" -> "timestamp default " + defaultValue + "\n";
                case "id" -> "varchar(36) default " + defaultValue + "\n";
                default -> "varchar(" + fieldLength + ") default " + defaultValue + "\n";
            };
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

}
