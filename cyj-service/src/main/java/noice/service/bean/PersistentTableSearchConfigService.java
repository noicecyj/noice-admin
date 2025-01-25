package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableSearchConfigDto()).getQueryWrapper()));
    }

}