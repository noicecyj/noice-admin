package noice.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import noice.assembler.TableAndFormAndUrlServiceAssembler;
import noice.common.contants.UserContext;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormConfigRowDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.dto.UrlDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.InterfacePo;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentRepository;
import noice.repository.bean.PersistentTableConfigRepository;
import noice.repository.bean.PersistentTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    private PersistentRepository persistentRepository;

    private InterfaceRepository interfaceRepository;

    private TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler;

    private AuthorityRepository authorityRepository;

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setPersistentTableConfigRepository(PersistentTableConfigRepository persistentTableConfigRepository) {
        this.persistentTableConfigRepository = persistentTableConfigRepository;
    }

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
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

    @Autowired
    public void setInterfaceRepository(InterfaceRepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    @Autowired
    public void setTableAndFormAndUrlServiceAssembler(TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler) {
        this.tableAndFormAndUrlServiceAssembler = tableAndFormAndUrlServiceAssembler;
    }

    public TableDto getTable(String tableCode) {
        List<String> tableCodeList = UserContext.getUserTable();
        if (tableCodeList.isEmpty()) {
            return null;
        } else {
            PersistentTablePo persistentTablePo = persistentTableRepository.find(new PersistentTablePo().eqPersistentTableCode(tableCode).getQueryWrapper());
            if (persistentTablePo == null) {
                return null;
            }
            TableDto tableDto = tableAndFormAndUrlServiceAssembler.poToDto(persistentTablePo);
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", tableCodeList))) {
                authorityPo.inAuthorityCode(tableCodeList);
            }
            List<String> authorityId = authorityRepository.findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
            List<PersistentTableConfigPo> persistentTableConfigPoList = persistentTableConfigRepository.findList(new PersistentTableConfigPo().eqPersistentTableId(persistentTablePo.getId()).inAuthorityId(authorityId).orderBySortCode(true).getQueryWrapper());
            List<TableConfigDto> tableConfigDtoList = tableAndFormAndUrlServiceAssembler.poTableListToDtoTableList(persistentTableConfigPoList);
            TableConfigDto sortCodeCol = new TableConfigDto();
            sortCodeCol.setId("sortCodeKey");
            sortCodeCol.setPersistentTableConfigCode("sortCode");
            sortCodeCol.setPersistentTableConfigName("排序");
            sortCodeCol.setPersistentTableConfigDisplay(false);
            tableConfigDtoList.add(sortCodeCol);
            TableConfigDto statusCol = new TableConfigDto();
            statusCol.setId("statusKey");
            statusCol.setPersistentTableConfigCode("status");
            statusCol.setPersistentTableConfigName("状态");
            statusCol.setPersistentTableConfigDisplay(false);
            tableConfigDtoList.add(statusCol);
            tableDto.setTableConfigDtoList(tableConfigDtoList);
            return tableDto;
        }
    }

    public FormDto getForm(String formCode) {
        List<String> formCodeList = UserContext.getUserForm();
        if (formCodeList.isEmpty()) {
            return null;
        } else {
            PersistentFormPo persistentFormPo = persistentFormRepository.find(new PersistentFormPo().eqPersistentFormCode(formCode).getQueryWrapper());
            if (persistentFormPo == null) {
                return null;
            }
            FormDto formDto = tableAndFormAndUrlServiceAssembler.poToDto(persistentFormPo);
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", formCodeList))) {
                authorityPo.inAuthorityCode(formCodeList);
            }
            List<String> authorityId = authorityRepository.findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
            List<PersistentFormConfigPo> persistentFormConfigPoList = persistentFormConfigRepository.findList(new PersistentFormConfigPo().eqPersistentFormId(persistentFormPo.getId()).inAuthorityId(authorityId).getQueryWrapper());
            List<FormConfigDto> formConfigDtoList = tableAndFormAndUrlServiceAssembler.poFormListToDtoFormList(persistentFormConfigPoList);
            List<FormConfigRowDto> formConfigRowDtoList = setFormConfigRow(formConfigDtoList);
            formConfigRowDtoList.add(setBaseFormConfigRow());
            formDto.setFormConfigRowDtoList(formConfigRowDtoList);
            return formDto;
        }
    }

    private List<FormConfigRowDto> setFormConfigRow(List<FormConfigDto> formConfigDtoList) {
        List<FormConfigRowDto> formConfigRowDtoList = new ArrayList<>();
        if (!CollUtil.isEmpty(formConfigDtoList)) {
            int currentRowCol = 0;
            List<FormConfigDto> row = new ArrayList<>();
            for (FormConfigDto formConfigDto : formConfigDtoList) {
                currentRowCol += formConfigDto.getPersistentFormConfigColSpan();
                if (currentRowCol <= 24) {
                    row.add(formConfigDto);
                } else {
                    FormConfigRowDto formConfigRowDto = new FormConfigRowDto();
                    List<FormConfigDto> rowData = new ArrayList<>(row);
                    formConfigRowDto.setFormConfigDtoList(rowData);
                    formConfigRowDtoList.add(formConfigRowDto);
                    row.clear();
                    currentRowCol = formConfigDto.getPersistentFormConfigColSpan();
                    row.add(formConfigDto);
                }
            }
            if (!row.isEmpty()) {
                FormConfigRowDto formConfigRowDto = new FormConfigRowDto();
                List<FormConfigDto> rowData = new ArrayList<>(row);
                formConfigRowDto.setFormConfigDtoList(rowData);
                formConfigRowDtoList.add(formConfigRowDto);
            }
        }
        return formConfigRowDtoList;
    }

    private FormConfigRowDto setBaseFormConfigRow() {
        FormConfigRowDto baseFormConfigRowDto = new FormConfigRowDto();
        List<FormConfigDto> baseFormConfigDtoList = new ArrayList<>();
        FormConfigDto sortCodeFormConfig = new FormConfigDto();
        sortCodeFormConfig.setPersistentFormConfigCode("sortCode");
        sortCodeFormConfig.setPersistentFormConfigName("排序码");
        sortCodeFormConfig.setPersistentFormConfigMode("NumberPicker");
        sortCodeFormConfig.setPersistentFormConfigColSpan(12);
        sortCodeFormConfig.setPersistentFormConfigEdit(true);
        sortCodeFormConfig.setPersistentFormConfigRequired(true);
        baseFormConfigDtoList.add(sortCodeFormConfig);
        FormConfigDto statusFormConfig = new FormConfigDto();
        statusFormConfig.setPersistentFormConfigCode("status");
        statusFormConfig.setPersistentFormConfigName("状态");
        statusFormConfig.setPersistentFormConfigMode("Select");
        statusFormConfig.setPersistentFormConfigDataSource("Dict#STATUS_TYPE");
        statusFormConfig.setPersistentFormConfigColSpan(12);
        statusFormConfig.setPersistentFormConfigDefaultValue("true");
        statusFormConfig.setPersistentFormConfigEdit(true);
        statusFormConfig.setPersistentFormConfigRequired(true);
        baseFormConfigDtoList.add(statusFormConfig);
        baseFormConfigRowDto.setFormConfigDtoList(baseFormConfigDtoList);
        return baseFormConfigRowDto;
    }

    public UrlDto getUrl(String persistentCode) {
        List<String> userInterfaceList = UserContext.getUserInterface();
        if (userInterfaceList.isEmpty()) {
            return null;
        } else {
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", userInterfaceList))) {
                authorityPo.inAuthorityCode(userInterfaceList);
            }
            String underlineCase = StrUtil.toUnderlineCase(StrUtil.lowerFirst(persistentCode));
            PersistentPo persistentPo = persistentRepository.find(new PersistentPo().eqPersistentCode(underlineCase).getQueryWrapper());
            if (ObjectUtil.isNotNull(persistentPo)) {
                List<String> authorityId = authorityRepository.findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
                List<InterfacePo> interfacePoList = interfaceRepository.findList(new InterfacePo().inAuthorityId(authorityId).eqPersistentId(persistentPo.getId()).getQueryWrapper());
                UrlDto urlDto = new UrlDto();
                if (ObjectUtil.isNotNull(interfacePoList)) {
                    Map<String, String> urlMap = interfacePoList.stream().collect(Collectors.toMap(InterfacePo::getInterfaceCode, InterfacePo::getInterfacePath));
                    urlDto.setPage(urlMap.getOrDefault(persistentCode + "_page", "noAuth"));
                    urlDto.setAdd(urlMap.getOrDefault(persistentCode + "_add", "noAuth"));
                    urlDto.setUpdate(urlMap.getOrDefault(persistentCode + "_update", "noAuth"));
                    urlDto.setDelete(urlMap.getOrDefault(persistentCode + "_delete", "noAuth"));
                    urlDto.setSet(urlMap.getOrDefault(persistentCode + "_set", "noAuth"));
                    urlDto.setGet(urlMap.getOrDefault(persistentCode + "_get", "noAuth"));
                    urlDto.setGetList(urlMap.getOrDefault(persistentCode + "_getList", "noAuth"));
                    urlDto.setGetOptions(urlMap.getOrDefault(persistentCode + "_getOptions", "noAuth"));
                    urlDto.setAllUrl(urlMap);
                }
                return urlDto;
            }
        }
        return null;
    }

}
