package noice.assembler.auth.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.auth.dto.bean.CatalogDictionaryDto;
import noice.entity.auth.po.bean.CatalogDictionaryPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.auth.bean.CatalogRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogRepository.class})
public interface CatalogDictionaryServiceAssembler {

    @Mapping(target = "catalogPo", source = "po.catalogId")
    CatalogDictionaryDto poToDto(CatalogDictionaryPo po);

    List<CatalogDictionaryDto> poListToDtoList(List<CatalogDictionaryPo> poList);

    Set<CatalogDictionaryDto> poSetToDtoSet(Set<CatalogDictionaryPo> poSet);

    @Mapping(target = "label", source = "po.catalogDictionaryName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(CatalogDictionaryPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<CatalogDictionaryPo> poList);

}