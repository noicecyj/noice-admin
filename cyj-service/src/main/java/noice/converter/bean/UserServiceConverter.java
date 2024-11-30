package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface UserServiceConverter {

    UserPo dtoToPo(UserDto dto);

    List<UserPo> dtoListToPoList(List<UserDto> dtoList);

    Set<UserPo> dtoSetToPoSet(Set<UserDto> dtoSet);

}