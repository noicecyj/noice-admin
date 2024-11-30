package noice.assembler;

import noice.entity.dto.TreeMenuDto;
import noice.entity.vo.TreeMenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface TreeMenuControllerAssembler {

    TreeMenuVo treeDtoToTreeVo(TreeMenuDto dto);

    List<TreeMenuVo> treeDtoListToTreeVoList(List<TreeMenuDto> dto);

}