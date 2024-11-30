package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WorkFlowVo extends BaseVoBean {

    public static final String VO = "WorkFlow";

    private String workFlowCode;

    private String workFlowName;

}