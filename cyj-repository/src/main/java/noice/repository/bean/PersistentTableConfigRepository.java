package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(PersistentTableConfigPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(PersistentTableConfigPo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<PersistentTableConfigPo> poList) {
        return mapper.deleteByIds(poList.stream().map(PersistentTableConfigPo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTableConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findAll() {
        return mapper.selectList(new PersistentTableConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}