## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceServiceAssembler.class, PersistentServiceAssembler.class})
public interface PersistentControllerAssembler {

    @Mapping(target = "appServiceDto", source = "dto.appServicePo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentVo dtoToVo(PersistentDto dto);

    List<PersistentVo> dtoListToVoList(List<PersistentDto> dto);

}
```

## 2024-03-16 11:21:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentControllerAssembler {

    @Mapping(target = "appServiceDto", source = "dto.appServicePo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentVo dtoToVo(PersistentDto dto);

    List<PersistentVo> dtoListToVoList(List<PersistentDto> dtoList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceServiceAssembler.class, PersistentServiceAssembler.class})
public interface PersistentControllerAssembler {

    @Mapping(target = "appServiceDto", source = "dto.appServicePo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentVo dtoToVo(PersistentDto dto);

    List<PersistentVo> dtoListToVoList(List<PersistentDto> dtoList);

}
```
