package noice.assembler.relation;

import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {AuthorityRepository.class, RoleRepository.class})
public interface RoleAuthorityServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "rolePo", source = "po.roleId")
    RoleAuthorityDto poToDto(RoleAuthorityPo po);

    List<RoleAuthorityDto> poListToDtoList(List<RoleAuthorityPo> poList);

    Set<RoleAuthorityDto> poSetToDtoSet(Set<RoleAuthorityPo> poSet);

}