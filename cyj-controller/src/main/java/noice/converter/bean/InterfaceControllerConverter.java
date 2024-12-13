package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
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
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}