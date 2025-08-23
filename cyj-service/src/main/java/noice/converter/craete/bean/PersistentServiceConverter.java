package noice.converter.craete.bean;


import noice.entity.create.dto.bean.PersistentDto;
import noice.entity.create.po.bean.PersistentPo;
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