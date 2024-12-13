package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
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
public interface CatalogServiceConverter {

    CatalogPo dtoToPo(CatalogDto dto);

    List<CatalogPo> dtoListToPoList(List<CatalogDto> dtoList);

    Set<CatalogPo> dtoSetToPoSet(Set<CatalogDto> dtoSet);

}