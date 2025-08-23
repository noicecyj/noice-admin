package noice.assembler.auth.bean;

import noice.entity.auth.dto.bean.EnterpriseDto;
import noice.entity.auth.vo.bean.EnterpriseVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseControllerAssembler {

    EnterpriseVo dtoToVo(EnterpriseDto dto);

    List<EnterpriseVo> dtoListToVoList(List<EnterpriseDto> dtoList);

    Set<EnterpriseVo> dtoSetToVoSet(Set<EnterpriseDto> dtoList);

}