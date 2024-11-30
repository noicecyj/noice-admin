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