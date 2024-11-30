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
public class PersistentPropertyVo extends BaseVoBean {

    public static final String VO = "PersistentProperty";

    private String persistentId;

    private PersistentDto persistentDto;

    private String persistentPropertyCode;

    private String persistentPropertyDefaultValue;

    private int persistentPropertyLength;

    private String persistentPropertyName;

    private boolean persistentPropertyNull;

    private String persistentPropertyType;

    private String relationPersistentId;

    private PersistentDto relationPersistentDto;

}