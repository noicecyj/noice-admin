## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseBeanConverter.class,
        uses = {PersistentRepository.class, AppServiceRepository.class})
public interface PersistentControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "appServicePo", source = "vo.appServiceId")
    PersistentDto voToDto(PersistentVo vo);

    List<PersistentDto> voListToDtoList(List<PersistentVo> vo);

}
```

## 2024-03-15 23:20:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseBeanConverter.class,
        uses = {PersistentRepository.class, AppServiceRepository.class})
public interface PersistentControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "appServicePo", source = "vo.appServiceId")
    PersistentDto voToDto(PersistentVo vo);

    List<PersistentDto> voListToDtoList(List<PersistentVo> vo);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentControllerConverter {

    @Mapping(target = "appServicePo", source = "vo.appServiceId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentDto voToDto(PersistentVo vo);

    List<PersistentDto> voListToDtoList(List<PersistentVo> voList);

}
```
