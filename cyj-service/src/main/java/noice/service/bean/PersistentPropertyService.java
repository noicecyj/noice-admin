package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(@NotNull PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentPropertyDto> findList(@NotNull PersistentPropertyDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}