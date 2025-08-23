package noice.entity.auth.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.po.bean.AuthorityPo;
import noice.entity.auth.po.bean.UserPo;
import noice.handler.dto.BaseDtoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDto extends BaseDtoBean {

    public static final String DTO = "Role";

    private String roleCode;

    private String roleName;

    private List<UserPo> userPoList;

    private List<AuthorityPo> authorityPoList;

}