package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.PersistentFormDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentFormConfigVo extends BaseVoBean {

    public static final String VO = "PersistentFormConfig";

    private String authorityId;

    private AuthorityDto authorityDto;

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

    private PersistentFormDto persistentFormDto;

}