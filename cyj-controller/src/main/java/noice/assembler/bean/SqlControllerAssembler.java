package noice.assembler.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.vo.bean.SqlVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface SqlControllerAssembler {

    SqlVo dtoToVo(SqlDto dto);

    List<SqlVo> dtoListToVoList(List<SqlDto> dtoList);

    Set<SqlVo> dtoSetToVoSet(Set<SqlDto> dtoList);

}