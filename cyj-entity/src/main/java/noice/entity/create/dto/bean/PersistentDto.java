package noice.entity.create.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.create.po.bean.PersistentPo;
import noice.handler.dto.BaseDtoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentDto extends BaseDtoBean {

    public static final String DTO = "Persistent";

    private boolean persistentCascade;

    private String persistentCode;

    private String persistentId;

    private PersistentPo persistentPo;

    private String persistentName;

    private String persistentType;

}