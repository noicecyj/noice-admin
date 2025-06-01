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
import java.util.stream.Collectors;

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
    public String add(CatalogDictionaryPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(CatalogDictionaryPo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<CatalogDictionaryPo> poList) {
        return mapper.deleteByIds(poList.stream().map(CatalogDictionaryPo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogDictionaryPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
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
    public List<CatalogDictionaryPo> findAll() {
        return mapper.selectList(new CatalogDictionaryPo().getQueryWrapper());
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