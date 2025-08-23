package noice.converter.craete.bean;

import noice.entity.create.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.create.po.bean.PersistentTableSearchConfigPo;
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