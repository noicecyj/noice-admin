package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.entity.po.bean.SqlPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(new SqlPo().eqId(id));
    }

    @Override
    public int updateOne(@NotNull SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(@NotNull SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<SqlDto> findList(@NotNull SqlDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new SqlDto()).getQueryWrapper()));
    }

}