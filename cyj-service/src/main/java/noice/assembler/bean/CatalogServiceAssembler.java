package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogServiceAssembler {

    CatalogDto poToDto(CatalogPo po);

    List<CatalogDto> poListToDtoList(List<CatalogPo> poList);

    Set<CatalogDto> poSetToDtoSet(Set<CatalogPo> poSet);

}