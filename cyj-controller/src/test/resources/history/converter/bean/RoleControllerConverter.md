## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface RoleControllerConverter {

    RoleDto voToDto(RoleVo vo);

    List<RoleDto> voListToDtoList(List<RoleVo> vo);

}
```

## 2024-03-15 23:20:32 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface RoleControllerConverter {

    RoleDto voToDto(RoleVo vo);

    List<RoleDto> voListToDtoList(List<RoleVo> vo);

}
```

## 2024-03-21 11:18:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface RoleControllerConverter {

    RoleDto voToDto(RoleVo vo);

    List<RoleDto> voListToDtoList(List<RoleVo> voList);

}
```
