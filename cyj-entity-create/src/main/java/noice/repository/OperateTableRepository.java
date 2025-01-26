package noice.repository;

import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import noice.entity.po.TableColumnPo;
import noice.mapper.OperateTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static noice.common.contants.Constant.DATABASE;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class OperateTableRepository {

    private static final SqlRunner SQL_RUNNER = new SqlRunner();
    private OperateTableMapper operateTableMapper;

    @Autowired
    public void setOperateTableMapper(OperateTableMapper operateTableMapper) {
        this.operateTableMapper = operateTableMapper;
    }

    public void queryTable(String sql) {
        List<Map<String, Object>> result = SQL_RUNNER.selectList(sql);
    }

    public boolean addTable(String sql) {
        return SQL_RUNNER.update(sql);
    }

    public boolean dropTable(String sql) {
        return SQL_RUNNER.delete(sql);
    }

    public boolean updateTableName(String sql) {
        return SQL_RUNNER.update(sql);
    }

    public boolean updateTableComment(String sql) {
        return SQL_RUNNER.update(sql);
    }

    public boolean addColumn(String sql) {
        return SQL_RUNNER.update(sql);
    }

    public boolean dropColumn(String sql) {
        return SQL_RUNNER.delete(sql);
    }

    public boolean updateColumn(String sql) {
        return SQL_RUNNER.update(sql);
    }

    public List<TableColumnPo> queryTableColumns(String persistentCode) {
        String tableName = "t_" + persistentCode;
        return operateTableMapper.getTableColumns(DATABASE, tableName).stream().filter(tableColumnPo -> tableColumnPo.getCOLUMN_NAME().contains(persistentCode)).toList();
    }

    public TableColumnPo queryTableColumn(String persistentCode, String persistentPropertyCode) {
        String tableName = "t_" + persistentCode;
        return operateTableMapper.getTableColumn(DATABASE, tableName, persistentPropertyCode);
    }

}
