package com.example.cyjentitycreater.service.bean.custom;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.contants.Constant;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.entity.bean.MenuBean;
import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.mapper.bean.MenuMapper;
import com.example.cyjcommon.utils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuCustomServiceImpl
        extends ServiceImpl<MenuMapper, MenuBean>
        implements IService<MenuBean> {

    private final static String routePath = "D:/noice-admin/noice/src";

    private final static String menuConfigPath = "D:/noice-admin/noice/src/layouts/BasicLayout";

    public void generateMenuFile() {
        List<AppServiceBean> appServiceBeanList = new AppServiceBean()
                .selectList(new LambdaQueryWrapper<AppServiceBean>()
                        .eq(AppServiceBean::getStatus, Constant.STATUS)
                        .orderByAsc(AppServiceBean::getSortCode));
        long count = 0;
        boolean deleteFlag = new MenuBean().delete(new LambdaQueryWrapper<>());
        logger.info("delete.MenuBean:{}", deleteFlag);
        for (AppServiceBean appServiceBean : appServiceBeanList) {
            count++;
            MenuBean menuBean = new MenuBean();
            menuBean.setMenuCode(appServiceBean.getAppServiceCode());
            menuBean.setMenuName(appServiceBean.getAppServiceName());
            menuBean.setMenuUrl("/" + appServiceBean.getAppServiceCode());
            menuBean.setMenuComponent("BasicLayout");
            menuBean.setSortCode(count);
            menuBean.setStatus(Constant.STATUS);
            menuBean.insert();
            List<PersistentBean> persistentBeanList = new PersistentBean()
                    .selectList(new LambdaQueryWrapper<PersistentBean>()
                            .eq(PersistentBean::getAppServiceId, appServiceBean.getId())
                            .eq(PersistentBean::getStatus, Constant.STATUS)
                            .orderByAsc(PersistentBean::getSortCode));
            for (PersistentBean persistentBean : persistentBeanList) {
                String underPoName = BeanUtils.underline2Camel(persistentBean.getPersistentCode());
                //文件名
                String poName = BeanUtils.captureName(underPoName);
                count++;
                MenuBean menuSubBean = new MenuBean();
                menuSubBean.setMenuCode(persistentBean.getPersistentCode());
                menuSubBean.setMenuName(persistentBean.getPersistentName());
                menuSubBean.setMenuUrl("/" + poName);
                menuSubBean.setMenuParentUrl("/" + appServiceBean.getAppServiceCode());
                menuSubBean.setMenuComponent(poName + "Page");
                menuSubBean.setSortCode(count);
                menuSubBean.setStatus(Constant.STATUS);
                menuSubBean.insert();
            }
        }
        try {
            List<MenuBean> menuBeanList = new MenuBean()
                    .selectList(new LambdaQueryWrapper<MenuBean>()
                            .eq(MenuBean::getStatus, Constant.STATUS));
            List<Map<String, Object>> mapList = BeanUtils
                    .listToTree(menuBeanList, "menuUrl", "menuParentUrl");
            BeanUtils.createJavaFile(routePath, menuGenerate(mapList, menuBeanList));
            BeanUtils.createJavaFile(menuConfigPath, menuConfigGenerate(mapList));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String[] menuGenerate(List<Map<String, Object>> mapList, List<MenuBean> menuBeanList) {
        StringBuilder sb = new StringBuilder();
        sb.append("import BasicLayout from '@/layouts/BasicLayout';\r\n");
        sb.append("import UserLayout from '@/layouts/UserLayout';\r\n");
        sb.append("import LoginPage from '@/pages/Login';\r\n");
        for (MenuBean menuBean : menuBeanList) {
            String menuCode = menuBean.getMenuCode();
            //驼峰名
            String underMenuCode = BeanUtils.underline2Camel(menuCode);
            //文件名
            String MenuCode = BeanUtils.captureName(underMenuCode);
            if (StringUtils.isNotEmpty(menuBean.getMenuParentUrl())) {
                sb.append("import ").append(menuBean.getMenuComponent()).append(" from '@/pages/").append(MenuCode).append("';\r\n");
            }
        }
        sb.append("\r\n");
        sb.append("const routerConfig = [\r\n");
        mapList.forEach(map -> {
            sb.append("  {\r\n");
            sb.append("    path: '").append(map.get("menuUrl").toString()).append("',\r\n");
            sb.append("    component: ").append(map.get("menuComponent").toString()).append(",\r\n");
            sb.append("    children: [\r\n");
            Object obj = map.get("children");
            JSONArray array = JSON.parseArray(JSON.toJSONString(obj));
            for (Object o : array) {
                JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(o));
                sb.append("      {\r\n");
                sb.append("        path: '").append(jsonObject.getString("menuUrl")).append("',\r\n");
                sb.append("        component: ").append(jsonObject.getString("menuComponent")).append(",\r\n");
                sb.append("      },\r\n");
            }
            sb.append("    ],\r\n");
            sb.append("  },\r\n");
        });

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
        sb.append("]\r\n");
        sb.append("\r\n");
        sb.append("export default routerConfig;\r\n");

        String menu = sb.toString();
        return new String[]{menu, "routes.js"};
    }

    private String[] menuConfigGenerate(List<Map<String, Object>> mapList) {
        StringBuilder sb = new StringBuilder();

        sb.append("const headerMenuConfig = [];\r\n");
        sb.append("const asideMenuConfig = [\r\n");
        mapList.forEach(map -> {
            sb.append("  {\r\n");
            sb.append("    name: '").append(map.get("menuName").toString()).append("',\r\n");
            sb.append("    path: '").append(map.get("menuUrl").toString()).append("',\r\n");
            sb.append("    children: [\r\n");
            Object obj = map.get("children");
            JSONArray array = JSON.parseArray(JSON.toJSONString(obj));
            for (Object o : array) {
                JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(o));
                sb.append("      {\r\n");
                sb.append("        name: '").append(jsonObject.getString("menuName")).append("',\r\n");
                sb.append("        path: '").append(map.get("menuUrl").toString()).append(jsonObject.getString("menuUrl")).append("',\r\n");
                sb.append("      },\r\n");
            }
            sb.append("    ],\r\n");
            sb.append("  },\r\n");
        });
        sb.append("]\r\n");
        sb.append("\r\n");
        sb.append("export {headerMenuConfig, asideMenuConfig};\r\n");

        String menuConfig = sb.toString();
        return new String[]{menuConfig, "menuConfig.js"};
    }

    private static final Logger logger = LoggerFactory.getLogger(MenuCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("MenuService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("MenuService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("MenuService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("MenuService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("MenuService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("MenuService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("MenuService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.MenuServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("MenuService.findAll.After:{}", joinPoint);
    }

}
