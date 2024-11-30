package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentTableServiceConverter {

    PersistentTablePo dtoToPo(PersistentTableDto dto);

    List<PersistentTablePo> dtoListToPoList(List<PersistentTableDto> dtoList);

    Set<PersistentTablePo> dtoSetToPoSet(Set<PersistentTableDto> dtoSet);

}