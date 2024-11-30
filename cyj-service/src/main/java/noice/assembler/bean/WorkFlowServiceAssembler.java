package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowServiceAssembler {

    WorkFlowDto poToDto(WorkFlowPo po);

    List<WorkFlowDto> poListToDtoList(List<WorkFlowPo> poList);

    Set<WorkFlowDto> poSetToDtoSet(Set<WorkFlowPo> poSet);

}