## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface UserControllerAssembler {

    UserVo dtoToVo(UserDto dto);

    List<UserVo> dtoListToVoList(List<UserDto> dto);

}
```

## 2024-03-16 11:04:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface UserControllerAssembler {

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    UserVo dtoToVo(UserDto dto);

    List<UserVo> dtoListToVoList(List<UserDto> dtoList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseServiceAssembler.class})
public interface UserControllerAssembler {

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    UserVo dtoToVo(UserDto dto);

    List<UserVo> dtoListToVoList(List<UserDto> dtoList);

}
```
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseServiceAssembler.class, RoleServiceAssembler.class})
public interface UserControllerAssembler {

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    UserVo dtoToVo(UserDto dto);

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "roleDtoList")
    UserVo dtoToVo(UserDto dto, List<RoleDto> roleDtoList);

    List<UserVo> dtoListToVoList(List<UserDto> dtoList);

    Set<UserVo> dtoSetToVoSet(Set<UserDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseServiceAssembler.class, RoleServiceAssembler.class})
public interface UserControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    UserVo dtoToVo(UserDto dto);

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "roleDtoList")
    UserVo dtoToVo(UserDto dto, List<RoleDto> roleDtoList);

    List<UserVo> dtoListToVoList(List<UserDto> dtoList);

    Set<UserVo> dtoSetToVoSet(Set<UserDto> dtoList);

}
```

