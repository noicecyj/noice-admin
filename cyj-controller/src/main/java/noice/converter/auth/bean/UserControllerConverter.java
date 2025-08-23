package noice.converter.auth.bean;

import noice.entity.auth.dto.bean.UserDto;
import noice.entity.auth.vo.bean.UserVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.auth.bean.EnterpriseRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {EnterpriseRepository.class})
public interface UserControllerConverter {

    @Mapping(target = "enterprisePo", source = "vo.enterpriseId")
    UserDto voToDto(UserVo vo);

    List<UserDto> voListToDtoList(List<UserVo> voList);

    Set<UserDto> voSetToDtoSet(Set<UserVo> voSet);

}