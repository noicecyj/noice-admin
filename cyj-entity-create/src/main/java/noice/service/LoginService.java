package noice.service;

import com.alibaba.fastjson2.JSONObject;
import noice.assembler.TableAndFormAndUrlServiceAssembler;
import noice.assembler.TreeMenuServiceAssembler;
import noice.common.contants.UserContext;
import noice.entity.dto.LoginDto;
import noice.entity.dto.TreeMenuDto;
import noice.entity.dto.bean.RoleDto;
import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.MenuPo;
import noice.entity.po.bean.UserPo;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.MenuRepository;
import noice.repository.bean.PersistentFormConfigRepository;
import noice.repository.bean.PersistentTableConfigRepository;
import noice.repository.bean.PersistentTableSearchConfigRepository;
import noice.repository.bean.UserRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import noice.service.bean.RoleService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LoginService {

    private final static String TOP_MENU_ID = "0";

    // 用户Repository
    private UserRepository userRepository;

    // 用户角色Repository
    private UserRoleRepository userRoleRepository;

    // 角色权限Repository
    private RoleAuthorityRepository roleAuthorityRepository;

    // 菜单Repository
    private MenuRepository menuRepository;

    // 树形菜单ServiceAssembler
    private TreeMenuServiceAssembler treeMenuServiceAssembler;

    // 持久化表单配置Repository
    private PersistentFormConfigRepository persistentFormConfigRepository;

    // 权限表单和表和URLServiceAssembler
    private TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler;

    // 持久化表配置Repository
    private PersistentTableConfigRepository persistentTableConfigRepository;

    // 持久化表搜索配置Repository
    private PersistentTableSearchConfigRepository persistentTableSearchConfigRepository;

    // 权限Repository
    private AuthorityRepository authorityRepository;

    // 接口Repository
    private InterfaceRepository interfaceRepository;

    // Redis模板
    private StringRedisTemplate redisTemplate;

    private RoleService roleService;

    // 生成token方法
    private static String generateToken(String userInfoJson) {
        return Base64.getEncoder().encodeToString(userInfoJson.getBytes());
    }

    // 递归获取树形菜单方法
    public static List<TreeMenuDto> getTree(List<TreeMenuDto> list, String menuId) {
        return list.stream().filter(node -> menuId.equals(node.getMenuId())).peek(node -> node.setChildren(getTree(list, node.getId()))).collect(Collectors.toList());
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Autowired
    public void setAuthFormAndTableAndUrlServiceAssembler(TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler) {
        this.tableAndFormAndUrlServiceAssembler = tableAndFormAndUrlServiceAssembler;
    }

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
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
    public void setPersistentFormConfigRepository(PersistentFormConfigRepository persistentFormConfigRepository) {
        this.persistentFormConfigRepository = persistentFormConfigRepository;
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
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Autowired
    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Autowired
    public void setTreeMenuServiceAssembler(TreeMenuServiceAssembler treeMenuServiceAssembler) {
        this.treeMenuServiceAssembler = treeMenuServiceAssembler;
    }

    // 登录方法
    public String login(@NotNull LoginDto dto) {
        // 根据用户名和密码查询用户
        UserPo userPo = userRepository.find(new UserPo().eqUserCode(dto.getUserName()).eqUserPassword(dto.getPassword()).getQueryWrapper());
        if (userPo != null) {
            List<RoleDto> roleLists = roleService.findListByUserIds(Collections.singletonList(userPo.getId()));
            return this.setRoleAuthorityToRedis(userPo, roleLists);
        }
        return null;
    }

    public UserDto getUserInfo() {
        return JSONObject.parseObject(JSONObject.toJSONString(UserContext.getUser()), UserDto.class);
    }

    public List<TreeMenuDto> getUserMenu() {
        List<String> menuCodeList = UserContext.getUserMenu();
        List<TreeMenuDto> treeMenu;
        if (menuCodeList.isEmpty()) {
            return null;
        } else {
            AuthorityPo authorityPo = new AuthorityPo();
            if (!"allAuthority".equals(String.join("", menuCodeList))) {
                authorityPo.inAuthorityCode(menuCodeList);
            }
            // 获取菜单
            treeMenu = this.getTreeMenu(authorityRepository.findList(authorityPo.getQueryWrapper()));
        }
        return treeMenu.get(0).getChildren();
    }

    // 获取树形菜单方法
    public List<TreeMenuDto> getTreeMenu(List<AuthorityPo> authorityPoList) {
        // 根据权限查询菜单
        List<MenuPo> menuPoList = menuRepository.findList(new MenuPo().inAuthorityId(authorityPoList.stream().map(AuthorityPo::getId).toList()).getQueryWrapper());
        // 将菜单转换为树形菜单
        List<TreeMenuDto> treeMenuDtoList = treeMenuServiceAssembler.poListToTreeDtoList(menuPoList);
        return getTree(treeMenuDtoList, TOP_MENU_ID);

    }

//    // 获取表单方法
//    public List<FormDto> getForm(List<AuthorityPo> authorityPoList) {
//        // 根据权限查询表单配置
//        List<PersistentFormConfigPo> persistentFormConfigRepositoryList = persistentFormConfigRepository.findList(new PersistentFormConfigPo().inAuthorityId(authorityPoList.stream().map(AuthorityPo::getId).toList()).getQueryWrapper());
//        // 将表单配置转换为表单
//        List<AuthorityPersistentFormConfigDto> authorityPersistentFormConfigDtoList = authFormAndTableAndUrlServiceAssembler.poFormListToDtoFormList(persistentFormConfigRepositoryList);
//        // 将表单分组
//        Map<PersistentFormPo, List<AuthorityPersistentFormConfigDto>> persistentFormPoListMap = authorityPersistentFormConfigDtoList.stream().collect(Collectors.groupingBy(AuthorityPersistentFormConfigDto::getPersistentFormPo));
//        // 将表单转换为表单DTO
//        return persistentFormPoListMap.keySet().stream().map(persistentFormPo -> {
//            FormDto authorityPersistentFormDto = authFormAndTableAndUrlServiceAssembler.poToDto(persistentFormPo);
//            authorityPersistentFormDto.setFormConfigDtoList(authFormAndTableAndUrlServiceAssembler.poChildFormListToChildDtoChildFormList(persistentFormPoListMap.get(persistentFormPo)));
//            return authorityPersistentFormDto;
//        }).toList();
//    }
//
//    // 获取表格方法
//    public List<TableDto> getTable(List<AuthorityPo> authorityPoList) {
//        // 根据权限查询表配置
//        Map<PersistentTablePo, List<AuthorityPersistentTableConfigDto>> persistentTablePoListMap = authFormAndTableAndUrlServiceAssembler.poTableListToDtoTableList(persistentTableConfigRepository.findList(new PersistentTableConfigPo().inAuthorityId(authorityPoList.stream().map(AuthorityPo::getId).toList()).getQueryWrapper())).stream().collect(Collectors.groupingBy(AuthorityPersistentTableConfigDto::getPersistentTablePo));
//        // 根据权限查询表搜索配置
//        Map<PersistentTablePo, List<AuthorityPersistentTableSearchConfigDto>> persistentTableSearchPoListMap = authFormAndTableAndUrlServiceAssembler.poTableSearchListToDtoTableSearchList(persistentTableSearchConfigRepository.findList(new PersistentTableSearchConfigPo().inAuthorityId(authorityPoList.stream().map(AuthorityPo::getId).toList()).getQueryWrapper())).stream().collect(Collectors.groupingBy(AuthorityPersistentTableSearchConfigDto::getPersistentTablePo));
//        // 将表配置转换为表DTO
//        List<TableDto> list = persistentTablePoListMap.keySet().stream().map(persistentTablePo -> {
//            TableDto authorityPersistentTableDto = authFormAndTableAndUrlServiceAssembler.poToDto(persistentTablePo);
//            authorityPersistentTableDto.setTableConfigDtoList(authFormAndTableAndUrlServiceAssembler.poChildTableListToDtoChildTableList(persistentTablePoListMap.get(persistentTablePo)));
//            return authorityPersistentTableDto;
//        }).toList();
//        // 将表搜索配置转换为表搜索DTO
//        List<TableDto> searchlist = persistentTableSearchPoListMap.keySet().stream().map(persistentTablePo -> {
//            TableDto authorityPersistentTableDto = authFormAndTableAndUrlServiceAssembler.poToDto(persistentTablePo);
//            List<AuthorityPersistentTableSearchConfigDto> authorityPersistentTableSearchConfigDtoList = persistentTableSearchPoListMap.get(persistentTablePo);
//            authorityPersistentTableSearchConfigDtoList.forEach(authorityPersistentTableSearchConfigDto -> {
//                String dataSource = authorityPersistentTableSearchConfigDto.getPersistentTableSearchConfigDataSource();
//                if (StrUtil.contains(dataSource, "NAME_AND_ID")) {
//                    String tableName = dataSource.split("@")[0];
//                    List<Map<String, Object>> mapList = SqlRunner.db().selectList("select " + tableName + "_name as label, id as value from t_" + tableName + " where status = 1");
//                    authorityPersistentTableSearchConfigDto.setPersistentTableSearchConfigDataSource(JSON.toJSONString(mapList));
//                }
//                if (StrUtil.contains(dataSource, "YES_AND_NO")) {
//                    List<SelectDataDto> dataSourceList = new ArrayList<>();
//                    SelectDataDto optionYes = new SelectDataDto();
//                    optionYes.setLabel("是");
//                    optionYes.setValue("true");
//                    SelectDataDto optionNo = new SelectDataDto();
//                    optionNo.setLabel("否");
//                    optionNo.setValue("false");
//                    dataSourceList.add(optionYes);
//                    dataSourceList.add(optionNo);
//                    authorityPersistentTableSearchConfigDto.setPersistentTableSearchConfigDataSource(JSON.toJSONString(dataSourceList));
//                }
//            });
//            AuthorityPersistentTableSearchConfigDto status = new AuthorityPersistentTableSearchConfigDto();
//            status.setPersistentTableSearchConfigCode("status");
//            status.setPersistentTableSearchConfigName("状态");
//            status.setPersistentTableSearchConfigDisplay(true);
//            status.setPersistentTableSearchConfigMode("Select");
//            status.setPersistentTablePo(persistentTablePo);
//            List<SelectDataDto> dataSource = new ArrayList<>();
//            SelectDataDto optionTrue = new SelectDataDto();
//            optionTrue.setLabel("有效");
//            optionTrue.setValue("true");
//            SelectDataDto optionFalse = new SelectDataDto();
//            optionFalse.setLabel("无效");
//            optionFalse.setValue("false");
//            dataSource.add(optionTrue);
//            dataSource.add(optionFalse);
//            status.setPersistentTableSearchConfigDataSource(JSON.toJSONString(dataSource));
//            status.setPersistentTableSearchConfigDefaultValue(JSON.toJSONString(optionTrue));
//            authorityPersistentTableSearchConfigDtoList.add(status);
//            authorityPersistentTableDto.setChildPersistentTableSearchConfigDtoList(authFormAndTableAndUrlServiceAssembler.poChildTableSearchListToSearchDtoChildTableSearchList(authorityPersistentTableSearchConfigDtoList));
//            return authorityPersistentTableDto;
//        }).toList();
//        // 合并表和表搜索DTO
//        List<TableDto> authorityList = new ArrayList<>();
//        authorityList.addAll(list);
//        authorityList.addAll(searchlist);
//        // 将表和表搜索DTO分组
//        Map<String, List<TableDto>> collect = authorityList.stream().collect(Collectors.groupingBy(TableDto::getPersistentTableCode));
//        // 将表和表搜索DTO转换为表DTO
//        return collect.keySet().stream().map(persistentTableCode -> {
//            List<TableDto> authorityPersistentTableDtoList = collect.get(persistentTableCode);
//            if (authorityPersistentTableDtoList.size() == 2) {
//                if (CollUtil.isEmpty(authorityPersistentTableDtoList.get(0).getTableConfigDtoList())) {
//                    authorityPersistentTableDtoList.get(0).setTableConfigDtoList(authorityPersistentTableDtoList.get(1).getTableConfigDtoList());
//                }
//                if (CollUtil.isEmpty(authorityPersistentTableDtoList.get(0).getChildPersistentTableSearchConfigDtoList())) {
//                    authorityPersistentTableDtoList.get(0).setChildPersistentTableSearchConfigDtoList(authorityPersistentTableDtoList.get(1).getChildPersistentTableSearchConfigDtoList());
//                }
//            }
//            return authorityPersistentTableDtoList.get(0);
//        }).toList();
//
//    }
//
//    // 获取接口方法
//    private Map<PersistentPo, List<AuthorityInterfaceDto>> getInterfaceList(List<AuthorityPo> authorityPoList) {
//        // 根据权限查询接口
//        return authFormAndTableAndUrlServiceAssembler.poInterfaceListToDtoInterfaceList(interfaceRepository.findList(new InterfacePo().inAuthorityId(authorityPoList.stream().map(AuthorityPo::getId).toList()).getQueryWrapper())).stream().collect(Collectors.groupingBy(AuthorityInterfaceDto::getPersistentPo));
//    }

//
//    // 权限处理方法
//    public AuthDto authHandler(UserPo userPo) {
//        AuthDto authDto = new AuthDto();
//        // 根据用户ID查询用户角色
//        List<UserRolePo> userRolePoList = userRoleRepository.findList(new UserRolePo().eqUserId(userPo.getId()));
//        if (userRolePoList.isEmpty()) {
//            return null;
//        } else {
//            // 根据角色ID查询角色权限
//            List<RoleAuthorityPo> roleAuthorityPoList = roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(userRolePoList.stream().map(UserRolePo::getRoleId).toList()));
//            // 根据权限ID查询权限
//            List<AuthorityPo> list = authorityRepository.findList(roleAuthorityPoList.stream().map(RoleAuthorityPo::getId).toList());
//            // 获取菜单
//            List<TreeMenuDto> treeMenu = this.getTreeMenu(list.stream().filter(authorityPo -> "menu".equals(authorityPo.getAuthorityType())).toList());
//            // 获取表单和表格和URL
//            Map<String, FormAndTableAndUrlDto> formAndTableAndUrlDtoMap = new HashMap<>();
//            Map<PersistentPo, List<AuthorityInterfaceDto>> url = this.getInterfaceList(list.stream().filter(authorityPo -> "interface".equals(authorityPo.getAuthorityType())).toList());
//            // 获取表单
//            List<FormDto> form = this.getForm(list.stream().filter(authorityPo -> "form".equals(authorityPo.getAuthorityType())).toList());
//            // 获取表格
//            List<TableDto> table = this.getTable(list.stream().filter(authorityPo -> "table".equals(authorityPo.getAuthorityType())).toList());
//            // 将表单转换为表单和表格和URL的DTO
//            form.forEach(authForm -> {
//                FormAndTableAndUrlDto formAndTableAndUrlDto = formAndTableAndUrlDtoMap.get(authForm.getPersistentFormCode());
//                if (ObjectUtil.isNull(formAndTableAndUrlDto)) {
//                    formAndTableAndUrlDto = new FormAndTableAndUrlDto();
//                }
//                formAndTableAndUrlDto.setForm(authForm);
//                formAndTableAndUrlDtoMap.put(authForm.getPersistentFormCode(), formAndTableAndUrlDto);
//            });
//            // 将表格转换为表单和表格和URL的DTO
//            table.forEach(authTable -> {
//                FormAndTableAndUrlDto formAndTableAndUrlDto = formAndTableAndUrlDtoMap.get(authTable.getPersistentTableCode());
//                if (ObjectUtil.isNull(formAndTableAndUrlDto)) {
//                    formAndTableAndUrlDto = new FormAndTableAndUrlDto();
//                }
//                formAndTableAndUrlDto.setTable(authTable);
//                formAndTableAndUrlDtoMap.put(authTable.getPersistentTableCode(), formAndTableAndUrlDto);
//            });
//            // 将接口转换为表单和表格和URL的DTO
//            url.keySet().forEach(authUrl -> {
//                String poName = StrUtil.upperFirst(StrUtil.toCamelCase(authUrl.getPersistentCode()));
//                FormAndTableAndUrlDto formAndTableAndUrlDto = formAndTableAndUrlDtoMap.get(poName);
//                if (ObjectUtil.isNull(formAndTableAndUrlDto)) {
//                    formAndTableAndUrlDto = new FormAndTableAndUrlDto();
//                }
//                Map<String, AuthorityInterfaceDto> authorityInterfaceDtoMap = new HashMap<>();
//                url.get(authUrl).forEach(type -> authorityInterfaceDtoMap.put(type.getInterfaceType(), type));
//                formAndTableAndUrlDto.setUrlMap(authorityInterfaceDtoMap);
//                formAndTableAndUrlDtoMap.put(poName, formAndTableAndUrlDto);
//            });
//            // 设置菜单和表单和表格和URLDTO
//            authDto.setTreeMenuDtoList(treeMenu.get(0).getChildren());
//            authDto.setFormAndTableDtoMap(formAndTableAndUrlDtoMap);
//            authDto.setId(userPo.getId());
//            authDto.setUserName(userPo.getUserName());
//        }
//        return authDto;
//    }

    // 登出方法
    public void logout() {
        UserContext.remove();
    }

    public String setRoleAuthorityToRedis(UserPo userPo, List<RoleDto> roleLists) {
        UserContext.setUser(JSONObject.parseObject(JSONObject.toJSONString(userPo)));
        String token = generateToken(JSONObject.toJSONString(userPo));
        // 登录成功，将用户信息存入redis
        redisTemplate.opsForValue().set("user:" + userPo.getId(), token, 120, TimeUnit.MINUTES);
        String userRoleCode = roleLists.stream().map(RoleDto::getRoleCode).collect(Collectors.joining(";"));
        redisTemplate.opsForValue().set("userRoleCode:" + userPo.getId(), userRoleCode, 120, TimeUnit.MINUTES);
        UserContext.setUserRole(userRoleCode);
        roleLists.forEach(roleDto -> {
            String roleCodeAndId = roleDto.getRoleCode() + ":" + userPo.getId();
            if ("root".equals(roleDto.getRoleCode())) {
                String allAuthority = "allAuthority";
                redisTemplate.opsForValue().set("menu:" + roleCodeAndId, allAuthority, 120, TimeUnit.MINUTES);
                UserContext.setUserMenu(allAuthority);
                redisTemplate.opsForValue().set("interface:" + roleCodeAndId, allAuthority, 120, TimeUnit.MINUTES);
                UserContext.setUserInterface(allAuthority);
                redisTemplate.opsForValue().set("table:" + roleCodeAndId, allAuthority, 120, TimeUnit.MINUTES);
                UserContext.setUserTable(allAuthority);
                redisTemplate.opsForValue().set("form:" + roleCodeAndId, allAuthority, 120, TimeUnit.MINUTES);
                UserContext.setUserForm(allAuthority);
                redisTemplate.opsForValue().set("button:" + roleCodeAndId, allAuthority, 120, TimeUnit.MINUTES);
                UserContext.setUserButton(allAuthority);
            } else {
                if (roleDto.getAuthorityPoList() != null) {
                    String menuAuthorityCode = roleDto.getAuthorityPoList().stream().filter(authorityPo -> "menu".equals(authorityPo.getAuthorityType())).map(AuthorityPo::getAuthorityCode).collect(Collectors.joining(";"));
                    redisTemplate.opsForValue().set("menu:" + roleCodeAndId, menuAuthorityCode, 120, TimeUnit.MINUTES);
                    UserContext.setUserMenu(menuAuthorityCode);
                    String interfaceAuthorityCode = roleDto.getAuthorityPoList().stream().filter(authorityPo -> "interface".equals(authorityPo.getAuthorityType())).map(AuthorityPo::getAuthorityCode).collect(Collectors.joining(";"));
                    redisTemplate.opsForValue().set("interface:" + roleCodeAndId, interfaceAuthorityCode, 120, TimeUnit.MINUTES);
                    UserContext.setUserInterface(interfaceAuthorityCode);
                    String tableAuthorityCode = roleDto.getAuthorityPoList().stream().filter(authorityPo -> "table".equals(authorityPo.getAuthorityType())).map(AuthorityPo::getAuthorityCode).collect(Collectors.joining(";"));
                    redisTemplate.opsForValue().set("table:" + roleCodeAndId, tableAuthorityCode, 120, TimeUnit.MINUTES);
                    UserContext.setUserTable(tableAuthorityCode);
                    String formAuthorityCode = roleDto.getAuthorityPoList().stream().filter(authorityPo -> "form".equals(authorityPo.getAuthorityType())).map(AuthorityPo::getAuthorityCode).collect(Collectors.joining(";"));
                    redisTemplate.opsForValue().set("form:" + roleCodeAndId, formAuthorityCode, 120, TimeUnit.MINUTES);
                    UserContext.setUserForm(formAuthorityCode);
                    String buttonAuthorityCode = roleDto.getAuthorityPoList().stream().filter(authorityPo -> "button".equals(authorityPo.getAuthorityType())).map(AuthorityPo::getAuthorityCode).collect(Collectors.joining(";"));
                    redisTemplate.opsForValue().set("button:" + roleCodeAndId, buttonAuthorityCode, 120, TimeUnit.MINUTES);
                    UserContext.setUserButton(buttonAuthorityCode);
                }
            }
        });
        return token;
    }

}