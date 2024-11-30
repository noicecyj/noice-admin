package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityServiceConverter {

    AuthorityPo dtoToPo(AuthorityDto dto);

    List<AuthorityPo> dtoListToPoList(List<AuthorityDto> dtoList);

    Set<AuthorityPo> dtoSetToPoSet(Set<AuthorityDto> dtoSet);

}