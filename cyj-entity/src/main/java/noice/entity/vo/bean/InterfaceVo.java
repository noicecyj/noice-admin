package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.handler.vo.BaseVoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceVo extends BaseVoBean {

    public static final String VO = "Interface";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

}