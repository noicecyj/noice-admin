package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
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
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(PersistentTablePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentTablePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(PersistentTablePo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<PersistentTablePo> poList) {
        return mapper.deleteByIds(poList.stream().map(PersistentTablePo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTablePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTablePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findAll() {
        return mapper.selectList(new PersistentTablePo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}