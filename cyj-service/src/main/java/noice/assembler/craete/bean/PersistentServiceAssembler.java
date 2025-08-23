package noice.assembler.craete.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.create.dto.bean.PersistentDto;
import noice.entity.create.po.bean.PersistentPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.create.bean.PersistentRepository;
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
public interface PersistentServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> poList);

    Set<PersistentDto> poSetToDtoSet(Set<PersistentPo> poSet);

    @Mapping(target = "label", source = "po.persistentName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(PersistentPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<PersistentPo> poList);

}