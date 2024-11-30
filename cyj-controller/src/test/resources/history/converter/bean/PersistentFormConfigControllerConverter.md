## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.vo.bean.PersistentFormConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentFormRepository.class})
public interface PersistentFormConfigControllerConverter {

    @Mapping(target = "persistentFormPo", source = "vo.persistentFormId")
    PersistentFormConfigDto voToDto(PersistentFormConfigVo vo);

    List<PersistentFormConfigDto> voListToDtoList(List<PersistentFormConfigVo> voList);

    Set<PersistentFormConfigDto> voSetToDtoSet(Set<PersistentFormConfigVo> voSet);

}
```
