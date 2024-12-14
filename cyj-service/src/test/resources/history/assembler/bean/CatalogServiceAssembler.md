## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> po);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> poList);

}
```
## 2024-12-13 15:41:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> poList);

    Set<CatalogDto> poSetToDtoSet(Set<CatalogPo> poSet);

}
```

## 2024-12-14 11:18:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> poList);

    Set<CatalogDto> poSetToDtoSet(Set<CatalogPo> poSet);

}
```

