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
public class PersistentTableConfigVo extends BaseVoBean {

    public static final String VO = "PersistentTableConfig";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String persistentTableConfigCode;

    private boolean persistentTableConfigDisplay;

    private String persistentTableConfigMethod;

    private String persistentTableConfigName;

    private String persistentTableConfigType;

    private String persistentTableId;

    private PersistentTableDto persistentTableDto;

}