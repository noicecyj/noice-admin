package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.po.bean.PersistentTablePo;
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
public interface PersistentTableServiceAssembler {

    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentTableDto poToDto(PersistentTablePo po);

    List<PersistentTableDto> poListToDtoList(List<PersistentTablePo> poList);

    Set<PersistentTableDto> poSetToDtoSet(Set<PersistentTablePo> poSet);

    @Mapping(target = "label", source = "po.persistentTableName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(PersistentTablePo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<PersistentTablePo> poList);

}