package noice.converter.auth.bean;

import noice.entity.auth.dto.bean.AuthorityDto;
import noice.entity.auth.po.bean.AuthorityPo;
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
public interface AuthorityServiceConverter {

    AuthorityPo dtoToPo(AuthorityDto dto);

    List<AuthorityPo> dtoListToPoList(List<AuthorityDto> dtoList);

    Set<AuthorityPo> dtoSetToPoSet(Set<AuthorityDto> dtoSet);

}