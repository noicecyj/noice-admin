package noice.converter.bean;

import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.entity.po.bean.PersistentFormConfigPo;
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
public interface PersistentFormConfigServiceConverter {

    PersistentFormConfigPo dtoToPo(PersistentFormConfigDto dto);

    List<PersistentFormConfigPo> dtoListToPoList(List<PersistentFormConfigDto> dtoList);

    Set<PersistentFormConfigPo> dtoSetToPoSet(Set<PersistentFormConfigDto> dtoSet);

}