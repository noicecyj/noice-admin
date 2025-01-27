package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(@NotNull MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<MenuDto> findList(@NotNull MenuDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new MenuDto()).getQueryWrapper()));
    }

}