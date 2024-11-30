package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentTableConfigDto extends BaseDtoBean {

    public static final String DTO = "PersistentTableConfig";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String persistentTableConfigCode;

    private boolean persistentTableConfigDisplay;

    private String persistentTableConfigMethod;

    private String persistentTableConfigName;

    private String persistentTableConfigType;

    private String persistentTableId;

    private PersistentTablePo persistentTablePo;

}