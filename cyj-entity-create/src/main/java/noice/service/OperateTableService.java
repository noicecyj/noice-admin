package noice.service;

import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.TableColumnPo;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.builder.entity.dml.bean.DMLBeanFieldAlterBuilder;
import noice.handler.builder.entity.dml.bean.DMLBeanTableBuilder;
import noice.repository.OperateTableRepository;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static noice.constant.CreateConstant.DATABASE;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OperateTableService {

    private OperateTableRepository repository;

    private PersistentServiceConverter persistentServiceConverter;

    private PersistentPropertyServiceConverter persistentPropertyServiceConverter;

    private PersistentPropertyServiceAssembler persistentPropertyServiceAssembler;

    private PersistentRepository persistentRepository;

    private PersistentPropertyRepository persistentPropertyRepository;

    private DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder;

    private DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldUpdateAlterBuilder dmlBeanFieldUpdateAlterBuilder;

    @Autowired
    public void setRepository(OperateTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setPersistentServiceConverter(PersistentServiceConverter persistentServiceConverter) {
        this.persistentServiceConverter = persistentServiceConverter;
    }

    @Autowired
    public void setPersistentPropertyServiceConverter(PersistentPropertyServiceConverter persistentPropertyServiceConverter) {
        this.persistentPropertyServiceConverter = persistentPropertyServiceConverter;
    }

    @Autowired
    public void setPersistentPropertyServiceAssembler(PersistentPropertyServiceAssembler persistentPropertyServiceAssembler) {
        this.persistentPropertyServiceAssembler = persistentPropertyServiceAssembler;
    }

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Autowired
    public void setDmlBeanTableDropBuilder(DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder) {
        this.dmlBeanTableDropBuilder = dmlBeanTableDropBuilder;
    }

    @Autowired
    public void setDmlBeanTableAddBuilder(DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder) {
        this.dmlBeanTableAddBuilder = dmlBeanTableAddBuilder;
    }

    @Autowired
    public void setDmlBeanFieldDropAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder) {
        this.dmlBeanFieldDropAlterBuilder = dmlBeanFieldDropAlterBuilder;
    }

    @Autowired
    public void setDmlBeanFieldAddAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder) {
        this.dmlBeanFieldAddAlterBuilder = dmlBeanFieldAddAlterBuilder;
    }

    @Autowired
    public void setDmlBeanFieldUpdateAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldUpdateAlterBuilder dmlBeanFieldUpdateAlterBuilder) {
        this.dmlBeanFieldUpdateAlterBuilder = dmlBeanFieldUpdateAlterBuilder;
    }

    public boolean addTable(PersistentDto dto) {
        PersistentPo po = persistentServiceConverter.dtoToPo(dto);
        return repository.addTable(dmlBeanTableAddBuilder.builder(po, persistentPropertyRepository.findList(new PersistentPropertyPo().eqPersistentId(po.getId()).getQueryWrapper()), DATABASE).toString());
    }

    public boolean dropTable(PersistentDto dto) {
        return repository.dropTable(dmlBeanTableDropBuilder.builder("t_" + dto.getPersistentCode(), DATABASE).toString());
    }

    public boolean updateTable(PersistentDto dto) {
        List<PersistentPropertyPo> propertyRepositoryList = persistentPropertyRepository.findList(new PersistentPropertyPo().eqPersistentId(dto.getPersistentId()).getQueryWrapper());
        propertyRepositoryList.forEach(persistentPropertyPo -> updateColumn(persistentPropertyServiceAssembler.poToDto(persistentPropertyPo)));
        return true;
    }

    public boolean addColumn(PersistentPropertyDto dto) {
        PersistentPo po = persistentRepository.find(dto.getPersistentId());
        return repository.addColumn(dmlBeanFieldAddAlterBuilder
                .builder(persistentPropertyServiceConverter.dtoToPo(dto), "t_" + po.getPersistentCode(), DATABASE).toString());
    }

    public boolean dropColumn(PersistentPropertyDto dto) {
        PersistentPo po = persistentRepository.find(dto.getPersistentId());
        return repository.dropColumn(dmlBeanFieldDropAlterBuilder
                .builder(persistentPropertyServiceConverter.dtoToPo(dto), "t_" + po.getPersistentCode(), DATABASE).toString());
    }

    public boolean updateColumn(PersistentPropertyDto dto) {
        PersistentPo po = persistentRepository.find(dto.getPersistentId());
        TableColumnPo tableColumnPo = repository.queryTableColumn(po.getPersistentCode(), dto.getPersistentPropertyCode());
        if (tableColumnPo == null) {
            return false;
        } else {
            if (dto.getPersistentPropertyCode().equals(tableColumnPo.getCOLUMN_NAME())) {
                return repository.updateColumn(dmlBeanFieldUpdateAlterBuilder.builder(persistentPropertyServiceConverter.dtoToPo(dto), null, "t_" + po.getPersistentCode(), DATABASE).toString());
            } else {
                return repository.updateColumn(dmlBeanFieldUpdateAlterBuilder.builder(persistentPropertyServiceConverter.dtoToPo(dto), tableColumnPo.getCOLUMN_NAME(), "t_" + po.getPersistentCode(), DATABASE).toString());
            }
        }
    }

}
