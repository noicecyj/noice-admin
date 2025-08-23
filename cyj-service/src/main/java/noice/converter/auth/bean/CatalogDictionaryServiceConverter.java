package noice.converter.auth.bean;

import noice.entity.auth.po.bean.CatalogDictionaryPo;
import noice.entity.dto.bean.CatalogDictionaryDto;
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
public interface CatalogDictionaryServiceConverter {

    CatalogDictionaryPo dtoToPo(CatalogDictionaryDto dto);

    List<CatalogDictionaryPo> dtoListToPoList(List<CatalogDictionaryDto> dtoList);

    Set<CatalogDictionaryPo> dtoSetToPoSet(Set<CatalogDictionaryDto> dtoSet);

}