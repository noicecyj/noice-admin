package noice.converter.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
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
public interface EnterpriseServiceConverter {

    EnterprisePo dtoToPo(EnterpriseDto dto);

    List<EnterprisePo> dtoListToPoList(List<EnterpriseDto> dtoList);

    Set<EnterprisePo> dtoSetToPoSet(Set<EnterpriseDto> dtoSet);

}