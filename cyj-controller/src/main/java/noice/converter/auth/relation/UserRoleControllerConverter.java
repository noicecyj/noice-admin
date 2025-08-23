package noice.converter.auth.relation;

import noice.entity.auth.dto.relation.UserRoleDto;
import noice.entity.auth.vo.relation.UserRoleVo;
import noice.handler.converter.relation.BaseRelationConverter;
import noice.repository.auth.bean.RoleRepository;
import noice.repository.auth.bean.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseRelationConverter.class, uses = {RoleRepository.class, UserRepository.class})
public interface UserRoleControllerConverter {

    @Mapping(target = "rolePo", source = "vo.roleId")
    @Mapping(target = "userPo", source = "vo.userId")
    UserRoleDto voToDto(UserRoleVo vo);

    List<UserRoleDto> voListToDtoList(List<UserRoleVo> voList);

    Set<UserRoleDto> voSetToDtoSet(Set<UserRoleVo> voSet);

}