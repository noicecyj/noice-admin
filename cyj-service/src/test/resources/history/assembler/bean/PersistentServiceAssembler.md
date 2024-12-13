## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class, AppServiceRepository.class})
public interface PersistentServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    @Mapping(target = "appServicePo", source = "po.appServiceId")
    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> po);

}
```

## 2024-03-16 11:04:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentServiceAssembler {

    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> poList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
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
public interface PersistentServiceAssembler {

    @Mapping(target = "appServicePo", source = "po.appServiceId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> poList);

}
```
## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentServiceAssembler {

    @Mapping(target = "appServicePo", source = "po.appServiceId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> poList);

    Set<PersistentDto> poSetToDtoSet(Set<PersistentPo> poSet);

}
```

