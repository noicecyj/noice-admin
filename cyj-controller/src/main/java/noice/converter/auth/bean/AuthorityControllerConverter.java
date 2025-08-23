package noice.converter.auth.bean;


import noice.entity.auth.dto.bean.AuthorityDto;
import noice.entity.auth.vo.bean.AuthorityVo;
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
public interface AuthorityControllerConverter {

    AuthorityDto voToDto(AuthorityVo vo);

    List<AuthorityDto> voListToDtoList(List<AuthorityVo> voList);

    Set<AuthorityDto> voSetToDtoSet(Set<AuthorityVo> voSet);

}