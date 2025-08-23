package noice.entity.auth.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.dto.bean.RoleDto;
import noice.handler.vo.BaseVoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AuthorityVo extends BaseVoBean {

    public static final String VO = "Authority";

    private String authorityCode;

    private String authorityName;

    private String authorityType;

    private List<RoleDto> roleDtoList;

}