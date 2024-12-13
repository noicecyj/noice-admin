## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.vo.bean.PersistentFormVo;
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
public interface PersistentFormControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentFormDto voToDto(PersistentFormVo vo);

    List<PersistentFormDto> voListToDtoList(List<PersistentFormVo> voList);

    Set<PersistentFormDto> voSetToDtoSet(Set<PersistentFormVo> voSet);

}
```

