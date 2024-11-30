package noice.assembler.relation;

import noice.entity.dto.relation.UserRoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.assembler.relation.BaseRelationAssembler;
import noice.repository.bean.RoleRepository;
import noice.repository.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationAssembler.class, uses = {RoleRepository.class, UserRepository.class})
public interface UserRoleServiceAssembler {

    @Mapping(target = "rolePo", source = "po.roleId")
    @Mapping(target = "userPo", source = "po.userId")
    UserRoleDto poToDto(UserRolePo po);

    List<UserRoleDto> poListToDtoList(List<UserRolePo> poList);

    Set<UserRoleDto> poSetToDtoSet(Set<UserRolePo> poSet);

}