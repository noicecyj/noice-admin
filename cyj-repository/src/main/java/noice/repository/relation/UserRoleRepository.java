package noice.repository.relation;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.entity.po.relation.UserRolePo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.UserRoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRoleRepository implements RelationRepository<UserRolePo> {

    private UserRoleMapper mapper;

    @Autowired
    public void setMapper(UserRoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserRolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public long count(QueryWrapper<UserRolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserRolePo find(@NotNull UserRolePo po) {
        return mapper.selectOne(po.eqId().eqRoleId().eqUserId().getQueryWrapper());
    }

    @Override
    public UserRolePo find(QueryWrapper<UserRolePo> queryWrapper) {
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public List<UserRolePo> findList(@NotNull UserRolePo po) {
        return mapper.selectList(po.eqId().eqRoleId().eqUserId().getQueryWrapper());
    }

    @Override
    public List<UserRolePo> findList(QueryWrapper<UserRolePo> queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

}