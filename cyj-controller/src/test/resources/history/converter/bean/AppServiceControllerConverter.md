## 2024-03-15 22:24:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceControllerConverter {

    AppServiceDto voToDto(AppServiceVo vo);

    List<AppServiceDto> voListToDtoList(List<AppServiceVo> vo);

}
```

## 2024-03-15 23:20:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceControllerConverter {

    AppServiceDto voToDto(AppServiceVo vo);

    List<AppServiceDto> voListToDtoList(List<AppServiceVo> vo);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceControllerConverter {

    AppServiceDto voToDto(AppServiceVo vo);

    List<AppServiceDto> voListToDtoList(List<AppServiceVo> voList);

}
```
