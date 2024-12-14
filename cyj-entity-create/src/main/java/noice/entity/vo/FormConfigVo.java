package noice.entity.vo;

import lombok.Data;
import noice.common.entity.dto.OptionDTO;

import java.util.List;

/**
 * @author Noice
 */
@Data
public class FormConfigVo {

    private String id;

    private String persistentFormConfigCode;

    private int persistentFormConfigColSpan;

    private List<OptionDTO> persistentFormConfigDataSource;

    private String persistentFormConfigDefaultValue;

    private String persistentFormConfigDirection;

    private boolean persistentFormConfigEdit;

    private String persistentFormConfigMode;

    private String persistentFormConfigName;

    private boolean persistentFormConfigRequired;

}