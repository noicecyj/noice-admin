## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentTableRepository.class})
public interface PersistentTableSearchConfigServiceAssembler {

    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableSearchConfigDto poToDto(PersistentTableSearchConfigPo po);

    List<PersistentTableSearchConfigDto> poListToDtoList(List<PersistentTableSearchConfigPo> poList);

    Set<PersistentTableSearchConfigDto> poSetToDtoSet(Set<PersistentTableSearchConfigPo> poSet);

}
```
## 2024-12-13 15:41:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableSearchConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableSearchConfigDto poToDto(PersistentTableSearchConfigPo po);

    List<PersistentTableSearchConfigDto> poListToDtoList(List<PersistentTableSearchConfigPo> poList);

    Set<PersistentTableSearchConfigDto> poSetToDtoSet(Set<PersistentTableSearchConfigPo> poSet);

}
```

## 2024-12-14 11:18:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableSearchConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableSearchConfigDto poToDto(PersistentTableSearchConfigPo po);

    List<PersistentTableSearchConfigDto> poListToDtoList(List<PersistentTableSearchConfigPo> poList);

    Set<PersistentTableSearchConfigDto> poSetToDtoSet(Set<PersistentTableSearchConfigPo> poSet);

}
```

