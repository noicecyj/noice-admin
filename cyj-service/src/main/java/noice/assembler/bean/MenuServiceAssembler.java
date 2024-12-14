package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "menuPo", source = "po.menuId")
    MenuDto poToDto(MenuPo po);

    List<MenuDto> poListToDtoList(List<MenuPo> poList);

    Set<MenuDto> poSetToDtoSet(Set<MenuPo> poSet);

    @Mapping(target = "label", source = "po.menuName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(MenuPo po);

    List<OptionDTO> poListToDtoOptionList(List<MenuPo> poList);

}