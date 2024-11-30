package noice.common.entity.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OptionVO {

    private String label;
    private String value;

}
