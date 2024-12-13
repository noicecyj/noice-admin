## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}
```

## 2024-12-09 17:52:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}
```

## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}
```

