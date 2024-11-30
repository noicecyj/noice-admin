## 2024-03-16 11:31:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.RoleServiceAssembler;
import noice.assembler.bean.UserServiceAssembler;
import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleServiceAssembler.class, UserServiceAssembler.class})
public interface UserRoleControllerAssembler {

    @Mapping(target = "userDto", source = "dto.userPo")
    @Mapping(target = "roleDto", source = "dto.rolePo")
    UserRoleVo dtoToVo(UserRoleDto dto);

    List<UserRoleVo> dtoListToVoList(List<UserRoleDto> dto);

}
```

## 2024-03-16 11:37:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.RoleServiceAssembler;
import noice.assembler.bean.UserServiceAssembler;
import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleServiceAssembler.class, UserServiceAssembler.class})
public interface UserRoleControllerAssembler {

    @Mapping(target = "roleDto", source = "dto.rolePo")
    @Mapping(target = "userDto", source = "dto.userPo")
    UserRoleVo dtoToVo(UserRoleDto dto);

    List<UserRoleVo> dtoListToVoList(List<UserRoleDto> dtoList);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.RoleServiceAssembler;
import noice.assembler.bean.UserServiceAssembler;
import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleServiceAssembler.class, UserServiceAssembler.class})
public interface UserRoleControllerAssembler {

    @Mapping(target = "roleDto", source = "dto.rolePo")
    @Mapping(target = "userDto", source = "dto.userPo")
    UserRoleVo dtoToVo(UserRoleDto dto);

    List<UserRoleVo> dtoListToVoList(List<UserRoleDto> dtoList);

}
```
