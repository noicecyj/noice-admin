package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnterpriseDto extends BaseDtoBean {

    public static final String DTO = "Enterprise";

    private String enterpriseCode;

    private String enterpriseName;

}