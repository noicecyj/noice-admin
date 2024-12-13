package noice.assembler.bean;

import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.vo.bean.CatalogDictionaryVo;
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
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {CatalogServiceAssembler.class})
public interface CatalogDictionaryControllerAssembler {

    @Mapping(target = "catalogDto", source = "dto.catalogPo")
    CatalogDictionaryVo dtoToVo(CatalogDictionaryDto dto);

    List<CatalogDictionaryVo> dtoListToVoList(List<CatalogDictionaryDto> dtoList);

    Set<CatalogDictionaryVo> dtoSetToVoSet(Set<CatalogDictionaryDto> dtoList);

}