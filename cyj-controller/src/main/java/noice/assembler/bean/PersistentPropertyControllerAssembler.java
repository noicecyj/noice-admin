package noice.assembler.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentPropertyControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    @Mapping(target = "relationPersistentDto", source = "dto.relationPersistentPo")
    PersistentPropertyVo dtoToVo(PersistentPropertyDto dto);

    List<PersistentPropertyVo> dtoListToVoList(List<PersistentPropertyDto> dtoList);

    Set<PersistentPropertyVo> dtoSetToVoSet(Set<PersistentPropertyDto> dtoList);

}