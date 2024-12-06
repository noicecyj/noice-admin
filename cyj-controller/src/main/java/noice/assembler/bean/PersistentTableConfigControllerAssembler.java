package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.vo.bean.PersistentTableConfigVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentTableServiceAssembler.class})
public interface PersistentTableConfigControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableConfigVo dtoToVo(PersistentTableConfigDto dto);

    List<PersistentTableConfigVo> dtoListToVoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigVo> dtoSetToVoSet(Set<PersistentTableConfigDto> dtoList);

}