package noice.converter.auth.bean;

import noice.entity.auth.po.bean.SqlPo;
import noice.entity.dto.bean.SqlDto;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface SqlServiceConverter {

    SqlPo dtoToPo(SqlDto dto);

    List<SqlPo> dtoListToPoList(List<SqlDto> dtoList);

    Set<SqlPo> dtoSetToPoSet(Set<SqlDto> dtoSet);

}