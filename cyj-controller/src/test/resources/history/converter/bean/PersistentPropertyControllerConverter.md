## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseBeanConverter.class,
        uses = PersistentRepository.class)
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "relationPersistentPo", source = "vo.relationPersistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> vo);

}
```

## 2024-03-15 23:20:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseBeanConverter.class,
        uses = PersistentRepository.class)
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "relationPersistentPo", source = "vo.relationPersistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> vo);

}
```

## 2024-03-15 23:30:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> voList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "relationPersistentPo", source = "vo.relationPersistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> voList);

}
```
## 2024-12-13 15:41:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "relationPersistentPo", source = "vo.relationPersistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> voList);

    Set<PersistentPropertyDto> voSetToDtoSet(Set<PersistentPropertyVo> voSet);

}
```

