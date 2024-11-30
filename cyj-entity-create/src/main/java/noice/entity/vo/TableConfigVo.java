package noice.entity.vo;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class TableConfigVo {

    private String id;

    private String persistentTableConfigCode;

    private boolean persistentTableConfigDisplay;

    private String persistentTableConfigMethod;

    private String persistentTableConfigName;

    private String persistentTableConfigType;

}