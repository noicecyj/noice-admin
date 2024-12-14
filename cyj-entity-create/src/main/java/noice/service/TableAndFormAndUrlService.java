package noice.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import noice.assembler.TableAndFormAndUrlServiceAssembler;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.common.contants.UserContext;
import noice.common.entity.dto.OptionDTO;
import noice.entity.dto.FormConfigDto;
import noice.entity.dto.FormConfigRowDto;
import noice.entity.dto.FormDto;
import noice.entity.dto.TableConfigDto;
import noice.entity.dto.TableDto;
import noice.entity.dto.UrlDto;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.entity.po.bean.CatalogPo;
import noice.entity.po.bean.InterfacePo;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanRepository;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.CatalogDictionaryRepository;
import noice.repository.bean.CatalogRepository;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentRepository;
import noice.repository.bean.PersistentTableConfigRepository;
import noice.repository.bean.PersistentTableRepository;
import org.mapstruct.Named;
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

    private CatalogRepository catalogRepository;

    private CatalogDictionaryRepository catalogDictionaryRepository;

    private CatalogDictionaryServiceAssembler catalogDictionaryServiceAssembler;

    @Autowired
    public void setCatalogDictionaryServiceAssembler(CatalogDictionaryServiceAssembler catalogDictionaryServiceAssembler) {
        this.catalogDictionaryServiceAssembler = catalogDictionaryServiceAssembler;
    }

    @Autowired
    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Autowired
    public void setCatalogDictionaryRepository(CatalogDictionaryRepository catalogDictionaryRepository) {
        this.catalogDictionaryRepository = catalogDictionaryRepository;
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
            List<PersistentTableConfigPo> persistentTableConfigPoList = persistentTableConfigRepository.findList(new PersistentTableConfigPo().eqPersistentTableId(persistentTablePo.getId()).inAuthorityId(authorityId).getQueryWrapper());
            List<TableConfigDto> tableConfigDtoList = tableAndFormAndUrlServiceAssembler.poTableListToDtoTableList(persistentTableConfigPoList);
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
        statusFormConfig.setPersistentFormConfigDataSource("status");
        statusFormConfig.setPersistentFormConfigColSpan(12);
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
            StrUtil.toUnderlineCase(StrUtil.lowerFirst(persistentCode));
            PersistentPo persistentPo = persistentRepository.find(new PersistentPo().eqPersistentCode(persistentCode).getQueryWrapper());
            if (ObjectUtil.isNotNull(persistentPo)) {
                List<String> authorityId = authorityRepository.findList(authorityPo.getQueryWrapper()).stream().map(AuthorityPo::getId).toList();
                List<InterfacePo> interfacePoList = interfaceRepository.findList(new InterfacePo().inAuthorityId(authorityId).eqPersistentId(persistentPo.getId()).getQueryWrapper());
                UrlDto urlDto = new UrlDto();
                if (ObjectUtil.isNotNull(interfacePoList)) {
                    Map<String, String> urlMap = interfacePoList.stream().collect(Collectors.toMap(InterfacePo::getInterfaceCode, InterfacePo::getInterfacePath));
                    urlDto.setPage(urlMap.get(persistentCode + "_page"));
                    urlDto.setAdd(urlMap.get(persistentCode + "_add"));
                    urlDto.setUpdate(urlMap.get(persistentCode + "_update"));
                    urlDto.setDelete(urlMap.get(persistentCode + "_delete"));
                    urlDto.setSet(urlMap.get(persistentCode + "_set"));
                    urlDto.setGet(urlMap.get(persistentCode + "_get"));
                    urlDto.setGetList(urlMap.get(persistentCode + "_getList"));
                    urlDto.setGetOptions(urlMap.get(persistentCode + "_getOptions"));
                    urlDto.setAllUrl(urlMap);
                }
                return urlDto;
            }
        }
        return null;
    }


    public List<CatalogDictionaryDto> getDict(String dataSourceCode) {
        CatalogPo catalogPo = catalogRepository.find(new CatalogPo().eqCatalogCode(dataSourceCode).getQueryWrapper());
        if (ObjectUtil.isNotNull(catalogPo)) {
            return catalogDictionaryServiceAssembler.poListToDtoList(catalogDictionaryRepository.findList(new CatalogDictionaryPo().eqCatalogId(catalogPo.getId()).getQueryWrapper()));
        }
        return null;
    }

    @Named("dataSourceToOptionList")
    public List<OptionDTO> dataSourceToOptionList(String dataSourceCode) throws ClassNotFoundException {
        List<String> split = StrUtil.split(dataSourceCode, "#");
        String type = split.get(0);
        String name = split.get(1);
        if ("Entity".equals(type)) {
            Map<String, BeanRepository> beansOfType = SpringUtil.getBeansOfType(BeanRepository.class);
            BeanRepository beanRepository = beansOfType.get(StrUtil.lowerFirst(name) + "Repository");
            if (ObjectUtil.isNotNull(beanRepository)) {
//                beanRepository.findList();
            }
        } else if ("Dict".equals(type)) {
            List<CatalogDictionaryDto> dict = this.getDict(dataSourceCode);
            return tableAndFormAndUrlServiceAssembler.dtoCatalogDictionaryListToDtoOptionList(dict);
        }
        return null;
    }
}
