package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.dao.FirstMenuDao;
import com.example.cyjcommon.dao.SecondMenuDao;
import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.FirstMenu;
import com.example.cyjcommon.entity.SecondMenu;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.BeanUtils;
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
            Dictionary dictionary = dictionaryCustomService
                    .findDictionaryByCatalogValueAndDictionaryValue(PROJECT_PATH, FRONT_END);
            List<FirstMenu> firstMenuList = firstMenuDao.findAll().stream()
                    .sorted(Comparator.comparing(FirstMenu::getSortCode))
                    .collect(Collectors.toList());
            BeanUtils.createJavaFile(dictionary.getDictionaryValue() + menuPath, menuGenerate(firstMenuList));
            BeanUtils.createJavaFile(dictionary.getDictionaryValue() + routerPath, routerGenerate(firstMenuList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] routerGenerate(List<FirstMenu> firstMenuList) {
        StringBuilder sb = new StringBuilder();
        sb.append("import BasicLayout from '@/layouts/BasicLayout';\r\n");
        sb.append("import UserLayout from '@/layouts/UserLayout';\r\n");
        sb.append("import LoginPage from '@/pages/Login';\r\n");
        for (FirstMenu firstMenu : firstMenuList) {
            List<SecondMenu> secondMenuList = secondMenuDao.findByFirstMenu(firstMenu);
            for (SecondMenu secondMenu : secondMenuList) {
                sb.append("import ").append(secondMenu.getSecondMenuComponent()).append("Page from '@/pages/").append(secondMenu.getSecondMenuComponent()).append("';\r\n");
            }
        }
        sb.append("\r\n");
        sb.append("const routerConfig = [\r\n");
        for (FirstMenu firstMenu : firstMenuList) {
            List<SecondMenu> secondMenuList = secondMenuDao.findByFirstMenu(firstMenu);
            sb.append("  {\r\n");
            sb.append("    path: '").append(firstMenu.getFirstMenuPath()).append("',\r\n");
            sb.append("    component: ").append(firstMenu.getFirstMenuLayout()).append(",\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenu secondMenu : secondMenuList) {
                sb.append("      {\r\n");
                sb.append("        path: '").append(secondMenu.getSecondMenuPath()).append("',\r\n");
                sb.append("        component: ").append(secondMenu.getSecondMenuComponent()).append("Page,\r\n");
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

    private String[] menuGenerate(List<FirstMenu> firstMenuList) {
        StringBuilder sb = new StringBuilder();
        sb.append("const headerMenuConfig = [];\r\n");
        sb.append("const asideMenuConfig = [\r\n");
        for (FirstMenu firstMenu : firstMenuList) {
            List<SecondMenu> secondMenuList = secondMenuDao.findByFirstMenu(firstMenu);
            sb.append("  {\r\n");
            sb.append("    name: '").append(firstMenu.getFirstMenuName()).append("',\r\n");
            sb.append("    icon: '").append(firstMenu.getFirstMenuIcon()).append("',\r\n");
            sb.append("    path: '").append(firstMenu.getFirstMenuPath()).append("',\r\n");
            sb.append("    children: [\r\n");
            for (SecondMenu secondMenu : secondMenuList) {
                sb.append("      {\r\n");
                sb.append("        name: '").append(secondMenu.getSecondMenuName()).append("',\r\n");
                sb.append("        path: '").append(firstMenu.getFirstMenuPath()).append(secondMenu.getSecondMenuPath()).append("',\r\n");
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
