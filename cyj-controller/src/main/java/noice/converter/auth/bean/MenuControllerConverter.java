package noice.converter.auth.bean;

import noice.entity.auth.dto.bean.MenuDto;
import noice.entity.auth.vo.bean.MenuVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.auth.bean.AuthorityRepository;
import noice.repository.auth.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "menuPo", source = "vo.menuId")
    MenuDto voToDto(MenuVo vo);

    List<MenuDto> voListToDtoList(List<MenuVo> voList);

    Set<MenuDto> voSetToDtoSet(Set<MenuVo> voSet);

}