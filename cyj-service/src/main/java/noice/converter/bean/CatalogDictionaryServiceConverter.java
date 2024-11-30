package noice.converter.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface CatalogDictionaryServiceConverter {

    CatalogDictionaryPo dtoToPo(CatalogDictionaryDto dto);

    List<CatalogDictionaryPo> dtoListToPoList(List<CatalogDictionaryDto> dtoList);

    Set<CatalogDictionaryPo> dtoSetToPoSet(Set<CatalogDictionaryDto> dtoSet);

}