package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.vo.bean.RoleVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface RoleControllerConverter {

    RoleDto voToDto(RoleVo vo);

    List<RoleDto> voListToDtoList(List<RoleVo> voList);

    Set<RoleDto> voSetToDtoSet(Set<RoleVo> voSet);

}