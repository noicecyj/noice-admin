package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static noice.common.contants.Constant.USER_ID;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}