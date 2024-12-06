package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, MenuServiceAssembler.class})
public interface MenuControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "menuDto", source = "dto.menuPo")
    MenuVo dtoToVo(MenuDto dto);

    List<MenuVo> dtoListToVoList(List<MenuDto> dtoList);

    Set<MenuVo> dtoSetToVoSet(Set<MenuDto> dtoList);

}