package noice.converter.create.bean;


import noice.entity.create.dto.bean.PersistentDto;
import noice.entity.create.vo.bean.PersistentVo;
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
public interface PersistentControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentDto voToDto(PersistentVo vo);

    List<PersistentDto> voListToDtoList(List<PersistentVo> voList);

    Set<PersistentDto> voSetToDtoSet(Set<PersistentVo> voSet);

}