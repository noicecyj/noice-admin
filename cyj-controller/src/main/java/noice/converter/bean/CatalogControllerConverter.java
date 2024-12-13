package noice.converter.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
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
public interface CatalogControllerConverter {

    CatalogDto voToDto(CatalogVo vo);

    List<CatalogDto> voListToDtoList(List<CatalogVo> voList);

    Set<CatalogDto> voSetToDtoSet(Set<CatalogVo> voSet);

}