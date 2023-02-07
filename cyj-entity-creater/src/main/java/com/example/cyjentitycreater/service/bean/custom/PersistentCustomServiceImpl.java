package com.example.cyjentitycreater.service.bean.custom;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.contants.Constant;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.entity.bean.PersistentFormBean;
import com.example.cyjcommon.entity.bean.PersistentFormConfigBean;
import com.example.cyjcommon.entity.bean.PersistentTableBean;
import com.example.cyjcommon.entity.bean.PersistentTableConfigBean;
import com.example.cyjcommon.entity.bean.PersistentTableSearchConfigBean;
import com.example.cyjcommon.entity.bean.PropertyBean;
import com.example.cyjcommon.entity.bean.SqlBean;
import com.example.cyjcommon.mapper.bean.PersistentMapper;
import com.example.cyjcommon.mapper.bean.SqlMapper;
import com.example.cyjcommon.utils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentCustomServiceImpl
        extends ServiceImpl<PersistentMapper, PersistentBean>
        implements IService<PersistentBean> {

    private final static String componentPath = "C:/Users/noice/IdeaProjects/noice-admin/noice/src/pages/";
    private final static String POST = "POST";

    private final static String commonPath = "C:/Users/noice/IdeaProjects/noice-admin/cyj-common/src/main/java/com/example/cyjcommon";

    private SqlMapper sqlMapper;

    @Autowired
    public void setSqlMapper(SqlMapper sqlMapper) {
        this.sqlMapper = sqlMapper;
    }

    public void generateJavaFile(PersistentBean persistent) {
        if (persistent == null) {
            return;
        }
        entityHandler(persistent, "create");
    }

    public void generateAllJavaFile() {
        List<PersistentBean> persistentList = new PersistentBean()
                .selectList(new LambdaQueryWrapper<PersistentBean>()
                        .eq(PersistentBean::getStatus, 1));
        for (PersistentBean persistent : persistentList) {
            entityHandler(persistent, "create");
        }
    }


    public void deleteJavaFile(PersistentBean persistent) {
        if (persistent == null) {
            return;
        }
        entityHandler(persistent, "delete");
    }

    private void authorityHandler(PersistentBean persistent) {
        boolean isBeanFlag = persistent.getPersistentRelation() == 0;
        AppServiceBean appServiceBean = new AppServiceBean().selectById(persistent.getAppServiceId());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        long count = new AuthorityBean().selectCount(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getStatus, Constant.STATUS));
        boolean deleteFlag = new AuthorityBean().delete(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getPersistentId, persistent.getId()));
        logger.info("delete.authority:{}", deleteFlag);
        String path = "/" + appServiceBean.getAppServiceTruePath() + "/" + appServiceBean.getAppServiceApi();
        if (isBeanFlag) {
            count++;
            AuthorityBean findAll = new AuthorityBean();
            findAll.setAuthorityCode("page" + poName);
            findAll.setAuthorityName("查询" + poName);
            findAll.setAuthorityMethod(POST);
            findAll.setAuthorityPath(path + "/page" + poName);
            findAll.setAuthorityType(Constant.SELECT);
            findAll.setPersistentId(persistent.getId());
            findAll.setSortCode(count);
            findAll.setStatus(Constant.STATUS);
            findAll.insert();
            count++;
            AuthorityBean save = new AuthorityBean();
            save.setAuthorityCode("save" + poName);
            save.setAuthorityName("保存" + poName);
            save.setAuthorityMethod(POST);
            save.setAuthorityPath(path + "/save" + poName);
            save.setAuthorityType(Constant.SAVE);
            save.setPersistentId(persistent.getId());
            save.setSortCode(count);
            save.setStatus(Constant.STATUS);
            save.insert();
            count++;
            AuthorityBean delete = new AuthorityBean();
            delete.setAuthorityCode("delete" + poName);
            delete.setAuthorityName("删除" + poName);
            delete.setAuthorityMethod(POST);
            delete.setAuthorityPath(path + "/delete" + poName);
            delete.setAuthorityType(Constant.DELETE);
            delete.setPersistentId(persistent.getId());
            delete.setSortCode(count);
            delete.setStatus(Constant.STATUS);
            delete.insert();
        } else {
            count++;
            AuthorityBean set = new AuthorityBean();
            set.setAuthorityCode("get" + poName);
            set.setAuthorityName("查询" + poName + "关联关系");
            set.setAuthorityMethod(POST);
            set.setAuthorityPath(path + "/get" + poName);
            set.setAuthorityType(Constant.GET);
            set.setPersistentId(persistent.getId());
            set.setSortCode(count);
            set.setStatus(Constant.STATUS);
            set.insert();
            count++;
            AuthorityBean get = new AuthorityBean();
            get.setAuthorityCode("set" + poName);
            get.setAuthorityName("保存" + poName + "关联关系");
            get.setAuthorityMethod(POST);
            get.setAuthorityPath(path + "/set" + poName);
            get.setAuthorityType(Constant.SET);
            get.setPersistentId(persistent.getId());
            get.setSortCode(count);
            get.setStatus(Constant.STATUS);
            get.insert();
        }
    }

    private void formAndTableAndSearchHandler(PersistentBean persistent) {
        boolean isBeanFlag = persistent.getPersistentRelation() == 0;
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        List<PropertyBean> propertyList = new PropertyBean().selectList(new LambdaQueryWrapper<PropertyBean>()
                .eq(PropertyBean::getPersistentId, persistent.getId())
                .orderByAsc(PropertyBean::getSortCode));
        if (isBeanFlag) {
            long countForm = new PersistentFormBean().selectCount(new LambdaQueryWrapper<PersistentFormBean>()
                    .eq(PersistentFormBean::getStatus, Constant.STATUS));
            PersistentFormBean formBean = new PersistentFormBean().selectOne(new LambdaQueryWrapper<PersistentFormBean>()
                    .eq(PersistentFormBean::getPersistentFormCode, poName.toUpperCase() + "_DEFAULT_FORM"));
            if (formBean != null) {
                boolean persistentFormConfigFlag = new PersistentFormConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentFormConfigBean>()
                                .eq(PersistentFormConfigBean::getPersistentFormId, formBean.getId()));
                logger.info("delete.persistentFormConfigFlag:{}", persistentFormConfigFlag);
                formBean.deleteById();
            }
            long countTable = new PersistentTableBean().selectCount(new LambdaQueryWrapper<PersistentTableBean>()
                    .eq(PersistentTableBean::getStatus, Constant.STATUS));
            PersistentTableBean tableBean = new PersistentTableBean().selectOne(new LambdaQueryWrapper<PersistentTableBean>()
                    .eq(PersistentTableBean::getPersistentTableCode, poName.toUpperCase() + "_DEFAULT_TABLE"));
            if (tableBean != null) {
                boolean persistentTableConfigFlag = new PersistentTableConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentTableConfigBean>()
                                .eq(PersistentTableConfigBean::getPersistentTableId, tableBean.getId()));
                boolean persistentTableSearchConfigFlag = new PersistentTableSearchConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentTableSearchConfigBean>()
                                .eq(PersistentTableSearchConfigBean::getPersistentTableId, tableBean.getId()));
                logger.info("delete.persistentTableConfigFlag:{}", persistentTableConfigFlag);
                logger.info("delete.persistentTableSearchConfigFlag:{}", persistentTableSearchConfigFlag);
                tableBean.deleteById();
            }
            countForm++;
            PersistentFormBean persistentFormBean = new PersistentFormBean();
            persistentFormBean.setPersistentFormName(poName.toUpperCase() + "默认表单");
            persistentFormBean.setPersistentFormCode(poName.toUpperCase() + "_DEFAULT_FORM");
            persistentFormBean.setPersistentFormType("default_form");
            persistentFormBean.setPersistentFormRow(1);
            persistentFormBean.setPersistentId(persistent.getId());
            persistentFormBean.setSortCode(countForm);
            persistentFormBean.setStatus(Constant.STATUS);
            persistentFormBean.insert();
            for (PropertyBean propertyBean : propertyList) {
                PersistentFormConfigBean persistentFormConfigBean = new PersistentFormConfigBean();
                persistentFormConfigBean.setPersistentFormId(persistentFormBean.getId());
                persistentFormConfigBean.setPersistentFormConfigName(propertyBean.getPropertyName());
                //驼峰名
                String underPropertyCode = BeanUtils.underline2Camel(propertyBean.getPropertyCode());
                persistentFormConfigBean.setPersistentFormConfigCode(underPropertyCode);
                persistentFormConfigBean.setPersistentFormConfigRequired(0);
                persistentFormConfigBean.setPersistentFormConfigEdit(0);
                if (propertyBean.getPropertyRelation() == 0) {
                    if ("boolean".equals(propertyBean.getPropertyType())) {
                        persistentFormConfigBean.setPersistentFormConfigMode("Select");
                        persistentFormConfigBean.setPersistentFormConfigDataSource("YES_AND_NO");
                    } else {
                        persistentFormConfigBean.setPersistentFormConfigMode("Input");
                    }
                } else {
                    persistentFormConfigBean.setPersistentFormConfigMode("Select");
                    persistentFormConfigBean.setPersistentFormConfigDataSource(propertyBean.getPropertyCode().toUpperCase() + "@NAME_AND_ID");
                }
                persistentFormConfigBean.setPersistentFormConfigColSpan(6);
                persistentFormConfigBean.setSortCode(propertyBean.getSortCode());
                persistentFormConfigBean.setStatus(Constant.STATUS);
                persistentFormConfigBean.insert();
            }
            countTable++;
            PersistentTableBean persistentTableBean = new PersistentTableBean();
            persistentTableBean.setPersistentTableName(poName.toUpperCase() + "默认表格");
            persistentTableBean.setPersistentTableCode(poName.toUpperCase() + "_DEFAULT_TABLE");
            persistentTableBean.setPersistentId(persistent.getId());
            persistentTableBean.setSortCode(countTable);
            persistentTableBean.setStatus(Constant.STATUS);
            persistentTableBean.insert();
            for (PropertyBean propertyBean : propertyList) {
                if (propertyBean.getPropertyRelation() == 0) {
                    PersistentTableConfigBean persistentTableConfigBean = new PersistentTableConfigBean();
                    persistentTableConfigBean.setPersistentTableId(persistentTableBean.getId());
                    persistentTableConfigBean.setPersistentTableConfigName(propertyBean.getPropertyName());
                    //驼峰名
                    String underPropertyCode = BeanUtils.underline2Camel(propertyBean.getPropertyCode());
                    persistentTableConfigBean.setPersistentTableConfigCode(underPropertyCode);
                    if ("boolean".equals(propertyBean.getPropertyType())) {
                        persistentTableConfigBean.setPersistentTableConfigDisplay(0);
                    } else {
                        persistentTableConfigBean.setPersistentTableConfigDisplay(1);
                    }
                    persistentTableConfigBean.setPersistentTableConfigType("column");
                    persistentTableConfigBean.setSortCode(propertyBean.getSortCode());
                    persistentTableConfigBean.setStatus(Constant.STATUS);
                    persistentTableConfigBean.insert();
                } else {
                    PersistentTableSearchConfigBean persistentTableSearchConfigBean = new PersistentTableSearchConfigBean();
                    persistentTableSearchConfigBean.setPersistentTableId(persistentTableBean.getId());
                    //驼峰名
                    String underPropertyCode = BeanUtils.underline2Camel(propertyBean.getPropertyCode());
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigCode(underPropertyCode);
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigName(propertyBean.getPropertyName());
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigMode("ManyToOne");
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigDisplay(0);
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigDataSource(propertyBean.getPropertyCode().toUpperCase() + "@NAME_AND_ID");
                    persistentTableSearchConfigBean.setSortCode(propertyBean.getSortCode());
                    persistentTableSearchConfigBean.setStatus(Constant.STATUS);
                    persistentTableSearchConfigBean.insert();
                }
                if (propertyBean.getPropertyCode().contains("code") || propertyBean.getPropertyCode().contains("name")) {
                    PersistentTableSearchConfigBean persistentTableSearchConfigBean = new PersistentTableSearchConfigBean();
                    persistentTableSearchConfigBean.setPersistentTableId(persistentTableBean.getId());
                    //驼峰名
                    String underPropertyCode = BeanUtils.underline2Camel(propertyBean.getPropertyCode());
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigCode(underPropertyCode);
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigName(propertyBean.getPropertyName());
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigMode("Input");
                    persistentTableSearchConfigBean.setPersistentTableSearchConfigDisplay(1);
                    persistentTableSearchConfigBean.setSortCode(propertyBean.getSortCode());
                    persistentTableSearchConfigBean.setStatus(Constant.STATUS);
                    persistentTableSearchConfigBean.insert();
                }
            }
        }
    }

    public void entityHandler(PersistentBean persistent, String handlerType) {
        switch (handlerType) {
            case "create":
                createEntityHandler(persistent);
                authorityHandler(persistent);
                sqlHandler(persistent);
                formAndTableAndSearchHandler(persistent);
                break;
            case "delete":
                deleteEntityHandler(persistent);
                authorityDeleteHandler(persistent);
                sqlDeleteHandler(persistent);
                formAndTableAndSearchDeleteHandler(persistent);
                break;
            default:
                logger.info("wtf!");
        }
    }

    private void formAndTableAndSearchDeleteHandler(PersistentBean persistent) {
        boolean isBeanFlag = persistent.getPersistentRelation() == 0;
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        if (isBeanFlag) {
            PersistentFormBean formBean = new PersistentFormBean().selectOne(new LambdaQueryWrapper<PersistentFormBean>()
                    .eq(PersistentFormBean::getPersistentFormCode, poName.toUpperCase() + "_DEFAULT_FORM"));
            if (formBean != null) {
                boolean persistentFormConfigFlag = new PersistentFormConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentFormConfigBean>()
                                .eq(PersistentFormConfigBean::getPersistentFormId, formBean.getId()));
                logger.info("delete.persistentFormConfigFlag:{}", persistentFormConfigFlag);
                formBean.deleteById();
            }
            PersistentTableBean tableBean = new PersistentTableBean().selectOne(new LambdaQueryWrapper<PersistentTableBean>()
                    .eq(PersistentTableBean::getPersistentTableCode, poName.toUpperCase() + "_DEFAULT_TABLE"));
            if (tableBean != null) {
                boolean persistentTableConfigFlag = new PersistentTableConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentTableConfigBean>()
                                .eq(PersistentTableConfigBean::getPersistentTableId, tableBean.getId()));
                boolean persistentTableSearchConfigFlag = new PersistentTableSearchConfigBean()
                        .delete(new LambdaQueryWrapper<PersistentTableSearchConfigBean>()
                                .eq(PersistentTableSearchConfigBean::getPersistentTableId, tableBean.getId()));
                logger.info("delete.persistentTableConfigFlag:{}", persistentTableConfigFlag);
                logger.info("delete.persistentTableSearchConfigFlag:{}", persistentTableSearchConfigFlag);
                tableBean.deleteById();
            }
        }
    }

    private void sqlDeleteHandler(PersistentBean persistent) {
        String dataSourceType = persistent.getPersistentCode().toUpperCase() + "_ID@NAME_AND_ID";
        SqlBean sql = new SqlBean().selectOne(new LambdaQueryWrapper<SqlBean>()
                .eq(SqlBean::getSqlCode, dataSourceType));
        if (sql != null) {
            sql.deleteById();
        }
    }

    private void authorityDeleteHandler(PersistentBean persistent) {
        AppServiceBean appServiceBean = new AppServiceBean().selectById(persistent.getAppServiceId());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AuthorityBean findAll = new AuthorityBean().selectOne(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getAuthorityPath, appServiceBean.getAppServiceApi() + "/page" + poName));
        if (findAll != null) {
            findAll.deleteById();
        }
        AuthorityBean save = new AuthorityBean().selectOne(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getAuthorityPath, appServiceBean.getAppServiceApi() + "/save" + poName));
        if (save != null) {
            save.deleteById();
        }
        AuthorityBean delete = new AuthorityBean().selectOne(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getAuthorityPath, appServiceBean.getAppServiceApi() + "/delete" + poName));
        if (delete != null) {
            delete.deleteById();
        }
    }

    private void deleteEntityHandler(PersistentBean persistent) {
        String persistentCode = persistent.getPersistentCode();
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistentCode);
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AppServiceBean appServiceBean = new AppServiceBean().selectById(persistent.getAppServiceId());
        if (appServiceBean == null) {
            return;
        }
        //服务路径
        String appPath = appServiceBean.getAppServicePath();
        Map<String, String> entityObj = new HashMap<>();
        entityObj.put(commonPath + "/entity", poName + ".java");
        entityObj.put(commonPath + "/dao", poName + "Dao.java");
        entityObj.put(appPath + "/service/auto", poName + "Service.java");
        entityObj.put(appPath + "/controller/auto", poName + "Controller.java");
        entityObj.put(componentPath + poName + "/services", poName + ".tsx");
        entityObj.put(componentPath + poName + "/models", poName + ".tsx");
        entityObj.put(componentPath + poName + "/view", poName + ".tsx");
        BeanUtils.deleteJavaFile(componentPath + poName, "index.tsx");
        BeanUtils.deleteJavaFile(componentPath + poName, "store.ts");
        Map<String, String> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service/custom", poName + "CustomService.java");
        entityCustomObj.put(appPath + "/controller/custom", poName + "CustomController.java");
        deleteEntityCodeHandler(entityObj, entityCustomObj);
        BeanUtils.deleteJavaFile(componentPath + poName);
    }

    private void sqlHandler(PersistentBean persistent) {
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        String dataSourceType = persistent.getPersistentCode().toUpperCase() + "_ID@NAME_AND_ID";
        boolean delete = new SqlBean().delete(new LambdaQueryWrapper<SqlBean>()
                .eq(SqlBean::getSqlCode, dataSourceType));
        long count = new SqlBean().selectCount(new LambdaQueryWrapper<SqlBean>()
                .eq(SqlBean::getStatus, Constant.STATUS));
        count++;
        logger.info("delete.sql:{}", delete);
        String sqlStr = "select " + persistent.getPersistentCode() + "_name as label, id as value from t_" + persistent.getPersistentCode();
        SqlBean sql = new SqlBean();
        sql.setSqlCode(dataSourceType);
        sql.setSqlName("查询" + poName);
        sql.setSqlStr(sqlStr);
        sql.setSqlType("查询");
        sql.setStatus(Constant.STATUS);
        sql.setSortCode(count);
        sql.insert();
    }

    private void createEntityHandler(PersistentBean persistent) {
        String persistentCode = persistent.getPersistentCode();
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistentCode);
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AppServiceBean appServiceBean = new AppServiceBean().selectById(persistent.getAppServiceId());
        if (appServiceBean == null) {
            return;
        }
        //服务路径
        String appPath = appServiceBean.getAppServicePath();
        //服务接口
        String appApi = appServiceBean.getAppServiceApi();
        List<PropertyBean> propertyList = new PropertyBean().selectList(new LambdaQueryWrapper<PropertyBean>()
                .eq(PropertyBean::getPersistentId, persistent.getId())
                .orderByAsc(PropertyBean::getSortCode));
        Map<String, String[]> entityObj = new HashMap<>();
        boolean isBeanFlag = persistent.getPersistentRelation() == 0;
        entityObj.put(commonPath + "/ddl" + (isBeanFlag ? "/bean" : "/relation"),
                ddlGenerate(persistent, propertyList, poName, isBeanFlag));
        entityObj.put(commonPath + "/entity" + (isBeanFlag ? "/bean" : "/relation"),
                poGenerate(persistent, propertyList, poName, isBeanFlag));
        entityObj.put(commonPath + "/mapper" + (isBeanFlag ? "/bean" : "/relation"),
                mapperGenerate(poName, isBeanFlag));
        entityObj.put(appPath + "/service" + (isBeanFlag ? "/bean" : "/relation") + "/auto",
                serviceGenerate(propertyList, poName, appPath, isBeanFlag));
        entityObj.put(appPath + "/controller" + (isBeanFlag ? "/bean" : "/relation") + "/auto",
                controllerGenerate(poName, appPath, appApi, isBeanFlag));
        entityObj.put(componentPath + poName + "/models", modelsGenerate(appApi, poName, persistentCode));
        try {
            BeanUtils.createJavaFile(componentPath + poName, indexGenerate(poName));
            BeanUtils.createJavaFile(componentPath + poName, storeGenerate(poName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String, String[]> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service" + (isBeanFlag ? "/bean" : "/relation") + "/custom",
                serviceCustomGenerate(poName, appPath, isBeanFlag));
        entityCustomObj.put(appPath + "/controller" + (isBeanFlag ? "/bean" : "/relation") + "/custom",
                controllerCustomGenerate(poName, appPath, appApi, isBeanFlag));
        createEntityCodeHandler(entityObj, entityCustomObj);
    }

    private String[] ddlGenerate(PersistentBean persistent, List<PropertyBean> propertyList, String poName, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        sb.append("drop table if exists data_user.t_").append(persistent.getPersistentCode()).append(";\r\n");
        sb.append("create table if not exists data_user.t_").append(persistent.getPersistentCode()).append("\r\n");
        sb.append("(\r\n");
        sb.append("    id\r\n");
        sb.append("        varchar(36)\r\n");
        sb.append("        not null comment '主键'\r\n");
        sb.append("        primary key,\r\n");
        for (PropertyBean property : propertyList) {
            sb.append("    ").append(property.getPropertyCode()).append("\r\n");
            if ("int".equals(property.getPropertyType()) || "boolean".equals(property.getPropertyType())) {
                sb.append("        int\r\n");
            } else {
                sb.append("        varchar(").append(property.getPropertyLength()).append(")\r\n");
            }
            if (property.getPropertyNull() == 0) {
                sb.append("        null\r\n");
            } else {
                sb.append("        not null\r\n");
            }
            sb.append("        comment '").append(property.getPropertyName()).append("',\r\n");
        }
        sb.append("    sort_code\r\n");
        sb.append("        int\r\n");
        sb.append("        not null comment '排序值',\r\n");
        sb.append("    status\r\n");
        sb.append("        int\r\n");
        sb.append("        not null comment '状态',\r\n");
        sb.append("    created_date\r\n");
        sb.append("        timestamp default CURRENT_TIMESTAMP\r\n");
        sb.append("        null comment '创建时间',\r\n");
        sb.append("    created_by\r\n");
        sb.append("        varchar(255)\r\n");
        sb.append("        null comment '创建人',\r\n");
        sb.append("    updated_date\r\n");
        sb.append("        timestamp default CURRENT_TIMESTAMP\r\n");
        sb.append("        null comment '更新时间',\r\n");
        sb.append("    updated_by\r\n");
        sb.append("        varchar(255)\r\n");
        sb.append("        null comment '更新人'\r\n");
        sb.append(")\r\n");
        sb.append("    comment '").append(persistent.getPersistentName()).append("';\r\n");
        String ddl = sb.toString();
        return new String[]{ddl, poName + (isBeanFlag ? "Bean" : "Relation") + ".sql"};

    }

    private String[] storeGenerate(String poName) {
        String viewData =
                "import {createStore} from 'ice';\r\n" +
                        "import " + poName + " from './models/" + poName + "';\r\n" +
                        "\r\n" +
                        "const store = createStore({\r\n" +
                        "  " + poName + ",\r\n" +
                        "});\r\n" +
                        "\r\n" +
                        "export default store;\r\n";
        return new String[]{viewData, "store.ts"};
    }

    private String[] indexGenerate(String poName) {
        String viewData =
                "import React from 'react';\r\n" +
                        "import PageModel from \"@/components/pageModel\";\r\n" +
                        "import pageStore from \"@/pages/" + poName + "/store\";\r\n" +
                        "\r\n" +
                        "function " + poName + "Page() {\r\n" +
                        "\r\n" +
                        "  const [state, dispatchers] = pageStore.useModel('" + poName + "');\r\n" +
                        "\r\n" +
                        "  return (\r\n" +
                        "    <PageModel state={state} dispatchers={dispatchers}/>\r\n" +
                        "  );\r\n" +
                        "}\r\n" +
                        "\r\n" +
                        "export default " + poName + "Page;\r\n";
        return new String[]{viewData, "index.tsx"};
    }

    private String[] modelsGenerate(String appApi, String poName, String persistentCode) {
        String viewData =
                "import initService from '@/services/init';\r\n" +
                        "import {Message} from \"@alifd/next\";\r\n" +
                        "\r\n" +
                        "export default {\r\n" +
                        "\r\n" +
                        "  namespace: '" + poName + "',\r\n" +
                        "\r\n" +
                        "  state: {\r\n" +
                        "    title: '添加',\r\n" +
                        "    tableData: [],\r\n" +
                        "    visible: false,\r\n" +
                        "    formData: {},\r\n" +
                        "    loadingVisible: true,\r\n" +
                        "    total: 0,\r\n" +
                        "    current: 1,\r\n" +
                        "    formConfig: [],\r\n" +
                        "    tableOperation: [],\r\n" +
                        "    tableConfig: [],\r\n" +
                        "    titleConfig: [],\r\n" +
                        "    tableSearch: [],\r\n" +
                        "    searchForm: {},\r\n" +
                        "    searchDefaultForm: {},\r\n" +
                        "  },\r\n" +
                        "\r\n" +
                        "  reducers: {\r\n" +
                        "    setState(prevState, payload) {\r\n" +
                        "      return {...prevState, ...payload};\r\n" +
                        "    },\r\n" +
                        "  },\r\n" +
                        "\r\n" +
                        "  effects: (dispatch) => ({\r\n" +
                        "    async page(data) {\r\n" +
                        "      const dataRes = await initService.runCustomMethod({\r\n" +
                        "        url: '/" + appApi + "/page" + poName + "',\r\n" +
                        "        obj: {\r\n" +
                        "          po: data.searchForm,\r\n" +
                        "          pageNumber: data.current,\r\n" +
                        "          pageSize: 10,\r\n" +
                        "        }\r\n" +
                        "      });\r\n" +
                        "      const payload = {\r\n" +
                        "        searchForm: data.searchForm,\r\n" +
                        "        tableData: dataRes.data.records,\r\n" +
                        "        total: dataRes.data.total,\r\n" +
                        "        current: data.current,\r\n" +
                        "        loadingVisible: false,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    async save(data) {\r\n" +
                        "      const dataRes = await initService.runCustomMethod({\r\n" +
                        "        url: '/" + appApi + "/save" + poName + "',\r\n" +
                        "        obj: {\r\n" +
                        "          po: data.formData,\r\n" +
                        "          user: data.user,\r\n" +
                        "        }\r\n" +
                        "      });\r\n" +
                        "      if (dataRes.code === 400) {\r\n" +
                        "        Message.error(dataRes.data.defaultMessage);\r\n" +
                        "      } else {\r\n" +
                        "        Message.success('保存成功');\r\n" +
                        "        await this.page({\r\n" +
                        "          searchForm: data.searchForm,\r\n" +
                        "          current: data.current,\r\n" +
                        "        });\r\n" +
                        "        const payload = {\r\n" +
                        "          visible: false,\r\n" +
                        "        };\r\n" +
                        "        dispatch." + poName + ".setState(payload);\r\n" +
                        "      }\r\n" +
                        "    },\r\n" +
                        "    async remove(data) {\r\n" +
                        "      const dataRes = await initService.runCustomMethod({\r\n" +
                        "        url: '/" + appApi + "/delete" + poName + "',\r\n" +
                        "        obj: {\r\n" +
                        "          po: data.record,\r\n" +
                        "        }\r\n" +
                        "      });\r\n" +
                        "      if (dataRes.code === 400) {\r\n" +
                        "        Message.error('删除失败');\r\n" +
                        "      } else {\r\n" +
                        "        Message.success('删除成功');\r\n" +
                        "        await this.page({\r\n" +
                        "          searchForm: data.searchForm,\r\n" +
                        "          current: data.current,\r\n" +
                        "        });\r\n" +
                        "        const payload = {\r\n" +
                        "          visible: false,\r\n" +
                        "        };\r\n" +
                        "        dispatch." + poName + ".setState(payload);\r\n" +
                        "      }\r\n" +
                        "    },\r\n" +
                        "    add() {\r\n" +
                        "      const payload = {\r\n" +
                        "        formData: {},\r\n" +
                        "        title: '添加',\r\n" +
                        "        visible: true,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    edit(data) {\r\n" +
                        "      const payload = {\r\n" +
                        "        formData: data,\r\n" +
                        "        title: '编辑',\r\n" +
                        "        visible: true,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    setDataForm(data) {\r\n" +
                        "      const payload = {\r\n" +
                        "        formData: data,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    setSearchDataForm(data) {\r\n" +
                        "      const payload = {\r\n" +
                        "        searchForm: data,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    async findDataTableAndFormByName() {\r\n" +
                        "      const ret = await initService.findDataTableAndFormByName('" + persistentCode + "');\r\n" +
                        "      await this.page({\r\n" +
                        "        searchForm: ret.data.dataTable.INFO,\r\n" +
                        "        current: 1,\r\n" +
                        "      });\r\n" +
                        "      const payload = {\r\n" +
                        "        searchDefaultForm: ret.data.dataTable.INFO,\r\n" +
                        "        titleConfig: ret.data.dataTable.TITLE,\r\n" +
                        "        tableOperation: ret.data.dataTable.OPERATION,\r\n" +
                        "        tableConfig: ret.data.dataTable.CONFIG,\r\n" +
                        "        tableSearch: ret.data.dataTable.SEARCH,\r\n" +
                        "        formConfig: ret.data.dataForm.CONFIG,\r\n" +
                        "      };\r\n" +
                        "      dispatch." + poName + ".setState(payload);\r\n" +
                        "    },\r\n" +
                        "    runCustomMethod(data) {\r\n" +
                        "      initService.runCustomMethod(data).then((res) => {\r\n" +
                        "        if (res.code === 200) {\r\n" +
                        "          Message.success('执行成功');\r\n" +
                        "        } else {\r\n" +
                        "          Message.error('执行失败');\r\n" +
                        "        }\r\n" +
                        "      });\r\n" +
                        "    },\r\n" +
                        "  }),\r\n" +
                        "};\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

    private void createEntityCodeHandler(Map<String, String[]> entityObj, Map<String, String[]> entityCustomObj) {
        try {
            for (Map.Entry<String, String[]> entry : entityObj.entrySet()) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                if (key.contains("mapper")) {
                    BeanUtils.createJavaFile(key, value, false);
                } else {
                    BeanUtils.createJavaFile(key, value);
                }

            }
            for (Map.Entry<String, String[]> entry : entityCustomObj.entrySet()) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                BeanUtils.createJavaFile(key, value, false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteEntityCodeHandler(Map<String, String> entityObj, Map<String, String> entityCustomObj) {
        for (Map.Entry<String, String> entry : entityObj.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            BeanUtils.deleteJavaFile(key, value);
        }
        for (Map.Entry<String, String> entry : entityCustomObj.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            BeanUtils.deleteJavaFile(key, value);
        }
    }

    public String[] poGenerate(PersistentBean persistent, List<PropertyBean> propertyList,
                               String poName, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.cyjcommon.entity.").append(isBeanFlag ? "bean" : "relation").append(";\r\n");
        sb.append("\r\n");
        sb.append("import com.baomidou.mybatisplus.annotation.IdType;\r\n");
        sb.append("import com.baomidou.mybatisplus.annotation.TableField;\r\n");
        sb.append("import com.baomidou.mybatisplus.annotation.TableId;\r\n");
        sb.append("import com.baomidou.mybatisplus.annotation.TableName;\r\n");
        sb.append("import com.baomidou.mybatisplus.extension.activerecord.Model;\r\n");
        sb.append("import lombok.Data;\r\n");
        sb.append("import lombok.EqualsAndHashCode;\r\n");
        sb.append("\r\n");
        sb.append("import java.time.LocalDateTime;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@EqualsAndHashCode(callSuper = true)\r\n");
        sb.append("@Data\r\n");
        sb.append("@TableName(\"t_").append(persistent.getPersistentCode()).append("\")\r\n");
        sb.append("public class ").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(" extends Model<").append(poName).append(isBeanFlag ? "Bean" : "Relation").append("> {\r\n");
        sb.append("\r\n");
        sb.append("    @TableId(value = \"id\", type = IdType.ASSIGN_UUID)\r\n");
        sb.append("    private String id;\r\n");
        sb.append("\r\n");
        for (PropertyBean property : propertyList) {
            sb.append("    @TableField(\"").append(property.getPropertyCode()).append("\")\r\n");
            if ("boolean".equals(property.getPropertyType())) {
                sb.append("    private int ").append(BeanUtils.underline2Camel(property.getPropertyCode())).append(";\r\n");
            } else {
                sb.append("    private ").append(property.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(property.getPropertyCode())).append(";\r\n");
            }
            sb.append("\r\n");
        }
        if (isBeanFlag) {
            sb.append("    @TableField(\"status\")\r\n");
            sb.append("    private int status;\r\n");
            sb.append("\r\n");
            sb.append("    @TableField(\"sort_code\")\r\n");
            sb.append("    private long sortCode;\r\n");
            sb.append("\r\n");
        }
        sb.append("    @TableField(\"created_date\")\r\n");
        sb.append("    private LocalDateTime createdDate;\r\n");
        sb.append("\r\n");
        sb.append("    @TableField(\"created_by\")\r\n");
        sb.append("    private String createdBy;\r\n");
        sb.append("\r\n");
        sb.append("    @TableField(\"updated_date\")\r\n");
        sb.append("    private LocalDateTime updatedDate;\r\n");
        sb.append("\r\n");
        sb.append("    @TableField(\"updated_by\")\r\n");
        sb.append("    private String updatedBy;\r\n");
        sb.append("\r\n");
        sb.append("}");
        String entityData = sb.toString();
        return new String[]{entityData, poName + (isBeanFlag ? "Bean" : "Relation") + ".java"};
    }

    public String[] mapperGenerate(String poName, boolean isBeanFlag) {
        String entityMapperData = "package com.example.cyjcommon.mapper." + (isBeanFlag ? "bean" : "relation") + ";\r\n" +
                "\r\n" +
                "import com.baomidou.mybatisplus.core.mapper.BaseMapper;\r\n" +
                "import com.example.cyjcommon.entity." + (isBeanFlag ? "bean" : "relation") + "." + poName + (isBeanFlag ? "Bean" : "Relation") + ";\r\n" +
                "import org.apache.ibatis.annotations.Mapper;\r\n" +
                "\r\n" +
                "/**\r\n" +
                " * @author Noice\r\n" +
                " */\r\n" +
                "@Mapper\r\n" +
                "public interface " + poName + "Mapper extends BaseMapper<" + poName + (isBeanFlag ? "Bean" : "Relation") + "> {\r\n" +
                "\r\n" +
                "}";
        return new String[]{entityMapperData, poName + "Mapper.java"};
    }

    public String[] serviceGenerate(List<PropertyBean> propertyList, String poName, String appPath, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service." + (isBeanFlag ? "bean" : "relation") + ".auto;\r\n";
        List<PropertyBean> relationPropertyList = propertyList.stream()
                .filter(property -> property.getPropertyRelation() == 1).collect(Collectors.toList());
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;\r\n");
        if (isBeanFlag) {
            sb.append("import com.baomidou.mybatisplus.extension.plugins.pagination.Page;\r\n");
        }
        sb.append("import com.baomidou.mybatisplus.extension.service.IService;\r\n");
        sb.append("import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;\r\n");
        sb.append("import com.example.cyjcommon.entity.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(";\r\n");
        sb.append("import com.example.cyjcommon.mapper.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append("Mapper;\r\n");
        sb.append("import org.apache.commons.lang3.StringUtils;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        if (!isBeanFlag) {
            sb.append("import java.util.List;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Service\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("ServiceImpl\r\n");
        sb.append("        extends ServiceImpl<").append(poName).append("Mapper, ").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(">\r\n");
        sb.append("        implements IService<").append(poName).append(isBeanFlag ? "Bean" : "Relation").append("> {\r\n");
        sb.append("\r\n");
        if (isBeanFlag) {
            sb.append("    public ").append(poName).append("Bean addOne(").append(poName).append("Bean po) {\r\n");
            sb.append("        po.insert();\r\n");
            sb.append("        return po;\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    public void deleteOne(").append(poName).append("Bean po) {\r\n");
            sb.append("        po.deleteById();\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    public ").append(poName).append("Bean updateOne(").append(poName).append("Bean po) {\r\n");
            sb.append("        po.updateById();\r\n");
            sb.append("        return po;\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    public Page<").append(poName).append("Bean> findAll(").append(poName).append("Bean po, Integer pageNumber, Integer pageSize) {\r\n");
            sb.append("        Page<").append(poName).append("Bean> page = new Page<>(pageNumber, pageSize);\r\n");
            sb.append("        LambdaQueryWrapper<").append(poName).append("Bean> queryWrapper = searchHandler(po);\r\n");
            sb.append("        return new ").append(poName).append("Bean().selectPage(page, queryWrapper);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    private LambdaQueryWrapper<").append(poName).append("Bean> searchHandler(").append(poName).append("Bean po) {\r\n");
            sb.append("        return new LambdaQueryWrapper<").append(poName).append("Bean>()\r\n");
            for (PropertyBean property : relationPropertyList) {
                String propertyCode = property.getPropertyCode();
                //驼峰名
                String underPropertyName = BeanUtils.underline2Camel(propertyCode);
                //文件名
                String propertyName = BeanUtils.captureName(underPropertyName);
                sb.append("                .eq(StringUtils.isNotEmpty(po.get").append(propertyName).append("()),\r\n");
                sb.append("                        ").append(poName).append("Bean::get").append(propertyName).append(", po.get").append(propertyName).append("())\r\n");
            }
            sb.append("                .like(StringUtils.isNotEmpty(po.get").append(poName).append("Name()),\r\n");
            sb.append("                        ").append(poName).append("Bean::get").append(poName).append("Name, po.get").append(poName).append("Name())\r\n");
            sb.append("                .like(StringUtils.isNotEmpty(po.get").append(poName).append("Code()),\r\n");
            sb.append("                        ").append(poName).append("Bean::get").append(poName).append("Code, po.get").append(poName).append("Code())\r\n");
            sb.append("                .eq(").append(poName).append("Bean::getStatus, po.getStatus())\r\n");
            sb.append("                .orderByAsc(").append(poName).append("Bean::getSortCode);\r\n");
            sb.append("    }\r\n");
        } else {
            sb.append("    public List<").append(poName).append("Relation").append("> get").append(poName).append("(").append(poName).append("Relation").append(" po) {\r\n");
            sb.append("        return new ").append(poName).append("Relation").append("().selectList(new LambdaQueryWrapper<").append(poName).append("Relation").append(">()\r\n");
            for (PropertyBean property : relationPropertyList) {
                String propertyCode = property.getPropertyCode();
                //驼峰名
                String underPropertyName = BeanUtils.underline2Camel(propertyCode);
                //文件名
                String propertyName = BeanUtils.captureName(underPropertyName);
                sb.append("                .eq(StringUtils.isNotEmpty(po.get").append(propertyName).append("()),\r\n");
                sb.append("                        ").append(poName).append("Relation").append("::get").append(propertyName).append(", po.get").append(propertyName).append("())\r\n");
            }
            sb.append("        );\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    public void set").append(poName).append("(").append(poName).append("Relation").append(" po, List<").append(poName).append("Relation").append("> new").append(poName).append("List) {\r\n");
            sb.append("        List<").append(poName).append("Relation").append("> old").append(poName).append("List = get").append(poName).append("(po);\r\n");
            sb.append("        for (").append(poName).append("Relation").append(" old").append(poName).append(" : old").append(poName).append("List) {\r\n");
            sb.append("            old").append(poName).append(".deleteById();\r\n");
            sb.append("        }\r\n");
            sb.append("        for (").append(poName).append("Relation").append(" new").append(poName).append(" : new").append(poName).append("List) {\r\n");
            sb.append("            new").append(poName).append(".insert();\r\n");
            sb.append("        }\r\n");
            sb.append("    }\r\n");
        }
        sb.append("\r\n");
        sb.append("}");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "ServiceImpl.java"};
    }

    public String[] controllerGenerate(String poName, String appPath, String appApi, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //serviceImpl路径
        String poServicePath = packetPath + ".service." + (isBeanFlag ? "bean" : "relation") + ".auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller." + (isBeanFlag ? "bean" : "relation") + ".auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        if (isBeanFlag) {
            sb.append("import com.example.cyjcommon.entity.vo.PageBeanVo;\r\n");
        }
        sb.append("import com.example.cyjcommon.entity.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(";\r\n");
        if (!isBeanFlag) {
            sb.append("import com.example.cyjcommon.entity.vo.PageRelationVo;\r\n");
        }
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("ServiceImpl;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@CrossOrigin\r\n");
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping(\"").append(appApi).append("\")\r\n");
        sb.append("@Tag(name = \"").append(poName).append("Bean\")\r\n");
        sb.append("public class ").append(poName).append("Controller {\r\n");
        sb.append("\r\n");
        sb.append("    private ").append(poName).append("ServiceImpl service;\r\n");
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void setService(").append(poName).append("ServiceImpl service) {\r\n");
        sb.append("        this.service = service;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        if (isBeanFlag) {
            sb.append("    @Operation(summary = \"分页查询所有").append(poName).append("\")\r\n");
            sb.append("    @PostMapping(value = \"page").append(poName).append("\")\r\n");
            sb.append("    public ResultVO page(@RequestBody PageBeanVo<").append(poName).append("Bean> vo) {\r\n");
            sb.append("        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Operation(summary = \"保存").append(poName).append("\")\r\n");
            sb.append("    @PostMapping(value = \"save").append(poName).append("\")\r\n");
            sb.append("    public ResultVO save(@RequestBody PageBeanVo<").append(poName).append("Bean> vo) {\r\n");
            sb.append("        vo.po.setUpdatedBy(vo.user);\r\n");
            sb.append("        if (vo.po.getId() == null) {\r\n");
            sb.append("            vo.po.setCreatedBy(vo.user);\r\n");
            sb.append("            return ResultVO.success(service.addOne(vo.po));\r\n");
            sb.append("        }\r\n");
            sb.append("        return ResultVO.success(service.updateOne(vo.po));\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
            sb.append("    @PostMapping(value = \"delete").append(poName).append("\")\r\n");
            sb.append("    public ResultVO delete(@RequestBody PageBeanVo<").append(poName).append("Bean> vo) {\r\n");
            sb.append("        if (vo.po.getId() == null) {\r\n");
            sb.append("            return ResultVO.failure();\r\n");
            sb.append("        }\r\n");
            sb.append("        service.deleteOne(vo.po);\r\n");
        } else {
            sb.append("    @Operation(summary = \"查询").append(poName).append("关联关系\")\r\n");
            sb.append("    @PostMapping(\"get").append(poName).append("\")\r\n");
            sb.append("    public ResultVO get").append(poName).append("(@RequestBody ").append(poName).append("Relation").append(" po) {\r\n");
            sb.append("        return ResultVO.success(service.get").append(poName).append("(po));\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Operation(summary = \"保存").append(poName).append("关联关系\")\r\n");
            sb.append("    @PostMapping(\"set").append(poName).append("\")\r\n");
            sb.append("    public ResultVO set").append(poName).append("(@RequestBody PageRelationVo<").append(poName).append("Relation> vo) {\r\n");
            sb.append("        service.set").append(poName).append("(vo.po, vo.poList);\r\n");
        }
        sb.append("        return ResultVO.success();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "Controller.java"};
    }

    private String[] controllerCustomGenerate(String poName, String appPath, String appApi, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller." + (isBeanFlag ? "bean" : "relation") + ".custom;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@CrossOrigin\r\n");
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping(\"").append(appApi).append("\")\r\n");
        sb.append("@Tag(name = \"").append(poName).append("Bean\")\r\n");
        sb.append("public class ").append(poName).append("CustomController {\r\n");
        sb.append("}");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "CustomController.java"};
    }

    private String[] serviceCustomGenerate(String poName, String appPath, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service." + (isBeanFlag ? "bean" : "relation") + ".custom;\r\n";
        //service路径
        String aspectServicePath = packetPath + ".service." + (isBeanFlag ? "bean" : "relation") + ".auto.";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("import com.baomidou.mybatisplus.extension.service.IService;\r\n");
        sb.append("import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;\r\n");
        sb.append("import com.example.cyjcommon.entity.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(";\r\n");
        sb.append("import com.example.cyjcommon.mapper.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append("Mapper;\r\n");
        sb.append("import org.aspectj.lang.JoinPoint;\r\n");
        sb.append("import org.aspectj.lang.annotation.After;\r\n");
        sb.append("import org.aspectj.lang.annotation.Aspect;\r\n");
        sb.append("import org.aspectj.lang.annotation.Before;\r\n");
        sb.append("import org.slf4j.Logger;\r\n");
        sb.append("import org.slf4j.LoggerFactory;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Aspect\r\n");
        sb.append("@Service\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("CustomServiceImpl\r\n");
        sb.append("        extends ServiceImpl<").append(poName).append("Mapper, ").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(">\r\n");
        sb.append("        implements IService<").append(poName).append(isBeanFlag ? "Bean" : "Relation").append("> {\r\n");
        sb.append("\r\n");
        sb.append("    private static final Logger logger = LoggerFactory.getLogger(").append(poName).append("CustomServiceImpl.class);\r\n");
        sb.append("\r\n");
        if (isBeanFlag) {
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.addOne(..))\")\r\n");
            sb.append("    public void addOneBefore(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.addOne.Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.addOne(..))\")\r\n");
            sb.append("    public void addOneAfter(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.addOne.After:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.deleteOne(..))\")\r\n");
            sb.append("    public void deleteOneBefore(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.deleteOne.Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.deleteOne(..))\")\r\n");
            sb.append("    public void deleteOneAfter(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.deleteOne.After:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.updateOne(..))\")\r\n");
            sb.append("    public void updateOneBefore(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.updateOne.Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.updateOne(..))\")\r\n");
            sb.append("    public void updateOneAfter(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.updateOne.After:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.findAll(..))\")\r\n");
            sb.append("    public void findAllBefore(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.findAll.Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.findAll(..))\")\r\n");
            sb.append("    public void findAllAfter(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.findAll.After:{}\", joinPoint);\r\n");
        } else {
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.get").append(poName).append("(..))\")\r\n");
            sb.append("    public void get").append(poName).append("Before(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.get").append(poName).append(".Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.get").append(poName).append("(..))\")\r\n");
            sb.append("    public void get").append(poName).append("After(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.get").append(poName).append(".After:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Before(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.set").append(poName).append("(..))\")\r\n");
            sb.append("    public void set").append(poName).append("Before(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.set").append(poName).append(".Before:{}\", joinPoint);\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @After(value = \"execution(* ").append(aspectServicePath).append(poName).append("ServiceImpl.set").append(poName).append("(..))\")\r\n");
            sb.append("    public void set").append(poName).append("After(JoinPoint joinPoint) {\r\n");
            sb.append("        logger.info(\"").append(poName).append("Service.set").append(poName).append(".After:{}\", joinPoint);\r\n");
        }
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "CustomServiceImpl.java"};
    }

    public JSONObject findDataTableAndFormByName(String persistentCode) {
        PersistentBean persistent = new PersistentBean().selectOne(new LambdaQueryWrapper<PersistentBean>()
                .eq(PersistentBean::getPersistentCode, persistentCode));
        logger.info("findDataTableAndFormByName.persistent:{}", persistent);
        if (persistent == null) {
            return null;
        }
        List<PersistentFormBean> persistentFormBeanList = new PersistentFormBean()
                .selectList(new LambdaQueryWrapper<PersistentFormBean>()
                        .eq(PersistentFormBean::getPersistentId, persistent.getId())
                        .orderByAsc(PersistentFormBean::getSortCode));
        JSONObject persistentForm = new JSONObject();
        JSONArray configFormArr = new JSONArray();
        for (PersistentFormBean persistentFormBean : persistentFormBeanList) {
            List<PersistentFormConfigBean> persistentFormConfigBeanList = new PersistentFormConfigBean()
                    .selectList(new LambdaQueryWrapper<PersistentFormConfigBean>()
                            .eq(PersistentFormConfigBean::getPersistentFormId, persistentFormBean.getId())
                            .orderByAsc(PersistentFormConfigBean::getSortCode));
            for (PersistentFormConfigBean persistentFormConfigBean : persistentFormConfigBeanList) {
                JSONObject formConfig = new JSONObject();
                formConfig.put("id", persistentFormConfigBean.getId());
                formConfig.put("formMode", persistentFormConfigBean.getPersistentFormConfigMode());
                formConfig.put("formName", persistentFormConfigBean.getPersistentFormConfigName());
                formConfig.put("formCode", persistentFormConfigBean.getPersistentFormConfigCode());
                formConfig.put("formDefaultValve", persistentFormConfigBean.getPersistentFormConfigDefaultValue());
                formConfig.put("formColSpan", persistentFormConfigBean.getPersistentFormConfigColSpan());
                formConfig.put("formRequired", persistentFormConfigBean.getPersistentFormConfigRequired() == 1);
                formConfig.put("formDirection", persistentFormConfigBean.getPersistentFormConfigDirection());
                formConfig.put("formEdit", persistentFormConfigBean.getPersistentFormConfigEdit() == 1);
                if (StringUtils.isNotEmpty(persistentFormConfigBean.getPersistentFormConfigDataSource())) {
                    if ("YES_AND_NO".equals(persistentFormConfigBean.getPersistentFormConfigDataSource())) {
                        List<Map> yesAndNo = new ArrayList<>();
                        Map<String, Object> yes = new HashMap<>();
                        yes.put("label", "是");
                        yes.put("value", 1);
                        Map<String, Object> no = new HashMap<>();
                        no.put("label", "否");
                        no.put("value", 0);
                        yesAndNo.add(yes);
                        yesAndNo.add(no);
                        formConfig.put("formDataSource", yesAndNo);
                    } else {
                        SqlBean sqlBean = new SqlBean().selectOne(new LambdaQueryWrapper<SqlBean>()
                                .eq(SqlBean::getSqlCode, persistentFormConfigBean.getPersistentFormConfigDataSource()));
                        Map<String, String> sql = new HashMap<>();
                        sql.put("sql", sqlBean.getSqlStr());
                        List<Map> map = sqlMapper.executeSql(sql);
                        formConfig.put("formDataSource", map);
                    }
                }
                configFormArr.add(formConfig);
            }
        }
        JSONObject formStatusConfig = new JSONObject();
        formStatusConfig.put("id", "status_id");
        formStatusConfig.put("formMode", "Select");
        formStatusConfig.put("formName", "状态");
        formStatusConfig.put("formCode", "status");
        formStatusConfig.put("formDefaultValve", 1);
        formStatusConfig.put("formColSpan", 6);
        Map<String, Object> youXiaoMap = new HashMap<>();
        youXiaoMap.put("label", "有效");
        youXiaoMap.put("value", 1);
        Map<String, Object> wuXiaoMap = new HashMap<>();
        wuXiaoMap.put("label", "无效");
        wuXiaoMap.put("value", 0);
        List<Map> mapList = new ArrayList<>();
        mapList.add(youXiaoMap);
        mapList.add(wuXiaoMap);
        formStatusConfig.put("formDataSource", mapList);
        configFormArr.add(formStatusConfig);
        JSONObject formSortCodeConfig = new JSONObject();
        formSortCodeConfig.put("id", "sort_code_id");
        formSortCodeConfig.put("formMode", "NumberPicker");
        formSortCodeConfig.put("formName", "排序");
        formSortCodeConfig.put("formCode", "sortCode");
        formSortCodeConfig.put("formDefaultValve", 1);
        formSortCodeConfig.put("formColSpan", 6);
        configFormArr.add(formSortCodeConfig);
        persistentForm.put("CONFIG", configFormArr);
        List<PersistentTableBean> persistentTableBeanList = new PersistentTableBean()
                .selectList(new LambdaQueryWrapper<PersistentTableBean>()
                        .eq(PersistentTableBean::getPersistentId, persistent.getId())
                        .orderByAsc(PersistentTableBean::getSortCode));
        JSONObject persistentTable = new JSONObject();
        JSONObject searchForm = new JSONObject();
        JSONArray operationArr = new JSONArray();
        JSONArray titleArr = new JSONArray();
        JSONArray searchConfigArr = new JSONArray();
        JSONArray configTableArr = new JSONArray();
        for (PersistentTableBean persistentTableBean : persistentTableBeanList) {
            List<PersistentTableConfigBean> persistentTableConfigBeanList = new PersistentTableConfigBean()
                    .selectList(new LambdaQueryWrapper<PersistentTableConfigBean>()
                            .eq(PersistentTableConfigBean::getPersistentTableId, persistentTableBean.getId())
                            .eq(PersistentTableConfigBean::getPersistentTableConfigDisplay, 1)
                            .orderByAsc(PersistentTableConfigBean::getSortCode));
            List<PersistentTableConfigBean> persistentTableConfigBeanColumnList = persistentTableConfigBeanList
                    .stream().filter(persistentTableConfigBean ->
                            "column".equals(persistentTableConfigBean.getPersistentTableConfigType()))
                    .collect(Collectors.toList());
            configTableArr.addAll(persistentTableConfigBeanColumnList);
            List<PersistentTableConfigBean> persistentTableConfigBeanOperationList = persistentTableConfigBeanList
                    .stream().filter(persistentTableConfigBean ->
                            "operation".equals(persistentTableConfigBean.getPersistentTableConfigType()))
                    .collect(Collectors.toList());
            operationArr.addAll(persistentTableConfigBeanOperationList);
            List<PersistentTableConfigBean> persistentTableConfigBeanTitleList = persistentTableConfigBeanList
                    .stream().filter(persistentTableConfigBean ->
                            "title".equals(persistentTableConfigBean.getPersistentTableConfigType()))
                    .collect(Collectors.toList());
            titleArr.addAll(persistentTableConfigBeanTitleList);
            List<PersistentTableSearchConfigBean> persistentTableSearchConfigBeanList = new PersistentTableSearchConfigBean()
                    .selectList(new LambdaQueryWrapper<PersistentTableSearchConfigBean>()
                            .eq(PersistentTableSearchConfigBean::getPersistentTableId, persistentTableBean.getId())
                            .orderByAsc(PersistentTableSearchConfigBean::getSortCode));
            for (PersistentTableSearchConfigBean persistentTableSearchConfigBean : persistentTableSearchConfigBeanList) {
                JSONObject searchConfig = new JSONObject();
                searchForm.put(persistentTableSearchConfigBean.getPersistentTableSearchConfigCode(), "");
                searchConfig.put("id", persistentTableSearchConfigBean.getId());
                searchConfig.put("searchMode", persistentTableSearchConfigBean.getPersistentTableSearchConfigMode());
                searchConfig.put("searchName", persistentTableSearchConfigBean.getPersistentTableSearchConfigName());
                searchConfig.put("searchCode", persistentTableSearchConfigBean.getPersistentTableSearchConfigCode());
                searchConfig.put("searchDefaultValve", persistentTableSearchConfigBean.getPersistentTableSearchConfigDefaultValue());
                if (StringUtils.isNotEmpty(persistentTableSearchConfigBean.getPersistentTableSearchConfigDataSource())) {
                    SqlBean sqlBean = new SqlBean().selectOne(new LambdaQueryWrapper<SqlBean>()
                            .eq(SqlBean::getSqlCode, persistentTableSearchConfigBean.getPersistentTableSearchConfigDataSource()));
                    Map<String, String> sql = new HashMap<>();
                    sql.put("sql", sqlBean.getSqlStr());
                    List<Map> map = sqlMapper.executeSql(sql);
                    searchConfig.put("searchDataSource", map);
                    logger.info("searchDataSource:{}", map);
                }
                searchConfigArr.add(searchConfig);
            }
        }
        searchForm.put("status", 1);
        JSONObject searchStatusConfig = new JSONObject();
        searchStatusConfig.put("id", "status_id");
        searchStatusConfig.put("searchMode", "Select");
        searchStatusConfig.put("searchName", "状态");
        searchStatusConfig.put("searchCode", "status");
        searchStatusConfig.put("searchDefaultValve", 1);
        searchStatusConfig.put("searchDataSource", mapList);
        searchConfigArr.add(searchStatusConfig);
        persistentTable.put("TITLE", titleArr);
        persistentTable.put("OPERATION", operationArr);
        persistentTable.put("SEARCH", searchConfigArr);
        persistentTable.put("CONFIG", configTableArr);
        persistentTable.put("INFO", searchForm);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataForm", persistentForm);
        jsonObject.put("dataTable", persistentTable);
        return jsonObject;
    }

    private static final Logger logger = LoggerFactory.getLogger(PersistentCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("PersistentService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("PersistentService.findAllAfter:{}", joinPoint);
    }

}
