package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDto;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface CatalogControllerAssembler {

    CatalogVo dtoToVo(CatalogDto dto);

    List<CatalogVo> dtoListToVoList(List<CatalogDto> dtoList);

    Set<CatalogVo> dtoSetToVoSet(Set<CatalogDto> dtoList);

}