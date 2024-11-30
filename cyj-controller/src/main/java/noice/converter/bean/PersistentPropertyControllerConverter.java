package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {PersistentRepository.class})
public interface PersistentPropertyControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    @Mapping(target = "relationPersistentPo", source = "vo.relationPersistentId")
    PersistentPropertyDto voToDto(PersistentPropertyVo vo);

    List<PersistentPropertyDto> voListToDtoList(List<PersistentPropertyVo> voList);

    Set<PersistentPropertyDto> voSetToDtoSet(Set<PersistentPropertyVo> voSet);

}