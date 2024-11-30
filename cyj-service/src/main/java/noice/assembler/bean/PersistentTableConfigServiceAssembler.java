package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableConfigDto poToDto(PersistentTableConfigPo po);

    List<PersistentTableConfigDto> poListToDtoList(List<PersistentTableConfigPo> poList);

    Set<PersistentTableConfigDto> poSetToDtoSet(Set<PersistentTableConfigPo> poSet);

}