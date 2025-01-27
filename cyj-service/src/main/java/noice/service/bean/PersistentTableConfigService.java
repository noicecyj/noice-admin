package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(@NotNull PersistentTableConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableConfigDto> findList(@NotNull PersistentTableConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableConfigDto()).getQueryWrapper()));
    }

}