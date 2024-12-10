package noice.assembler.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, PersistentServiceAssembler.class})
public interface InterfaceControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "persistentDto", source = "dto.persistentPo")
    InterfaceVo dtoToVo(InterfaceDto dto);

    List<InterfaceVo> dtoListToVoList(List<InterfaceDto> dtoList);

    Set<InterfaceVo> dtoSetToVoSet(Set<InterfaceDto> dtoList);

}