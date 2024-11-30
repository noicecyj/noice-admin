package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.UserPo;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

}