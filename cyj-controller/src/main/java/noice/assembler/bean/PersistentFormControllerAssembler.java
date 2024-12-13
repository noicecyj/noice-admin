package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.vo.bean.PersistentFormVo;
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
public interface PersistentFormControllerAssembler {

    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    PersistentFormVo dtoToVo(PersistentFormDto dto);

    List<PersistentFormVo> dtoListToVoList(List<PersistentFormDto> dtoList);

    Set<PersistentFormVo> dtoSetToVoSet(Set<PersistentFormDto> dtoList);

}