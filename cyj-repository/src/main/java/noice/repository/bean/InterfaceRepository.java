package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(InterfacePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(InterfacePo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<InterfacePo> poList) {
        return mapper.deleteByIds(poList.stream().map(InterfacePo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(InterfacePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findAll() {
        return mapper.selectList(new InterfacePo().getQueryWrapper());
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}