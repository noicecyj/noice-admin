package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    private CatalogDictionaryRepository catalogDictionaryRepository;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setCatalogDictionaryRepository(CatalogDictionaryRepository catalogDictionaryRepository) {
        this.catalogDictionaryRepository = catalogDictionaryRepository;
    }

    @Override
    public String addOne(@NotNull CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        catalogDictionaryRepository.findList(new CatalogDictionaryPo().eqCatalogId(id).getQueryWrapper()).forEach(po -> catalogDictionaryRepository.update(po.eqCatalogId(null)));
        return repository.delete(new CatalogPo().eqId(id));
    }

    @Override
    public int updateOne(@NotNull CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(@NotNull CatalogDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDto> findList(@NotNull CatalogDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new CatalogDto()).getQueryWrapper()));
    }

}