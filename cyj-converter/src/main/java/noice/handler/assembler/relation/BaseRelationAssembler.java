package noice.handler.assembler.relation;

import noice.handler.dto.BaseDtoRelation;
import noice.handler.po.BasePoRelation;
import noice.handler.vo.BaseVoRelation;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

/**
 * @author Noice
 */
@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BaseRelationAssembler {

    BaseDtoRelation poToDto(BasePoRelation po);

    BaseVoRelation dtoToVo(BaseDtoRelation dto);

}