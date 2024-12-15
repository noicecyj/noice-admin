## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class EnterpriseRepository extends BaseBeanRepositoryImpl<EnterpriseMapper, EnterprisePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, EnterprisePo po) {
        return findPage(page, po.likeEnterpriseCode().likeEnterpriseName().baseQueryWrapper().getQueryWrapper());
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
public class EnterpriseRepository extends BaseBeanRepositoryImpl<EnterpriseMapper, EnterprisePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, EnterprisePo po) {
        return findPage(page, po.likeEnterpriseCode().likeEnterpriseName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-22 22:15:42 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.likeEnterpriseCode().likeEnterpriseName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:08 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> queryWrapper) {
        return 0;
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.likeEnterpriseCode().likeEnterpriseName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.likeEnterpriseCode().likeEnterpriseName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.baseQueryWrapper().likeEnterpriseCode().likeEnterpriseName().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.baseQueryWrapper().likeEnterpriseCode().likeEnterpriseName().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
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
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
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
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
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
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<EnterprisePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(EnterprisePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<EnterprisePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
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
import noice.entity.po.bean.EnterprisePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.EnterpriseMapper;
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
public class EnterpriseRepository implements BeanRepository<EnterprisePo> {

    private EnterpriseMapper mapper;

    @Autowired
    public void setMapper(EnterpriseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(EnterprisePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<EnterprisePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(EnterprisePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(EnterprisePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<EnterprisePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public EnterprisePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public EnterprisePo find(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<EnterprisePo> findList(QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<EnterprisePo> findAll() {
        return mapper.selectList(new EnterprisePo().getQueryWrapper());
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, QueryWrapper<EnterprisePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<EnterprisePo> findPage(IPage<EnterprisePo> page, @NotNull EnterprisePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

