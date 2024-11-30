package noice.converter.bean;

import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentFormServiceConverter {

    PersistentFormPo dtoToPo(PersistentFormDto dto);

    List<PersistentFormPo> dtoListToPoList(List<PersistentFormDto> dtoList);

    Set<PersistentFormPo> dtoSetToPoSet(Set<PersistentFormDto> dtoSet);

}