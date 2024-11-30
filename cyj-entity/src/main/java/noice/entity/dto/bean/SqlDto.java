package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SqlDto extends BaseDtoBean {

    public static final String DTO = "Sql";

    private String sqlCode;

    private String sqlName;

    private String sqlStr;

    private String sqlType;

}