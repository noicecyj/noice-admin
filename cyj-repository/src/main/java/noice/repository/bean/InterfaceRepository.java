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
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
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
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}