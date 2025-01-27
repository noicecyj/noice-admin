## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentFormRepository extends BaseBeanRepositoryImpl<PersistentFormMapper, PersistentFormPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, PersistentFormPo po) {
        return findPage(page, po.likePersistentFormCode().likePersistentFormName().baseQueryWrapper().getQueryWrapper());
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
public class PersistentFormRepository extends BaseBeanRepositoryImpl<PersistentFormMapper, PersistentFormPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, PersistentFormPo po) {
        return findPage(page, po.likePersistentFormCode().likePersistentFormName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-20 20:24:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.likePersistentFormCode().likePersistentFormName().likePersistentFormType().eqPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.baseQueryWrapper().likePersistentFormCode().likePersistentFormName().likePersistentFormType().eqPersistentId().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.baseQueryWrapper().likePersistentFormCode().likePersistentFormName().likePersistentFormType().eqPersistentId().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
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
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
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
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
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
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findAll() {
        return mapper.selectList(new PersistentFormPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentFormPo> findPage
            (IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentFormMapper;
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
public class PersistentFormRepository implements BeanRepository<PersistentFormPo> {

    private PersistentFormMapper mapper;

    @Autowired
    public void setMapper(PersistentFormMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentFormPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(PersistentFormPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(PersistentFormPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<PersistentFormPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentFormPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentFormPo find(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<PersistentFormPo> findList(QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<PersistentFormPo> findAll() {
        return mapper.selectList(new PersistentFormPo().getQueryWrapper());
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, QueryWrapper<PersistentFormPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentFormPo> findPage(IPage<PersistentFormPo> page, @NotNull PersistentFormPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

