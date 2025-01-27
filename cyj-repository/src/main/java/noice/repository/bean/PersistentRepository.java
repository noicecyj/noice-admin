package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
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
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(PersistentPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(String id) {
        int delete = mapper.deleteById(id);
        return delete == 0 ? null : id;
    }

    @Override
    public int delete(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findAll() {
        return mapper.selectList(new PersistentPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}