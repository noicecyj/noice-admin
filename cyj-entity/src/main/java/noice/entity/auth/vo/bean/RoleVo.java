package noice.entity.auth.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.dto.bean.AuthorityDto;
import noice.entity.auth.dto.bean.UserDto;
import noice.handler.vo.BaseVoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends BaseVoBean {

    public static final String VO = "Role";

    private String roleCode;

    private String roleName;

    private List<UserDto> userDtoList;

    private List<AuthorityDto> authorityDtoList;

}