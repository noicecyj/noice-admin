package noice.converter.auth.bean;

import noice.entity.auth.dto.bean.InterfaceDto;
import noice.entity.auth.po.bean.InterfacePo;
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
public interface InterfaceServiceConverter {

    InterfacePo dtoToPo(InterfaceDto dto);

    List<InterfacePo> dtoListToPoList(List<InterfaceDto> dtoList);

    Set<InterfacePo> dtoSetToPoSet(Set<InterfaceDto> dtoSet);

}