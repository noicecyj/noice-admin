package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.vo.bean.UserVo;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseServiceAssembler.class, RoleServiceAssembler.class})
public interface UserControllerAssembler {

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    UserVo dtoToVo(UserDto dto);

    @Mapping(target = "enterpriseDto", source = "dto.enterprisePo")
    @Mapping(target = "roleDtoList", source = "roleDtoList")
    UserVo dtoToVo(UserDto dto, List<RoleDto> roleDtoList);

    List<UserVo> dtoListToVoList(List<UserDto> dtoList);

    Set<UserVo> dtoSetToVoSet(Set<UserDto> dtoList);

}