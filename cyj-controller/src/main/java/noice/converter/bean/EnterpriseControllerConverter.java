package noice.converter.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.vo.bean.EnterpriseVo;
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
public interface EnterpriseControllerConverter {

    EnterpriseDto voToDto(EnterpriseVo vo);

    List<EnterpriseDto> voListToDtoList(List<EnterpriseVo> voList);

    Set<EnterpriseDto> voSetToDtoSet(Set<EnterpriseVo> voSet);

}