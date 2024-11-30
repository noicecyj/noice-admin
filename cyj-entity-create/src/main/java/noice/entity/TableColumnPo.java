package noice.entity;

import lombok.Data;

@Data
public class TableColumnPo {

    private String COLUMN_NAME;
    private String DATA_TYPE;
    private String CHARACTER_MAXIMUM_LENGTH;
    private String COLUMN_DEFAULT;
    private String COLUMN_COMMENT;

}
