package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableSearchConfigMapper;
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
public class PersistentTableSearchConfigRepository implements BeanRepository<PersistentTableSearchConfigPo> {

    private PersistentTableSearchConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableSearchConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableSearchConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableSearchConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentTableSearchConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTableSearchConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableSearchConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableSearchConfigPo find(QueryWrapper<PersistentTableSearchConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableSearchConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableSearchConfigPo> findList(QueryWrapper<PersistentTableSearchConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableSearchConfigPo> findPage(IPage<PersistentTableSearchConfigPo> page, QueryWrapper<PersistentTableSearchConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableSearchConfigPo> findPage(IPage<PersistentTableSearchConfigPo> page, @NotNull PersistentTableSearchConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}