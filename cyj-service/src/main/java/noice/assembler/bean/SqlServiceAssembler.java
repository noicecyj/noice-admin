package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.SqlDto;
import noice.entity.po.bean.SqlPo;
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
public interface SqlServiceAssembler {

    SqlDto poToDto(SqlPo po);

    List<SqlDto> poListToDtoList(List<SqlPo> poList);

    Set<SqlDto> poSetToDtoSet(Set<SqlPo> poSet);

    @Mapping(target = "label", source = "po.sqlName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(SqlPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<SqlPo> poList);

}