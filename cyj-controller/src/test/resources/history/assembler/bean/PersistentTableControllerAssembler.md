## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.vo.bean.PersistentTableVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentTableControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentTableVo dtoToVo(PersistentTableDto dto);

    List<PersistentTableVo> dtoListToVoList(List<PersistentTableDto> dtoList);

    Set<PersistentTableVo> dtoSetToVoSet(Set<PersistentTableDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.vo.bean.PersistentTableVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentTableControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentTableVo dtoToVo(PersistentTableDto dto);

    List<PersistentTableVo> dtoListToVoList(List<PersistentTableDto> dtoList);

    Set<PersistentTableVo> dtoSetToVoSet(Set<PersistentTableDto> dtoList);

}
```

