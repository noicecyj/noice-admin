package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface MenuServiceConverter {

    MenuPo dtoToPo(MenuDto dto);

    List<MenuPo> dtoListToPoList(List<MenuDto> dtoList);

    Set<MenuPo> dtoSetToPoSet(Set<MenuDto> dtoSet);

}