package noice.repository.relation;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.RoleAuthorityMapper;
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
public class RoleAuthorityRepository implements RelationRepository<RoleAuthorityPo> {

    private RoleAuthorityMapper mapper;

    @Autowired
    public void setMapper(RoleAuthorityMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RoleAuthorityPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public long count(QueryWrapper<RoleAuthorityPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RoleAuthorityPo find(@NotNull RoleAuthorityPo po) {
        return mapper.selectOne(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public RoleAuthorityPo find(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public List<RoleAuthorityPo> findList(@NotNull RoleAuthorityPo po) {
        return mapper.selectList(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public List<RoleAuthorityPo> findList(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

}