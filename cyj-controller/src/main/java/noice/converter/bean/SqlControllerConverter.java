package noice.converter.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.vo.bean.SqlVo;
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
public interface SqlControllerConverter {

    SqlDto voToDto(SqlVo vo);

    List<SqlDto> voListToDtoList(List<SqlVo> voList);

    Set<SqlDto> voSetToDtoSet(Set<SqlVo> voSet);

}