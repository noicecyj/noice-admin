package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.UserPo;
import noice.entity.po.bean.AuthorityPo;
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