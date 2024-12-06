package noice.assembler.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.vo.bean.EnterpriseVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    EnterpriseVo dtoToVo(EnterpriseDto dto);

    List<EnterpriseVo> dtoListToVoList(List<EnterpriseDto> dtoList);

    Set<EnterpriseVo> dtoSetToVoSet(Set<EnterpriseDto> dtoList);

}