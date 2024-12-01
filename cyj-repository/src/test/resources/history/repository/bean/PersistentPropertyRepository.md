## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.mapper.bean.PersistentPropertyMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentPropertyRepository extends BaseBeanRepositoryImpl<PersistentPropertyMapper, PersistentPropertyPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, PersistentPropertyPo po) {
        return findPage(page, po.likePersistentPropertyCode().likePersistentPropertyName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-02-19 14:28:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.mapper.bean.PersistentPropertyMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class PersistentPropertyRepository extends BaseBeanRepositoryImpl<PersistentPropertyMapper, PersistentPropertyPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, PersistentPropertyPo po) {
        return findPage(page, po.likePersistentPropertyCode().likePersistentPropertyName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-16 14:58:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    //******************************代码生成方法，请勿改动*************************************//

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, PersistentPropertyPo po) {
        return findPage(page, po.likePersistentPropertyCode().likePersistentPropertyName().eqPersistentId().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-22 22:15:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> queryWrapper) {
        return 0;
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-23 09:38:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyDefaultValue().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:18 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.baseQueryWrapper().eqPersistentId().likePersistentPropertyCode().likePersistentPropertyDefaultValue().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
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
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.baseQueryWrapper().eqPersistentId().likePersistentPropertyCode().likePersistentPropertyDefaultValue().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:57 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
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
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
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
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.PersistentPropertyMapper;
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
public class PersistentPropertyRepository implements BeanRepository<PersistentPropertyPo> {

    private PersistentPropertyMapper mapper;

    @Autowired
    public void setMapper(PersistentPropertyMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(PersistentPropertyPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(PersistentPropertyPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public PersistentPropertyPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public PersistentPropertyPo find(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<PersistentPropertyPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<PersistentPropertyPo> findList(QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, QueryWrapper<PersistentPropertyPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<PersistentPropertyPo> findPage(IPage<PersistentPropertyPo> page, @NotNull PersistentPropertyPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

