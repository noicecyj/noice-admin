package noice.entity.dto;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class TableConfigDto {

    private String id;

    private String persistentTableConfigCode;

    private boolean persistentTableConfigDisplay;

    private String persistentTableConfigMethod;

    private String persistentTableConfigName;

    private String persistentTableConfigType;

    private String persistentTableConfigDataSource;


}