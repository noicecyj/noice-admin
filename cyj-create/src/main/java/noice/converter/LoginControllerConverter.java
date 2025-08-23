package noice.converter;

import noice.entity.dto.LoginDto;
import noice.entity.vo.LoginVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface LoginControllerConverter {

    LoginDto voToDto(LoginVo vo);

}