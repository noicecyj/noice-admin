package noice.converter.create.bean;


import noice.entity.create.dto.bean.PersistentFormConfigDto;
import noice.entity.create.vo.bean.PersistentFormConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.auth.bean.AuthorityRepository;
import noice.repository.create.bean.PersistentFormRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentFormRepository.class})
public interface PersistentFormConfigControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentFormPo", source = "vo.persistentFormId")
    PersistentFormConfigDto voToDto(PersistentFormConfigVo vo);

    List<PersistentFormConfigDto> voListToDtoList(List<PersistentFormConfigVo> voList);

    Set<PersistentFormConfigDto> voSetToDtoSet(Set<PersistentFormConfigVo> voSet);

}