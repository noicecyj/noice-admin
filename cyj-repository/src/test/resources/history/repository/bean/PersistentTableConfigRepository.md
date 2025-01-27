## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentTableConfigRepository extends BaseBeanRepositoryImpl<PersistentTableConfigMapper, PersistentTableConfigPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, PersistentTableConfigPo po) {
        return findPage(page, po.likePersistentTableConfigCode().likePersistentTableConfigName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentTableConfigRepository extends BaseBeanRepositoryImpl<PersistentTableConfigMapper, PersistentTableConfigPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, PersistentTableConfigPo po) {
        return findPage(page, po.likePersistentTableConfigCode().likePersistentTableConfigName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.eqAuthorityId().likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
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
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
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
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTableConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTableConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findAll() {
        return mapper.selectList(new PersistentTableConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:33 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTableConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTableConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findAll() {
        return mapper.selectList(new PersistentTableConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:59:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableConfigMapper;
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
public class PersistentTableConfigRepository implements BeanRepository<PersistentTableConfigPo> {

    private PersistentTableConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentTableConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(PersistentTableConfigPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentTableConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentTableConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentTableConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTableConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTableConfigPo find(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentTableConfigPo> findList(QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentTableConfigPo> findAll() {
        return mapper.selectList(new PersistentTableConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, QueryWrapper<PersistentTableConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTableConfigPo> findPage(IPage<PersistentTableConfigPo> page, @NotNull PersistentTableConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

