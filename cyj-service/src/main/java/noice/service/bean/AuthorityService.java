package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public String addOne(@NotNull AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AuthorityDto findOne(@NotNull AuthorityDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AuthorityDto> findList(@NotNull AuthorityDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new AuthorityDto()).getQueryWrapper()));
    }

    public List<AuthorityDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(ids)).stream().map(RoleAuthorityPo::getAuthorityId).toList()));
    }

}