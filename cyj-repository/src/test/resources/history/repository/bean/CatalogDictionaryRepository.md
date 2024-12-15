## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class CatalogDictionaryRepository extends BaseBeanRepositoryImpl<CatalogDictionaryMapper, CatalogDictionaryPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().baseQueryWrapper().getQueryWrapper());
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
public class CatalogDictionaryRepository extends BaseBeanRepositoryImpl<CatalogDictionaryMapper, CatalogDictionaryPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    //******************************代码生成方法，请勿改动*************************************//

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> queryWrapper) {
        return 0;
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:54 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
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
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
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
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:10 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogDictionaryPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogDictionaryMapper;
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
public class CatalogDictionaryRepository implements BeanRepository<CatalogDictionaryPo> {

    private CatalogDictionaryMapper mapper;

    @Autowired
    public void setMapper(CatalogDictionaryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogDictionaryPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(CatalogDictionaryPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogDictionaryPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogDictionaryPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogDictionaryPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogDictionaryPo find(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogDictionaryPo> findList(QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<CatalogDictionaryPo> findAll() {
        return mapper.selectList(new CatalogDictionaryPo().getQueryWrapper());
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, QueryWrapper<CatalogDictionaryPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogDictionaryPo> findPage(IPage<CatalogDictionaryPo> page, @NotNull CatalogDictionaryPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

