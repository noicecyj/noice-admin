package noice.entity.vo.relation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.handler.vo.BaseVoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleAuthorityVo extends BaseVoRelation {

    public static final String VO = "RoleAuthority";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String roleId;

    private RoleDto roleDto;

}