## 2024-03-16 11:31:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class, uses = {UserRepository.class, RoleRepository.class})
public interface UserRoleServiceAssembler {

    @Mapping(target = "userPo", source = "po.userId")
    @Mapping(target = "rolePo", source = "po.roleId")
    UserRoleDto poToDto(UserRolePo po);

    List<UserRoleDto> poListToDtoList(List<UserRolePo> po);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleRepository.class, UserRepository.class})
public interface UserRoleServiceAssembler {

    @Mapping(target = "rolePo", source = "po.roleId")
    @Mapping(target = "userPo", source = "po.userId")
    UserRoleDto poToDto(UserRolePo po);

    List<UserRoleDto> poListToDtoList(List<UserRolePo> poList);

}
```
