package noice.converter.relation;

import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class, uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "rolePo", source = "vo.roleId")
    RoleAuthorityDto voToDto(RoleAuthorityVo vo);

    List<RoleAuthorityDto> voListToDtoList(List<RoleAuthorityVo> voList);

    Set<RoleAuthorityDto> voSetToDtoSet(Set<RoleAuthorityVo> voSet);

}