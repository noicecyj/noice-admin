package noice.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Noice
 */
@Data
public class TableDto {

    private String id;

    private String persistentTableCode;

    private String persistentTableName;

    private List<TableConfigDto> tableConfigDtoList;

}