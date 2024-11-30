## 2024-03-03 14:13:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleDto extends BaseDtoRelation {

    public static final String DTO = "UserRole";

    private String roleId;

    private String userId;

}
```

## 2024-03-11 23:15:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoRelation;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleDto extends BaseDtoRelation {

    public static final String DTO = "UserRole";

    private String roleId;

    private RoleDto roleDto;

    private String userId;

    private UserDto userDto;

    public noice.entity.dto.relation.UserRoleDto setRoleDto(RoleDto roleDto) {
        this.roleDto = roleDto;
        return this;
    }

    public noice.entity.dto.relation.UserRoleDto setUserDto(UserDto userDto) {
        this.userDto = userDto;
        return this;
    }

}
```

## 2024-03-14 13:04:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.dto.BaseDtoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleDto extends BaseDtoRelation {

    public static final String DTO = "UserRole";

    private String roleId;

    private RolePo rolePo;

    private String userId;

    private UserPo userPo;

}
```
