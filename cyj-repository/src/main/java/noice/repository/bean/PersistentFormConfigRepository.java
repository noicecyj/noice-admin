package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}