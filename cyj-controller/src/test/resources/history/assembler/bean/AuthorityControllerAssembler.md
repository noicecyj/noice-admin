## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityControllerAssembler {

    AuthorityVo dtoToVo(AuthorityDto dto);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dto);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityControllerAssembler {

    AuthorityVo dtoToVo(AuthorityDto dto);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

}
```

## 2024-09-18 16:34:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityControllerAssembler {

    AuthorityVo dtoToVo(AuthorityDto dto);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```
## 2024-10-11 18:47:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-11 19:35:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-18 19:39:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-18 22:36:09 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-18 23:25:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-20 20:01:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-10-20 20:24:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-11-09 00:34:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}
```

