package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(RolePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(String id) {
        int delete = mapper.deleteById(id);
        return delete == 0 ? null : id;
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(RolePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findAll() {
        return mapper.selectList(new RolePo().getQueryWrapper());
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}