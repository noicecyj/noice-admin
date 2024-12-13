## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> po);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

}
```

## 2024-09-18 15:05:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```
## 2024-10-11 18:47:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-11 19:35:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-18 19:39:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-18 22:36:09 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-18 23:25:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-20 20:01:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-10-20 20:24:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-11-09 00:34:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
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
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

## 2024-12-13 15:41:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

}
```

