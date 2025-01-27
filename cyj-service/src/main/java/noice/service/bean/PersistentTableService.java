package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    private PersistentTableConfigRepository persistentTableConfigRepository;

    private PersistentTableSearchConfigRepository persistentTableSearchConfigRepository;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setPersistentTableConfigRepository(PersistentTableConfigRepository persistentTableConfigRepository) {
        this.persistentTableConfigRepository = persistentTableConfigRepository;
    }

    @Autowired
    public void setPersistentTableSearchConfigRepository(PersistentTableSearchConfigRepository persistentTableSearchConfigRepository) {
        this.persistentTableSearchConfigRepository = persistentTableSearchConfigRepository;
    }

    @Override
    public String addOne(@NotNull PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        persistentTableConfigRepository.findList(new PersistentTableConfigPo().eqPersistentTableId(id).getQueryWrapper()).forEach(po -> persistentTableConfigRepository.update(po.eqPersistentTableId(null)));
        persistentTableSearchConfigRepository.findList(new PersistentTableSearchConfigPo().eqPersistentTableId(id).getQueryWrapper()).forEach(po -> persistentTableSearchConfigRepository.update(po.eqPersistentTableId(null)));
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(@NotNull PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableDto> findList(@NotNull PersistentTableDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableDto()).getQueryWrapper()));
    }

}