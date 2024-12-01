## 2024-03-16 10:56:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceAssembler {

    UserDto poToDto(UserPo po);

    List<UserDto> poListToDtoList(List<UserPo> po);

}
```

## 2024-03-16 11:04:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface UserServiceAssembler {

    UserDto poToDto(UserPo po);

    List<UserDto> poListToDtoList(List<UserPo> poList);

}
```

## 2024-03-16 14:58:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface UserServiceAssembler {

    UserDto poToDto(UserPo po);

    List<UserDto> poListToDtoList(List<UserPo> poList);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.EnterpriseRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseRepository.class})
public interface UserServiceAssembler {

    @Mapping(target = "enterprisePo", source = "po.enterpriseId")
    UserDto poToDto(UserPo po);

    List<UserDto> poListToDtoList(List<UserPo> poList);

}
```