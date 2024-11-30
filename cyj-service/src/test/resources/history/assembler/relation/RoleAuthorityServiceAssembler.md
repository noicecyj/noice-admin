## 2024-03-16 11:31:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;


import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class, uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "rolePo", source = "po.roleId")
    RoleAuthorityDto poToDto(RoleAuthorityPo po);

    List<RoleAuthorityDto> poListToDtoList(List<RoleAuthorityPo> po);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.relation;

import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "rolePo", source = "po.roleId")
    RoleAuthorityDto poToDto(RoleAuthorityPo po);

    List<RoleAuthorityDto> poListToDtoList(List<RoleAuthorityPo> poList);

}
```
