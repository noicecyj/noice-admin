package noice.entity.vo;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class TableConfigVo {

    private String id;

    private String dataIndex;

    private boolean hideInTable;

    private String title;

    private String valueType;

    private int width;

}