## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentRepository.class})
public interface PersistentFormServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentFormDto poToDto(PersistentFormPo po);

    List<PersistentFormDto> poListToDtoList(List<PersistentFormPo> poList);

    Set<PersistentFormDto> poSetToDtoSet(Set<PersistentFormPo> poSet);

}
```

