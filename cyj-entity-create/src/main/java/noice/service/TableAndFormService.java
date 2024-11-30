package noice.service;

import noice.assembler.FormAndTableServiceAssembler;
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
public class TableAndFormService {

    private PersistentTableRepository persistentTableRepository;

    private PersistentTableConfigRepository persistentTableConfigRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentFormConfigRepository persistentFormConfigRepository;

    private FormAndTableServiceAssembler formAndTableServiceAssembler;
    // 权限Repository
    private AuthorityRepository authorityRepository;

    @Autowired
    public void setFormAndTableServiceAssembler(FormAndTableServiceAssembler formAndTableServiceAssembler) {
        this.formAndTableServiceAssembler = formAndTableServiceAssembler;
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
            TableDto tableDto = formAndTableServiceAssembler.poToDto(persistentTablePo);
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
            List<TableConfigDto> tableConfigDtoList = formAndTableServiceAssembler.poTableListToDtoTableList(persistentTableConfigPoList);
            tableDto.setTableConfigDtoList(tableConfigDtoList);
            return tableDto;
        }
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
            FormDto formDto = formAndTableServiceAssembler.poToDto(persistentFormPo);
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
            List<FormConfigDto> formConfigDtoList = formAndTableServiceAssembler.poFormListToDtoFormList(persistentFormConfigPoList);
            formDto.setFormConfigDtoList(formConfigDtoList);
            return formDto;
        }
    }

}
