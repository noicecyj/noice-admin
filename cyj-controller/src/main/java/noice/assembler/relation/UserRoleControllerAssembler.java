package noice.assembler.relation;

import noice.assembler.bean.RoleServiceAssembler;
import noice.assembler.bean.UserServiceAssembler;
import noice.entity.dto.relation.UserRoleDto;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleServiceAssembler.class, UserServiceAssembler.class})
public interface UserRoleControllerAssembler {

    @Mapping(target = "roleDto", source = "dto.rolePo")
    @Mapping(target = "userDto", source = "dto.userPo")
    UserRoleVo dtoToVo(UserRoleDto dto);

    List<UserRoleVo> dtoListToVoList(List<UserRoleDto> dtoList);

    Set<UserRoleVo> dtoSetToVoSet(Set<UserRoleDto> dtoSet);

}