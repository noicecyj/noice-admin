package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
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
public interface EnterpriseServiceAssembler {

    EnterpriseDto poToDto(EnterprisePo po);

    List<EnterpriseDto> poListToDtoList(List<EnterprisePo> poList);

    Set<EnterpriseDto> poSetToDtoSet(Set<EnterprisePo> poSet);

    @Mapping(target = "label", source = "po.enterpriseName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO<String> poToOptionDto(EnterprisePo po);

    List<OptionDTO<String>> poListToDtoOptionList(List<EnterprisePo> poList);

}