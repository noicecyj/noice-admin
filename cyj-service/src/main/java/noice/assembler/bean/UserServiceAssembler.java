package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.RolePo;
import noice.entity.po.bean.UserPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.EnterpriseRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {EnterpriseRepository.class})
public interface UserServiceAssembler {

    @Mapping(target = "enterprisePo", source = "po.enterpriseId")
    UserDto poToDto(UserPo po);

    @Mapping(target = "enterprisePo", source = "po.enterpriseId")
    @Mapping(target = "rolePoList", source = "rolePoList")
    UserDto poToDto(UserPo po, List<RolePo> rolePoList);

    List<UserDto> poListToDtoList(List<UserPo> poList);

    Set<UserDto> poSetToDtoSet(Set<UserPo> poSet);

    @Mapping(target = "label", source = "po.userName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(UserPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<UserPo> poList);

}