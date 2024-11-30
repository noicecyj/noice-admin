## 2024-03-15 13:26:08 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dto);

}
```

## 2024-03-15 13:29:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dto);

}
```

## 2024-03-15 13:32:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dto);

}
```

## 2024-03-15 13:34:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dto);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dtoList);

}
```
