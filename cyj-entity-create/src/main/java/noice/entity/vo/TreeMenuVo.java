package noice.entity.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class TreeMenuVo {

    private String name;

    private String path;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeMenuVo> children;

}
