package noice.entity.auth.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.po.bean.EnterprisePo;
import noice.entity.auth.po.bean.RolePo;
import noice.handler.dto.BaseDtoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends BaseDtoBean {

    public static final String DTO = "User";

    private String enterpriseId;

    private EnterprisePo enterprisePo;

    private String userCode;

    private String userName;

    private String userPassword;

    private List<RolePo> rolePoList;

}