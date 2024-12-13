package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
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

}