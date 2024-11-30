package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentTableSearchConfigVo extends BaseVoBean {

    public static final String VO = "PersistentTableSearchConfig";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String persistentTableId;

    private PersistentTableDto persistentTableDto;

    private String persistentTableSearchConfigCode;

    private String persistentTableSearchConfigDataSource;

    private String persistentTableSearchConfigDefaultValue;

    private boolean persistentTableSearchConfigDisplay;

    private String persistentTableSearchConfigMode;

    private String persistentTableSearchConfigName;

}