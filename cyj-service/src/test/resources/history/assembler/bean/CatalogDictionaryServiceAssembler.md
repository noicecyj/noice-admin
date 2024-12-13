## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = CatalogRepository.class)
public interface CatalogDictionaryServiceAssembler {

    @Mapping(target = "catalogPo", source = "po.catalogId")
    CatalogDictionaryDto poToDto(CatalogDictionaryPo po);

    List<CatalogDictionaryDto> poListToDtoList(List<CatalogDictionaryPo> po);

}
```

## 2024-03-16 11:04:54 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryServiceAssembler {

    CatalogDictionaryDto poToDto(CatalogDictionaryPo po);

    List<CatalogDictionaryDto> poListToDtoList(List<CatalogDictionaryPo> poList);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryServiceAssembler {

    @Mapping(target = "catalogPo", source = "po.catalogId")
    CatalogDictionaryDto poToDto(CatalogDictionaryPo po);

    List<CatalogDictionaryDto> poListToDtoList(List<CatalogDictionaryPo> poList);

}
```
## 2024-12-13 15:41:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryServiceAssembler {

    @Mapping(target = "catalogPo", source = "po.catalogId")
    CatalogDictionaryDto poToDto(CatalogDictionaryPo po);

    List<CatalogDictionaryDto> poListToDtoList(List<CatalogDictionaryPo> poList);

    Set<CatalogDictionaryDto> poSetToDtoSet(Set<CatalogDictionaryPo> poSet);

}
```

