package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}