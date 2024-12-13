## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceControllerAssembler {

    AppServiceVo dtoToVo(AppServiceDto dto);

    List<AppServiceVo> dtoListToVoList(List<AppServiceDto> dto);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceControllerAssembler {

    AppServiceVo dtoToVo(AppServiceDto dto);

    List<AppServiceVo> dtoListToVoList(List<AppServiceDto> dtoList);

}
```
## 2024-12-06 16:10:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    AppServiceVo dtoToVo(AppServiceDto dto);

    List<AppServiceVo> dtoListToVoList(List<AppServiceDto> dtoList);

    Set<AppServiceVo> dtoSetToVoSet(Set<AppServiceDto> dtoList);

}
```

## 2024-12-13 15:41:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceControllerAssembler {

    AppServiceVo dtoToVo(AppServiceDto dto);

    List<AppServiceVo> dtoListToVoList(List<AppServiceDto> dtoList);

    Set<AppServiceVo> dtoSetToVoSet(Set<AppServiceDto> dtoList);

}
```

