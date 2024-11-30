package noice.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Noice
 */
@Data
public class FormDto {

    private String id;

    private String persistentFormCode;

    private String persistentFormName;

    private int persistentFormRow;

    private String persistentFormType;

    private List<FormConfigDto> formConfigDtoList;

}