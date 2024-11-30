package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.vo.BaseVoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVo extends BaseVoBean {

    public static final String VO = "User";

    private String enterpriseId;

    private EnterpriseDto enterpriseDto;

    private String userCode;

    private String userName;

    private String userPassword;

    private List<RoleDto> roleDtoList;

}