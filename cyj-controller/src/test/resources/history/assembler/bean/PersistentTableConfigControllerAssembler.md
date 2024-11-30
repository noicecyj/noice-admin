## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.vo.bean.PersistentTableConfigVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentTableServiceAssembler.class})
public interface PersistentTableConfigControllerAssembler {

    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableConfigVo dtoToVo(PersistentTableConfigDto dto);

    List<PersistentTableConfigVo> dtoListToVoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigVo> dtoSetToVoSet(Set<PersistentTableConfigDto> dtoList);

}
```
