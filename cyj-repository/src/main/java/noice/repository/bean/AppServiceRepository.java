package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}