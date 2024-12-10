## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentServiceAssembler.class})
public interface InterfaceControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    InterfaceVo dtoToVo(InterfaceDto dto);

    List<InterfaceVo> dtoListToVoList(List<InterfaceDto> dtoList);

    Set<InterfaceVo> dtoSetToVoSet(Set<InterfaceDto> dtoList);

}
```

## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class})
public interface InterfaceControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    InterfaceVo dtoToVo(InterfaceDto dto);

    List<InterfaceVo> dtoListToVoList(List<InterfaceDto> dtoList);

    Set<InterfaceVo> dtoSetToVoSet(Set<InterfaceDto> dtoList);

}
```

## 2024-12-06 16:10:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class})
public interface InterfaceControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    InterfaceVo dtoToVo(InterfaceDto dto);

    List<InterfaceVo> dtoListToVoList(List<InterfaceDto> dtoList);

    Set<InterfaceVo> dtoSetToVoSet(Set<InterfaceDto> dtoList);

}
```

## 2024-12-09 17:52:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class})
public interface InterfaceControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    InterfaceVo dtoToVo(InterfaceDto dto);

    List<InterfaceVo> dtoListToVoList(List<InterfaceDto> dtoList);

    Set<InterfaceVo> dtoSetToVoSet(Set<InterfaceDto> dtoList);

}
```

