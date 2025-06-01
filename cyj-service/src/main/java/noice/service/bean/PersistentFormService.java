package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentFormServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentFormServiceConverter;
import noice.entity.dto.bean.PersistentFormDto;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentFormRepository;
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
public class PersistentFormService implements BeanService<PersistentFormDto> {

    private PersistentFormRepository repository;

    private PersistentFormServiceConverter converter;

    private PersistentFormServiceAssembler assembler;

    private PersistentFormConfigRepository persistentFormConfigRepository;

    @Autowired
    public void setRepository(PersistentFormRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentFormServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setPersistentFormConfigRepository(PersistentFormConfigRepository persistentFormConfigRepository) {
        this.persistentFormConfigRepository = persistentFormConfigRepository;
    }

    @Override
    public String addOne(@NotNull PersistentFormDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        persistentFormConfigRepository.findList(new PersistentFormConfigPo().eqPersistentFormId(id).getQueryWrapper()).forEach(po -> persistentFormConfigRepository.update(po.eqPersistentFormId(null)));
        return repository.delete(new PersistentFormPo().eqId(id));
    }

    @Override
    public int updateOne(@NotNull PersistentFormDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentFormDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentFormDto findOne(@NotNull PersistentFormDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentFormDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentFormDto> findList(@NotNull PersistentFormDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentFormDto> findPage(@NotNull PersistentFormDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentFormDto()).getQueryWrapper()));
    }

}