package noice.assembler.craete.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.create.dto.bean.PersistentTableConfigDto;
import noice.entity.create.po.bean.PersistentTableConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.auth.bean.AuthorityRepository;
import noice.repository.create.bean.PersistentTableRepository;
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
    OptionDTO<String> poToOptionDto(PersistentTableConfigPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<PersistentTableConfigPo> poList);

}