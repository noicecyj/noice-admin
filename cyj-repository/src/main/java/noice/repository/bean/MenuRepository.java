package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
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
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}