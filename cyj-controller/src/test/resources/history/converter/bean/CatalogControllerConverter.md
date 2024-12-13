## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogControllerConverter {

    CatalogDto voToDto(CatalogVo vo);

    List<CatalogDto> voListToDtoList(List<CatalogVo> vo);

}
```

## 2024-03-15 23:20:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogControllerConverter {

    CatalogDto voToDto(CatalogVo vo);

    List<CatalogDto> voListToDtoList(List<CatalogVo> vo);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogControllerConverter {

    CatalogDto voToDto(CatalogVo vo);

    List<CatalogDto> voListToDtoList(List<CatalogVo> voList);

}
```
## 2024-12-13 15:41:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogControllerConverter {

    CatalogDto voToDto(CatalogVo vo);

    List<CatalogDto> voListToDtoList(List<CatalogVo> voList);

    Set<CatalogDto> voSetToDtoSet(Set<CatalogVo> voSet);

}
```

