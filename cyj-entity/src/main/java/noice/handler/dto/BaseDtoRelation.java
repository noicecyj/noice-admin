package noice.handler.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Noice
 */
@Data
public class BaseDtoRelation {

    private String id;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

}
