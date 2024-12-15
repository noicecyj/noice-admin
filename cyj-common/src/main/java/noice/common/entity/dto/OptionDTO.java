package noice.common.entity.dto;

import lombok.Data;

@Data
public class OptionDTO<T> {

    private String label;
    private T value;

}
