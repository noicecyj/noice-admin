package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.UserRoleRepository;
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
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(@NotNull RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(@NotNull RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<RoleDto> findList(@NotNull RoleDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new RoleDto()).getQueryWrapper()));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}