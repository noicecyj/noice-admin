package noice.mapper;

import noice.entity.po.TableColumnPo;
import noice.entity.po.TablePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OperateTableMapper {

    @Select("SELECT COLUMN_NAME, DATA_TYPE, CHARACTER_MAXIMUM_LENGTH, COLUMN_DEFAULT, COLUMN_COMMENT FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = #{dateBase} AND TABLE_NAME = #{tableName}")
    List<TableColumnPo> getTableColumns(String dateBase, String tableName);

    @Select("SELECT COLUMN_NAME, DATA_TYPE, CHARACTER_MAXIMUM_LENGTH, COLUMN_DEFAULT, COLUMN_COMMENT FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = #{dateBase} AND TABLE_NAME = #{tableName} AND COLUMN_NAME = #{columnName}")
    TableColumnPo getTableColumn(String dateBase, String tableName, String columnName);

    @Select("SELECT TABLE_NAME,TABLE_COMMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = #{dateBase} AND TABLE_NAME = #{tableName}")
    TablePo getTable(String dateBase, String tableName);

}
