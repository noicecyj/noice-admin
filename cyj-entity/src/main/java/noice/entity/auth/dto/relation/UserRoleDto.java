package noice.entity.auth.dto.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.po.bean.RolePo;
import noice.entity.auth.po.bean.UserPo;
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