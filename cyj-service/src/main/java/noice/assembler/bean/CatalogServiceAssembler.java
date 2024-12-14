package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> poList);

    Set<CatalogDto> poSetToDtoSet(Set<CatalogPo> poSet);

    @Mapping(target = "label", source = "po.catalogName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(CatalogPo po);

    List<OptionDTO> poListToDtoOptionList(List<CatalogPo> poList);

}