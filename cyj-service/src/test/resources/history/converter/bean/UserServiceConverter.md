## 2024-03-15 13:26:08 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dto);

}
```

## 2024-03-15 13:29:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dto);

}
```

## 2024-03-15 13:32:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dto);

}
```

## 2024-03-15 13:34:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dto);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dtoList);

}
```
