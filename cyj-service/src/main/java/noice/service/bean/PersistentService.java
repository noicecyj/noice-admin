package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.InterfacePo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
import noice.repository.bean.PersistentTableRepository;
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

    private InterfaceRepository interfaceRepository;

    private PersistentTableRepository persistentTableRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentPropertyRepository persistentPropertyRepository;

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

    @Autowired
    public void setInterfaceRepository(InterfaceRepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setPersistentFormRepository(PersistentFormRepository persistentFormRepository) {
        this.persistentFormRepository = persistentFormRepository;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        interfaceRepository.findList(new InterfacePo().eqPersistentId(id).getQueryWrapper()).forEach(po -> interfaceRepository.update(po.eqPersistentId(null)));
        persistentTableRepository.findList(new PersistentTablePo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentTableRepository.update(po.eqPersistentId(null)));
        persistentFormRepository.findList(new PersistentFormPo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentFormRepository.update(po.eqPersistentId(null)));
        persistentPropertyRepository.findList(new PersistentPropertyPo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentPropertyRepository.update(po.eqPersistentId(null)));
        return repository.delete(new PersistentPo().eqId(id));
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

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).getQueryWrapper()));
    }

}