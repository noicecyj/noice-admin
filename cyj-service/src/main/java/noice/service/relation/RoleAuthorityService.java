package noice.service.relation;

import noice.assembler.relation.RoleAuthorityServiceAssembler;
import noice.converter.relation.RoleAuthorityServiceConverter;
import noice.entity.dto.relation.RoleAuthorityDto;
import noice.handler.relation.RelationService;
import noice.repository.relation.RoleAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleAuthorityService implements RelationService<RoleAuthorityDto> {

    private RoleAuthorityRepository repository;

    private RoleAuthorityServiceConverter converter;

    private RoleAuthorityServiceAssembler assembler;

    @Autowired
    public void setRepository(RoleAuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleAuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleAuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public void set(List<String> ids, List<RoleAuthorityDto> dtoList) {
        ids.forEach(id -> repository.delete(id));
        dtoList.forEach(dto -> repository.add(converter.dtoToPo(dto)));
    }

    @Override
    public RoleAuthorityDto get(RoleAuthorityDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto)));
    }

}