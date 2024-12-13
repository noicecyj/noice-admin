package noice.assembler.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, PersistentFormRepository.class})
public interface PersistentFormConfigServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "persistentFormPo", source = "po.persistentFormId")
    PersistentFormConfigDto poToDto(PersistentFormConfigPo po);

    List<PersistentFormConfigDto> poListToDtoList(List<PersistentFormConfigPo> poList);

    Set<PersistentFormConfigDto> poSetToDtoSet(Set<PersistentFormConfigPo> poSet);

}