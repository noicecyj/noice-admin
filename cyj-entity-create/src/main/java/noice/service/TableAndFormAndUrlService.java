package noice.service;

import noice.assembler.TableAndFormAndUrlServiceAssembler;
import noice.common.contants.UserContext;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentTableConfigRepository;
import noice.repository.bean.PersistentTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TableAndFormAndUrlService {

    private PersistentTableRepository persistentTableRepository;

    private PersistentTableConfigRepository persistentTableConfigRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentFormConfigRepository persistentFormConfigRepository;

    private TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler;

    private AuthorityRepository authorityRepository;

    @Autowired
    public void setFormAndTableServiceAssembler(TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler) {
        this.tableAndFormAndUrlServiceAssembler = tableAndFormAndUrlServiceAssembler;
    }

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setPersistentTableConfigRepository(PersistentTableConfigRepository persistentTableConfigRepository) {
        this.persistentTableConfigRepository = persistentTableConfigRepository;
    }

    @Autowired
    public void setAuthorityRepository(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Autowired
    public void setPersistentFormRepository(PersistentFormRepository persistentFormRepository) {
        this.persistentFormRepository = persistentFormRepository;
    }

    @Autowired
    public void setPersistentFormConfigRepository(PersistentFormConfigRepository persistentFormConfigRepository) {
        this.persistentFormConfigRepository = persistentFormConfigRepository;
    }

    public TableDto getTable(String tableCode) {
        List<String> tableCodeList = UserContext.getUserTable();
        if (tableCodeList.isEmpty()) {
            return null;
        } else {
            PersistentTablePo persistentTablePo = persistentTableRepository
                    .find(new PersistentTablePo().eqPersistentTableCode(tableCode).getQueryWrapper());
            if (persistentTablePo == null) {
                return null;
            }
            TableDto tableDto = tableAndFormAndUrlServiceAssembler.poToDto(persistentTablePo);
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", tableCodeList))) {
                authorityPo.inAuthorityCode(tableCodeList);
            }
            List<String> authorityId = authorityRepository
                    .findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
            List<PersistentTableConfigPo> persistentTableConfigPoList = persistentTableConfigRepository
                    .findList(new PersistentTableConfigPo()
                            .eqPersistentTableId(persistentTablePo.getId())
                            .inAuthorityId(authorityId).getQueryWrapper());
            List<TableConfigDto> tableConfigDtoList = tableAndFormAndUrlServiceAssembler.poTableListToDtoTableList(persistentTableConfigPoList);
            tableDto.setTableConfigDtoList(tableConfigDtoList);
            return tableDto;
        }
    }

    public TableDto getTableSelect(String tableCode) {
        TableDto table = getTable(tableCode);
        List<TableConfigDto> list = table.getTableConfigDtoList().stream().filter(tableConfigDto ->
                tableConfigDto.getPersistentTableConfigCode().contains("Code") ||
                        tableConfigDto.getPersistentTableConfigCode().contains("Name") ||
                        "id".equals(tableConfigDto.getPersistentTableConfigCode())).toList();
        table.setTableConfigDtoList(list);
        return table;
    }

    public FormDto getForm(String formCode) {
        List<String> tableCodeList = UserContext.getUserTable();
        if (tableCodeList.isEmpty()) {
            return null;
        } else {
            PersistentFormPo persistentFormPo = persistentFormRepository
                    .find(new PersistentFormPo().eqPersistentFormCode(formCode).getQueryWrapper());
            if (persistentFormPo == null) {
                return null;
            }
            FormDto formDto = tableAndFormAndUrlServiceAssembler.poToDto(persistentFormPo);
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", tableCodeList))) {
                authorityPo.inAuthorityCode(tableCodeList);
            }
            List<String> authorityId = authorityRepository
                    .findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
            List<PersistentFormConfigPo> persistentFormConfigPoList = persistentFormConfigRepository
                    .findList(new PersistentFormConfigPo()
                            .eqPersistentFormId(persistentFormPo.getId())
                            .inAuthorityId(authorityId).getQueryWrapper());
            List<FormConfigDto> formConfigDtoList = tableAndFormAndUrlServiceAssembler.poFormListToDtoFormList(persistentFormConfigPoList);
            FormConfigDto sortCodeFormConfig = new FormConfigDto();
            sortCodeFormConfig.setPersistentFormConfigCode("sortCode");
            sortCodeFormConfig.setPersistentFormConfigName("排序码");
            sortCodeFormConfig.setPersistentFormConfigMode("NumberPicker");
            sortCodeFormConfig.setPersistentFormConfigColSpan(12);
            sortCodeFormConfig.setPersistentFormConfigEdit(true);
            formConfigDtoList.add(sortCodeFormConfig);
            FormConfigDto statusFormConfig = new FormConfigDto();
            statusFormConfig.setPersistentFormConfigCode("status");
            statusFormConfig.setPersistentFormConfigName("状态");
            statusFormConfig.setPersistentFormConfigMode("Select");
            statusFormConfig.setPersistentFormConfigColSpan(12);
            statusFormConfig.setPersistentFormConfigEdit(true);
            formConfigDtoList.add(statusFormConfig);
//            formDto.setFormConfigDtoList(formConfigDtoList);
            return formDto;
        }
    }

//    public TableConfigDto getUrl(String persistentCode) {
//
//    }
}
