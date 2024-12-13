package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
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
public interface AppServiceControllerConverter {

    AppServiceDto voToDto(AppServiceVo vo);

    List<AppServiceDto> voListToDtoList(List<AppServiceVo> voList);

    Set<AppServiceDto> voSetToDtoSet(Set<AppServiceVo> voSet);

}