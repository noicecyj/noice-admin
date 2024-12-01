package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}