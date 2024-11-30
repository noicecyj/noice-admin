## 2024-03-15 22:24:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseRelationConverter.class,
        uses = {UserRepository.class, RoleRepository.class})
public interface UserRoleControllerConverter {

    @Mapping(target = "userPo", source = "vo.userId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    UserRoleDto voToDto(UserRoleVo vo);

    List<UserRoleDto> voListToDtoList(List<UserRoleVo> vo);

}
```

## 2024-03-15 23:20:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseRelationConverter.class,
        uses = {UserRepository.class, RoleRepository.class})
public interface UserRoleControllerConverter {

    @Mapping(target = "userPo", source = "vo.userId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    UserRoleDto voToDto(UserRoleVo vo);

    List<UserRoleDto> voListToDtoList(List<UserRoleVo> vo);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class, uses = {RoleRepository.class, UserRepository.class})
public interface UserRoleControllerConverter {

    @Mapping(target = "rolePo", source = "vo.roleId")
    @Mapping(target = "userPo", source = "vo.userId")
    UserRoleDto voToDto(UserRoleVo vo);

    List<UserRoleDto> voListToDtoList(List<UserRoleVo> voList);

}
```
