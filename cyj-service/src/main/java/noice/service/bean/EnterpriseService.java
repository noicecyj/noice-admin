package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
import noice.entity.po.bean.UserPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
import noice.repository.bean.UserRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    private UserRepository userRepository;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String addOne(@NotNull EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        userRepository.findList(new UserPo().eqEnterpriseId(id).getQueryWrapper()).forEach(po -> userRepository.update(po.eqEnterpriseId(null)));
        return repository.delete(new EnterprisePo().eqId(id));
    }

    @Override
    public int updateOne(@NotNull EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(@NotNull EnterpriseDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<EnterpriseDto> findList(@NotNull EnterpriseDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new EnterpriseDto()).getQueryWrapper()));
    }

}