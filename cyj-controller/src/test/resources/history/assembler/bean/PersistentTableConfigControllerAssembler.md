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
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentTableServiceAssembler.class})
public interface PersistentTableConfigControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableConfigVo dtoToVo(PersistentTableConfigDto dto);

    List<PersistentTableConfigVo> dtoListToVoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigVo> dtoSetToVoSet(Set<PersistentTableConfigDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentTableServiceAssembler.class})
public interface PersistentTableConfigControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableConfigVo dtoToVo(PersistentTableConfigDto dto);

    List<PersistentTableConfigVo> dtoListToVoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigVo> dtoSetToVoSet(Set<PersistentTableConfigDto> dtoList);

}
```

## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentTableServiceAssembler.class})
public interface PersistentTableConfigControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableConfigVo dtoToVo(PersistentTableConfigDto dto);

    List<PersistentTableConfigVo> dtoListToVoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigVo> dtoSetToVoSet(Set<PersistentTableConfigDto> dtoList);

}
```

