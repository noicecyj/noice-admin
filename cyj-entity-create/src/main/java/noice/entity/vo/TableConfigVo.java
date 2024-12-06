package noice.entity.vo;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class TableConfigVo {

    private String key;

    private String dataIndex;

    private Boolean hideInTable;

    private String title;

    private String valueType;

    private Integer width;

}