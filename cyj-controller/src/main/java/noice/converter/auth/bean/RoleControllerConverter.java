package noice.converter.auth.bean;

import noice.entity.auth.dto.bean.RoleDto;
import noice.entity.auth.vo.bean.RoleVo;
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
public interface RoleControllerConverter {

    RoleDto voToDto(RoleVo vo);

    List<RoleDto> voListToDtoList(List<RoleVo> voList);

    Set<RoleDto> voSetToDtoSet(Set<RoleVo> voSet);

}