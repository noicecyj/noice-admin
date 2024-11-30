package noice.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Noice
 */
@Data
public class TableVo {

    private String id;

    private String persistentTableCode;

    private String persistentTableName;

    private List<TableConfigVo> tableConfigVoList;

}