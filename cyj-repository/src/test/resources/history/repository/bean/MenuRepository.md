## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

/**
 * @author Noice
 */
@Repository
public class MenuRepository extends BaseBeanRepositoryImpl<MenuMapper, MenuPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<MenuPo> findPage(IPage<MenuPo> page, MenuPo po) {
        return findPage(page, po.likeMenuCode().likeMenuName().baseQueryWrapper().getQueryWrapper());
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
public class MenuRepository extends BaseBeanRepositoryImpl<MenuMapper, MenuPo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<MenuPo> findPage(IPage<MenuPo> page, MenuPo po) {
        return findPage(page, po.likeMenuCode().likeMenuName().baseQueryWrapper().getQueryWrapper());
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-22 11:33:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.eqAuthorityId().likeMenuCode().likeMenuComponent().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:15:44 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-03-22 22:49:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<MenuPo> queryWrapper) {
        return 0;
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-10-20 20:24:40 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().baseQueryWrapper().getQueryWrapper());
    }

}
```

## 2024-11-09 00:34:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Noice
 */
@Repository
@SuppressWarnings("unused")
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po);
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po);
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().getQueryWrapper());
    }

}
```

## 2024-11-10 13:03:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.context.UserContext;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
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
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.baseQueryWrapper().eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl().getQueryWrapper());
    }

}
```

## 2024-11-16 23:38:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.repository.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.common.contants.UserContext;
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
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
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
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
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
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
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectBatchIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
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
import noice.entity.po.bean.MenuPo;
import noice.handler.bean.BeanRepository;
import noice.mapper.bean.MenuMapper;
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
public class MenuRepository implements BeanRepository<MenuPo> {

    private MenuMapper mapper;

    @Autowired
    public void setMapper(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int add(MenuPo po) {
        return mapper.insert(po.eqCreatedBy(UserContext.getUser().getString(USER_ID)).eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public int delete(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.delete(baseQueryWrapper);
    }

    @Override
    public int update(MenuPo po) {
        return mapper.updateById(po.eqUpdatedBy(UserContext.getUser().getString(USER_ID)));
    }

    @Override
    public long count(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectCount(baseQueryWrapper);
    }

    @Override
    public MenuPo find(String id) {
        return mapper.selectById(id);
    }

    @Override
    public MenuPo find(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectOne(baseQueryWrapper);
    }

    @Override
    public List<MenuPo> findList(List<String> ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<MenuPo> findList(QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectList(baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, QueryWrapper<MenuPo> baseQueryWrapper) {
        return mapper.selectPage(page, baseQueryWrapper);
    }

    @Override
    public IPage<MenuPo> findPage(IPage<MenuPo> page, @NotNull MenuPo po) {
        return findPage(page, po.baseQueryWrapper().likeAuto().getQueryWrapper());
    }

}
```

