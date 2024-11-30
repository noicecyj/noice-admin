package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.RolePo;
import noice.handler.dto.BaseDtoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AuthorityDto extends BaseDtoBean {

    public static final String DTO = "Authority";

    private String authorityCode;

    private String authorityName;

    private String authorityType;

    private List<RolePo> rolePoList;

}