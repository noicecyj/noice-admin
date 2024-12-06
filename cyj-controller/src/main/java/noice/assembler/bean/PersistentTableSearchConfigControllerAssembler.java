package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.vo.bean.PersistentTableSearchConfigVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentTableServiceAssembler.class})
public interface PersistentTableSearchConfigControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentTableDto", source = "dto.persistentTablePo")
    PersistentTableSearchConfigVo dtoToVo(PersistentTableSearchConfigDto dto);

    List<PersistentTableSearchConfigVo> dtoListToVoList(List<PersistentTableSearchConfigDto> dtoList);

    Set<PersistentTableSearchConfigVo> dtoSetToVoSet(Set<PersistentTableSearchConfigDto> dtoList);

}