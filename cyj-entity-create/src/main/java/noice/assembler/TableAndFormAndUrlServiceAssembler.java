package noice.assembler;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface TableAndFormAndUrlServiceAssembler {

    FormDto poToDto(PersistentFormPo po);

    FormConfigDto poToDto(PersistentFormConfigPo po);

    List<FormConfigDto> poFormListToDtoFormList(List<PersistentFormConfigPo> poList);

    TableDto poToDto(PersistentTablePo po);

    TableConfigDto poToDto(PersistentTableConfigPo po);

    List<TableConfigDto> poTableListToDtoTableList(List<PersistentTableConfigPo> poList);

    @Mapping(target = "label", source = "dto.catalogDictionaryName")
    @Mapping(target = "value", source = "dto.catalogDictionaryCode")
    OptionDTO dtoToDto(CatalogDictionaryDto dto);

    List<OptionDTO> dtoCatalogDictionaryListToDtoOptionList(List<CatalogDictionaryDto> dtoList);

}