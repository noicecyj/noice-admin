## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.vo.bean.PersistentTableVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentTableControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentTableDto voToDto(PersistentTableVo vo);

    List<PersistentTableDto> voListToDtoList(List<PersistentTableVo> voList);

    Set<PersistentTableDto> voSetToDtoSet(Set<PersistentTableVo> voSet);

}
```

