package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
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
public interface PersistentPropertyServiceConverter {

    PersistentPropertyPo dtoToPo(PersistentPropertyDto dto);

    List<PersistentPropertyPo> dtoListToPoList(List<PersistentPropertyDto> dtoList);

    Set<PersistentPropertyPo> dtoSetToPoSet(Set<PersistentPropertyDto> dtoSet);

}