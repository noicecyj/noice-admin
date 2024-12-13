package noice.assembler.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {UserServiceAssembler.class, AuthorityServiceAssembler.class})
public interface RoleControllerAssembler {

    @Mapping(target = "userDtoList", source = "dto.userPoList")
    @Mapping(target = "authorityDtoList", source = "dto.authorityPoList")
    RoleVo dtoToVo(RoleDto dto);

    @Mapping(target = "userDtoList", source = "userDtoList")
    @Mapping(target = "authorityDtoList", source = "authorityDtoList")
    RoleVo dtoToVo(RoleDto dto, List<UserDto> userDtoList, List<AuthorityDto> authorityDtoList);

    List<RoleVo> dtoListToVoList(List<RoleDto> dtoList);

    Set<RoleVo> dtoSetToVoSet(Set<RoleDto> dtoList);

}