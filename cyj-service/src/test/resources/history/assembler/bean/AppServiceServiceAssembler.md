## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AppServiceServiceAssembler {

    AppServiceDto poToDto(AppServicePo po);

    List<AppServiceDto> poListToDtoList(List<AppServicePo> po);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceServiceAssembler {

    AppServiceDto poToDto(AppServicePo po);

    List<AppServiceDto> poListToDtoList(List<AppServicePo> poList);

}
```
## 2024-12-13 15:41:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceServiceAssembler {

    AppServiceDto poToDto(AppServicePo po);

    List<AppServiceDto> poListToDtoList(List<AppServicePo> poList);

    Set<AppServiceDto> poSetToDtoSet(Set<AppServicePo> poSet);

}
```

## 2024-12-14 11:18:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
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
public interface AppServiceServiceAssembler {

    AppServiceDto poToDto(AppServicePo po);

    List<AppServiceDto> poListToDtoList(List<AppServicePo> poList);

    Set<AppServiceDto> poSetToDtoSet(Set<AppServicePo> poSet);

}
```

