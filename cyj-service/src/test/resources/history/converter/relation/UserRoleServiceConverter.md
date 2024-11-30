## 2024-03-15 14:52:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.converter.relation.BaseRelationConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class)
public interface UserRoleServiceConverter {

    UserRolePo dtoToPo(UserRoleDto dto);

    List<UserRolePo> dtoListToPoList(List<UserRoleDto> dto);

}
```

## 2024-03-21 11:18:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.converter.relation.BaseRelationConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class)
public interface UserRoleServiceConverter {

    UserRolePo dtoToPo(UserRoleDto dto);

    List<UserRolePo> dtoListToPoList(List<UserRoleDto> dtoList);

}
```
