package noice.assembler;

import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.vo.FormConfigVo;
import noice.entity.vo.FormVo;
import noice.entity.vo.TableConfigVo;
import noice.entity.vo.TableVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface TableAndFormAndUrlControllerAssembler {

    @Mapping(target = "formConfigVoList", source = "dto.formConfigDtoList")
    FormVo dtoToVo(FormDto dto);

    FormConfigVo dtoToVo(FormConfigDto dto);

    List<FormConfigVo> dtotFormListToVoFormList(List<FormConfigDto> dtoList);

    @Mapping(target = "tableConfigVoList", source = "dto.tableConfigDtoList")
    TableVo dtoToVo(TableDto dto);

    TableConfigVo dtoToVo(TableConfigDto dto);

    List<TableConfigVo> dtoTableListToVoTableList(List<TableConfigDto> dtoList);

}