## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.mapper.bean.RoleMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class RoleRepository extends BaseBeanRepositoryImpl<RoleMapper, RolePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<RolePo> findPage(IPage<RolePo> page, RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.mapper.bean.RoleMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class RoleRepository extends BaseBeanRepositoryImpl<RoleMapper, RolePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<RolePo> findPage(IPage<RolePo> page, RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    //******************************代码生成方法，请勿改动*************************************//

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<RolePo> queryWrapper) {
        return 0;
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.likeRoleCode().likeRoleName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeRoleCode().likeRoleName().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeRoleCode().likeRoleName().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-01 14:55:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-01 17:31:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(RolePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

import static noice.common.contants.Constant.USER_ID;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(RolePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findAll() {
        return mapper.selectList(new RolePo().getQueryWrapper());
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(RolePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(RolePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findAll() {
        return mapper.selectList(new RolePo().getQueryWrapper());
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:59:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.RolePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.RoleMapper;
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
public class RoleRepository implements BeanRepository<RolePo> {

    private RoleMapper mapper;

    @Autowired
    public void setMapper(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(RolePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(RolePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(RolePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<RolePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public RolePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public RolePo find(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<RolePo> findList(QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<RolePo> findAll() {
        return mapper.selectList(new RolePo().getQueryWrapper());
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, QueryWrapper<RolePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<RolePo> findPage(IPage<RolePo> page, @NotNull RolePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

