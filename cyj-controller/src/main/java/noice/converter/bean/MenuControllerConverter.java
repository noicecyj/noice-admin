package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "menuPo", source = "vo.menuId")
    MenuDto voToDto(MenuVo vo);

    List<MenuDto> voListToDtoList(List<MenuVo> voList);

    Set<MenuDto> voSetToDtoSet(Set<MenuVo> voSet);

}