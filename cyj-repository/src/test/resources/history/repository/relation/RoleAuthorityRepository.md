## 2024-03-16 23:10:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.relation;

import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.RoleAuthorityMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
public class RoleAuthorityRepository implements RelationRepository<RoleAuthorityPo> {

    private RoleAuthorityMapper mapper;

    @Autowired
    public void setMapper(RoleAuthorityMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<RoleAuthorityPo> findList(@NotNull RoleAuthorityPo po) {
        return mapper.selectList(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public RoleAuthorityPo find(@NotNull RoleAuthorityPo po) {
        return mapper.selectOne(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public int add(RoleAuthorityPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

}
```

## 2024-03-19 14:15:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.relation;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.RoleAuthorityMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    public RoleAuthorityPo find(@NotNull RoleAuthorityPo po) {
        return mapper.selectOne(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public RoleAuthorityPo find(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return null;
    }

    @Override
    public List<RoleAuthorityPo> findList(@NotNull RoleAuthorityPo po) {
        return mapper.selectList(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public List<RoleAuthorityPo> findList(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return null;
    }

}
```

## 2024-03-23 09:35:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.relation;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.RoleAuthorityMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    public RoleAuthorityPo find(@NotNull RoleAuthorityPo po) {
        return mapper.selectOne(po.eqId().eqAuthorityId().eqRoleId().getQueryWrapper());
    }

    @Override
    public RoleAuthorityPo find(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public long count(QueryWrapper<RoleAuthorityPo> queryWrapper) {
        return 0;
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
```
