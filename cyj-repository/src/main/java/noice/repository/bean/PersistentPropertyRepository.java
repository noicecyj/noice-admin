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
import java.util.stream.Collectors;

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
    public String add(PersistentPropertyPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentPropertyPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(PersistentPropertyPo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<PersistentPropertyPo> poList) {
        return mapper.deleteByIds(poList.stream().map(PersistentPropertyPo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentPropertyPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentPropertyPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
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
    public List<PersistentPropertyPo> findAll() {
        return mapper.selectList(new PersistentPropertyPo().getQueryWrapper());
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