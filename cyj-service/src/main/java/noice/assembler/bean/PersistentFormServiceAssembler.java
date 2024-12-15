package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.po.bean.PersistentFormPo;
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
public interface PersistentFormServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentFormDto poToDto(PersistentFormPo po);

    List<PersistentFormDto> poListToDtoList(List<PersistentFormPo> poList);

    Set<PersistentFormDto> poSetToDtoSet(Set<PersistentFormPo> poSet);

    @Mapping(target = "label", source = "po.persistentFormName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(PersistentFormPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<PersistentFormPo> poList);

}