package noice.converter.craete.bean;

import noice.entity.create.dto.bean.PersistentFormConfigDto;
import noice.entity.create.po.bean.PersistentFormConfigPo;
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