package noice.converter.auth.relation;


import noice.entity.auth.dto.relation.RoleAuthorityDto;
import noice.entity.auth.po.relation.RoleAuthorityPo;
import noice.handler.converter.relation.BaseRelationConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class)
public interface RoleAuthorityServiceConverter {

    RoleAuthorityPo dtoToPo(RoleAuthorityDto dto);

    List<RoleAuthorityPo> dtoListToPoList(List<RoleAuthorityDto> dtoList);

    Set<RoleAuthorityPo> dtoSetToPoSet(Set<RoleAuthorityDto> dtoSet);

}