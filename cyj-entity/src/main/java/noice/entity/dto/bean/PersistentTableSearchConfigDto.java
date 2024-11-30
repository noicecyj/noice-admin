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
public class PersistentTableSearchConfigDto extends BaseDtoBean {

    public static final String DTO = "PersistentTableSearchConfig";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String persistentTableId;

    private PersistentTablePo persistentTablePo;

    private String persistentTableSearchConfigCode;

    private String persistentTableSearchConfigDataSource;

    private String persistentTableSearchConfigDefaultValue;

    private boolean persistentTableSearchConfigDisplay;

    private String persistentTableSearchConfigMode;

    private String persistentTableSearchConfigName;

}