package noice.converter.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.vo.bean.PersistentFormConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentFormRepository.class})
public interface PersistentFormConfigControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentFormPo", source = "vo.persistentFormId")
    PersistentFormConfigDto voToDto(PersistentFormConfigVo vo);

    List<PersistentFormConfigDto> voListToDtoList(List<PersistentFormConfigVo> voList);

    Set<PersistentFormConfigDto> voSetToDtoSet(Set<PersistentFormConfigVo> voSet);

}