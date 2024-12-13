package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
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
public interface RoleServiceConverter {

    RolePo dtoToPo(RoleDto dto);

    List<RolePo> dtoListToPoList(List<RoleDto> dtoList);

    Set<RolePo> dtoSetToPoSet(Set<RoleDto> dtoSet);

}