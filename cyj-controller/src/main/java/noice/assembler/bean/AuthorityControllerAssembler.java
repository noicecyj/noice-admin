package noice.assembler.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {RoleServiceAssembler.class})
public interface AuthorityControllerAssembler {

    @Mapping(target = "roleDtoList", source = "dto.rolePoList")
    AuthorityVo dtoToVo(AuthorityDto dto);

    @Mapping(target = "roleDtoList", source = "roleDtoList")
    AuthorityVo dtoToVo(AuthorityDto dto, List<RoleDto> roleDtoList);

    List<AuthorityVo> dtoListToVoList(List<AuthorityDto> dtoList);

    Set<AuthorityVo> dtoSetToVoSet(Set<AuthorityDto> dtoList);

}