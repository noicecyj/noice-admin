package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.vo.bean.PersistentTableVo;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentServiceAssembler.class})
public interface PersistentTableControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentTableVo dtoToVo(PersistentTableDto dto);

    List<PersistentTableVo> dtoListToVoList(List<PersistentTableDto> dtoList);

    Set<PersistentTableVo> dtoSetToVoSet(Set<PersistentTableDto> dtoList);

}