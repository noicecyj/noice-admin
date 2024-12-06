package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceServiceAssembler.class, PersistentServiceAssembler.class})
public interface PersistentControllerAssembler {

    @Mapping(target = "appServiceDto", source = "dto.appServicePo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentVo dtoToVo(PersistentDto dto);

    List<PersistentVo> dtoListToVoList(List<PersistentDto> dtoList);

    Set<PersistentVo> dtoSetToVoSet(Set<PersistentDto> dtoList);

}