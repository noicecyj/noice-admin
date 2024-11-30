package noice.assembler.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseServiceAssembler {

    EnterpriseDto poToDto(EnterprisePo po);

    List<EnterpriseDto> poListToDtoList(List<EnterprisePo> poList);

    Set<EnterpriseDto> poSetToDtoSet(Set<EnterprisePo> poSet);

}