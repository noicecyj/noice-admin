package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.PersistentPo;
import noice.handler.dto.BaseDtoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceDto extends BaseDtoBean {

    public static final String DTO = "Interface";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

    private String persistentId;

    private PersistentPo persistentPo;

}