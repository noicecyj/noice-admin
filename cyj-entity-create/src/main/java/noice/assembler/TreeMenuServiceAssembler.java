package noice.assembler;

import noice.entity.dto.TreeMenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface TreeMenuServiceAssembler {


    @Mapping(target = "menuPo", source = "po.menuId")
    @Mapping(target = "name", source = "po.menuName")
    @Mapping(target = "path", source = "po.menuUrl")
    TreeMenuDto poToTreeDto(MenuPo po);

    List<TreeMenuDto> poListToTreeDtoList(List<MenuPo> poList);

}