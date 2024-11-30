package noice.entity.vo.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.handler.vo.BaseVoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleVo extends BaseVoRelation {

    public static final String VO = "UserRole";

    private String roleId;

    private RoleDto roleDto;

    private String userId;

    private UserDto userDto;

}