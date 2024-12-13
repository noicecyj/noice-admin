## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.vo.bean.PersistentTableConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentTableRepository.class})
public interface PersistentTableConfigControllerConverter {

    @Mapping(target = "persistentTablePo", source = "vo.persistentTableId")
    PersistentTableConfigDto voToDto(PersistentTableConfigVo vo);

    List<PersistentTableConfigDto> voListToDtoList(List<PersistentTableConfigVo> voList);

    Set<PersistentTableConfigDto> voSetToDtoSet(Set<PersistentTableConfigVo> voSet);

}
```
## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.vo.bean.PersistentTableConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableConfigControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentTablePo", source = "vo.persistentTableId")
    PersistentTableConfigDto voToDto(PersistentTableConfigVo vo);

    List<PersistentTableConfigDto> voListToDtoList(List<PersistentTableConfigVo> voList);

    Set<PersistentTableConfigDto> voSetToDtoSet(Set<PersistentTableConfigVo> voSet);

}
```

