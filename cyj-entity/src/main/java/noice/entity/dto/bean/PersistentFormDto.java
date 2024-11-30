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
public class PersistentFormDto extends BaseDtoBean {

    public static final String DTO = "PersistentForm";

    private String persistentFormCode;

    private String persistentFormName;

    private int persistentFormRow;

    private String persistentFormType;

    private String persistentId;

    private PersistentPo persistentPo;

}