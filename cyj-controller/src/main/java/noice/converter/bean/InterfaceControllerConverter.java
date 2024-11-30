package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class})
public interface InterfaceControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    InterfaceDto voToDto(InterfaceVo vo);

    List<InterfaceDto> voListToDtoList(List<InterfaceVo> voList);

    Set<InterfaceDto> voSetToDtoSet(Set<InterfaceVo> voSet);

}