package noice.assembler.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
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
public interface PersistentTableSearchConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentTablePo", source = "po.persistentTableId")
    PersistentTableSearchConfigDto poToDto(PersistentTableSearchConfigPo po);

    List<PersistentTableSearchConfigDto> poListToDtoList(List<PersistentTableSearchConfigPo> poList);

    Set<PersistentTableSearchConfigDto> poSetToDtoSet(Set<PersistentTableSearchConfigPo> poSet);

}