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
public class RoleAuthorityDto extends BaseDtoRelation {

    public static final String DTO = "RoleAuthority";

    private String authorityId;

    private String roleId;

}
```

## 2024-03-11 23:15:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoRelation;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleAuthorityDto extends BaseDtoRelation {

    public static final String DTO = "RoleAuthority";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String roleId;

    private RoleDto roleDto;

    public noice.entity.dto.relation.RoleAuthorityDto setAuthorityDto(AuthorityDto authorityDto) {
        this.authorityDto = authorityDto;
        return this;
    }

    public noice.entity.dto.relation.RoleAuthorityDto setRoleDto(RoleDto roleDto) {
        this.roleDto = roleDto;
        return this;
    }
}
```

## 2024-03-14 13:04:25 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.handler.dto.BaseDtoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleAuthorityDto extends BaseDtoRelation {

    public static final String DTO = "RoleAuthority";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String roleId;

    private RolePo rolePo;

}
```
