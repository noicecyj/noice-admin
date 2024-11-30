package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WorkFlowDto extends BaseDtoBean {

    public static final String DTO = "WorkFlow";

    private String workFlowCode;

    private String workFlowName;

}