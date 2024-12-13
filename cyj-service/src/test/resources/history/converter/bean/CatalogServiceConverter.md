## 2024-03-15 13:26:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dto);

}
```

## 2024-03-15 13:29:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dto);

}
```

## 2024-03-15 13:32:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dto);

}
```

## 2024-03-15 13:34:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dto);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dtoList);

}
```
## 2024-12-13 15:41:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dtoList);

    Set<CatalogPo> dtoSetToPoSet(Set<CatalogDto> dtoSet);

}
```

