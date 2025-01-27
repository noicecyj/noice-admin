## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.AppServicePo;
import noice.mapper.bean.AppServiceMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class AppServiceRepository extends BaseBeanRepositoryImpl<AppServiceMapper, AppServicePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, AppServicePo po) {
        return findPage(page, po.likeAppServiceCode().likeAppServiceName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.AppServicePo;
import noice.mapper.bean.AppServiceMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class AppServiceRepository extends BaseBeanRepositoryImpl<AppServiceMapper, AppServicePo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, AppServicePo po) {
        return findPage(page, po.likeAppServiceCode().likeAppServiceName().baseQueryWrapper().getQueryWrapper());
    }

    public AppServicePo findByCode(String code) {
        return find(new AppServicePo().eqAppServiceCode(code).getQueryWrapper());
    }

    public List<AppServicePo> findByName(String name) {
        return findList(new AppServicePo().eqAppServiceName(name).getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    //******************************代码生成方法，请勿改动*************************************//

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return this.findPage(page, po.likeAppServiceCode().likeAppServiceName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.likeAppServiceApi().likeAppServiceCode().likeAppServiceName().likeAppServicePath().likeAppServicePort().likeAppServiceTruePath().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.likeAppServiceApi().likeAppServiceCode().likeAppServiceName().likeAppServicePath().likeAppServicePort().likeAppServiceTruePath().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAppServiceApi().likeAppServiceCode().likeAppServiceName().likeAppServicePath().likeAppServicePort().likeAppServiceTruePath().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
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
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-01 17:31:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-14 21:33:09 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2024-12-15 16:38:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(@Qualifier("delete") String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(@Qualifier("find") String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findAll() {
        return mapper.selectList(new AppServicePo().getQueryWrapper());
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:43:29 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(AppServicePo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findAll() {
        return mapper.selectList(new AppServicePo().getQueryWrapper());
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

## 2025-01-27 15:59:08 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.AppServicePo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.AppServiceMapper;
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
public class AppServiceRepository implements BeanRepository<AppServicePo> {

    private AppServiceMapper mapper;

    @Autowired
    public void setMapper(AppServiceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String add(AppServicePo po) {
        int insert = mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return insert == 0 ? null : po.getId();
    }

    @Override
    public int addBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.insert(poList, 100).size();
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int deleteBatch(List<String> ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int update(AppServicePo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public boolean insertOrUpdate(AppServicePo po) {
        return mapper.insertOrUpdate(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int updateBatch(List<AppServicePo> poList) {
        poList.forEach(po -> po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
        return mapper.updateById(poList, 100).size();
    }

    @Override
    public long count(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public AppServicePo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public AppServicePo find(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<AppServicePo> findList(QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public List<AppServicePo> findAll() {
        return mapper.selectList(new AppServicePo().getQueryWrapper());
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, QueryWrapper<AppServicePo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<AppServicePo> findPage(IPage<AppServicePo> page, @NotNull AppServicePo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

