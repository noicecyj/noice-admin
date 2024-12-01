package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}