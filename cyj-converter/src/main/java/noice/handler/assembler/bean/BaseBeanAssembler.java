package noice.handler.assembler.bean;

import noice.handler.dto.BaseDtoBean;
import noice.handler.po.BasePoBean;
import noice.handler.vo.BaseVoBean;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;

/**
 * @author Noice
 */
@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG
)
public interface BaseBeanAssembler {

    BaseDtoBean poToDto(BasePoBean po);

    BaseVoBean dtoToVo(BaseDtoBean dto);

}