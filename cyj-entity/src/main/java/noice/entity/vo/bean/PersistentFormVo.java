package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentFormVo extends BaseVoBean {

    public static final String VO = "PersistentForm";

    private String persistentFormCode;

    private String persistentFormName;

    private int persistentFormRow;

    private String persistentFormType;

    private String persistentId;

    private PersistentDto persistentDto;

}