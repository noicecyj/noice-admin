## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class WorkFlowRepository extends BaseBeanRepositoryImpl<WorkFlowMapper, WorkFlowPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, WorkFlowPo po) {
        return findPage(page, po.likeWorkFlowCode().likeWorkFlowName().baseQueryWrapper().getQueryWrapper());
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
public class WorkFlowRepository extends BaseBeanRepositoryImpl<WorkFlowMapper, WorkFlowPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, WorkFlowPo po) {
        return findPage(page, po.likeWorkFlowCode().likeWorkFlowName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-20 20:24:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.likeWorkFlowCode().likeWorkFlowName().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.baseQueryWrapper().likeWorkFlowCode().likeWorkFlowName().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.baseQueryWrapper().likeWorkFlowCode().likeWorkFlowName().getQueryWrapper());
    }

}
```

## 2024-11-16 23:39:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
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
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
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
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.WorkFlowMapper;
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
public class WorkFlowRepository implements BeanRepository<WorkFlowPo> {

    private WorkFlowMapper mapper;

    @Autowired
    public void setMapper(WorkFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(WorkFlowPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<WorkFlowPo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(WorkFlowPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(WorkFlowPo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<WorkFlowPo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public WorkFlowPo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public WorkFlowPo find(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<WorkFlowPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<WorkFlowPo> findList(QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, QueryWrapper<WorkFlowPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<WorkFlowPo> findPage(IPage<WorkFlowPo> page, @NotNull WorkFlowPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

