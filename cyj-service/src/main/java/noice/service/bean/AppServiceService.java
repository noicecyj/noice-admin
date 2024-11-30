package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(@NotNull AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AppServiceDto> findList(@NotNull AppServiceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}