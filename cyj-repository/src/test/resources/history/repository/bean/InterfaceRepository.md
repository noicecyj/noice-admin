## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-22 22:15:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().eqPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:09 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<InterfacePo> queryWrapper) {
        return 0;
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().eqPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().eqPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-01 14:55:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
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
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(InterfacePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.InterfacePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.InterfaceMapper;
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
public class InterfaceRepository implements BeanRepository<InterfacePo> {

    private InterfaceMapper mapper;

    @Autowired
    public void setMapper(InterfaceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(InterfacePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(InterfacePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(InterfacePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<InterfacePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public InterfacePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public InterfacePo find(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<InterfacePo> findList(QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<InterfacePo> findAll() {
        return mapper.selectList(new InterfacePo().getQueryWrapper());
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, QueryWrapper<InterfacePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<InterfacePo> findPage(IPage<InterfacePo> page, @NotNull InterfacePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

