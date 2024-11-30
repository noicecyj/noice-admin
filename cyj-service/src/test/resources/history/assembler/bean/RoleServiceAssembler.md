## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    List<RoleDto> poListToDtoList(List<RolePo> po);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

}
```

## 2024-09-18 15:05:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-09-22 12:45:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.UserPo;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "authorityPoList", source = "authorityPoList")
    @Mapping(target = "userPoList", source = "userPoList")
    RoleDto poToDto(RolePo po, List<AuthorityPo> authorityPoList, List<UserPo> userPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```
## 2024-10-11 18:47:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-11 19:35:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-18 19:39:29 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-18 22:36:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-18 23:25:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-20 20:01:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-10-20 20:24:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}
```

