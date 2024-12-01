package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}