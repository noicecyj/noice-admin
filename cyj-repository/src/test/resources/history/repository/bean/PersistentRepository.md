## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.mapper.bean.PersistentMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentRepository extends BaseBeanRepositoryImpl<PersistentMapper, PersistentPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, PersistentPo po) {
        return findPage(page, po.likePersistentCode().likePersistentName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.mapper.bean.PersistentMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentRepository extends BaseBeanRepositoryImpl<PersistentMapper, PersistentPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, PersistentPo po) {
        return findPage(page, po.likePersistentCode().likePersistentName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentRepository implements BeanRepository<PersistentPo> {

    //******************************代码生成方法，请勿改动*************************************//

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, PersistentPo po) {
        return findPage(page, po.likePersistentCode().likePersistentName().baseQueryWrapper().eqPersistentId().eqAppServiceId().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.eqAppServiceId().likePersistentCode().eqPersistentId().likePersistentName().likePersistentType().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPo> queryWrapper) {
        return 0;
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.eqAppServiceId().likePersistentCode().eqPersistentId().likePersistentName().likePersistentType().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.baseQueryWrapper().eqAppServiceId().likePersistentCode().eqPersistentId().likePersistentName().likePersistentType().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
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
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.baseQueryWrapper().eqAppServiceId().likePersistentCode().eqPersistentId().likePersistentName().likePersistentType().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
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
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
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
import noice.entity.po.bean.PersistentPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentMapper;
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
public class PersistentRepository implements BeanRepository<PersistentPo> {

    private PersistentMapper mapper;

    @Autowired
    public void setMapper(PersistentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPo find(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPo> findList(QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, QueryWrapper<PersistentPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPo> findPage(IPage<PersistentPo> page, @NotNull PersistentPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

