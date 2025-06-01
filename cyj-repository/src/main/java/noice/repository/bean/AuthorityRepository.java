package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AuthorityMapper;
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
public class AuthorityRepository implements BeanRepository<AuthorityPo> {

    private AuthorityMapper mapper;

    @Autowired
    public void setMapper(AuthorityMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(AuthorityPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<AuthorityPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public String delete(AuthorityPo po) {
        int delete = mapper.deleteById(po.getId());
        return delete == 0 ? null : po.getId();
    }

    @Override
    public int delete(QueryWrapper<AuthorityPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<AuthorityPo> poList) {
        return mapper.deleteByIds(poList.stream().map(AuthorityPo::getId).collect(Collectors.toList()));
    }

    @Override
    public int update(AuthorityPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AuthorityPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AuthorityPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AuthorityPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AuthorityPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public AuthorityPo find(QueryWrapper<AuthorityPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AuthorityPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AuthorityPo> findList(QueryWrapper<AuthorityPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<AuthorityPo> findAll() {
        return mapper.selectList(new AuthorityPo().getQueryWrapper());
    }

    @Override
    public IPage<AuthorityPo> findPage(IPage<AuthorityPo> page, QueryWrapper<AuthorityPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AuthorityPo> findPage(IPage<AuthorityPo> page, @NotNull AuthorityPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}