package noice.assembler.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.PersistentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AppServiceRepository.class, PersistentRepository.class})
public interface PersistentServiceAssembler {

    @Mapping(target = "appServicePo", source = "po.appServiceId")
    @Mapping(target = "persistentPo", source = "po.persistentId")
    PersistentDto poToDto(PersistentPo po);

    List<PersistentDto> poListToDtoList(List<PersistentPo> poList);

    Set<PersistentDto> poSetToDtoSet(Set<PersistentPo> poSet);

}