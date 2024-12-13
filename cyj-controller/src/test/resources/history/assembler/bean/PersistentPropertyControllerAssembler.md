## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dto);

}
```

## 2024-03-16 11:21:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentRepository.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

}
```
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

    Set<PersistentPropertyVo> dtoSetToVoSet(Set<PersistentPropertyDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

    Set<PersistentPropertyVo> dtoSetToVoSet(Set<PersistentPropertyDto> dtoList);

}
```

## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

    Set<PersistentPropertyVo> dtoSetToVoSet(Set<PersistentPropertyDto> dtoList);

}
```

