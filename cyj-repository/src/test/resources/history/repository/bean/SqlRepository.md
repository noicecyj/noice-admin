## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class SqlRepository extends BaseBeanRepositoryImpl<SqlMapper, SqlPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<SqlPo> findPage(IPage<SqlPo> page, SqlPo po) {
        return findPage(page, po.likeSqlCode().likeSqlName().baseQueryWrapper().getQueryWrapper());
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
public class SqlRepository extends BaseBeanRepositoryImpl<SqlMapper, SqlPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<SqlPo> findPage(IPage<SqlPo> page, SqlPo po) {
        return findPage(page, po.likeSqlCode().likeSqlName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-20 20:24:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.likeSqlCode().likeSqlName().likeSqlStr().likeSqlType().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.baseQueryWrapper().likeSqlCode().likeSqlName().likeSqlStr().likeSqlType().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.baseQueryWrapper().likeSqlCode().likeSqlName().likeSqlStr().likeSqlType().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
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
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
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
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<SqlPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(SqlPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<SqlPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
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
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.SqlMapper;
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
public class SqlRepository implements BeanRepository<SqlPo> {

    private SqlMapper mapper;

    @Autowired
    public void setMapper(SqlMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(SqlPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<SqlPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(SqlPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(SqlPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<SqlPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public SqlPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public SqlPo find(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<SqlPo> findList(QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<SqlPo> findAll() {
        return mapper.selectList(new SqlPo().getQueryWrapper());
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, QueryWrapper<SqlPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<SqlPo> findPage(IPage<SqlPo> page, @NotNull SqlPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

