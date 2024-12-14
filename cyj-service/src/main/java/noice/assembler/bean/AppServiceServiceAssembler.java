package noice.assembler.bean;

import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
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
public interface AppServiceServiceAssembler {

    AppServiceDto poToDto(AppServicePo po);

    List<AppServiceDto> poListToDtoList(List<AppServicePo> poList);

    Set<AppServiceDto> poSetToDtoSet(Set<AppServicePo> poSet);

    @Mapping(target = "label", source = "po.appServiceName")
    @Mapping(target = "value", source = "po.id")
    OptionDTO poToOptionDto(AppServicePo po);

    List<OptionDTO> poListToDtoOptionList(List<AppServicePo> poList);

}