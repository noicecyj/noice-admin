## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class CatalogRepository extends BaseBeanRepositoryImpl<CatalogMapper, CatalogPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
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
public class CatalogRepository extends BaseBeanRepositoryImpl<CatalogMapper, CatalogPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogRepository implements BeanRepository<CatalogPo> {

    //******************************代码生成方法，请勿改动*************************************//

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:40 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogPo> queryWrapper) {
        return 0;
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.likeCatalogCode().likeCatalogName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.baseQueryWrapper().likeCatalogCode().likeCatalogName().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.baseQueryWrapper().likeCatalogCode().likeCatalogName().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:54 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
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
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
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
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
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
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
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
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findAll() {
        return mapper.selectList(new CatalogPo().getQueryWrapper());
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:30 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.CatalogMapper;
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
public class CatalogRepository implements BeanRepository<CatalogPo> {

    private CatalogMapper mapper;

    @Autowired
    public void setMapper(CatalogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(CatalogPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(CatalogPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(CatalogPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<CatalogPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public CatalogPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public CatalogPo find(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<CatalogPo> findList(QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<CatalogPo> findAll() {
        return mapper.selectList(new CatalogPo().getQueryWrapper());
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, QueryWrapper<CatalogPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<CatalogPo> findPage(IPage<CatalogPo> page, @NotNull CatalogPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

