package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.vo.bean.WorkFlowVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    WorkFlowVo dtoToVo(WorkFlowDto dto);

    List<WorkFlowVo> dtoListToVoList(List<WorkFlowDto> dtoList);

    Set<WorkFlowVo> dtoSetToVoSet(Set<WorkFlowDto> dtoList);

}