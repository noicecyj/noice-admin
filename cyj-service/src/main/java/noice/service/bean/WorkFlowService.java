package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.WorkFlowServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.WorkFlowServiceConverter;
import noice.entity.dto.bean.WorkFlowDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.WorkFlowRepository;
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
public class WorkFlowService implements BeanService<WorkFlowDto> {

    private WorkFlowRepository repository;

    private WorkFlowServiceConverter converter;

    private WorkFlowServiceAssembler assembler;

    @Autowired
    public void setRepository(WorkFlowRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(WorkFlowServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(WorkFlowServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull WorkFlowDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull WorkFlowDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public WorkFlowDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public WorkFlowDto findOne(@NotNull WorkFlowDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<WorkFlowDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<WorkFlowDto> findList(@NotNull WorkFlowDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<WorkFlowDto> findPage(@NotNull WorkFlowDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new WorkFlowDto()).getQueryWrapper()));
    }

}