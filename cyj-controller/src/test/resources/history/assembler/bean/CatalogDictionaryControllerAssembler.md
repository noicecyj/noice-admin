## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring",
        config = BaseBeanAssembler.class,
        uses = CatalogServiceAssembler.class)
public interface CatalogDictionaryControllerAssembler {

    @Mapping(target = "catalogDto", source = "dto.catalogPo")
    CatalogDictionaryVo dtoToVo(CatalogDictionaryDto dto);

    List<CatalogDictionaryVo> dtoListToVoList(List<CatalogDictionaryDto> dto);

}
```

## 2024-03-16 11:21:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryControllerAssembler {

    @Mapping(target = "catalogDto", source = "dto.catalogPo")
    CatalogDictionaryVo dtoToVo(CatalogDictionaryDto dto);

    List<CatalogDictionaryVo> dtoListToVoList(List<CatalogDictionaryDto> dtoList);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogServiceAssembler.class})
public interface CatalogDictionaryControllerAssembler {

    @Mapping(target = "catalogDto", source = "dto.catalogPo")
    CatalogDictionaryVo dtoToVo(CatalogDictionaryDto dto);

    List<CatalogDictionaryVo> dtoListToVoList(List<CatalogDictionaryDto> dtoList);

}
```
## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogServiceAssembler.class})
public interface CatalogDictionaryControllerAssembler {

    @Mapping(target = "catalogDto", source = "dto.catalogPo")
    CatalogDictionaryVo dtoToVo(CatalogDictionaryDto dto);

    List<CatalogDictionaryVo> dtoListToVoList(List<CatalogDictionaryDto> dtoList);

    Set<CatalogDictionaryVo> dtoSetToVoSet(Set<CatalogDictionaryDto> dtoList);

}
```

