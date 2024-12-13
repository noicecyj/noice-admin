package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.entity.po.bean.PersistentTableConfigPo;
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
public interface PersistentTableConfigServiceConverter {

    PersistentTableConfigPo dtoToPo(PersistentTableConfigDto dto);

    List<PersistentTableConfigPo> dtoListToPoList(List<PersistentTableConfigDto> dtoList);

    Set<PersistentTableConfigPo> dtoSetToPoSet(Set<PersistentTableConfigDto> dtoSet);

}