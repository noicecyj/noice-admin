## 2024-03-15 13:26:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceServiceConverter {

    AppServicePo dtoToPo(AppServiceDto dto);

    List<AppServicePo> dtoListToPoList(List<AppServiceDto> dtoList);

}
```

## 2024-03-15 13:29:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceServiceConverter {

    AppServicePo dtoToPo(AppServiceDto dto);

    List<AppServicePo> dtoListToPoList(List<AppServiceDto> dtoList);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceServiceConverter {

    AppServicePo dtoToPo(AppServiceDto dto);

    List<AppServicePo> dtoListToPoList(List<AppServiceDto> dtoList);

}
```
