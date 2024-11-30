package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentFormConfigDto extends BaseDtoBean {

    public static final String DTO = "PersistentFormConfig";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String persistentFormConfigCode;

    private int persistentFormConfigColSpan;

    private String persistentFormConfigDataSource;

    private String persistentFormConfigDefaultValue;

    private String persistentFormConfigDirection;

    private boolean persistentFormConfigEdit;

    private String persistentFormConfigMode;

    private String persistentFormConfigName;

    private boolean persistentFormConfigRequired;

    private String persistentFormId;

    private PersistentFormPo persistentFormPo;

}