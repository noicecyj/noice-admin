## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.po.bean.PersistentTablePo;
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
public interface PersistentTableServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentTableDto poToDto(PersistentTablePo po);

    List<PersistentTableDto> poListToDtoList(List<PersistentTablePo> poList);

    Set<PersistentTableDto> poSetToDtoSet(Set<PersistentTablePo> poSet);

}
```

