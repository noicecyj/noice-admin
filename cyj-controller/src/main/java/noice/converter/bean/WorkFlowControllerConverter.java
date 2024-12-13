package noice.converter.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.vo.bean.WorkFlowVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface WorkFlowControllerConverter {

    WorkFlowDto voToDto(WorkFlowVo vo);

    List<WorkFlowDto> voListToDtoList(List<WorkFlowVo> voList);

    Set<WorkFlowDto> voSetToDtoSet(Set<WorkFlowVo> voSet);

}