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
import java.util.stream.Collectors;

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
    public String add(PersistentFormConfigPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(PersistentFormConfigPo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<PersistentFormConfigPo> poList) {
        return mapper.deleteByIds(poList.stream().map(PersistentFormConfigPo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
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
    public List<PersistentFormConfigPo> findAll() {
        return mapper.selectList(new PersistentFormConfigPo().getQueryWrapper());
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