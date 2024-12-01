package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
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
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}