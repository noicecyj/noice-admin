package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnterpriseVo extends BaseVoBean {

    public static final String VO = "Enterprise";

    private String enterpriseCode;

    private String enterpriseName;

}