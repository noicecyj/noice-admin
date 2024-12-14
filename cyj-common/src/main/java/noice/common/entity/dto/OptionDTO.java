package noice.common.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OptionDTO {

    private String label;
    private String value;

}
