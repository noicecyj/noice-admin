package noice.converter.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.converter.relation.BaseRelationConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class)
public interface UserRoleServiceConverter {

    UserRolePo dtoToPo(UserRoleDto dto);

    List<UserRolePo> dtoListToPoList(List<UserRoleDto> dtoList);

    Set<UserRolePo> dtoSetToPoSet(Set<UserRoleDto> dtoSet);

}