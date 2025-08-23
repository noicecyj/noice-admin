package noice.entity.create.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.dto.bean.AuthorityDto;
import noice.entity.create.dto.bean.PersistentTableDto;
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

    private String persistentTableConfigDataSource;

    private boolean persistentTableConfigDisplay;

    private String persistentTableConfigMethod;

    private String persistentTableConfigName;

    private String persistentTableConfigType;

    private String persistentTableId;

    private PersistentTableDto persistentTableDto;

}