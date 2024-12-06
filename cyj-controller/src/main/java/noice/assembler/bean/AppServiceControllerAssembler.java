package noice.assembler.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface AppServiceControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    AppServiceVo dtoToVo(AppServiceDto dto);

    List<AppServiceVo> dtoListToVoList(List<AppServiceDto> dtoList);

    Set<AppServiceVo> dtoSetToVoSet(Set<AppServiceDto> dtoList);

}