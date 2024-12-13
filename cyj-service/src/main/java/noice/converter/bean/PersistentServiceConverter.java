package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
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
public interface PersistentServiceConverter {

    PersistentPo dtoToPo(PersistentDto dto);

    List<PersistentPo> dtoListToPoList(List<PersistentDto> dtoList);

    Set<PersistentPo> dtoSetToPoSet(Set<PersistentDto> dtoSet);

}