package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableConfigDto poToDto(PersistentTableConfigPo po);

    List<PersistentTableConfigDto> poListToDtoList(List<PersistentTableConfigPo> poList);

    Set<PersistentTableConfigDto> poSetToDtoSet(Set<PersistentTableConfigPo> poSet);

    @Mapping(target = "label", source = "po.persistentTableConfigName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(PersistentTableConfigPo po);

    List<OptionDTO> poListToDtoOptionList(List<PersistentTableConfigPo> poList);

}