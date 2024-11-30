## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;


import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseRelationConverter.class,
        uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    RoleAuthorityDto voToDto(RoleAuthorityVo vo);

    List<RoleAuthorityDto> voListToDtoList(List<RoleAuthorityVo> vo);

}
```

## 2024-03-15 23:20:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;


import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseRelationConverter.class,
        uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    RoleAuthorityDto voToDto(RoleAuthorityVo vo);

    List<RoleAuthorityDto> voListToDtoList(List<RoleAuthorityVo> vo);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
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
public interface RoleAuthorityControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    RoleAuthorityDto voToDto(RoleAuthorityVo vo);

    List<RoleAuthorityDto> voListToDtoList(List<RoleAuthorityVo> voList);

}
```
