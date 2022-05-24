package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.dao.FirstMenuDao;
import com.example.cyjcommon.dao.SecondMenuDao;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
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
    private SecondMenuDao secondMenuDao;

    @Autowired
    public void setDictionaryCustomService(DictionaryCustomService dictionaryCustomService) {
        this.dictionaryCustomService = dictionaryCustomService;
    }

    @Autowired
    public void setFirstMenuDao(FirstMenuDao firstMenuDao) {
        this.firstMenuDao = firstMenuDao;
    }

    @Autowired
    public void setSecondMenuDao(SecondMenuDao secondMenuDao) {
        this.secondMenuDao = secondMenuDao;
    }

    @Override
    public void createMenu() {
        try {
            DictionaryPO dictionaryPO = dictionaryCustomService
                    .findDictionaryByCatalogValueAndDictionaryValue(PROJECT_PATH, FRONT_END);
            List<FirstMenuPO> firstMenuPOList = firstMenuDao.findAll().stream()
                    .sorted(Comparator.comparing(FirstMenuPO::getSortCode))
                    .collect(Collectors.toList());
            createJavaFile(dictionaryPO.getDictionaryValue() + menuPath, menuGenerate(firstMenuPOList));
            createJavaFile(dictionaryPO.getDictionaryValue() + routerPath, routerGenerate(firstMenuPOList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] routerGenerate(List<FirstMenuPO> firstMenuPOList) {
        StringBuilder sb = new StringBuilder();
        sb.append("import BasicLayout from '@/layouts/BasicLayout';\r\n");
        sb.append("import UserLayout from '@/layouts/UserLayout';\r\n");
        sb.append("import LoginPage from '@/pages/Login';\r\n");
        for (FirstMenuPO firstMenuPO : firstMenuPOList) {
            List<SecondMenuPO> secondMenuPOList = secondMenuDao.findByFirstMenu(firstMenuPO);
            for (SecondMenuPO secondMenuPO : secondMenuPOList) {
                sb.append("import ").append(secondMenuPO.getSecondMenuComponent()).append("Page from '@/pages/").append(secondMenuPO.getSecondMenuComponent()).append("';\r\n");
            }
        }
        sb.append("\r\n");
        sb.append("const routerConfig = [\r\n");
        for (FirstMenuPO firstMenuPO : firstMenuPOList) {
            List<SecondMenuPO> secondMenuPOList = secondMenuDao.findByFirstMenu(firstMenuPO);
            sb.append("  {\r\n");
            sb.append("    path: '").append(firstMenuPO.getFirstMenuPath()).append("',\r\n");
            sb.append("    component: ").append(firstMenuPO.getFirstMenuLayout()).append(",\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenuPO secondMenuPO : secondMenuPOList) {
                sb.append("      {\r\n");
                sb.append("        path: '").append(secondMenuPO.getSecondMenuPath()).append("',\r\n");
                sb.append("        component: ").append(secondMenuPO.getSecondMenuComponent()).append("Page,\r\n");
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

    private String[] menuGenerate(List<FirstMenuPO> firstMenuPOList) {
        StringBuilder sb = new StringBuilder();
        sb.append("const headerMenuConfig = [];\r\n");
        sb.append("const asideMenuConfig = [\r\n");
        for (FirstMenuPO firstMenuPO : firstMenuPOList) {
            List<SecondMenuPO> secondMenuPOList = secondMenuDao.findByFirstMenu(firstMenuPO);
            sb.append("  {\r\n");
            sb.append("    name: '").append(firstMenuPO.getFirstMenuName()).append("',\r\n");
            sb.append("    icon: '").append(firstMenuPO.getFirstMenuIcon()).append("',\r\n");
            sb.append("    path: '").append(firstMenuPO.getFirstMenuPath()).append("',\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenuPO secondMenuPO : secondMenuPOList) {
                sb.append("      {\r\n");
                sb.append("        name: '").append(secondMenuPO.getSecondMenuName()).append("',\r\n");
                sb.append("        path: '").append(firstMenuPO.getFirstMenuPath()).append(secondMenuPO.getSecondMenuPath()).append("',\r\n");
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
