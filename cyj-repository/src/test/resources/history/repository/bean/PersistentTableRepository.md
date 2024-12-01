## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentTableRepository extends BaseBeanRepositoryImpl<PersistentTableMapper, PersistentTablePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, PersistentTablePo po) {
        return findPage(page, po.likePersistentTableCode().likePersistentTableName().baseQueryWrapper().getQueryWrapper());
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
public class PersistentTableRepository extends BaseBeanRepositoryImpl<PersistentTableMapper, PersistentTablePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, PersistentTablePo po) {
        return findPage(page, po.likePersistentTableCode().likePersistentTableName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-20 20:24:44 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTablePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
        return findPage(page, po.eqPersistentId().likePersistentTableCode().likePersistentTableName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:18 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTablePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
        return findPage(page, po.baseQueryWrapper().eqPersistentId().likePersistentTableCode().likePersistentTableName().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
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
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTablePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
        return findPage(page, po.baseQueryWrapper().eqPersistentId().likePersistentTableCode().likePersistentTableName().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
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
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTablePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
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
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentTableMapper;
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
public class PersistentTableRepository implements BeanRepository<PersistentTablePo> {

    private PersistentTableMapper mapper;

    @Autowired
    public void setMapper(PersistentTableMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentTablePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentTablePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentTablePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentTablePo find(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentTablePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentTablePo> findList(QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, QueryWrapper<PersistentTablePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentTablePo> findPage(IPage<PersistentTablePo> page, @NotNull PersistentTablePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

