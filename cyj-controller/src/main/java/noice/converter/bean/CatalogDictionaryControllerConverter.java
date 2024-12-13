package noice.converter.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryControllerConverter {

    @Mapping(target = "catalogPo", source = "vo.catalogId")
    CatalogDictionaryDto voToDto(CatalogDictionaryVo vo);

    List<CatalogDictionaryDto> voListToDtoList(List<CatalogDictionaryVo> voList);

    Set<CatalogDictionaryDto> voSetToDtoSet(Set<CatalogDictionaryVo> voSet);

}