package noice.converter.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.po.bean.SqlPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface SqlServiceConverter {

    SqlPo dtoToPo(SqlDto dto);

    List<SqlPo> dtoListToPoList(List<SqlDto> dtoList);

    Set<SqlPo> dtoSetToPoSet(Set<SqlDto> dtoSet);

}