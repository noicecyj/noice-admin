## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentFormRepository.class})
public interface PersistentFormConfigServiceAssembler {

    @Mapping(target = "persistentFormPo", source = "po.persistentFormId")
    PersistentFormConfigDto poToDto(PersistentFormConfigPo po);

    List<PersistentFormConfigDto> poListToDtoList(List<PersistentFormConfigPo> poList);

    Set<PersistentFormConfigDto> poSetToDtoSet(Set<PersistentFormConfigPo> poSet);

}
```
## 2024-12-13 15:41:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentFormRepository.class})
public interface PersistentFormConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentFormPo", source = "po.persistentFormId")
    PersistentFormConfigDto poToDto(PersistentFormConfigPo po);

    List<PersistentFormConfigDto> poListToDtoList(List<PersistentFormConfigPo> poList);

    Set<PersistentFormConfigDto> poSetToDtoSet(Set<PersistentFormConfigPo> poSet);

}
```

