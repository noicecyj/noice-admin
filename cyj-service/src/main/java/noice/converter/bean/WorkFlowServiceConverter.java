package noice.converter.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.po.bean.WorkFlowPo;
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
public interface WorkFlowServiceConverter {

    WorkFlowPo dtoToPo(WorkFlowDto dto);

    List<WorkFlowPo> dtoListToPoList(List<WorkFlowDto> dtoList);

    Set<WorkFlowPo> dtoSetToPoSet(Set<WorkFlowDto> dtoSet);

}