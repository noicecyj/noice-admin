## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleControllerAssembler {

    RoleVo dtoToVo(RoleDto dto);

    List<RoleVo> dtoListToVoList(List<RoleDto> dto);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleControllerAssembler {

    RoleVo dtoToVo(RoleDto dto);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

}
```

## 2024-09-18 16:34:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleControllerAssembler {

    RoleVo dtoToVo(RoleDto dto);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-09-26 11:13:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, UserServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    @Mapping(target = "userDtoList", source = "dto.userPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    @Mapping(target = "userDtoList", source = "userDtoList")
    RoleVo dtoToVo(RoleDto dto, List<AuthorityDto> authorityDtoList, List<UserDto> userDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```
## 2024-10-11 18:47:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-11 19:35:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-18 19:39:29 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-18 22:36:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-18 23:25:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-20 20:01:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-10-20 20:24:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

## 2024-12-13 15:41:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}
```

