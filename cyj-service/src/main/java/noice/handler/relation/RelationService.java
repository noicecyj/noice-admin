package noice.handler.relation;

import noice.handler.dto.BaseDtoRelation;

import java.util.List;

/**
 * @author Noice
 */

public interface RelationService<DTO extends BaseDtoRelation> {

    DTO get(DTO dto);

    void set(List<String> ids, List<DTO> dtoList);

}
