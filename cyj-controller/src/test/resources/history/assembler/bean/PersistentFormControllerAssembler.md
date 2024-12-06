## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.vo.bean.PersistentFormVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentFormControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentFormVo dtoToVo(PersistentFormDto dto);

    List<PersistentFormVo> dtoListToVoList(List<PersistentFormDto> dtoList);

    Set<PersistentFormVo> dtoSetToVoSet(Set<PersistentFormDto> dtoList);

}
```

