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
public class PersistentPropertyDto extends BaseDtoBean {

    public static final String DTO = "PersistentProperty";

    private String persistentId;

    private PersistentPo persistentPo;

    private String persistentPropertyCode;

    private String persistentPropertyDefaultValue;

    private int persistentPropertyLength;

    private String persistentPropertyName;

    private boolean persistentPropertyNull;

    private String persistentPropertyType;

    private String relationPersistentId;

    private PersistentPo relationPersistentPo;

}