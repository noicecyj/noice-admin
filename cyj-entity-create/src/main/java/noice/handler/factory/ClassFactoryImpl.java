package noice.handler.factory;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import io.swagger.v3.oas.annotations.Operation;
import lombok.Getter;
import noice.common.utils.BeanUtils;
import noice.entity.po.bean.AppServicePo;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.entity.po.bean.InterfacePo;
import noice.entity.po.bean.MenuPo;
import noice.entity.po.bean.PersistentFormConfigPo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.po.bean.PersistentTableConfigPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.entity.po.bean.RolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.repository.bean.AppServiceRepository;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.CatalogDictionaryRepository;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.MenuRepository;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
import noice.repository.bean.PersistentTableConfigRepository;
import noice.repository.bean.PersistentTableRepository;
import noice.repository.bean.PersistentTableSearchConfigRepository;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static noice.common.contants.Constant.DEFAULT_FORM;

@Getter
public abstract class ClassFactoryImpl implements ClassFactory {

    private static final Logger logger = LoggerFactory.getLogger(ClassFactoryImpl.class);
    private static final String ENV_TIP = "笔记本";
    private static final String OPERATOR = "noice 作者大大 曹元杰 天才";
    private static final String ROOT_ROLE = "root";
    private CatalogDictionaryRepository catalogDictionaryRepository;

    private PersistentRepository persistentRepository;

    private PersistentPropertyRepository persistentPropertyRepository;

    private AppServiceRepository appServiceRepository;

    private AuthorityRepository authorityRepository;

    private RoleRepository roleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    private InterfaceRepository interfaceRepository;

    private MenuRepository menuRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentFormConfigRepository persistentFormConfigRepository;

    private PersistentTableRepository persistentTableRepository;

    private PersistentTableConfigRepository persistentTableConfigRepository;

    private PersistentTableSearchConfigRepository persistentTableSearchConfigRepository;

    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @Autowired
    public void setRequestMappingHandlerMapping(RequestMappingHandlerMapping requestMappingHandlerMapping) {
        this.requestMappingHandlerMapping = requestMappingHandlerMapping;
    }

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
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
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setPersistentTableConfigRepository(PersistentTableConfigRepository persistentTableConfigRepository) {
        this.persistentTableConfigRepository = persistentTableConfigRepository;
    }

    @Autowired
    public void setPersistentTableSearchConfigRepository(PersistentTableSearchConfigRepository persistentTableSearchConfigRepository) {
        this.persistentTableSearchConfigRepository = persistentTableSearchConfigRepository;
    }

    @Autowired
    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Autowired
    public void setInterfaceRepository(InterfaceRepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    @Autowired
    public void setAuthorityRepository(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Autowired
    public void setAppServiceRepository(AppServiceRepository appServiceRepository) {
        this.appServiceRepository = appServiceRepository;
    }

    @Autowired
    public void setCatalogDictionaryRepository(CatalogDictionaryRepository catalogDictionaryRepository) {
        this.catalogDictionaryRepository = catalogDictionaryRepository;
    }

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    public List<PersistentPo> findByType(String type) {
        PersistentPo persistentPo = new PersistentPo();
        persistentPo.setPersistentType(type);
        return persistentRepository.findList(persistentPo.eqPersistentType().orderByPersistentCodeAsc().getQueryWrapper());
    }

    public List<Map<String, PersistentPo>> findNtoNAndRelationById(String id) {
        List<Map<String, PersistentPo>> poList = new ArrayList<>();
        //查询多对多关系
        List<PersistentPo> relation = persistentRepository.findList(new PersistentPo().eqPersistentType("Relation").orderByPersistentCodeAsc().getQueryWrapper());
        //填充多对多字段 用实体id反向去多对多实体查寻包含自己id的关联关系
        if (relation.isEmpty()) {
            return poList;
        }
        List<PersistentPropertyPo> propertyList = persistentPropertyRepository.findList(new PersistentPropertyPo().inPersistentId(relation.stream().map(PersistentPo::getId).toList()).orderByPersistentPropertyCodeAsc().getQueryWrapper());
        return propertyList.stream().filter(persistentPropertyPo -> id.equals(persistentPropertyPo.getRelationPersistentId())).map(persistentPropertyPo -> {
            PersistentPropertyPo NtoNPo = propertyList.stream()
                    .filter(propertyPO -> propertyPO.getPersistentId().equals(persistentPropertyPo.getPersistentId()) && !propertyPO.getRelationPersistentId().equals(id)).findFirst().orElse(null);
            if (NtoNPo != null) {
                Map<String, PersistentPo> poMap = new HashMap<>();
                poMap.put("NtoN", persistentRepository.find(NtoNPo.getRelationPersistentId()));
                poMap.put("relation", persistentRepository.find(NtoNPo.getPersistentId()));
                return poMap;
            } else {
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public List<PersistentPo> findOtoNById(String id) {
        //查询一对多关系
        return persistentRepository.findList(new PersistentPo()
                .eqPersistentType("Bean").eqPersistentId(id).orderByPersistentCodeAsc().getQueryWrapper());
    }

    public List<PersistentPropertyPo> findByPersistentId(String id) {
        PersistentPropertyPo persistentPropertyPo = new PersistentPropertyPo();
        persistentPropertyPo.setPersistentId(id);
        return persistentPropertyRepository.findList(persistentPropertyPo.eqPersistentId().orderByPersistentPropertyCodeAsc().getQueryWrapper());
    }

    public String getRoot() {
        CatalogDictionaryPo catalogDictionaryPo = new CatalogDictionaryPo();
        catalogDictionaryPo.setCatalogDictionaryName("BACK_END");
        return catalogDictionaryRepository.find(catalogDictionaryPo.eqCatalogDictionaryName().getQueryWrapper()).getCatalogDictionaryCode();
    }

    public AppServicePo getAppService(String id) {
        return appServiceRepository.find(id);
    }

    public void createAndSaveHistory(String path, String historyPath, String className, String fileString) throws IOException {
        String javaFileToString = BeanUtils.JavaFileToString(path, className);
        if (StrUtil.removeAllLineBreaks(javaFileToString).equals(StrUtil.removeAllLineBreaks(fileString))) {
            logger.info("{}:java文本相同,不生成代码", className);
        } else {
            BeanUtils.createMdFile(historyPath, className, BeanUtils.mdStrBuilder(OPERATOR, ENV_TIP, javaFileToString, "java"));
            BeanUtils.createJavaFile(path, className, fileString);
        }
    }

    public void createAndSaveHistorySql(String path, String historyPath, String className, String fileString) throws IOException {
        String sqlFileToString = BeanUtils.SqlFileToString(path, className);
        if (sqlFileToString.equals(fileString)) {
            logger.info("{}sql文本相同不生成代码", className);
        } else {
            BeanUtils.createMdFile(historyPath, className, BeanUtils.mdStrBuilder(OPERATOR, ENV_TIP, sqlFileToString, "sql"));
            BeanUtils.createSqlFile(path, className, fileString);
        }

    }

    public void createAndSaveHistory(String path, String historyPath, String className, String fileString, String type) throws IOException {
        switch (type) {
            case "java":
                createAndSaveHistory(path, historyPath, className, fileString);
                break;
            case "sql":
                createAndSaveHistorySql(path, historyPath, className, fileString);
                break;
            default:
                logger.info("类型出错");
        }
    }

    public String authorityCreate(String tagCode, String tagName, String type) {
        AuthorityPo authorityPo = new AuthorityPo();
        authorityPo = authorityRepository.find(authorityPo.eqAuthorityCode(tagCode).eqAuthorityName(tagName).eqAuthorityType(type).getQueryWrapper());
        if (ObjectUtil.isNull(authorityPo)) {
            authorityPo = new AuthorityPo().eqAuthorityCode(tagCode).eqAuthorityName(tagName);
            authorityPo.setAuthorityType(type);
            authorityPo.setCreatedBy("123123");
            authorityPo.setUpdatedBy("123123");
            authorityPo.setSortCode(1L);
            authorityPo.setStatus(true);
            String authorityAdd = authorityRepository.add(authorityPo);
            if (StrUtil.isNotEmpty(authorityAdd)) {
                logger.info("{}:权限添加成功", tagName);
            } else {
                logger.info("{}:权限添加失败", tagName);
            }
        } else {
            logger.info("{}:权限已存在", tagName);
        }
        this.createRootRoleAuthority(authorityPo.getId());
        return authorityPo.getId();
    }

    public void createRootRoleAuthority(String authorityId) {
        RolePo rolePo = roleRepository.find(new RolePo().eqRoleCode(ROOT_ROLE).getQueryWrapper());
        RoleAuthorityPo roleAuthorityPo = new RoleAuthorityPo();
        roleAuthorityPo = roleAuthorityRepository.find(roleAuthorityPo.eqRoleId(rolePo.getId()).eqAuthorityId(authorityId).getQueryWrapper());
        if (ObjectUtil.isNull(roleAuthorityPo)) {
            roleAuthorityPo = new RoleAuthorityPo().eqRoleId(rolePo.getId()).eqAuthorityId(authorityId);
            roleAuthorityPo.setCreatedBy("123123");
            roleAuthorityPo.setUpdatedBy("123123");
            int authorityAdd = roleAuthorityRepository.add(roleAuthorityPo);
            if (authorityAdd == 1) {
                logger.info("{}:权限绑定成功", rolePo.getRoleName());
            } else {
                logger.info("{}:权限绑定失败", rolePo.getRoleName());
            }
        } else {
            logger.info("{}:权限已绑定", rolePo.getRoleName());
        }
    }

    public String formCreate(PersistentPo persistentPo, String type, int row) {
        String tagCode = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        String tagName = persistentPo.getPersistentName();
        PersistentFormPo persistentFormPo = new PersistentFormPo();
        persistentFormPo = persistentFormRepository.find(persistentFormPo.eqPersistentFormCode(tagCode).eqPersistentFormName(tagName).getQueryWrapper());
        if (ObjectUtil.isNull(persistentFormPo)) {
            persistentFormPo = new PersistentFormPo().eqPersistentFormCode(tagCode).eqPersistentFormName(tagName);
            persistentFormPo.setPersistentId(persistentPo.getId());
            persistentFormPo.setPersistentFormType(type);
            persistentFormPo.setPersistentFormRow(row);
            persistentFormPo.setCreatedBy("123123");
            persistentFormPo.setUpdatedBy("123123");
            persistentFormPo.setSortCode(1L);
            persistentFormPo.setStatus(true);
            String persistentFormAdd = persistentFormRepository.add(persistentFormPo);
            if (StrUtil.isNotEmpty(persistentFormAdd)) {
                logger.info("{}:表单添加成功", tagName);
            } else {
                logger.info("{}:表单添加失败", tagName);
            }
        } else {
            logger.info("{}:表单已存在", tagName);
        }
        return persistentFormPo.getId();
    }

    public void formConfigCreate(PersistentPropertyPo persistentPropertyPo, String formId) {
        String tagCode = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
        String tagName = persistentPropertyPo.getPersistentPropertyName();
        PersistentFormConfigPo persistentFormConfigPo = new PersistentFormConfigPo();
        String authorityId = authorityCreate(tagCode, tagName, "form");
        persistentFormConfigPo = persistentFormConfigRepository.find(persistentFormConfigPo.eqPersistentFormConfigCode(tagCode).eqPersistentFormConfigName(tagName).eqPersistentFormId(formId).getQueryWrapper());
        if (ObjectUtil.isNull(persistentFormConfigPo)) {
            persistentFormConfigPo = new PersistentFormConfigPo().eqPersistentFormConfigCode(tagCode).eqPersistentFormConfigName(tagName);
            persistentFormConfigPo.setAuthorityId(authorityId);
            persistentFormConfigPo.setPersistentFormId(formId);
            persistentFormConfigPo.setPersistentFormConfigColSpan(12);
            switch (persistentPropertyPo.getPersistentPropertyType()) {
                case "boolean":
                    persistentFormConfigPo.setPersistentFormConfigMode("Select");
                    persistentFormConfigPo.setPersistentFormConfigDataSource("Dict#YES_AND_NO");
                    break;
                case "String":
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        persistentFormConfigPo.setPersistentFormConfigMode("Select");
                        PersistentPo relationPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                        persistentFormConfigPo.setPersistentFormConfigDataSource("Entity#" + StrUtil.upperFirst(StrUtil.toCamelCase(relationPo.getPersistentCode())));
                    }
                    break;
                default:
                    persistentFormConfigPo.setPersistentFormConfigMode("Input");
            }
            persistentFormConfigPo.setPersistentFormConfigRequired(persistentPropertyPo.isPersistentPropertyNull());
            persistentFormConfigPo.setPersistentFormConfigDefaultValue(persistentPropertyPo.getPersistentPropertyDefaultValue());
            persistentFormConfigPo.setCreatedBy("123123");
            persistentFormConfigPo.setUpdatedBy("123123");
            persistentFormConfigPo.setSortCode(1L);
            persistentFormConfigPo.setStatus(true);
            String add = persistentFormConfigRepository.add(persistentFormConfigPo);
            if (StrUtil.isNotEmpty(add)) {
                logger.info("{}:表单字段添加成功", tagName);
            } else {
                logger.info("{}:表单字段添加失败", tagName);
            }
        } else {
            logger.info(tagName + ":表单字段已存在");
            persistentFormConfigPo.setAuthorityId(authorityId);
            persistentFormConfigPo.setPersistentFormId(formId);
            persistentFormConfigPo.setPersistentFormConfigColSpan(12);
            switch (persistentPropertyPo.getPersistentPropertyType()) {
                case "boolean":
                    persistentFormConfigPo.setPersistentFormConfigMode("Select");
                    persistentFormConfigPo.setPersistentFormConfigDataSource("Dict#YES_AND_NO");
                    break;
                case "String":
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        persistentFormConfigPo.setPersistentFormConfigMode("Select");
                        PersistentPo relationPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                        persistentFormConfigPo.setPersistentFormConfigDataSource("Entity#" + StrUtil.upperFirst(StrUtil.toCamelCase(relationPo.getPersistentCode())));
                    }
                    break;
                default:
                    persistentFormConfigPo.setPersistentFormConfigMode("Input");
            }
            persistentFormConfigPo.setPersistentFormConfigRequired(persistentPropertyPo.isPersistentPropertyNull());
            persistentFormConfigPo.setPersistentFormConfigDefaultValue(persistentPropertyPo.getPersistentPropertyDefaultValue());
            persistentFormConfigPo.setUpdatedBy("123123");
            persistentFormConfigPo.setSortCode(1L);
            persistentFormConfigPo.setStatus(true);
            int update = persistentFormConfigRepository.update(persistentFormConfigPo);
            if (update == 1) {
                logger.info("{}:表单字段更新成功", tagName);
            } else {
                logger.info("{}:表单字段更新失败", tagName);
            }
        }
    }

    public String tableCreate(PersistentPo persistentPo) {
        String tagCode = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        String tagName = persistentPo.getPersistentName();
        PersistentTablePo persistentTablePo = new PersistentTablePo();
        persistentTablePo = persistentTableRepository.find(persistentTablePo.eqPersistentTableCode(tagCode).eqPersistentTableName(tagName).getQueryWrapper());
        if (ObjectUtil.isNull(persistentTablePo)) {
            persistentTablePo = new PersistentTablePo().eqPersistentTableCode(tagCode).eqPersistentTableName(tagName);
            persistentTablePo.setPersistentId(persistentPo.getId());
            persistentTablePo.setCreatedBy("123123");
            persistentTablePo.setUpdatedBy("123123");
            persistentTablePo.setSortCode(1L);
            persistentTablePo.setStatus(true);
            String PersistentTableAdd = persistentTableRepository.add(persistentTablePo);
            if (StrUtil.isNotEmpty(PersistentTableAdd)) {
                logger.info("{}:表格添加成功", tagName);
            } else {
                logger.info("{}:表格添加失败", tagName);
            }
        } else {
            logger.info("{}:表格已存在", tagName);
        }
        return persistentTablePo.getId();
    }

    public void tableConfigCreate(PersistentPropertyPo persistentPropertyPo, String tableId) {
        String tagCode = StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode());
        String tagName = persistentPropertyPo.getPersistentPropertyName();
        PersistentTableConfigPo persistentTableConfigPo = new PersistentTableConfigPo();
        String authorityId = authorityCreate(tagCode, tagName, "table");
        persistentTableConfigPo = persistentTableConfigRepository.find(persistentTableConfigPo.eqPersistentTableConfigCode(tagCode).eqPersistentTableConfigName(tagName).eqPersistentTableId(tableId).getQueryWrapper());
        if (ObjectUtil.isNull(persistentTableConfigPo)) {
            persistentTableConfigPo = new PersistentTableConfigPo().eqPersistentTableConfigCode(tagCode).eqPersistentTableConfigName(tagName);
            persistentTableConfigPo.setAuthorityId(authorityId);
            persistentTableConfigPo.setPersistentTableId(tableId);
            switch (persistentPropertyPo.getPersistentPropertyType()) {
                case "boolean":
                    persistentTableConfigPo.setPersistentTableConfigType("select");
                    persistentTableConfigPo.setPersistentTableConfigDataSource("Dict#YES_AND_NO");
                    break;
                case "String":
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        persistentTableConfigPo.setPersistentTableConfigType("select");
                        PersistentPo relationPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                        persistentTableConfigPo.setPersistentTableConfigDataSource("Entity#" + StrUtil.upperFirst(StrUtil.toCamelCase(relationPo.getPersistentCode())));
                    }
                    break;
                default:
                    persistentTableConfigPo.setPersistentTableConfigType("text");
            }
            persistentTableConfigPo.setPersistentTableConfigDisplay(false);
            persistentTableConfigPo.setCreatedBy("123123");
            persistentTableConfigPo.setUpdatedBy("123123");
            persistentTableConfigPo.setSortCode(1L);
            persistentTableConfigPo.setStatus(true);
            String add = persistentTableConfigRepository.add(persistentTableConfigPo);
            if (StrUtil.isNotEmpty(add)) {
                logger.info("{}:表格字段添加成功", tagName);
            } else {
                logger.info("{}:表格字段添加失败", tagName);
            }
        } else {
            logger.info("{}:表格字段已存在", tagName);
            persistentTableConfigPo.setAuthorityId(authorityId);
            persistentTableConfigPo.setPersistentTableId(tableId);
            switch (persistentPropertyPo.getPersistentPropertyType()) {
                case "boolean":
                    persistentTableConfigPo.setPersistentTableConfigType("select");
                    persistentTableConfigPo.setPersistentTableConfigDataSource("Dict#YES_AND_NO");
                    break;
                case "String":
                    if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                        persistentTableConfigPo.setPersistentTableConfigType("select");
                        PersistentPo relationPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                        persistentTableConfigPo.setPersistentTableConfigDataSource("Entity#" + StrUtil.upperFirst(StrUtil.toCamelCase(relationPo.getPersistentCode())));
                    }
                    break;
                default:
                    persistentTableConfigPo.setPersistentTableConfigType("text");
            }
            persistentTableConfigPo.setPersistentTableConfigDisplay(false);
            persistentTableConfigPo.setUpdatedBy("123123");
            persistentTableConfigPo.setSortCode(1L);
            persistentTableConfigPo.setStatus(true);
            int update = persistentTableConfigRepository.update(persistentTableConfigPo);
            if (update == 1) {
                logger.info("{}:表格字段更新成功", tagName);
            } else {
                logger.info("{}:表格字段更新失败", tagName);
            }
        }
    }

    public void createFormAndTable(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String formId = formCreate(persistentPo, DEFAULT_FORM, 2);
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            formConfigCreate(persistentPropertyPo, formId);
        }
        String tableId = tableCreate(persistentPo);
        for (PersistentPropertyPo persistentPropertyPo : persistentPropertyPoList) {
            tableConfigCreate(persistentPropertyPo, tableId);
//            tableSearchConfigCreate(persistentPropertyPo, tableId);
        }
    }

    public void createBeanInterface() {
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> entry : handlerMethods.entrySet()) {
            RequestMappingInfo requestMappingInfo = entry.getKey();
            HandlerMethod handlerMethod = entry.getValue();
            Operation operation = handlerMethod.getMethodAnnotation(Operation.class);
            if (requestMappingInfo.getPathPatternsCondition() != null) {
                for (PathPattern pathPattern : requestMappingInfo.getPathPatternsCondition().getPatterns()) {
                    List<String> split = StrUtil.split(pathPattern.getPatternString(), "/");
                    List<String> appServiceAndPersistent = split.subList(2, split.size());
                    String persistentId = "1";
                    if (appServiceAndPersistent.size() >= 2) {
                        String persistentCode = StrUtil.toUnderlineCase(StrUtil.lowerFirst(appServiceAndPersistent.get(0)));
                        PersistentPo persistentPo = persistentRepository.find(new PersistentPo().eqPersistentCode(persistentCode).getQueryWrapper());
                        if (ObjectUtil.isNotNull(persistentPo)) {
                            persistentId = persistentPo.getId();
                        }
                    }
                    String code = String.join("_", appServiceAndPersistent);
                    if (ObjectUtil.isNotNull(operation)) {
                        this.createInterfaceType(code, operation.summary(), pathPattern.getPatternString(),
                                requestMappingInfo.getMethodsCondition().getMethods().toString(), persistentId);
                    }
                }
            }
        }
    }

    public void createInterfaceType(String code, String name, String path, String type, String persistentId) {
        String authorityId = authorityCreate(code, name, "interface");
        InterfacePo interfacePo = new InterfacePo();
        interfacePo = interfaceRepository.find(interfacePo.eqInterfaceCode(code).eqInterfaceName(name).getQueryWrapper());
        if (ObjectUtil.isNull(interfacePo)) {
            interfacePo = new InterfacePo().eqInterfaceCode(code).eqInterfaceName(name);
            interfacePo.setInterfacePath(path);
            interfacePo.setInterfaceType(type);
            interfacePo.setAuthorityId(authorityId);
            interfacePo.setPersistentId(persistentId);
            interfacePo.setCreatedBy("123123");
            interfacePo.setUpdatedBy("123123");
            interfacePo.setSortCode(1L);
            interfacePo.setStatus(true);
            String add = interfaceRepository.add(interfacePo);
            if (StrUtil.isNotEmpty(add)) {
                logger.info("{}:接口添加成功", name);
            } else {
                logger.info("{}:接口添加失败", name);
            }
        } else {
            logger.info("{}:接口已存在", name);
            interfacePo.setInterfacePath(path);
            interfacePo.setInterfaceType(type);
            interfacePo.setAuthorityId(authorityId);
            interfacePo.setPersistentId(persistentId);
            interfacePo.setUpdatedBy("123123");
            interfacePo.setSortCode(1L);
            interfacePo.setStatus(true);
            int update = interfaceRepository.update(interfacePo);
            if (update == 1) {
                logger.info("{}:接口更新成功", name);
            } else {
                logger.info("{}:接口更新失败", name);
            }
        }
    }

    public void createMenu() {
        String indexMenuId = this.createMenuType(null, null, "index", "首页", "0");
        List<AppServicePo> appServicePoList = getAppServiceRepository().findList(new AppServicePo().getQueryWrapper());
        for (AppServicePo appServicePo : appServicePoList) {
            String appServiceMenuId = this.createMenuType(null, appServicePo, appServicePo.getAppServiceCode(), appServicePo.getAppServiceName(), indexMenuId);
            List<PersistentPo> persistentPoList = getPersistentRepository().findList(new PersistentPo().eqAppServiceId(appServicePo.getId()).getQueryWrapper());
            for (PersistentPo persistentPo : persistentPoList) {
                this.createMenuType(persistentPo, appServicePo, persistentPo.getPersistentCode(), persistentPo.getPersistentName(), appServiceMenuId);
            }
        }
    }

    public String createMenuType(PersistentPo persistentPo, AppServicePo appService, String tagCode, String tagName, String pid) {
        String authorityId = authorityCreate(tagCode, tagName, "menu");
        MenuPo menuPo = new MenuPo();
        menuPo = getMenuRepository().find(menuPo.eqMenuCode(tagCode).eqMenuName(tagName).getQueryWrapper());
        if (ObjectUtil.isNull(menuPo)) {
            menuPo = new MenuPo().eqMenuCode(tagCode).eqMenuName(tagName).eqMenuId(pid);
            menuPo.setAuthorityId(authorityId);
            menuPo.setMenuUrl("/");
            if (ObjectUtil.isNotNull(persistentPo) && ObjectUtil.isNotNull(appService)) {
                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                menuPo.setMenuUrl("/" + poName);
            }
            menuPo.setCreatedBy("123123");
            menuPo.setUpdatedBy("123123");
            menuPo.setSortCode(1L);
            menuPo.setStatus(true);
            String menuAdd = getMenuRepository().add(menuPo);
            if (StrUtil.isNotEmpty(menuAdd)) {
                logger.info("{}:菜单添加成功", tagName);
            } else {
                logger.info("{}:菜单添加失败", tagName);
                return null;
            }
        } else {
            logger.info("{}:菜单已存在", tagName);
        }
        return menuPo.getId();
    }

}
