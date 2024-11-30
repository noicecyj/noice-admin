package noice.entity.dto;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class FormConfigDto {

    private String id;

    private String persistentFormConfigCode;

    private int persistentFormConfigColSpan;

    private String persistentFormConfigDataSource;

    private String persistentFormConfigDefaultValue;

    private String persistentFormConfigDirection;

    private boolean persistentFormConfigEdit;

    private String persistentFormConfigMode;

    private String persistentFormConfigName;

    private boolean persistentFormConfigRequired;

}