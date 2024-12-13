package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.vo.bean.PersistentTableVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.PersistentRepository;
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
public interface PersistentTableControllerConverter {

    @Mapping(target = "persistentPo", source = "vo.persistentId")
    PersistentTableDto voToDto(PersistentTableVo vo);

    List<PersistentTableDto> voListToDtoList(List<PersistentTableVo> voList);

    Set<PersistentTableDto> voSetToDtoSet(Set<PersistentTableVo> voSet);

}