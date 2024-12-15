package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.UserPo;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface RoleServiceAssembler {

    RoleDto poToDto(RolePo po);

    @Mapping(target = "userPoList", source = "userPoList")
    @Mapping(target = "authorityPoList", source = "authorityPoList")
    RoleDto poToDto(RolePo po, List<UserPo> userPoList, List<AuthorityPo> authorityPoList);

    List<RoleDto> poListToDtoList(List<RolePo> poList);

    Set<RoleDto> poSetToDtoSet(Set<RolePo> poSet);

    @Mapping(target = "label", source = "po.roleName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(RolePo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<RolePo> poList);

}