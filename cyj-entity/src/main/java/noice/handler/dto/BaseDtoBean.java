package noice.handler.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Noice
 */
@Data
public class BaseDtoBean {

    private Map<String, Object> extend = new HashMap<>();

    private String id;

    private Boolean status;

    private Long sortCode;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

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
