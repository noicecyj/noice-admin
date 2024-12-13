package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
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
public interface PersistentTableSearchConfigServiceConverter {

    PersistentTableSearchConfigPo dtoToPo(PersistentTableSearchConfigDto dto);

    List<PersistentTableSearchConfigPo> dtoListToPoList(List<PersistentTableSearchConfigDto> dtoList);

    Set<PersistentTableSearchConfigPo> dtoSetToPoSet(Set<PersistentTableSearchConfigDto> dtoSet);

}