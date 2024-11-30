package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SqlVo extends BaseVoBean {

    public static final String VO = "Sql";

    private String sqlCode;

    private String sqlName;

    private String sqlStr;

    private String sqlType;

}