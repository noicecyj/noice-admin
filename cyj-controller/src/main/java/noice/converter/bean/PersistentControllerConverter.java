package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentControllerConverter {

    @Mapping(target = "appServicePo", source = "vo.appServiceId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentDto voToDto(PersistentVo vo);

    List<PersistentDto> voListToDtoList(List<PersistentVo> voList);

    Set<PersistentDto> voSetToDtoSet(Set<PersistentVo> voSet);

}