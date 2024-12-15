package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.RolePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AuthorityServiceAssembler {

    AuthorityDto poToDto(AuthorityPo po);

    @Mapping(target = "rolePoList", source = "rolePoList")
    AuthorityDto poToDto(AuthorityPo po, List<RolePo> rolePoList);

    List<AuthorityDto> poListToDtoList(List<AuthorityPo> poList);

    Set<AuthorityDto> poSetToDtoSet(Set<AuthorityPo> poSet);

    @Mapping(target = "label", source = "po.authorityName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(AuthorityPo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<AuthorityPo> poList);

}