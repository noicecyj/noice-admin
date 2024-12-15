package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.UserServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.UserServiceConverter;
import noice.entity.dto.bean.UserDto;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.UserRepository;
import noice.repository.relation.UserRoleRepository;
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
public class UserService implements BeanService<UserDto> {

    private UserRepository repository;

    private UserServiceConverter converter;

    private UserServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(UserServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public int addOne(@NotNull UserDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull UserDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public UserDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public UserDto findOne(@NotNull UserDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<UserDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<UserDto> findList(@NotNull UserDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<UserDto> findPage(@NotNull UserDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new UserDto()).eqAuto().getQueryWrapper()));
    }

    public List<UserDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inRoleId(ids)).stream().map(UserRolePo::getUserId).toList()));
    }

}