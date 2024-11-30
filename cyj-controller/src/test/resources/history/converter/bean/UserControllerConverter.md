## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserControllerConverter {

    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> vo);

}
```

## 2024-03-15 23:20:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserControllerConverter {

    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> vo);

}
```

## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserControllerConverter {
    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> voList);

}
```

## 2024-03-16 11:04:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserControllerConverter {

    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> voList);

}
```

## 2024-03-16 14:58:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserControllerConverter {

    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> voList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.EnterpriseRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {EnterpriseRepository.class})
public interface UserControllerConverter {

    @Mapping(target = "enterprisePo", source = "vo.enterpriseId")
    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> voList);

}
```
