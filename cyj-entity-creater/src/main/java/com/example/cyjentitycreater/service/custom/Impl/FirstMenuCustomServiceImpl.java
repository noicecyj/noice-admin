package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.dao.FirstMenuDao;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.QSecondMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.VoPoConverter;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import com.example.cyjentitycreater.entity.dto.FirstMenuDTO;
import com.example.cyjentitycreater.entity.dto.SecondMenuDTO;
import com.example.cyjentitycreater.service.custom.FirstMenuCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-20
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FirstMenuCustomServiceImpl extends BaseService implements FirstMenuCustomService {

    final static String menuPath = "\\src\\layouts\\BasicLayout";
    final static String routerPath = "\\src";
    final static String PROJECT_PATH = "PROJECT_PATH";
    final static String FRONT_END = "FRONT_END";

    private DictionaryCustomService dictionaryCustomService;
    private FirstMenuDao firstMenuDao;

    @Autowired
    public void setDictionaryCustomService(DictionaryCustomService dictionaryCustomService) {
        this.dictionaryCustomService = dictionaryCustomService;
    }

    @Autowired
    public void setFirstMenuDao(FirstMenuDao firstMenuDao) {
        this.firstMenuDao = firstMenuDao;
    }

    @Override
    public void createMenu() {
        try {
            DictionaryPO dictionaryPO = dictionaryCustomService
                    .findDictionaryByCatalogValueAndDictionaryValue(PROJECT_PATH, FRONT_END);
            List<FirstMenuDTO> firstMenuDTOList = getMenu();
            createJavaFile(dictionaryPO.getDictionaryValue() + menuPath, menuGenerate(firstMenuDTOList));
            createJavaFile(dictionaryPO.getDictionaryValue() + routerPath, routerGenerate(firstMenuDTOList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] routerGenerate(List<FirstMenuDTO> firstMenuDTOList) {
        StringBuilder sb = new StringBuilder();
        sb.append("import BasicLayout from '@/layouts/BasicLayout';\r\n");
        sb.append("import UserLayout from '@/layouts/UserLayout';\r\n");
        sb.append("import LoginPage from '@/pages/Login';\r\n");
        for (FirstMenuDTO firstMenuDTO : firstMenuDTOList) {
            for (SecondMenuDTO secondMenuDTO : firstMenuDTO.getSecondMenuDTOList()) {
                sb.append("import ").append(secondMenuDTO.getComponent()).append("Page from '@/pages/").append(secondMenuDTO.getComponent()).append("';\r\n");
            }
        }
        sb.append("\r\n");
        sb.append("const routerConfig = [\r\n");
        for (FirstMenuDTO firstMenuDTO : firstMenuDTOList) {
            sb.append("  {\r\n");
            sb.append("    path: '").append(firstMenuDTO.getPath()).append("',\r\n");
            sb.append("    component: ").append(firstMenuDTO.getLayout()).append(",\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenuDTO secondMenuDTO : firstMenuDTO.getSecondMenuDTOList()) {
                sb.append("      {\r\n");
                sb.append("        path: '").append(secondMenuDTO.getPath()).append("',\r\n");
                sb.append("        component: ").append(secondMenuDTO.getComponent()).append("Page,\r\n");
                sb.append("      },\r\n");
            }
            sb.append("    ],\r\n");
            sb.append("  },\r\n");
        }
        sb.append("  {\r\n");
        sb.append("    path: '/user',\r\n");
        sb.append("    component: UserLayout,\r\n");
        sb.append("    children: [\r\n");
        sb.append("      {\r\n");
        sb.append("        path: '/login',\r\n");
        sb.append("        component: LoginPage,\r\n");
        sb.append("      },\r\n");
        sb.append("    ],\r\n");
        sb.append("  },\r\n");
        sb.append("  {\r\n");
        sb.append("    path: '/',\r\n");
        sb.append("    redirect: '/user/login',\r\n");
        sb.append("  },\r\n");
        sb.append("];\r\n");
        sb.append("export default routerConfig;\r\n");
        String menuData = sb.toString();
        return new String[]{menuData, "routes.js"};
    }

    @Override
    public List<FirstMenuDTO> getMenu() {
        List<FirstMenuPO> firstMenuPOList = firstMenuDao
                .findAll()
                .stream()
                .sorted(Comparator.comparing(FirstMenuPO::getSortCode))
                .collect(Collectors.toList());
        List<FirstMenuDTO> firstMenuDTOList = VoPoConverter.copyList(firstMenuPOList, FirstMenuDTO.class);
        for (FirstMenuDTO firstMenuDTO : firstMenuDTOList) {
            List<SecondMenuPO> secondMenuPOList = queryFactory
                    .selectFrom(QSecondMenuPO.secondMenuPO)
                    .where(QSecondMenuPO.secondMenuPO.pid.eq(firstMenuDTO.getId()))
                    .orderBy(QSecondMenuPO.secondMenuPO.sortCode.asc())
                    .fetch();
            List<SecondMenuDTO> secondMenuDTOList = VoPoConverter.copyList(secondMenuPOList, SecondMenuDTO.class);
            firstMenuDTO.setSecondMenuDTOList(secondMenuDTOList);
        }
        return firstMenuDTOList;
    }

    private String[] menuGenerate(List<FirstMenuDTO> firstMenuDTOList) {
        StringBuilder sb = new StringBuilder();
        sb.append("const headerMenuConfig = [];\r\n");
        sb.append("const asideMenuConfig = [\r\n");
        for (FirstMenuDTO firstMenuDTO : firstMenuDTOList) {
            sb.append("  {\r\n");
            sb.append("    name: '").append(firstMenuDTO.getMenuName()).append("',\r\n");
            sb.append("    icon: '").append(firstMenuDTO.getIcon()).append("',\r\n");
            sb.append("    path: '").append(firstMenuDTO.getPath()).append("',\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenuDTO secondMenuDTO : firstMenuDTO.getSecondMenuDTOList()) {
                sb.append("      {\r\n");
                sb.append("        name: '").append(secondMenuDTO.getMenuName()).append("',\r\n");
                sb.append("        path: '").append(firstMenuDTO.getPath()).append(secondMenuDTO.getPath()).append("',\r\n");
                sb.append("      },\r\n");
            }
            sb.append("    ],\r\n");
            sb.append("  },\r\n");
        }
        sb.append("];\r\n");
        sb.append("\r\n");
        sb.append("export { headerMenuConfig, asideMenuConfig };\r\n");
        String menuData = sb.toString();
        return new String[]{menuData, "menuConfig.js"};
    }
}
