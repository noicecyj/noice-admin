package com.example.cyjentitycreater.service.bean.custom;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.contants.Constant;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.entity.bean.PropertyBean;
import com.example.cyjcommon.entity.bean.SqlBean;
import com.example.cyjcommon.mapper.bean.PersistentMapper;
import com.example.cyjcommon.utils.BeanUtils;
import com.example.cyjdictionary.service.bean.custom.DictionaryCustomServiceImpl;
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
    private final static String AUTO = "auto";

    private final static String commonPath = "C:/Users/noice/IdeaProjects/noice-admin/cyj-common/src/main/java/com/example/cyjcommon";
    private DictionaryCustomServiceImpl dictionaryCustomServiceImpl;
//    private SqlCustomServiceImpl sqlCustomServiceImpl;


    @Autowired
    public void setDictionaryCustomService(DictionaryCustomServiceImpl dictionaryCustomServiceImpl) {
        this.dictionaryCustomServiceImpl = dictionaryCustomServiceImpl;
    }

//    @Autowired
//    public void setSqlCustomService(SqlCustomServiceImpl sqlCustomServiceImpl) {
//        this.sqlCustomServiceImpl = sqlCustomServiceImpl;
//    }

    public void generateJavaFile(PersistentBean persistent) {
        if (persistent == null) {
            return;
        }
        entityHandler(persistent, "create");
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
        boolean delete1 = new AuthorityBean().delete(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getPersistentId, persistent.getId()));
        logger.info("delete.authority:{}", delete1);
        if (isBeanFlag) {
            count++;
            AuthorityBean findAll = new AuthorityBean();
            findAll.setAuthorityCode("page" + poName);
            findAll.setAuthorityName("查询" + poName);
            findAll.setAuthorityMethod(POST);
            findAll.setAuthorityPath(appServiceBean.getAppServiceApi() + "/page" + poName);
            findAll.setAuthorityType(Constant.SELECT);
            findAll.setPersistentId(persistent.getId());
            findAll.setAppServiceId(appServiceBean.getId());
            findAll.setSortCode(count);
            findAll.setStatus(Constant.STATUS);
            findAll.insert();
            count++;
            AuthorityBean save = new AuthorityBean();
            save.setAuthorityCode("save" + poName);
            save.setAuthorityName("保存" + poName);
            save.setAuthorityMethod(POST);
            save.setAuthorityPath(appServiceBean.getAppServiceApi() + "/save" + poName);
            save.setAuthorityType(Constant.SAVE);
            save.setPersistentId(persistent.getId());
            save.setAppServiceId(appServiceBean.getId());
            save.setSortCode(count);
            save.setStatus(Constant.STATUS);
            save.insert();
            count++;
            AuthorityBean delete = new AuthorityBean();
            delete.setAuthorityCode("delete" + poName);
            delete.setAuthorityName("删除" + poName);
            delete.setAuthorityMethod(POST);
            delete.setAuthorityPath(appServiceBean.getAppServiceApi() + "/delete" + poName);
            delete.setAuthorityType(Constant.DELETE);
            delete.setPersistentId(persistent.getId());
            delete.setAppServiceId(appServiceBean.getId());
            delete.setSortCode(count);
            delete.setStatus(Constant.STATUS);
            delete.insert();
        } else {
            count++;
            AuthorityBean set = new AuthorityBean();
            set.setAuthorityCode("get" + poName);
            set.setAuthorityName("查询" + poName + "关联关系");
            set.setAuthorityMethod(POST);
            set.setAuthorityPath(appServiceBean.getAppServiceApi() + "/get" + poName);
            set.setAuthorityType(Constant.GET);
            set.setPersistentId(persistent.getId());
            set.setAppServiceId(appServiceBean.getId());
            set.setSortCode(count);
            set.setStatus(Constant.STATUS);
            set.insert();
            count++;
            AuthorityBean get = new AuthorityBean();
            get.setAuthorityCode("set" + poName);
            get.setAuthorityName("保存" + poName + "关联关系");
            get.setAuthorityMethod(POST);
            get.setAuthorityPath(appServiceBean.getAppServiceApi() + "/set" + poName);
            get.setAuthorityType(Constant.SET);
            get.setPersistentId(persistent.getId());
            get.setAppServiceId(appServiceBean.getId());
            get.setSortCode(count);
            get.setStatus(Constant.STATUS);
            get.insert();
        }

    }

    public void entityHandler(PersistentBean persistent, String handlerType) {
        switch (handlerType) {
            case "create":
                createEntityHandler(persistent);
                authorityHandler(persistent);
                sqlHandler(persistent);
                break;
            case "delete":
//                deleteEntityHandler(persistent);
//                authorityDeleteHandler(persistent);
//                sqlDeleteHandler(persistent);
                break;
            default:
                logger.info("wtf!");
        }
    }

//    private void sqlDeleteHandler(Persistent persistent) {
//        String dataSourceType = "DATABASE_" + persistent.getPersistentCode().toUpperCase() + "_TYPE";
//        Sql sql = new Sql().selectOne(new LambdaQueryWrapper<Sql>().eq(Sql::getSqlDescription, dataSourceType));
//        if (sql != null) {
//            sql.deleteById();
//        }
//    }

    private void authorityDeleteHandler(PersistentBean persistent) {
        AppServiceBean appServiceBean = new AppServiceBean().selectById(persistent.getAppServiceId());
        List<PropertyBean> propertyList = new PropertyBean().selectList(new LambdaQueryWrapper<PropertyBean>()
                .eq(PropertyBean::getPersistentId, persistent.getId()));
//        List<Property> outPropertyList = propertyList.stream().filter(property -> BeanUtils.YES.equals(property.getPropertyOut())).collect(Collectors.toList());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AuthorityBean findAll = new AuthorityBean().selectOne(new LambdaQueryWrapper<AuthorityBean>()
                .eq(AuthorityBean::getAuthorityPath, appServiceBean.getAppServiceApi() + "/page" + poName));
        if (findAll != null) {
            findAll.deleteById();
        }
//        for (Property property : outPropertyList) {
//            String underPropertyPoName = BeanUtils.underline2Camel(property.getPropertyCode());
//            String propertyPoName = BeanUtils.captureName(underPropertyPoName);
//            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
//                oneToManyAuthorityDeleteHandler(appServiceBean, poName, propertyPoName);
//            }
//            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
//                manyToManyAuthorityDeleteHandler(appServiceBean, poName, propertyPoName);
//            }
//        }
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
        entityObj.put(componentPath + poName + "/services/auto", poName + ".tsx");
        entityObj.put(componentPath + poName + "/models/auto", poName + ".tsx");
        entityObj.put(componentPath + poName + "/view/auto", poName + ".tsx");
        BeanUtils.deleteJavaFile(componentPath + poName, "index.tsx");
        BeanUtils.deleteJavaFile(componentPath + poName, "store.ts");
        Map<String, String> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service/custom", poName + "CustomService.java");
        entityCustomObj.put(appPath + "/controller/custom", poName + "CustomController.java");
        entityCustomObj.put(componentPath + poName + "/services/custom", poName + ".tsx");
        entityCustomObj.put(componentPath + poName + "/models/custom", poName + ".tsx");
        entityCustomObj.put(componentPath + poName + "/view/custom", poName + ".tsx");
        deleteEntityCodeHandler(entityObj, entityCustomObj);
        BeanUtils.deleteJavaFile(componentPath + poName);
    }

    private void sqlHandler(PersistentBean persistent) {
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        String dataSourceType = "DATABASE_" + persistent.getPersistentCode().toUpperCase() + "_TYPE";
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
        entityObj.put(commonPath + "/entity" + (isBeanFlag ? "/bean" : "/relation"),
                poGenerate(persistent, propertyList, poName, isBeanFlag));
        entityObj.put(commonPath + "/mapper" + (isBeanFlag ? "/bean" : "/relation"),
                mapperGenerate(poName, isBeanFlag));
        entityObj.put(appPath + "/service" + (isBeanFlag ? "/bean" : "/relation") + "/auto",
                serviceGenerate(propertyList, poName, appPath, isBeanFlag));
        entityObj.put(appPath + "/controller" + (isBeanFlag ? "/bean" : "/relation") + "/auto",
                controllerGenerate(propertyList, poName, appPath, appApi, isBeanFlag));
//        entityObj.put(componentPath + poName + "/services/auto", servicesAutoGenerate(outPropertyList, appApi, poName));
//        entityObj.put(componentPath + poName + "/models/auto", modelsAutoGenerate(outPropertyList, underPoName, poName, persistentCode));
//        entityObj.put(componentPath + poName + "/view/auto", viewAutoGenerate(outPropertyList, underPoName, poName));
//        try {
//            BeanUtils.createJavaFile(componentPath + poName, indexGenerate(poName));
//            BeanUtils.createJavaFile(componentPath + poName, storeGenerate(outPropertyList, underPoName, poName));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Map<String, String[]> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service" + (isBeanFlag ? "/bean" : "/relation") + "/custom",
                serviceCustomGenerate(poName, appPath, isBeanFlag));
        entityCustomObj.put(appPath + "/controller" + (isBeanFlag ? "/bean" : "/relation") + "/custom",
                controllerCustomGenerate(poName, appPath, appApi, isBeanFlag));
//        entityCustomObj.put(componentPath + poName + "/services/custom", servicesCustomGenerate(poName));
//        entityCustomObj.put(componentPath + poName + "/models/custom", modelsCustomGenerate(poName));
//        entityCustomObj.put(componentPath + poName + "/view/custom", viewCustomGenerate(poName));
        createEntityCodeHandler(entityObj, entityCustomObj);
    }

//    private String[] servicesAutoGenerate(List<Property> outPropertyList, String appApi, String poName) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("import {request} from 'ice';\r\n");
//        sb.append("\r\n");
//        sb.append("export default {\r\n");
//        sb.append("  page(pageNumber) {\r\n");
//        sb.append("    return request({\r\n");
//        sb.append("      url: '/").append(appApi).append("/page").append(poName).append("',\r\n");
//        sb.append("      method: 'post',\r\n");
//        sb.append("      params: {\r\n");
//        sb.append("        pageNumber,\r\n");
//        sb.append("      },\r\n");
//        sb.append("    });\r\n");
//        sb.append("  },\r\n");
//        sb.append("  save(data) {\r\n");
//        sb.append("    return request({\r\n");
//        sb.append("      url: '/").append(appApi).append("/save").append(poName).append("',\r\n");
//        sb.append("      method: 'post',\r\n");
//        sb.append("      data,\r\n");
//        sb.append("    });\r\n");
//        sb.append("  },\r\n");
//        sb.append("  delete(data) {\r\n");
//        sb.append("    return request({\r\n");
//        sb.append("      url: '/").append(appApi).append("/delete").append(poName).append("',\r\n");
//        sb.append("      method: 'post',\r\n");
//        sb.append("      data,\r\n");
//        sb.append("    });\r\n");
//        sb.append("  },\r\n");
////        oneToManyServiceHandler(outPropertyList, sb, appApi, poName);
////        manyToManyServiceHandler(outPropertyList, sb, appApi, poName);
//        sb.append("};\r\n");
//        String viewData = sb.toString();
//        return new String[]{viewData, poName + ".tsx"};
//    }

//    private void oneToManyServiceHandler(List<Property> outPropertyList, StringBuilder sb, String appApi, String poName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                String propertyOut = BeanUtils.captureName(underPropertyOut);
//                sb.append("  page").append(propertyOut).append("By").append(poName).append("(pageNumber, id) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/page").append(propertyOut).append("By").append(poName).append("',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        pageNumber,\r\n");
//                sb.append("        id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//            }
//        }
//    }

//    private void manyToManyServiceHandler(List<Property> outPropertyList, StringBuilder sb, String appApi, String poName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                sb.append("  ").append(underPropertyOut).append("By").append(poName).append("(id) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underPropertyOut).append("By").append(poName).append("',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  ").append(underPropertyOut).append("Save").append(poName).append("(id, data) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underPropertyOut).append("Save").append(poName).append("',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("      data,\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//            }
//        }
//    }

    private String[] storeGenerate(List<PropertyBean> outPropertyList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import {createStore} from 'ice';\r\n");
        sb.append("import ").append(underPoName).append(" from './models/auto/").append(poName).append("';\r\n");
        sb.append("import ").append(underPoName).append("Custom from './models/custom/").append(poName).append("';\r\n");
        storeHandler(outPropertyList, sb);
        sb.append("\r\n");
        sb.append("const store = createStore({\r\n");
        sb.append("  ").append(underPoName).append(",\r\n");
        sb.append("  ").append(underPoName).append("Custom,\r\n");
        storeHandler1(outPropertyList, sb);
        sb.append("});\r\n");
        sb.append("\r\n");
        sb.append("export default store;\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, "store.ts"};
    }

    private void storeHandler1(List<PropertyBean> outPropertyList, StringBuilder sb) {
        for (PropertyBean property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            sb.append("  ").append(underPropertyOut).append(",\r\n");
        }
    }

    private void storeHandler(List<PropertyBean> outPropertyList, StringBuilder sb) {
        for (PropertyBean property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("import ").append(underPropertyOut).append(" from '@/pages/").append(propertyOut).append("/models/auto/").append(propertyOut).append("';\r\n");
        }
    }


    private String[] indexGenerate(String poName) {
        String viewData = "import React from 'react';\r\n" + "import " + poName + " from '@/pages/" + poName + "/view/auto/" + poName + "';\r\n" + "\r\n" + "function " + poName + "Page() {\r\n" + "  return (\r\n" + "    <div>\r\n" + "      <" + poName + "/>\r\n" + "    </div>\r\n" + "  );\r\n" + "}\r\n" + "\r\n" + "export default " + poName + "Page;\r\n";
        return new String[]{viewData, "index.tsx"};
    }

    private String[] modelsCustomGenerate(String poName) {
        String viewData = "export default {\r\n" + "\r\n" + "  namespace: 'custom" + poName + "',\r\n" + "\r\n" + "  state: {\r\n" + "    customMethodName1: null,\r\n" + "    customMethodName2: null,\r\n" + "    customMethodName3: null,\r\n" + "    customFrom: [],\r\n" + "  },\r\n" + "\r\n" + "  reducers: {\r\n" + "    setState(prevState, payload) {\r\n" + "      return {...prevState, ...payload};\r\n" + "    },\r\n" + "  },\r\n" + "  effects: () => ({\r\n" + "    customMethod1() {\r\n" + "    },\r\n" + "    customMethod2() {\r\n" + "    },\r\n" + "    customMethod3() {\r\n" + "    },\r\n" + "  }),\r\n" + "};\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

    private String[] servicesCustomGenerate(String poName) {
        String viewData = "\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

    private String[] viewCustomGenerate(String poName) {
        String viewData = "import React from \"react\";\r\n" + "\r\n" + "function CustomColumn(props) {\r\n" + "\r\n" + "  console.log(props)\r\n" + "\r\n" + "  return (\r\n" + "    <></>\r\n" + "  );\r\n" + "\r\n" + "}\r\n" + "\r\n" + "export {CustomColumn};\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

//    private String[] modelsAutoGenerate(List<Property> outPropertyList, String underPoName, String poName, String persistentCode) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("import initService from '@/services/init';\r\n");
//        sb.append("import {Message} from \"@alifd/next\";\r\n");
//        sb.append("import service from '@/pages/").append(poName).append("/services/auto/").append(poName).append("';\r\n");
//        oneToManyModelServiceHandler(outPropertyList, sb);
//        sb.append("\r\n");
//        sb.append("export default {\r\n");
//        sb.append("\r\n");
//        sb.append("  namespace: '").append(underPoName).append("',\r\n");
//        sb.append("\r\n");
//        sb.append("  state: {\r\n");
//        sb.append("    title: '添加',\r\n");
//        sb.append("    tableData: [],\r\n");
//        sb.append("    visible: false,\r\n");
//        sb.append("    formData: {},\r\n");
//        sb.append("    loadingVisible: true,\r\n");
//        sb.append("    total: 0,\r\n");
//        sb.append("    current: 1,\r\n");
//        sb.append("    form: [],\r\n");
//        sb.append("    table: [],\r\n");
//        sb.append("    customData: {},\r\n");
//        sb.append("    divVisible: false,\r\n");
//        sb.append("    parent: \"\",\r\n");
//        sb.append("    select: [],\r\n");
//        sb.append("  },\r\n");
//        sb.append("\r\n");
//        sb.append("  reducers: {\r\n");
//        sb.append("    setState(prevState, payload) {\r\n");
//        sb.append("      return {...prevState, ...payload};\r\n");
//        sb.append("    },\r\n");
//        sb.append("  },\r\n");
//        sb.append("\r\n");
//        sb.append("  effects: (dispatch) => ({\r\n");
//        sb.append("    async page(current) {\r\n");
//        sb.append("      const dataRes = await service.page(current);\r\n");
//        sb.append("      const payload = {\r\n");
//        sb.append("        tableData: dataRes.data.content,\r\n");
//        sb.append("        total: dataRes.data.totalElements,\r\n");
//        sb.append("        current,\r\n");
//        sb.append("        loadingVisible: false,\r\n");
//        sb.append("      };\r\n");
//        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("    },\r\n");
//        sb.append("    async save(data) {\r\n");
//        sb.append("      const ret = await service.save(data.formData);\r\n");
//        sb.append("      if (ret.code === 400) {\r\n");
//        sb.append("        Message.error(ret.data.defaultMessage);\r\n");
//        sb.append("      } else {\r\n");
//        sb.append("        Message.success('保存成功');\r\n");
//        sb.append("        await this.page(data.current);\r\n");
//        sb.append("        const payload = {\r\n");
//        sb.append("          visible: false,\r\n");
//        sb.append("        };\r\n");
//        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("      }\r\n");
//        sb.append("    },\r\n");
//        sb.append("    async delete(data) {\r\n");
//        sb.append("      const ret = await service.delete(data.record);\r\n");
//        sb.append("      if (ret.code === 400) {\r\n");
//        sb.append("        Message.error('删除失败');\r\n");
//        sb.append("      } else {\r\n");
//        sb.append("        Message.success('删除成功');\r\n");
//        sb.append("        await this.page(data.current);\r\n");
//        sb.append("        const payload = {\r\n");
//        sb.append("          visible: false,\r\n");
//        sb.append("        };\r\n");
//        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("      }\r\n");
//        sb.append("    },\r\n");
//        sb.append("    add() {\r\n");
//        sb.append("      const payload = {\r\n");
//        sb.append("        formData: {},\r\n");
//        sb.append("        title: '添加',\r\n");
//        sb.append("        visible: true,\r\n");
//        sb.append("      };\r\n");
//        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("    },\r\n");
//        sb.append("    edit(data) {\r\n");
//        sb.append("      const payload = {\r\n");
//        sb.append("        formData: data,\r\n");
//        sb.append("        title: '编辑',\r\n");
//        sb.append("        visible: true,\r\n");
//        sb.append("      };\r\n");
//        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("    },\r\n");
//        sb.append("    setDataForm(data) {\r\n");
//        sb.append("      const payload = {\r\n");
//        sb.append("        formData: data,\r\n");
//        sb.append("      };\r\n");
//        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("    },\r\n");
//        sb.append("    async findDataTableAndFormByName() {\r\n");
//        sb.append("      const ret = await initService.findDataTableAndFormByName('").append(persistentCode).append("');\r\n");
//        sb.append("      await this.page(1);\r\n");
//        sb.append("      const payload = {\r\n");
//        sb.append("        table: ret.data.dataTable,\r\n");
//        sb.append("        form: ret.data.dataForm,\r\n");
//        sb.append("        customData: ret.data.customData,\r\n");
//        sb.append("      };\r\n");
//        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
//        sb.append("    },\r\n");
//        oneToManyModelHandler(outPropertyList, sb, poName);
//        manyToManyModelHandler(outPropertyList, sb, poName);
//        sb.append("  }),\r\n");
//        sb.append("};\r\n");
//        String viewData = sb.toString();
//        return new String[]{viewData, poName + ".tsx"};
//    }

//    private void oneToManyModelServiceHandler(List<Property> outPropertyList, StringBuilder sb) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                String propertyOut = BeanUtils.captureName(underPropertyOut);
//                sb.append("import ").append(underPropertyOut).append("Service from '@/pages/").append(propertyOut).append("/services/auto/").append(propertyOut).append("'\r\n");
//            }
//        }
//    }
//
//    private void oneToManyModelHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                String propertyOut = BeanUtils.captureName(underPropertyOut);
//                sb.append("    async page").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
//                sb.append("      const ret = await initService.findDataTableAndFormByName('").append(property.getPropertyCode()).append("');\r\n");
//                sb.append("      const dataRes = await service.page").append(propertyOut).append("By").append(poName).append("(data.current, data.id);\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        table: ret.data.dataTable,\r\n");
//                sb.append("        form: ret.data.dataForm,\r\n");
//                sb.append("        customData: ret.data.customData,\r\n");
//                sb.append("        tableData: dataRes.data.content,\r\n");
//                sb.append("        total: dataRes.data.totalElements,\r\n");
//                sb.append("        current: data.current,\r\n");
//                sb.append("        loadingVisible: false,\r\n");
//                sb.append("        divVisible: true,\r\n");
//                sb.append("        parent: data.id,\r\n");
//                sb.append("        visible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async save").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
//                sb.append("      const ret = await ").append(underPropertyOut).append("Service.save(data.formData);\r\n");
//                sb.append("      if (ret.code === 400) {\r\n");
//                sb.append("        Message.error(ret.data.defaultMessage);\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        Message.success('保存成功');\r\n");
//                sb.append("        await this.page").append(propertyOut).append("By").append(poName).append("({\r\n");
//                sb.append("          current: data.current,\r\n");
//                sb.append("          id: data.id,\r\n");
//                sb.append("        });\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          visible: false,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async delete").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
//                sb.append("      const ret = await ").append(underPropertyOut).append("Service.delete(data.record);\r\n");
//                sb.append("      if (ret.code === 400) {\r\n");
//                sb.append("        Message.error('删除失败');\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        Message.success('删除成功');\r\n");
//                sb.append("        await this.page").append(propertyOut).append("By").append(poName).append("({\r\n");
//                sb.append("          current: data.current,\r\n");
//                sb.append("          id: data.id,\r\n");
//                sb.append("        });\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          visible: false,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//
//
//            }
//        }
//    }

//    private void manyToManyModelHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                sb.append("    async ").append(underPropertyOut).append("By").append(poName).append("(data) {\r\n");
//                sb.append("      await dispatch.").append(underPropertyOut).append(".findDataTableAndFormByName();\r\n");
//                sb.append("      const ret = await service.").append(underPropertyOut).append("By").append(poName).append("(data.id);\r\n");
//                sb.append("      if (ret.code === 400) {\r\n");
//                sb.append("        Message.error('获取失败');\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          divVisible: true,\r\n");
//                sb.append("          parent: data.id,\r\n");
//                sb.append("          select: ret.data,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underPropertyOut).append("Save").append(poName).append("(data) {\r\n");
//                sb.append("      const ret = await service.").append(underPropertyOut).append("Save").append(poName).append("(data.parent, data.select);\r\n");
//                sb.append("      if (ret.code === 400) {\r\n");
//                sb.append("        Message.error('保存失败');\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        Message.success('保存成功');\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          divVisible: false,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//            }
//        }
//    }

//    private String[] viewAutoGenerate(List<Property> outPropertyList, String underPoName, String poName) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("import React, {useEffect} from 'react';\r\n");
//        sb.append("import pageStore from '@/pages/").append(poName).append("/store';\r\n");
//        sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
//        sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
//        sb.append("import {CustomColumn} from '@/pages/").append(poName).append("/view/custom/").append(poName).append("';\r\n");
//        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)) {
//            sb.append("import {Dialog} from \"@alifd/next\";\r\n");
//        }
//        sb.append("\r\n");
//        sb.append("function ").append(poName).append("() {\r\n");
//        sb.append("\r\n");
//        sb.append("  const [state, dispatchers] = pageStore.useModel('").append(underPoName).append("');\r\n");
//        sb.append("\r\n");
//        sb.append("  const [customState, customDispatchers] = pageStore.useModel('").append(underPoName).append("Custom');\r\n");
//        sb.append("\r\n");
//        ViewStoreHandler(outPropertyList, sb);
//        sb.append("  useEffect(() => {\r\n");
//        sb.append("    dispatchers.findDataTableAndFormByName().then(r => console.log(r));\r\n");
//        sb.append("  }, [dispatchers]);\r\n");
//        sb.append("\r\n");
//        sb.append("  return (\r\n");
//        sb.append("    <>\r\n");
//        sb.append("      <DataTableTemple\r\n");
//        sb.append("        createItem={() => dispatchers.add()}\r\n");
//        sb.append("        editItem={record => dispatchers.edit(record)}\r\n");
//        sb.append("        deleteItem={record => dispatchers.delete({\r\n");
//        sb.append("          current: state.current,\r\n");
//        sb.append("          record,\r\n");
//        sb.append("        })}\r\n");
//        sb.append("        visibleLoading={state.loadingVisible}\r\n");
//        sb.append("        dataSource={state.tableData}\r\n");
//        sb.append("        items={state.table}\r\n");
//        sb.append("        total={state.total}\r\n");
//        sb.append("        getPage={current => dispatchers.page(current)}\r\n");
//        sb.append("        primaryKey=\"id\"\r\n");
//        sb.append("        customData={state.customData}\r\n");
//        sb.append("        columnRender={(value, index, record) => {\r\n");
//        sb.append("          return (\r\n");
//        sb.append("            <CustomColumn value={value} index={index} record={record}/>\r\n");
//        sb.append("          );\r\n");
//        sb.append("        }}\r\n");
//        oneToManyViewMethodHandler(outPropertyList, sb, poName);
//        manyToManyViewMethodHandler(outPropertyList, sb, poName);
//        sb.append("        customMethod1={() => customDispatchers.customMethod1()}\r\n");
//        sb.append("        customMethod2={() => customDispatchers.customMethod2()}\r\n");
//        sb.append("        customMethod3={() => customDispatchers.customMethod3()}\r\n");
//        sb.append("        customMethodName1={customState.customMethodName1}\r\n");
//        sb.append("        customMethodName2={customState.customMethodName2}\r\n");
//        sb.append("        customMethodName3={customState.customMethodName3}\r\n");
//        sb.append("      />\r\n");
//        sb.append("      <DataFormTemple\r\n");
//        sb.append("        customData={state.customData}\r\n");
//        sb.append("        title={state.title}\r\n");
//        sb.append("        visibleDialog={state.visible}\r\n");
//        sb.append("        onClose={() => dispatchers.setState({visible: false})}\r\n");
//        sb.append("        items={[...state.form, ...customState.customFrom]}\r\n");
//        sb.append("        dispatchers={value => dispatchers.setDataForm(value)}\r\n");
//        sb.append("        onOk={() => dispatchers.save({\r\n");
//        sb.append("          current: state.current,\r\n");
//        sb.append("          formData: state.formData,\r\n");
//        sb.append("        })}\r\n");
//        sb.append("        formDataValue={state.formData}\r\n");
//        sb.append("        formSortCode={String(Number.parseInt(String(state.total)) + 10)}\r\n");
//        sb.append("      />\r\n");
//        oneToManyViewDialogHandler(outPropertyList, sb, poName, underPoName);
//        manyToManyViewDialogHandler(outPropertyList, sb, poName);
//        sb.append("    </>\r\n");
//        sb.append("  );\r\n");
//        sb.append("}\r\n");
//        sb.append("\r\n");
//        sb.append("export default ").append(poName).append(";\r\n");
//        String viewData = sb.toString();
//        return new String[]{viewData, poName + ".tsx"};
//    }

//    private void ViewStoreHandler(List<Property> outPropertyList, StringBuilder sb) {
//        for (Property property : outPropertyList) {
//            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//            if (!BeanUtils.MANY_TO_ONE.equals(property.getPropertyOutType())) {
//                sb.append("  const [").append(underPropertyOut).append("State, ").append(underPropertyOut).append("Dispatchers] = pageStore.useModel('").append(underPropertyOut).append("');\r\n");
//                sb.append("\r\n");
//            }
//        }
//    }
//
//    private void oneToManyViewMethodHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
//        List<Property> oneToManyPropertyList = outPropertyList.stream().filter(property -> BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())).collect(Collectors.toList());
//        for (int i = 0; i < oneToManyPropertyList.size(); i++) {
//            Property property = oneToManyPropertyList.get(i);
//            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//            String propertyOut = BeanUtils.captureName(underPropertyOut);
//            sb.append("        son").append(i + 1).append("=\"").append(property.getPropertyLabel()).append("\"\r\n");
//            sb.append("        sonMethod").append(i + 1).append("={record => dispatchers.page").append(propertyOut).append("By").append(poName).append("({\r\n");
//            sb.append("          current: 1,\r\n");
//            sb.append("          id: record.id,\r\n");
//            sb.append("        })}\r\n");
//        }
//    }
//
//    private void manyToManyViewMethodHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
//        List<Property> manyToManyPropertyList = outPropertyList.stream().filter(property -> BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())).collect(Collectors.toList());
//        for (int i = 0; i < manyToManyPropertyList.size(); i++) {
//            Property property = manyToManyPropertyList.get(i);
//            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//            sb.append("        manyToMany").append(i + 1).append("=\"").append(property.getPropertyLabel()).append("\"\r\n");
//            sb.append("        manyToManyMethod").append(i + 1).append("={record => dispatchers.").append(underPropertyOut).append("By").append(poName).append("(record)}\r\n");
//        }
//    }
//
//    private void manyToManyViewDialogHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                sb.append("      <Dialog\r\n");
//                sb.append("        v2\r\n");
//                sb.append("        title=\"").append(property.getPropertyLabel()).append("\"\r\n");
//                sb.append("        visible={").append(underPropertyOut).append("State.divVisible}\r\n");
//                sb.append("        onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
//                sb.append("          divVisible: false,\r\n");
//                sb.append("          parent: \"\",\r\n");
//                sb.append("          select: [],\r\n");
//                sb.append("        })}\r\n");
//                sb.append("        onOk={() => dispatchers.").append(underPropertyOut).append("Save").append(poName).append("({\r\n");
//                sb.append("          parent: ").append(underPropertyOut).append("State.parent,\r\n");
//                sb.append("          select: ").append(underPropertyOut).append("State.select,\r\n");
//                sb.append("        })}\r\n");
//                sb.append("        style={{width: '90%'}}\r\n");
//                sb.append("      >\r\n");
//                sb.append("        <DataTableTemple\r\n");
//                sb.append("          customData={{customType: false}}\r\n");
//                sb.append("          visibleLoading={").append(underPropertyOut).append("State.loadingVisible}\r\n");
//                sb.append("          dataSource={").append(underPropertyOut).append("State.tableData}\r\n");
//                sb.append("          items={").append(underPropertyOut).append("State.table}\r\n");
//                sb.append("          total={").append(underPropertyOut).append("State.total}\r\n");
//                sb.append("          getPage={(current) => ").append(underPropertyOut).append("Dispatchers.page(current)}\r\n");
//                sb.append("          primaryKey=\"id\"\r\n");
//                sb.append("          rowSelection={{\r\n");
//                sb.append("            onChange: (ids) => {\r\n");
//                sb.append("              ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
//                sb.append("                select: ids,\r\n");
//                sb.append("              })\r\n");
//                sb.append("            },\r\n");
//                sb.append("            selectedRowKeys: ").append(underPropertyOut).append("State.select,\r\n");
//                sb.append("          }}\r\n");
//                sb.append("        />\r\n");
//                sb.append("      </Dialog>\r\n");
//            }
//        }
//    }
//
//    private void oneToManyViewDialogHandler(List<Property> outPropertyList, StringBuilder sb, String poName, String underPoName) {
//        for (Property property : outPropertyList) {
//            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
//                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
//                String propertyOut = BeanUtils.captureName(underPropertyOut);
//                sb.append("      <Dialog\r\n");
//                sb.append("        v2\r\n");
//                sb.append("        visible={").append(underPropertyOut).append("State.divVisible}\r\n");
//                sb.append("        footer={false}\r\n");
//                sb.append("        onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
//                sb.append("          divVisible: false,\r\n");
//                sb.append("          parent: \"\",\r\n");
//                sb.append("        })}\r\n");
//                sb.append("        style={{width: '100%'}}\r\n");
//                sb.append("      >\r\n");
//                sb.append("        <DataTableTemple\r\n");
//                sb.append("          createItem={() => ").append(underPropertyOut).append("Dispatchers.add()}\r\n");
//                sb.append("          editItem={record => ").append(underPropertyOut).append("Dispatchers.edit(record)}\r\n");
//                sb.append("          deleteItem={record => dispatchers.delete").append(propertyOut).append("By").append(poName).append("({\r\n");
//                sb.append("            current: ").append(underPropertyOut).append("State.current,\r\n");
//                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
//                sb.append("            record,\r\n");
//                sb.append("          })}\r\n");
//                sb.append("          visibleLoading={").append(underPropertyOut).append("State.loadingVisible}\r\n");
//                sb.append("          dataSource={").append(underPropertyOut).append("State.tableData}\r\n");
//                sb.append("          items={").append(underPropertyOut).append("State.table}\r\n");
//                sb.append("          total={").append(underPropertyOut).append("State.total}\r\n");
//                sb.append("          getPage={current => dispatchers.page").append(propertyOut).append("By").append(poName).append("({\r\n");
//                sb.append("            current,\r\n");
//                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
//                sb.append("          })}\r\n");
//                sb.append("          primaryKey=\"id\"\r\n");
//                sb.append("          customData={").append(underPropertyOut).append("State.customData}\r\n");
//                sb.append("        />\r\n");
//                sb.append("        <DataFormTemple\r\n");
//                sb.append("          customData={").append(underPropertyOut).append("State.customData}\r\n");
//                sb.append("          title={").append(underPropertyOut).append("State.title}\r\n");
//                sb.append("          visibleDialog={").append(underPropertyOut).append("State.visible}\r\n");
//                sb.append("          onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({visible: false})}\r\n");
//                sb.append("          items={").append(underPropertyOut).append("State.form}\r\n");
//                sb.append("          dispatchers={value => ").append(underPropertyOut).append("Dispatchers.setDataForm(value)}\r\n");
//                sb.append("          onOk={() => dispatchers.save").append(propertyOut).append("By").append(poName).append("({\r\n");
//                sb.append("            current: ").append(underPropertyOut).append("State.current,\r\n");
//                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
//                sb.append("            formData: {\r\n");
//                sb.append("              ...").append(underPropertyOut).append("State.formData,\r\n");
//                sb.append("              ").append(underPoName).append("Id: ").append(underPropertyOut).append("State.parent,\r\n");
//                sb.append("            },\r\n");
//                sb.append("          })}\r\n");
//                sb.append("          formDataValue={").append(underPropertyOut).append("State.formData}\r\n");
//                sb.append("          formSortCode={String(Number.parseInt(String(").append(underPropertyOut).append("State.total)) + 10)}\r\n");
//                sb.append("        />\r\n");
//                sb.append("      </Dialog>\r\n");
//            }
//        }
//    }

    private void createEntityCodeHandler(Map<String, String[]> entityObj, Map<String, String[]> entityCustomObj) {
        try {
            for (Map.Entry<String, String[]> entry : entityObj.entrySet()) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                BeanUtils.createJavaFile(key, value);
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
            sb.append("    private ").append(property.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(property.getPropertyCode())).append(";\r\n");
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
        sb.append("    private LocalDateTime updated_date;\r\n");
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

    public String[] controllerGenerate(List<PropertyBean> propertyList,
                                       String poName, String appPath, String appApi, boolean isBeanFlag) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //serviceImpl路径
        String poServicePath = packetPath + ".service." + (isBeanFlag ? "bean" : "relation") + ".auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller." + (isBeanFlag ? "bean" : "relation") + ".auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        if (isBeanFlag){
            sb.append("import com.example.cyjcommon.entity.vo.PageBeanVo;\r\n");
        }
        sb.append("import com.example.cyjcommon.entity.").append(isBeanFlag ? "bean" : "relation").append(".").append(poName).append(isBeanFlag ? "Bean" : "Relation").append(";\r\n");
        if (!isBeanFlag){
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
        if (isBeanFlag) {
            sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
        }
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        if (!isBeanFlag) {
            sb.append("import java.util.List;\r\n");
            sb.append("\r\n");
        }
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
            sb.append("    public ResultVO save(@RequestBody ").append(poName).append("Bean po) {\r\n");
            sb.append("        if (po.getId() == null) {\r\n");
            sb.append("            return ResultVO.success(service.addOne(po));\r\n");
            sb.append("        }\r\n");
            sb.append("        return ResultVO.success(service.updateOne(po));\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
            sb.append("    @PostMapping(value = \"delete").append(poName).append("\")\r\n");
            sb.append("    public ResultVO delete(@RequestBody ").append(poName).append("Bean po) {\r\n");
            sb.append("        if (po.getId() == null) {\r\n");
            sb.append("            return ResultVO.failure();\r\n");
            sb.append("        }\r\n");
            sb.append("        service.deleteOne(po);\r\n");
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

//    public JSONObject findDataTableAndFormByName(String persistentCode) {
//        Persistent persistent = new Persistent().selectOne(new LambdaQueryWrapper<Persistent>()
//                .eq(Persistent::getPersistentCode, persistentCode));
//        if (persistent == null) {
//            return null;
//        }
//        List<Property> propertyList = new Property().selectList(new LambdaQueryWrapper<Property>()
//                .eq(Property::getPersistentId, persistent.getId())
//                .orderByAsc(Property::getSortCode));
//        List<PropertyCustomDTO> propertyCustomDTOList = new ArrayList<>();
//        for (Property property : propertyList) {
//            PropertyCustomDTO propertyCustomDTO = new PropertyCustomDTO();
//            propertyCustomDTO.setId(property.getId());
//            propertyCustomDTO.setPropertyCode(property.getPropertyCode());
//            propertyCustomDTO.setPropertyName(BeanUtils.underline2Camel(property.getPropertyCode()));
//            propertyCustomDTO.setPropertyDirection(property.getPropertyDirection());
//            propertyCustomDTO.setPropertyDisplay(BeanUtils.NO.equals(property.getPropertyDisplay()));
//            propertyCustomDTO.setPropertyDefaultValue(property.getPropertyDefaultValue());
//            propertyCustomDTO.setPropertyLabel(property.getPropertyLabel());
//            propertyCustomDTO.setPropertyMode(property.getPropertyMode());
//            propertyCustomDTO.setPropertyType(property.getPropertyType());
//            propertyCustomDTO.setPropertyWidth(property.getPropertyWidth());
//            propertyCustomDTO.setSortCode(property.getSortCode());
//            propertyCustomDTO.setPropertyMode(property.getPropertyMode());
//            propertyCustomDTO.setPropertyDataSourceType(property.getPropertyDataSourceType());
//            propertyCustomDTO.setPropertyEditEnable(BeanUtils.NO.equals(property.getPropertyEditEnable()));
//            propertyCustomDTO.setPropertyRequired(BeanUtils.YES.equals(property.getPropertyRequired()));
//            propertyCustomDTO.setPropertyOut(BeanUtils.YES.equals(property.getPropertyOut()));
//            propertyCustomDTO.setPropertyOutType(property.getPropertyOutType());
//            if (StringUtils.isNotEmpty(property.getPropertyDataSourceType())) {
//                List<Dictionary> dictionaryDTOList = dictionaryCustomServiceImpl.findCatalogByValue(propertyCustomDTO.getPropertyDataSourceType());
//                JSONArray mapList = new JSONArray();
//                JSONObject mapNull = new JSONObject();
//                mapNull.put("label", "无");
//                mapNull.put("value", null);
//                mapList.add(mapNull);
//                if (dictionaryDTOList != null && dictionaryDTOList.size() != 0) {
//                    for (Dictionary dictionary : dictionaryDTOList) {
//                        Map<String, String> map = new HashMap<>();
//                        map.put("label", dictionary.getDictionaryName());
//                        map.put("value", dictionary.getDictionaryValue());
//                        mapList.add(map);
//                    }
//                }
//                JSONArray dateSourceList = sqlCustomServiceImpl.queryBySql(propertyCustomDTO.getPropertyDataSourceType());
//                dateSourceHandler(mapList, dateSourceList);
//                propertyCustomDTO.setPropertyDataSource(mapList);
//            }
//            propertyCustomDTOList.add(propertyCustomDTO);
//        }
//        List<PropertyCustomDTO> propertyCustomDTOS = propertyCustomDTOList.stream().sorted(Comparator.comparing(PropertyCustomDTO::getSortCode)).collect(Collectors.toList());
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("dataTable", propertyCustomDTOS);
//        jsonObject.put("dataForm", propertyCustomDTOS);
//        JSONObject customData = new JSONObject();
////        customData.put("customType", BeanUtils.YES.equals(persistent.getPersistentCustomTable()));
////        customData.put("customForm", BeanUtils.YES.equals(persistent.getPersistentCustomForm()));
////        customData.put("editEnable", BeanUtils.YES.equals(persistent.getPersistentEditEnable()));
////        customData.put("formType", persistent.getPersistentFormType());
////        customData.put("formCol", persistent.getPersistentFormRow());
//        jsonObject.put("customData", customData);
//        return jsonObject;
//    }

    private void dateSourceHandler(JSONArray mapList, JSONArray dateSourceList) {
        if (dateSourceList != null && !dateSourceList.isEmpty()) {
            for (Object dateSource : dateSourceList) {
                JSONObject dateSourceMap = JSON.parseObject(JSON.toJSONString(dateSource));
                JSONObject map = new JSONObject();
                if (dateSourceMap.get("label") == null && dateSourceMap.get("value") == null) {
                    continue;
                }
                map.put("label", dateSourceMap.get("label").toString());
                map.put("value", dateSourceMap.get("value").toString());
                mapList.add(map);
            }
        }
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
