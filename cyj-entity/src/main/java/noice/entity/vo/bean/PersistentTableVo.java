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
public class PersistentTableVo extends BaseVoBean {

    public static final String VO = "PersistentTable";

    private String persistentId;

    private PersistentDto persistentDto;

    private String persistentTableCode;

    private String persistentTableName;

}