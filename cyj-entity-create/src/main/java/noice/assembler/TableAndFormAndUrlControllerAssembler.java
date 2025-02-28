package noice.assembler;

import noice.common.entity.dto.OptionDTO;
import noice.common.entity.vo.OptionVO;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormConfigRowDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.dto.UrlDto;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {TableAndFormAndUrlControllerAssemblerComponent.class})
public interface TableAndFormAndUrlControllerAssembler {

    @Mapping(target = "formConfigRowVoList", source = "dto.formConfigRowDtoList")
    FormVo dtoToVo(FormDto dto);

    UrlVo dtoToVo(UrlDto dto);

    @Mapping(target = "persistentFormConfigDataSource", source = "dto.persistentFormConfigDataSource", qualifiedByName = "dataSourceToOptionList")
    @Mapping(target = "persistentFormConfigDefaultValue", source = "dto.persistentFormConfigDefaultValue", qualifiedByName = "defaultValueStringToObject")
    FormConfigVo dtoToVo(FormConfigDto dto);

    @Mapping(target = "formConfigVoList", source = "dto.formConfigDtoList")
    FormConfigRowVo dtoToVo(FormConfigRowDto dto);

    OptionVO dtoToVo(OptionDTO dto);

    List<OptionVO> dtoOptionListToVoOptionList(List<OptionDTO> dtoList);

    List<FormConfigRowVo> dtotFormRowListToVoFormRowList(List<FormConfigRowDto> dtoList);

    List<FormConfigVo> dtotFormListToVoFormList(List<FormConfigDto> dtoList);

    @Mapping(target = "tableConfigVoList", source = "dto.tableConfigDtoList")
    TableVo dtoToVo(TableDto dto);

    @Mapping(target = "key", source = "dto.persistentTableConfigCode")
    @Mapping(target = "dataIndex", source = "dto.persistentTableConfigCode")
    @Mapping(target = "hideInTable", source = "dto.persistentTableConfigDisplay")
    @Mapping(target = "title", source = "dto.persistentTableConfigName")
    @Mapping(target = "valueType", source = "dto.persistentTableConfigType")
//    @Mapping(target = "width", source = "dto.persistentTableConfigType", qualifiedByName = "typeToWidth")
    @Mapping(target = "fieldProps", source = "dto.persistentTableConfigDataSource", qualifiedByName = "dataSourceToFieldProps")
    TableConfigVo dtoToVo(TableConfigDto dto);

    List<TableConfigVo> dtoTableListToVoTableList(List<TableConfigDto> dtoList);

}