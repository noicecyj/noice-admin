## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.mapper.bean.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class UserRepository extends BaseBeanRepositoryImpl<UserMapper, UserPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<UserPo> findPage(IPage<UserPo> page, UserPo po) {
        return findPage(page, po.likeUserCode().likeUserName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.mapper.bean.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class UserRepository extends BaseBeanRepositoryImpl<UserMapper, UserPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<UserPo> findPage(IPage<UserPo> page, UserPo po) {
        return findPage(page, po.likeUserCode().likeUserName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRepository implements BeanRepository<UserPo> {

    //******************************代码生成方法，请勿改动*************************************//

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, UserPo po) {
        return findPage(page, po.likeUserCode().likeUserName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<UserPo> queryWrapper) {
        return 0;
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.baseQueryWrapper().eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.baseQueryWrapper().eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
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
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
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
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(UserPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
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
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(UserPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findAll() {
        return mapper.selectList(new UserPo().getQueryWrapper());
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
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
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(UserPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(UserPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findAll() {
        return mapper.selectList(new UserPo().getQueryWrapper());
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:59:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.UserMapper;
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
public class UserRepository implements BeanRepository<UserPo> {

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(UserPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(UserPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(UserPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<UserPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public UserPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public UserPo find(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<UserPo> findList(QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<UserPo> findAll() {
        return mapper.selectList(new UserPo().getQueryWrapper());
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, QueryWrapper<UserPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<UserPo> findPage(IPage<UserPo> page, @NotNull UserPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

