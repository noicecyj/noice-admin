## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogControllerAssembler {

    CatalogVo dtoToVo(CatalogDto dto);

    List<CatalogVo> dtoListToVoList(List<CatalogDto> dto);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogControllerAssembler {

    CatalogVo dtoToVo(CatalogDto dto);

    List<CatalogVo> dtoListToVoList(List<CatalogDto> dtoList);

}
```
## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogControllerAssembler {

    CatalogVo dtoToVo(CatalogDto dto);

    List<CatalogVo> dtoListToVoList(List<CatalogDto> dtoList);

    Set<CatalogVo> dtoSetToVoSet(Set<CatalogDto> dtoList);

}
```

## 2024-12-06 16:10:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    CatalogVo dtoToVo(CatalogDto dto);

    List<CatalogVo> dtoListToVoList(List<CatalogDto> dtoList);

    Set<CatalogVo> dtoSetToVoSet(Set<CatalogDto> dtoList);

}
```

