package noice.assembler;

import noice.common.entity.vo.OptionVO;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormConfigRowDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.dto.UrlDto;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.FormConfigRowVo;
import noice.entity.vo.FormConfigVo;
import noice.entity.vo.FormVo;
import noice.entity.vo.TableConfigVo;
import noice.entity.vo.TableVo;
import noice.entity.vo.UrlVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface TableAndFormAndUrlControllerAssembler {

    @Mapping(target = "formConfigRowVoList", source = "dto.formConfigRowDtoList")
    FormVo dtoToVo(FormDto dto);

    UrlVo dtoToVo(UrlDto dto);

    FormConfigVo dtoToVo(FormConfigDto dto);

    @Mapping(target = "formConfigVoList", source = "dto.formConfigDtoList")
    FormConfigRowVo dtoToVo(FormConfigRowDto dto);

    OptionVO dtoToVo(CatalogDictionaryDto dto);

    List<OptionVO> dtoCatalogDictionaryListToVoOptionList(List<CatalogDictionaryDto> dtoList);

    List<FormConfigRowVo> dtotFormRowListToVoFormRowList(List<FormConfigRowDto> dtoList);

    List<FormConfigVo> dtotFormListToVoFormList(List<FormConfigDto> dtoList);

    @Mapping(target = "tableConfigVoList", source = "dto.tableConfigDtoList")
    TableVo dtoToVo(TableDto dto);

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "dataIndex", source = "dto.persistentTableConfigCode")
    @Mapping(target = "hideInTable", source = "dto.persistentTableConfigDisplay")
    @Mapping(target = "title", source = "dto.persistentTableConfigName")
    @Mapping(target = "valueType", source = "dto.persistentTableConfigType")
    TableConfigVo dtoToVo(TableConfigDto dto);

    List<TableConfigVo> dtoTableListToVoTableList(List<TableConfigDto> dtoList);

}