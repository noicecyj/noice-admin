package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.InterfaceDto;
import noice.entity.po.bean.InterfacePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    InterfaceDto poToDto(InterfacePo po);

    List<InterfaceDto> poListToDtoList(List<InterfacePo> poList);

    Set<InterfaceDto> poSetToDtoSet(Set<InterfacePo> poSet);

    @Mapping(target = "label", source = "po.interfaceName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(InterfacePo po);

    List<OptionDTO> poListToDtoOptionList(List<InterfacePo> poList);

}