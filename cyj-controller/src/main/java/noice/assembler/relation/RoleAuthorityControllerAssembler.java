package noice.assembler.relation;

import noice.assembler.bean.AuthorityServiceAssembler;
import noice.assembler.bean.RoleServiceAssembler;
import noice.entity.dto.relation.RoleAuthorityDto;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {AuthorityServiceAssembler.class, RoleServiceAssembler.class})
public interface RoleAuthorityControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "roleDto", source = "dto.rolePo")
    RoleAuthorityVo dtoToVo(RoleAuthorityDto dto);

    List<RoleAuthorityVo> dtoListToVoList(List<RoleAuthorityDto> dtoList);

    Set<RoleAuthorityVo> dtoSetToVoSet(Set<RoleAuthorityDto> dtoSet);

}