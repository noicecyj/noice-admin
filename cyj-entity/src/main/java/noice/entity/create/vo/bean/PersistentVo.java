package noice.entity.create.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.create.dto.bean.PersistentDto;
import noice.handler.vo.BaseVoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentVo extends BaseVoBean {

    public static final String VO = "Persistent";

    private boolean persistentCascade;

    private String persistentCode;

    private String persistentId;

    private PersistentDto persistentDto;

    private String persistentName;

    private String persistentType;

}