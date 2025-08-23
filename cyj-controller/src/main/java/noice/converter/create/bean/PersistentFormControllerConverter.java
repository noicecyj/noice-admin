package noice.converter.create.bean;

import noice.entity.create.dto.bean.PersistentFormDto;
import noice.entity.create.vo.bean.PersistentFormVo;
import noice.handler.converter.bean.BaseBeanConverter;
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
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentFormControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentFormDto voToDto(PersistentFormVo vo);

    List<PersistentFormDto> voListToDtoList(List<PersistentFormVo> voList);

    Set<PersistentFormDto> voSetToDtoSet(Set<PersistentFormVo> voSet);

}