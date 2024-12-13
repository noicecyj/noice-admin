package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.vo.bean.PersistentTableSearchConfigVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentTableRepository.class})
public interface PersistentTableSearchConfigControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentTablePo", source = "vo.persistentTableId")
    PersistentTableSearchConfigDto voToDto(PersistentTableSearchConfigVo vo);

    List<PersistentTableSearchConfigDto> voListToDtoList(List<PersistentTableSearchConfigVo> voList);

    Set<PersistentTableSearchConfigDto> voSetToDtoSet(Set<PersistentTableSearchConfigVo> voSet);

}