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
import java.util.stream.Collectors;

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
    public String add(AppServicePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(AppServicePo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<AppServicePo> poList) {
        return mapper.deleteByIds(poList.stream().map(AppServicePo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
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
    public List<AppServicePo> findAll() {
        return mapper.selectList(new AppServicePo().getQueryWrapper());
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