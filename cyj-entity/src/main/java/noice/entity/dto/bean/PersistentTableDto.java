package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersistentTableDto extends BaseDtoBean {

    public static final String DTO = "PersistentTable";

    private String persistentId;

    private PersistentPo persistentPo;

    private String persistentTableCode;

    private String persistentTableName;

}