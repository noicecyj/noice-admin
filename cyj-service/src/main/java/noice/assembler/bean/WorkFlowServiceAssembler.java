package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowServiceAssembler {

    WorkFlowDto poToDto(WorkFlowPo po);

    List<WorkFlowDto> poListToDtoList(List<WorkFlowPo> poList);

    Set<WorkFlowDto> poSetToDtoSet(Set<WorkFlowPo> poSet);

    @Mapping(target = "label", source = "po.workFlowName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(WorkFlowPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<WorkFlowPo> poList);

}