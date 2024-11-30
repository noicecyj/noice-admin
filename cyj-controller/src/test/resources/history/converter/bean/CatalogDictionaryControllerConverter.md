## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryControllerConverter {

    @Mapping(target = "catalogPo", source = "vo.catalogId")
    CatalogDictionaryDto voToDto(CatalogDictionaryVo vo);

    List<CatalogDictionaryDto> voListToDtoList(List<CatalogDictionaryVo> vo);

}
```

## 2024-03-15 23:20:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryControllerConverter {

    @Mapping(target = "catalogPo", source = "vo.catalogId")
    CatalogDictionaryDto voToDto(CatalogDictionaryVo vo);

    List<CatalogDictionaryDto> voListToDtoList(List<CatalogDictionaryVo> vo);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryControllerConverter {

    @Mapping(target = "catalogPo", source = "vo.catalogId")
    CatalogDictionaryDto voToDto(CatalogDictionaryVo vo);

    List<CatalogDictionaryDto> voListToDtoList(List<CatalogDictionaryVo> voList);

}
```
