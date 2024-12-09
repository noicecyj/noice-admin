package noice.handler.vo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Noice
 */
@Data
public class BaseVoBean {

    private Map<String, Object> extend = new HashMap<>();

    private String id;

    @NotNull
    private Boolean status;

    @NotNull
    private Long sortCode;

    private Integer current = 10;

    private Integer pageSize = -1;

    @JsonAnyGetter
    public Map<String, Object> getExtend() {
        return extend;
    }

    @JsonAnySetter
    public void setExtend(String key, Object value) {
        this.extend.put(key, value);
    }

}
