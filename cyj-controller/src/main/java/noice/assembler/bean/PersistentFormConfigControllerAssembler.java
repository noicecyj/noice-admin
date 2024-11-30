package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.vo.bean.PersistentFormConfigVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentFormServiceAssembler.class})
public interface PersistentFormConfigControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentFormDto", source = "dto.persistentFormPo")
    PersistentFormConfigVo dtoToVo(PersistentFormConfigDto dto);

    List<PersistentFormConfigVo> dtoListToVoList(List<PersistentFormConfigDto> dtoList);

    Set<PersistentFormConfigVo> dtoSetToVoSet(Set<PersistentFormConfigDto> dtoList);

}