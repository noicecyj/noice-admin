package noice.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Noice
 */
@Data
public class FormVo {

    private String id;

    private String persistentFormCode;

    private String persistentFormName;

    private int persistentFormRow;

    private String persistentFormType;

    private List<FormConfigVo> formConfigVoList;

}