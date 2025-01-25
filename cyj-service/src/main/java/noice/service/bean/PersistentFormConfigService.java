package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentFormConfigServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentFormConfigServiceConverter;
import noice.entity.dto.bean.PersistentFormConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentFormConfigRepository;
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
public class PersistentFormConfigService implements BeanService<PersistentFormConfigDto> {

    private PersistentFormConfigRepository repository;

    private PersistentFormConfigServiceConverter converter;

    private PersistentFormConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentFormConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentFormConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentFormConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentFormConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentFormConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentFormConfigDto findOne(@NotNull PersistentFormConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentFormConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentFormConfigDto> findList(@NotNull PersistentFormConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentFormConfigDto> findPage(@NotNull PersistentFormConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentFormConfigDto()).getQueryWrapper()));
    }

}