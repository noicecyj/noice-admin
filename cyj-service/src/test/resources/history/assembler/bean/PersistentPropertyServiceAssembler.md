## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = PersistentRepository.class)
public interface PersistentPropertyServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    @Mapping(target = "relationPersistentPo", source = "po.relationPersistentId")
    PersistentPropertyDto poToDto(PersistentPropertyPo po);

    List<PersistentPropertyDto> poListToDtoList(List<PersistentPropertyPo> po);

}
```

## 2024-03-16 11:04:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentRepository.class})
public interface PersistentPropertyServiceAssembler {

    PersistentPropertyDto poToDto(PersistentPropertyPo po);

    List<PersistentPropertyDto> poListToDtoList(List<PersistentPropertyPo> poList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentRepository.class})
public interface PersistentPropertyServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    @Mapping(target = "relationPersistentPo", source = "po.relationPersistentId")
    PersistentPropertyDto poToDto(PersistentPropertyPo po);

    List<PersistentPropertyDto> poListToDtoList(List<PersistentPropertyPo> poList);

}
```
