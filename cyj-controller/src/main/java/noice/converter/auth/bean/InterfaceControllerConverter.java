package noice.converter.auth.bean;


import noice.entity.auth.dto.bean.InterfaceDto;
import noice.entity.auth.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.auth.bean.AuthorityRepository;
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
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, PersistentRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "persistentPo", source = "vo.persistentId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}