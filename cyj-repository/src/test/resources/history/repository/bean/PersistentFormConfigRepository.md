## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentFormConfigRepository extends BaseBeanRepositoryImpl<PersistentFormConfigMapper, PersistentFormConfigPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, PersistentFormConfigPo po) {
        return findPage(page, po.likePersistentFormConfigCode().likePersistentFormConfigName().baseQueryWrapper().getQueryWrapper());
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
public class PersistentFormConfigRepository extends BaseBeanRepositoryImpl<PersistentFormConfigMapper, PersistentFormConfigPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, PersistentFormConfigPo po) {
        return findPage(page, po.likePersistentFormConfigCode().likePersistentFormConfigName().baseQueryWrapper().getQueryWrapper());
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
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.eqAuthorityId().likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:18 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
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
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
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
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findAll() {
        return mapper.selectList(new PersistentFormConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormConfigPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findAll() {
        return mapper.selectList(new PersistentFormConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:59:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormConfigMapper;
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
public class PersistentFormConfigRepository implements BeanRepository<PersistentFormConfigPo> {

    private PersistentFormConfigMapper mapper;

    @Autowired
    public void setMapper(PersistentFormConfigMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(PersistentFormConfigPo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormConfigPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormConfigPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormConfigPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormConfigPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormConfigPo find(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormConfigPo> findList(QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormConfigPo> findAll() {
        return mapper.selectList(new PersistentFormConfigPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, QueryWrapper<PersistentFormConfigPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormConfigPo> findPage(IPage<PersistentFormConfigPo> page, @NotNull PersistentFormConfigPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

