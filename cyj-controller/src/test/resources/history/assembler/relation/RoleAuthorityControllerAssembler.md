## 2024-03-16 11:31:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.AuthorityServiceAssembler;
import noice.assembler.bean.RoleServiceAssembler;
import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleAuthorityControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "roleDto", source = "dto.rolePo")
    RoleAuthorityVo dtoToVo(RoleAuthorityDto dto);

    List<RoleAuthorityVo> dtoListToVoList(List<RoleAuthorityDto> dto);

}
```

## 2024-03-16 11:37:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.AuthorityServiceAssembler;
import noice.assembler.bean.RoleServiceAssembler;
import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {AuthorityServiceAssembler.class, RoleServiceAssembler.class})
public interface RoleAuthorityControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "roleDto", source = "dto.rolePo")
    RoleAuthorityVo dtoToVo(RoleAuthorityDto dto);

    List<RoleAuthorityVo> dtoListToVoList(List<RoleAuthorityDto> dtoList);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.assembler.bean.AuthorityServiceAssembler;
import noice.assembler.bean.RoleServiceAssembler;
import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {AuthorityServiceAssembler.class, RoleServiceAssembler.class})
public interface RoleAuthorityControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "roleDto", source = "dto.rolePo")
    RoleAuthorityVo dtoToVo(RoleAuthorityDto dto);

    List<RoleAuthorityVo> dtoListToVoList(List<RoleAuthorityDto> dtoList);

}
```
