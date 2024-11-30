## 2024-03-16 23:10:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.relation;

import noice.entity.po.relation.UserRolePo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.UserRoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
public class UserRoleRepository implements RelationRepository<UserRolePo> {

    private UserRoleMapper mapper;

    @Autowired
    public void setMapper(UserRoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<UserRolePo> findList(@NotNull UserRolePo po) {
        return mapper.selectList(po.eqId().eqUserId().eqRoleId().getQueryWrapper());
    }

    @Override
    public UserRolePo find(@NotNull UserRolePo po) {
        return mapper.selectOne(po.eqId().eqUserId().eqRoleId().getQueryWrapper());
    }

    @Override
    public int add(UserRolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

}
```

## 2024-03-23 09:35:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.relation;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.entity.po.relation.UserRolePo;
import noice.handler.relation.RelationRepository;
import noice.mapper.relation.UserRoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    public int delete(String id) {
        return mapper.deleteById(id);
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
    public long count(QueryWrapper<UserRolePo> queryWrapper) {
        return 0;
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
```
