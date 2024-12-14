package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {PersistentRepository.class})
public interface PersistentPropertyServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    @Mapping(target = "relationPersistentPo", source = "po.relationPersistentId")
    PersistentPropertyDto poToDto(PersistentPropertyPo po);

    List<PersistentPropertyDto> poListToDtoList(List<PersistentPropertyPo> poList);

    Set<PersistentPropertyDto> poSetToDtoSet(Set<PersistentPropertyPo> poSet);

    @Mapping(target = "label", source = "po.persistentPropertyName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(PersistentPropertyPo po);

    List<OptionDTO> poListToDtoOptionList(List<PersistentPropertyPo> poList);

}