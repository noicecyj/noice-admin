package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
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
public interface AppServiceServiceConverter {

    AppServicePo dtoToPo(AppServiceDto dto);

    List<AppServicePo> dtoListToPoList(List<AppServiceDto> dtoList);

    Set<AppServicePo> dtoSetToPoSet(Set<AppServiceDto> dtoSet);

}