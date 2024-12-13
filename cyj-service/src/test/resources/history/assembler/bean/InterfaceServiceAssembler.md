## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.po.bean.InterfacePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    InterfaceDto poToDto(InterfacePo po);

    List<InterfaceDto> poListToDtoList(List<InterfacePo> poList);

    Set<InterfaceDto> poSetToDtoSet(Set<InterfacePo> poSet);

}
```

## 2024-12-09 17:52:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.po.bean.InterfacePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class})
public interface InterfaceServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    InterfaceDto poToDto(InterfacePo po);

    List<InterfaceDto> poListToDtoList(List<InterfacePo> poList);

    Set<InterfaceDto> poSetToDtoSet(Set<InterfacePo> poSet);

}
```

## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.po.bean.InterfacePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    InterfaceDto poToDto(InterfacePo po);

    List<InterfaceDto> poListToDtoList(List<InterfacePo> poList);

    Set<InterfaceDto> poSetToDtoSet(Set<InterfacePo> poSet);

}
```

