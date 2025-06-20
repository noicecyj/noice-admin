package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(new CatalogDictionaryPo().eqId(id));
    }

    @Override
    public int updateOne(@NotNull CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(@NotNull CatalogDictionaryDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDictionaryDto> findList(@NotNull CatalogDictionaryDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new CatalogDictionaryDto()).getQueryWrapper()));
    }

}