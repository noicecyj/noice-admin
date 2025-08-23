package noice.assembler.craete.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.create.dto.bean.PersistentTableDto;
import noice.entity.create.po.bean.PersistentTablePo;
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