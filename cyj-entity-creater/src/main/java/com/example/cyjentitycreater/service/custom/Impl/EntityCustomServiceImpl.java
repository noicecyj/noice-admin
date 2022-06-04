package com.example.cyjentitycreater.service.custom.Impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import com.example.cyjcommon.entity.po.QAuthorityPO;
import com.example.cyjcommon.entity.po.QEntityPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import com.example.cyjentitycreater.entity.dto.PropertyCustomDTO;
import com.example.cyjentitycreater.service.custom.EntityCustomService;
import com.example.cyjentitycreater.utils.BeanUtils;
import com.example.cyjquery.service.custom.SqlCustomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntityCustomServiceImpl extends BaseService implements EntityCustomService {

    private final static String componentPath = "C:/Users/noice/IdeaProjects/noice-admin/noice/src/pages/";
    private final static String POST = "POST";
    private final static String MANY_TO_ONE = "ManyToOne";
    private final static String AUTO = "auto";
    private final static String STATUS = "有效";
    private final static String SORTCODE = "10";
    private final static String commonPath = "C:/Users/noice/IdeaProjects/noice-admin/cyj-common/src/main/java/com/example/cyjcommon";
    private EntityDao entityDao;
    private PropertyDao propertyDao;
    private AuthorityDao authorityDao;
    private DictionaryCustomService dictionaryCustomService;
    private SqlCustomService sqlCustomService;

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Autowired
    public void setPropertyDao(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Autowired
    public void setDictionaryCustomService(DictionaryCustomService dictionaryCustomService) {
        this.dictionaryCustomService = dictionaryCustomService;
    }

    @Autowired
    public void setSqlCustomService(SqlCustomService sqlCustomService) {
        this.sqlCustomService = sqlCustomService;
    }

    @Override
    public void generateJavaFile(EntityPO entityPO) {
        if (entityPO == null) {
            return;
        }
        entityHandler(entityPO);
    }

    private void authorityHandler(EntityPO entityPO) {
        List<PropertyPO> propertyPOOutList = propertyDao
                .findByEntityOrderBySortCode(entityPO)
                .stream()
                .filter(propertyPO -> "是".equals(propertyPO.getPropertyOut()))
                .collect(Collectors.toList());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(entityPO.getEntityCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AuthorityPO findAll = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.authorityPath
                        .eq(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Page")).fetchOne();
        if (findAll == null) {
            findAll = new AuthorityPO();
            findAll.setAuthorityMethod(POST);
            findAll.setAuthorityPath(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Page");
            findAll.setAuthorityName("查询所有" + poName);
            findAll.setAuthorityType(AUTO);
            findAll.setAuthorityDescription("查询所有" + poName);
            findAll.setEntity(entityPO);
            findAll.setAppService(entityPO.getAppService());
            findAll.setSortCode(SORTCODE);
            findAll.setStatus(STATUS);
            authorityDao.save(findAll);
        }
        if ("是".equals(entityPO.getEntitySelf())) {
            authoritySaveHandler(entityPO, underPoName, poName, poName);
        }
        for (PropertyPO propertyPO : propertyPOOutList) {
            String underPropertyPoName = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
            String propertyPoName = BeanUtils.captureName(underPropertyPoName);
            authoritySaveHandler(entityPO, underPoName, poName, propertyPoName);
        }
        AuthorityPO save = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.authorityPath
                        .eq(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Save")).fetchOne();
        if (save == null) {
            save = new AuthorityPO();
            save.setAuthorityMethod(POST);
            save.setAuthorityPath(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Save");
            save.setAuthorityName("保存" + poName);
            save.setAuthorityType(AUTO);
            save.setAuthorityDescription("保存" + poName);
            save.setEntity(entityPO);
            save.setAppService(entityPO.getAppService());
            save.setSortCode(SORTCODE);
            save.setStatus(STATUS);
            authorityDao.save(save);
        }
        AuthorityPO delete = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.authorityPath
                        .eq(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Delete")).fetchOne();
        if (delete == null) {
            delete = new AuthorityPO();
            delete.setAuthorityMethod(POST);
            delete.setAuthorityPath(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "Delete");
            delete.setAuthorityName("删除" + poName);
            delete.setAuthorityType(AUTO);
            delete.setAuthorityDescription("删除" + poName);
            delete.setEntity(entityPO);
            delete.setAppService(entityPO.getAppService());
            delete.setSortCode(SORTCODE);
            delete.setStatus(STATUS);
            authorityDao.save(delete);
        }
    }

    private void authoritySaveHandler(EntityPO entityPO, String underPoName, String poName, String propertyPoName) {
        AuthorityPO findAllOut = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.authorityPath
                        .eq(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "PageBy" + propertyPoName)).fetchOne();
        if (findAllOut == null) {
            findAllOut = new AuthorityPO();
            findAllOut.setAuthorityMethod(POST);
            findAllOut.setAuthorityPath(entityPO.getAppService().getAppServiceApi() + "/" + underPoName + "PageBy" + propertyPoName);
            findAllOut.setAuthorityName("根据" + propertyPoName + "查询所有" + poName);
            findAllOut.setAuthorityType(AUTO);
            findAllOut.setAuthorityDescription("根据" + propertyPoName + "查询所有" + poName);
            findAllOut.setEntity(entityPO);
            findAllOut.setAppService(entityPO.getAppService());
            findAllOut.setSortCode(SORTCODE);
            findAllOut.setStatus(STATUS);
            authorityDao.save(findAllOut);
        }
    }

    @Override
    public void entityHandler(EntityPO entityPO) {
        //查询是否存在子实体
        List<EntityPO> subEntityPOList = entityDao.findByEntityOrderBySortCode(entityPO);
        //若存在则便利子实体
        if (!subEntityPOList.isEmpty()) {
            //生成有子实体的实体
            createEntityHandler(entityPO);
            authorityHandler(entityPO);
            for (EntityPO entityPO1 : subEntityPOList) {
                //进入递归
                entityHandler(entityPO1);
            }
        } else {
            //生成没有有子实体的实体
            createEntityHandler(entityPO);
            authorityHandler(entityPO);
        }
    }

    private void createEntityHandler(EntityPO entityPO) {
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(entityPO.getEntityCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AppServicePO appServicePO = entityPO.getAppService();
        if (appServicePO == null) {
            return;
        }
        //服务路径
        String appPath = appServicePO.getAppServicePath();
        //服务接口
        String appApi = appServicePO.getAppServiceApi();
        List<PropertyPO> propertyPOList = propertyDao.findByEntityOrderBySortCode(entityPO);
        Map<String, String[]> entityObj = new HashMap<>();
        entityObj.put(commonPath + "/entity/po", poGenerate(entityPO, propertyPOList, poName, underPoName));
        entityObj.put(commonPath + "/dao", daoGenerate(entityPO, propertyPOList, poName, underPoName));
        entityObj.put(appPath + "/service/auto", serviceGenerate(entityPO, propertyPOList, poName, underPoName, appPath));
        entityObj.put(appPath + "/service/auto/Impl", serviceImplGenerate(entityPO, propertyPOList, underPoName, poName, appPath));
        entityObj.put(appPath + "/controller/auto", controllerGenerate(entityPO, propertyPOList, underPoName, poName, appPath));
        entityObj.put(appPath + "/controller/auto/Impl", controllerImplGenerate(entityPO, propertyPOList, underPoName, poName, appPath, appApi));
        entityObj.put(componentPath + poName + "/view/auto", viewAutoGenerate(entityPO, underPoName, poName));
        entityObj.put(componentPath + poName + "/services/auto", servicesAutoGenerate(entityPO, propertyPOList, appApi, underPoName, poName));
        entityObj.put(componentPath + poName + "/models/auto", modelsAutoGenerate(entityPO, underPoName, poName));
        if (entityPO.getEntityId() == null) {
            entityObj.put(componentPath + poName, indexGenerate(entityPO, underPoName, poName));
            entityObj.put(componentPath + poName, storeGenerate(entityPO, propertyPOList, underPoName, poName));
        }
        Map<String, String[]> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service/custom", serviceCustomGenerate(poName, appPath));
        entityCustomObj.put(appPath + "/service/custom/aop", aopCustomGenerate(poName, appPath));
        entityCustomObj.put(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath));
        entityCustomObj.put(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath));
        entityCustomObj.put(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi));
        entityCustomObj.put(componentPath + poName + "/view/custom", viewCustomGenerate(underPoName));
        entityCustomObj.put(componentPath + poName + "/services/custom", servicesCustomGenerate(underPoName));
        entityCustomObj.put(componentPath + poName + "/models/custom", modelsCustomGenerate(underPoName, poName));
        createEntityCodeHandler(entityObj, entityCustomObj);
    }

    private String[] servicesAutoGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String appApi, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import {request} from 'ice';\r\n");
        sb.append("\r\n");
        sb.append("export default {\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("  ").append(underPoName).append("Page(pageNumber) {\r\n");
        } else {
            sb.append("  ").append(underPoName).append("Page(pageNumber, data) {\r\n");
        }
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("Page',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      params: {\r\n");
        sb.append("        pageNumber,\r\n");
        sb.append("      },\r\n");
        if (entityPO.getEntityId() != null) {
            sb.append("      data,\r\n");
        }
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("  ").append(underPoName).append("PageBy").append(poName).append("(pageNumber, data) {\r\n");
            sb.append("    return request({\r\n");
            sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("PageBy").append(poName).append("',\r\n");
            sb.append("      method: 'post',\r\n");
            sb.append("      params: {\r\n");
            sb.append("        pageNumber,\r\n");
            sb.append("      },\r\n");
            sb.append("      data,\r\n");
            sb.append("    });\r\n");
            sb.append("  },\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("  ").append(underPoName).append("PageBy").append(propertyOut).append("(pageNumber, data) {\r\n");
                    sb.append("    return request({\r\n");
                    sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("PageBy").append(propertyOut).append("',\r\n");
                } else {
                    sb.append("  ").append(underPoName).append("PageBy").append(propertyOut).append("List(pageNumber, data) {\r\n");
                    sb.append("    return request({\r\n");
                    sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("PageBy").append(propertyOut).append("List',\r\n");
                }
                sb.append("      method: 'post',\r\n");
                sb.append("      params: {\r\n");
                sb.append("        pageNumber,\r\n");
                sb.append("      },\r\n");
                sb.append("      data,\r\n");
                sb.append("    });\r\n");
                sb.append("  },\r\n");
            }
        }
        sb.append("  ").append(underPoName).append("Save(data) {\r\n");
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("Save',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      data,\r\n");
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        sb.append("  ").append(underPoName).append("Delete(data) {\r\n");
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/").append(underPoName).append("Delete',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      data,\r\n");
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        sb.append("};\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] storeGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName) {
        List<EntityPO> subEntityPOList = entityDao.findByEntityOrderBySortCode(entityPO);
        StringBuilder sb = new StringBuilder();
        sb.append("import {createStore} from 'ice';\r\n");
        sb.append("import ").append(underPoName).append(" from './models/auto/").append(underPoName).append("';\r\n");
        sb.append("import custom").append(poName).append(" from './models/custom/").append(underPoName).append("';\r\n");
        subEntityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import ").append(underSubPoName).append(" from './models/auto/").append(underSubPoName).append("';\r\n");
            sb.append("import custom").append(subPoName).append(" from './models/custom/").append(underSubPoName).append("';\r\n");
        });
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import ").append(underPropertyOut).append(" from \"@/pages/").append(propertyOut).append("/models/auto/").append(underPropertyOut).append("\";\r\n");
            }
        }
        sb.append("\r\n");
        sb.append("const store = createStore({\r\n");
        sb.append("  ").append(underPoName).append(",\r\n");
        sb.append("  custom").append(poName).append(",\r\n");
        subEntityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("  ").append(underSubPoName).append(",\r\n");
            sb.append("  custom").append(subPoName).append(",\r\n");
        });
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                sb.append("  ").append(underPropertyOut).append(",\r\n");
            }
        }
        sb.append("});\r\n");
        sb.append("\r\n");
        sb.append("export default store;\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, "store.ts"};
    }

    private String[] indexGenerate(EntityPO entityPO, String underPoName, String poName) {
        List<EntityPO> subEntityPOList = entityDao.findByEntityOrderBySortCode(entityPO);
        StringBuilder sb = new StringBuilder();
        sb.append("import React from 'react';\r\n");
        sb.append("import ").append(poName).append(" from '@/pages/").append(poName).append("/view/auto/").append(underPoName).append("';\r\n");
        subEntityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import ").append(subPoName).append(" from '@/pages/").append(poName).append("/view/auto/").append(underSubPoName).append("';\r\n");
        });
        sb.append("\r\n");
        sb.append("function ").append(poName).append("Page() {\r\n");
        sb.append("  return (\r\n");
        sb.append("    <div>\r\n");
        sb.append("      <").append(poName).append("/>\r\n");
        subEntityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("      <").append(subPoName).append("/>\r\n");
        });
        sb.append("    </div>\r\n");
        sb.append("  );\r\n");
        sb.append("}\r\n");
        sb.append("\r\n");
        sb.append("export default ").append(poName).append("Page;\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, "index.tsx"};
    }

    private String[] modelsCustomGenerate(String underPoName, String poName) {
        String viewData = "export default {\r\n" +
                "\r\n" +
                "  namespace: 'custom" + poName + "',\r\n" +
                "\r\n" +
                "  state: {\r\n" +
                "    customMethodName1: null,\r\n" +
                "    customMethodName2: null,\r\n" +
                "    customMethodName3: null,\r\n" +
                "    customFrom: [],\r\n" +
                "  },\r\n" +
                "\r\n" +
                "  reducers: {\r\n" +
                "    setState(prevState, payload) {\r\n" +
                "      return {...prevState, ...payload};\r\n" +
                "    },\r\n" +
                "  },\r\n" +
                "  effects: () => ({\r\n" +
                "    customMethod1() {\r\n" +
                "    },\r\n" +
                "    customMethod2() {\r\n" +
                "    },\r\n" +
                "    customMethod3() {\r\n" +
                "    },\r\n" +
                "  }),\r\n" +
                "};\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] servicesCustomGenerate(String underPoName) {
        String viewData = "\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] viewCustomGenerate(String underPoName) {
        String viewData = "function CustomColumnProperty() {}\r\n" +
                "\r\n" +
                "export {CustomColumnProperty};\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] modelsAutoGenerate(EntityPO entityPO, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import ").append(underPoName).append("Service from '@/pages/").append(poName).append("/services/auto/").append(underPoName).append("';\r\n");
        sb.append("import initService from '@/services/init';\r\n");
        sb.append("import {Message} from \"@alifd/next\";\r\n");
        sb.append("\r\n");
        sb.append("export default {\r\n");
        sb.append("\r\n");
        sb.append("  namespace: '").append(underPoName).append("',\r\n");
        sb.append("\r\n");
        sb.append("  state: {\r\n");
        sb.append("    ").append(underPoName).append("Title: '添加',\r\n");
        sb.append("    ").append(underPoName).append("TableData: [],\r\n");
        sb.append("    ").append(underPoName).append("Visible: false,\r\n");
        sb.append("    ").append(underPoName).append("FormData: {},\r\n");
        sb.append("    ").append(underPoName).append("LoadingVisible: true,\r\n");
        sb.append("    ").append(underPoName).append("Total: 0,\r\n");
        sb.append("    ").append(underPoName).append("Current: 1,\r\n");
        sb.append("    ").append(underPoName).append("Form: [],\r\n");
        sb.append("    ").append(underPoName).append("Table: [],\r\n");
        if (entityPO.getEntityId() != null) {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    ").append(underPoName).append("Visible: false,\r\n");
            sb.append("    divVisible: false,\r\n");
            sb.append("    ").append(underPoNameParent).append(": {},\r\n");
        }
        sb.append("    customData: {},\r\n");
        sb.append("  },\r\n");
        sb.append("\r\n");
        sb.append("  reducers: {\r\n");
        sb.append("    setState(prevState, payload) {\r\n");
        sb.append("      return {...prevState, ...payload};\r\n");
        sb.append("    },\r\n");
        sb.append("  },\r\n");
        sb.append("\r\n");
        sb.append("  effects: (dispatch) => ({\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    async ").append(underPoName).append("Page(").append(underPoName).append("Current) {\r\n");
            sb.append("      const dataRes = await ").append(underPoName).append("Service.").append(underPoName).append("Page(").append(underPoName).append("Current);\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    async ").append(underPoName).append("Page(").append(underPoName).append("Current, ").append(underPoNameParent).append(") {\r\n");
            sb.append("      const dataRes = await ").append(underPoName).append("Service.").append(underPoName).append("Page(").append(underPoName).append("Current, ").append(underPoNameParent).append(");\r\n");
        }
        sb.append("      const payload = {\r\n");
        sb.append("        ").append(underPoName).append("TableData: dataRes.data.content,\r\n");
        sb.append("        ").append(underPoName).append("Total: dataRes.data.totalElements,\r\n");
        sb.append("        ").append(underPoName).append("Current,\r\n");
        sb.append("        ").append(underPoName).append("LoadingVisible: false,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    ").append(underPoName).append("Add() {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        ").append(underPoName).append("FormData: {},\r\n");
        sb.append("        ").append(underPoName).append("Title: '添加',\r\n");
        sb.append("        ").append(underPoName).append("Visible: true,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    ").append(underPoName).append("Edit(data) {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        ").append(underPoName).append("FormData: data,\r\n");
        sb.append("        ").append(underPoName).append("Title: '编辑',\r\n");
        sb.append("        ").append(underPoName).append("Visible: true,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    async ").append(underPoName).append("Delete(").append(underPoName).append("Current, record) {\r\n");
            sb.append("      const ret = await ").append(underPoName).append("Service.").append(underPoName).append("Delete(record);\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    async ").append(underPoName).append("Delete(").append(underPoName).append("Current, ").append(underPoNameParent).append(", record) {\r\n");
            sb.append("      const ret = await ").append(underPoName).append("Service.").append(underPoName).append("Delete(record);\r\n");
        }
        sb.append("      if (ret.code === 400) {\r\n");
        sb.append("        Message.error('删除失败');\r\n");
        sb.append("      } else {\r\n");
        sb.append("        Message.success('删除成功');\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("        await this.").append(underPoName).append("Page(").append(underPoName).append("Current);\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("        await this.").append(underPoName).append("Page(").append(underPoName).append("Current, ").append(underPoNameParent).append(");\r\n");
        }
        sb.append("        const payload = {\r\n");
        sb.append("          ").append(underPoName).append("Visible: false,\r\n");
        sb.append("        };\r\n");
        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("      }\r\n");
        sb.append("    },\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    async ").append(underPoName).append("Save(").append(underPoName).append("Current, formData) {\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    async ").append(underPoName).append("Save(").append(underPoName).append("Current, ").append(underPoNameParent).append(", formData) {\r\n");
        }
        sb.append("      const ret = await ").append(underPoName).append("Service.").append(underPoName).append("Save(formData);\r\n");
        sb.append("      if (ret.code === 400) {\r\n");
        sb.append("        Message.error(ret.data.defaultMessage);\r\n");
        sb.append("      } else {\r\n");
        sb.append("        Message.success('保存成功');\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("        await this.").append(underPoName).append("Page(").append(underPoName).append("Current);\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("        await this.").append(underPoName).append("Page(").append(underPoName).append("Current, ").append(underPoNameParent).append(");\r\n");
        }
        sb.append("        const payload = {\r\n");
        sb.append("          ").append(underPoName).append("Visible: false,\r\n");
        sb.append("        };\r\n");
        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("      }\r\n");
        sb.append("    },\r\n");
        sb.append("    setDataForm(data) {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        ").append(underPoName).append("FormData: data,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    async findDataTableAndFormByName() {\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    async findDataTableAndFormByName(").append(underPoNameParent).append(") {\r\n");
        }
        sb.append("      const ret = await initService.findDataTableAndFormByName('").append(underPoName).append("');\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("      await this.").append(underPoName).append("Page(1);\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("      await this.").append(underPoName).append("Page(1, ").append(underPoNameParent).append(");\r\n");
        }
        sb.append("      const payload = {\r\n");
        sb.append("        ").append(underPoName).append("Table: ret.data.dataTable,\r\n");
        sb.append("        ").append(underPoName).append("Form: ret.data.dataForm,\r\n");
        sb.append("        customData: ret.data.customData,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        if (entityPO.getEntityId() != null) {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    async onRowClick(data) {\r\n");
            sb.append("      await this.findDataTableAndFormByName(data);\r\n");
            sb.append("      const payload = {\r\n");
            sb.append("        divVisible: true,\r\n");
            sb.append("        ").append(underPoNameParent).append(": data,\r\n");
            sb.append("        ").append(underPoName).append("Visible: false,\r\n");
            sb.append("      };\r\n");
            sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
            sb.append("    },\r\n");
        }
        sb.append("  }),\r\n");
        sb.append("};\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] viewAutoGenerate(EntityPO entityPO, String underPoName, String poName) {
        List<EntityPO> subEntityPOList = entityDao.findByEntityOrderBySortCode(entityPO);
        StringBuilder sb = new StringBuilder();
        if (entityPO.getEntityId() != null) {
            sb.append("import {Dialog} from '@alifd/next';\r\n");
        }
        sb.append("import React, {useEffect} from 'react';\r\n");
        sb.append("import pageStore from '@/pages/").append(poName).append("/store';\r\n");
        sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
        sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
        sb.append("import {CustomColumn").append(poName).append("} from '@/pages/").append(poName).append("/view/custom/").append(underPoName).append("';\r\n");
        sb.append("\r\n");
        sb.append("function ").append(poName).append("() {\r\n");
        sb.append("  const [").append(underPoName).append("State, ").append(underPoName).append("Dispatchers] = pageStore.useModel('").append(underPoName).append("');\r\n");
        if (subEntityPOList.size() > 0) {
            EntityPO entityPO11 = subEntityPOList.get(0);
            if (entityPO11 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO11.getEntityCode());
                sb.append("  const ").append(underSubPoName).append("Dispatchers = pageStore.useModelDispatchers('").append(entityPO11.getEntityCode()).append("');\r\n");
                sb.append("\r\n");
            }
        }
        if (subEntityPOList.size() > 1) {
            EntityPO entityPO21 = subEntityPOList.get(1);
            if (entityPO21 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO21.getEntityCode());
                sb.append("  const ").append(underSubPoName).append("Dispatchers = pageStore.useModelDispatchers('").append(entityPO21.getEntityCode()).append("');\r\n");
                sb.append("\r\n");
            }
        }
        if (subEntityPOList.size() > 2) {
            EntityPO entityPO31 = subEntityPOList.get(2);
            if (entityPO31 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO31.getEntityCode());
                sb.append("  const ").append(underSubPoName).append("Dispatchers = pageStore.useModelDispatchers('").append(entityPO31.getEntityCode()).append("');\r\n");
                sb.append("\r\n");
            }
        }
        sb.append("  const [custom").append(poName).append("State, custom").append(poName).append("Dispatchers] = pageStore.useModel('custom").append(poName).append("');\r\n");
        sb.append("\r\n");
        sb.append("  useEffect(() => {\r\n");
        sb.append("    ").append(underPoName).append("Dispatchers.findDataTableAndFormByName().then(r => console.log(r));\r\n");
        sb.append("  }, [").append(underPoName).append("Dispatchers]);\r\n");
        sb.append("\r\n");
        sb.append("  return (\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    <>\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("    <Dialog\r\n");
            sb.append("      v2\r\n");
            sb.append("      visible={").append(underPoName).append("State.divVisible}\r\n");
            sb.append("      footer={false}\r\n");
            sb.append("      onClose={() => ").append(underPoName).append("Dispatchers.setState({\r\n");
            sb.append("        divVisible: false,\r\n");
            sb.append("        ").append(underPoNameParent).append(": {},\r\n");
            sb.append("      })}\r\n");
            sb.append("      style={{width: '100%'}}\r\n");
            sb.append("    >\r\n");
        }
        sb.append("      <DataTableTemple\r\n");
        sb.append("        createItem={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Add()}\r\n");
        sb.append("        editItem={record => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Edit(record)}\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("        deleteItem={record => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Delete(").append(underPoName).append("State.").append(underPoName).append("Current, record)}\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("        deleteItem={record => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Delete(").append(underPoName).append("State.").append(underPoName).append("Current, ").append(underPoName).append("State.").append(underPoNameParent).append(", record)}\r\n");
        }
        sb.append("        visibleLoading={").append(underPoName).append("State.").append(underPoName).append("LoadingVisible}\r\n");
        sb.append("        dataSource={").append(underPoName).append("State.").append(underPoName).append("TableData}\r\n");
        sb.append("        items={").append(underPoName).append("State.").append(underPoName).append("Table}\r\n");
        sb.append("        total={").append(underPoName).append("State.").append(underPoName).append("Total}\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("        getPage={").append(underPoName).append("Current => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Page(").append(underPoName).append("Current)}\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("        getPage={").append(underPoName).append("Current => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Page(").append(underPoName).append("Current, ").append(underPoName).append("State.").append(underPoNameParent).append(")}\r\n");
        }
        sb.append("        primaryKey=\"id\"\r\n");
        sb.append("        customData={").append(underPoName).append("State.customData}\r\n");
        sb.append("        columnRender={(value, index, record) => {\r\n");
        sb.append("          return (\r\n");
        sb.append("            <CustomColumn").append(poName).append(" value={value} index={index} record={record}/>\r\n");
        sb.append("          );\r\n");
        sb.append("        }}\r\n");
        if (subEntityPOList.size() > 0) {
            EntityPO entityPO1 = subEntityPOList.get(0);
            if (entityPO1 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
                sb.append("        son1=\"").append(entityPO1.getEntityName()).append("\"\r\n");
                sb.append("        sonMethod1={record => ").append(underSubPoName).append("Dispatchers.onRowClick(record)}\r\n");
            }
        }
        if (subEntityPOList.size() > 1) {
            EntityPO entityPO2 = subEntityPOList.get(1);
            if (entityPO2 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO2.getEntityCode());
                sb.append("        son2=\"").append(entityPO2.getEntityName()).append("\"\r\n");
                sb.append("        sonMethod2={record => ").append(underSubPoName).append("Dispatchers.onRowClick(record)}\r\n");
            }
        }
        if (subEntityPOList.size() > 2) {
            EntityPO entityPO3 = subEntityPOList.get(2);
            if (entityPO3 != null) {
                String underSubPoName = BeanUtils.underline2Camel(entityPO3.getEntityCode());
                sb.append("        son3=\"").append(entityPO3.getEntityName()).append("\"\r\n");
                sb.append("        sonMethod3={record => ").append(underSubPoName).append("Dispatchers.onRowClick(record)}\r\n");
            }
        }
        sb.append("        customMethod1={() => custom").append(poName).append("Dispatchers.customMethod1()}\r\n");
        sb.append("        customMethod2={() => custom").append(poName).append("Dispatchers.customMethod2()}\r\n");
        sb.append("        customMethod3={() => custom").append(poName).append("Dispatchers.customMethod3()}\r\n");
        sb.append("        customMethodName1={custom").append(poName).append("State.customMethodName1}\r\n");
        sb.append("        customMethodName2={custom").append(poName).append("State.customMethodName2}\r\n");
        sb.append("        customMethodName3={custom").append(poName).append("State.customMethodName3}\r\n");
        sb.append("      />\r\n");
        sb.append("      <DataFormTemple\r\n");
        sb.append("        customData={").append(underPoName).append("State.customData}\r\n");
        sb.append("        title={").append(underPoName).append("State.").append(underPoName).append("Title}\r\n");
        sb.append("        visibleDialog={").append(underPoName).append("State.").append(underPoName).append("Visible}\r\n");
        sb.append("        onClose={() => ").append(underPoName).append("Dispatchers.setState({").append(underPoName).append("Visible: false})}\r\n");
        sb.append("        items={[...").append(underPoName).append("State.").append(underPoName).append("Form, ...custom").append(poName).append("State.customFrom]}\r\n");
        sb.append("        dispatchers={value => ").append(underPoName).append("Dispatchers.setDataForm(value)}\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("        onOk={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Save(").append(underPoName).append("State.").append(underPoName).append("Current, ").append(underPoName).append("State.").append(underPoName).append("FormData)}\r\n");
        } else {
            EntityPO entityPOParent = entityDao.getOne(entityPO.getEntityId());
            //驼峰名
            String underPoNameParent = BeanUtils.underline2Camel(entityPOParent.getEntityCode());
            sb.append("        onOk={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Save(").append(underPoName).append("State.").append(underPoName).append("Current, ").append(underPoName).append("State.").append(underPoNameParent).append(", ").append(underPoName).append("State.").append(underPoName).append("FormData)}\r\n");
        }
        sb.append("        formDataValue={").append(underPoName).append("State.").append(underPoName).append("FormData}\r\n");
        sb.append("        formSortCode={String(Number.parseInt(String(").append(underPoName).append("State.").append(underPoName).append("Total)) + 10)}\r\n");
        sb.append("      />\r\n");
        if (entityPO.getEntityId() == null) {
            sb.append("    </>\r\n");
        } else {
            sb.append("    </Dialog>\r\n");
        }
        sb.append("  );\r\n");
        sb.append("}\r\n");
        sb.append("\r\n");
        sb.append("export default ").append(poName).append(";\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private void createEntityCodeHandler(Map<String, String[]> entityObj, Map<String, String[]> entityCustomObj) {
        try {
            for (Map.Entry<String, String[]> entry : entityObj.entrySet()) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                createJavaFile(key, value);
            }
            for (Map.Entry<String, String[]> entry : entityCustomObj.entrySet()) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                createJavaFile(key, value, false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String[] poGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String poName, String underPoName) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.cyjcommon.entity.po;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import com.fasterxml.jackson.annotation.JsonIgnore;\r\n");
        }
        sb.append("import com.fasterxml.jackson.annotation.JsonIgnoreProperties;\r\n");
        sb.append("import lombok.Getter;\r\n");
        sb.append("import lombok.RequiredArgsConstructor;\r\n");
        sb.append("import lombok.Setter;\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import org.hibernate.annotations.BatchSize;\r\n");
        }
        sb.append("import org.hibernate.annotations.GenericGenerator;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.CascadeType;\r\n");
        }
        if ("是".equals(entityPO.getEntitySelf()) || BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.ConstraintMode;\r\n");
        }
        sb.append("import javax.persistence.Column;\r\n");
        sb.append("import javax.persistence.Entity;\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import javax.persistence.FetchType;\r\n");
        }
        if ("是".equals(entityPO.getEntitySelf()) || BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.ForeignKey;\r\n");
        }
        sb.append("import javax.persistence.GeneratedValue;\r\n");
        sb.append("import javax.persistence.Id;\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.JoinColumn;\r\n");
        }
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import javax.persistence.ManyToMany;\r\n");
        }
        if ("是".equals(entityPO.getEntitySelf()) || BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.ManyToOne;\r\n");
        }
        sb.append("import javax.persistence.Table;\r\n");
        sb.append("import javax.validation.constraints.NotNull;\r\n");
        sb.append("import java.io.Serializable;\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Set;\r\n");
        }
        if (BeanUtils.ifDate(propertyPOList)) {
            sb.append("import java.sql.Date;\r\n");
        }
        if (BeanUtils.ifTimestamp(propertyPOList)) {
            sb.append("import java.sql.Timestamp;\r\n");
        }
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Entity\r\n");
        sb.append("@Table(name = ").append(poName).append("PO.T_").append(entityPO.getEntityCode().toUpperCase()).append(")\r\n");
        sb.append("@Getter\r\n");
        sb.append("@Setter\r\n");
        sb.append("@RequiredArgsConstructor\r\n");
        sb.append("@GenericGenerator(name = \"uuid2\", strategy = \"org.hibernate.id.UUIDGenerator\")\r\n");
        sb.append("@JsonIgnoreProperties(value = {\"hibernateLazyInitializer\", \"handler\"})\r\n");
        sb.append("public class ").append(poName).append("PO implements Serializable {\r\n");
        sb.append("\r\n");
        sb.append("    static final String T_").append(entityPO.getEntityCode().toUpperCase()).append(" = \"t_").append(entityPO.getEntityCode()).append("\";\r\n");
        sb.append("\r\n");
        sb.append("    @Id\r\n");
        sb.append("    @GeneratedValue(generator = \"uuid2\")\r\n");
        sb.append("    @Column(name = \"id\", length = 36)\r\n");
        sb.append("    private String id;\r\n");
        sb.append("\r\n");
        propertyPOList.forEach(propertyPO -> {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @Column(name = \"").append(propertyPO.getPropertyCode()).append("_id\", insertable = false, updatable = false)\r\n");
                    sb.append("    private String ").append(underPropertyOut).append("Id;\r\n");
                    sb.append("\r\n");
                    sb.append("    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})\r\n");
                    sb.append("    @JoinColumn(name = \"").append(propertyPO.getPropertyCode()).append("_id\", foreignKey = @ForeignKey(name = \"none\", value = ConstraintMode.NO_CONSTRAINT))\r\n");
                    sb.append("    private ").append(propertyOut).append("PO ").append(underPropertyOut).append(";\r\n");
                } else {
                    sb.append("    @JsonIgnore\r\n");
                    sb.append("    @ManyToMany(targetEntity = ").append(propertyOut).append("PO.class, fetch = FetchType.EAGER)\r\n");
                    sb.append("    @BatchSize(size = 20)\r\n");
                    sb.append("    private Set<").append(propertyOut).append("PO> ").append(underPropertyOut).append(";\r\n");
                }
            } else {
                if (StringUtils.isNotEmpty(propertyPO.getPropertyRequired()) && "是".equals(propertyPO.getPropertyRequired())) {
                    sb.append("    @NotNull(message = \"").append(propertyPO.getPropertyLabel()).append("不能为空\")\r\n");
                }
                if (StringUtils.isNotEmpty(propertyPO.getPropertyLength())) {
                    sb.append("    @Column(name = \"").append(propertyPO.getPropertyCode()).append("\", length = ").append(propertyPO.getPropertyLength()).append(")\r\n");
                } else {
                    sb.append("    @Column(name = \"").append(propertyPO.getPropertyCode()).append("\")\r\n");
                }
                sb.append("    private ").append(propertyPO.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(propertyPO.getPropertyCode())).append(";\r\n");
            }
            sb.append("\r\n");
        });
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("    @Column(name = \"").append(entityPO.getEntityCode()).append("_id\", insertable = false, updatable = false)\r\n");
            sb.append("    private String ").append(underPoName).append("Id;\r\n");
            sb.append("\r\n");
            sb.append("    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})\r\n");
            sb.append("    @JoinColumn(name = \"").append(entityPO.getEntityCode()).append("_id\", foreignKey = @ForeignKey(name = \"none\", value = ConstraintMode.NO_CONSTRAINT))\r\n");
            sb.append("    private ").append(poName).append("PO ").append(underPoName).append(";\r\n");
            sb.append("\r\n");
        }
        sb.append("    @NotNull(message = \"状态不能为空\")\r\n");
        sb.append("    @Column(name = \"status\")\r\n");
        sb.append("    private String status;\r\n");
        sb.append("\r\n");
        sb.append("    @NotNull(message = \"排序不能为空\")\r\n");
        sb.append("    @Column(name = \"sort_code\")\r\n");
        sb.append("    private String sortCode;\r\n");
        sb.append("\r\n");
        sb.append("}");
        String entityData = sb.toString();
        return new String[]{entityData, poName + "PO.java"};
    }

    public String[] daoGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String poName, String underPoName) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.cyjcommon.dao;\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
        sb.append("import org.springframework.data.jpa.repository.JpaRepository;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList) && BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Collection;\r\n");
            sb.append("import java.util.List;\r\n");
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        } else if (BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import java.util.List;\r\n");
            sb.append("\r\n");
        } else if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Collection;\r\n");
            sb.append("import java.util.List;\r\n");
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("Dao extends JpaRepository<").append(poName).append("PO, String> {\r\n");
        sb.append("\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("    List<").append(poName).append("PO> findBy").append(poName).append("OrderBySortCode(").append(poName).append("PO ").append(underPoName).append(");\r\n");
            sb.append("\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("    List<").append(poName).append("PO> findBy").append(propertyOut).append("OrderBySortCode(").append(propertyOut).append("PO ").append(underPropertyOut).append(");\r\n");
                    sb.append("\r\n");
                } else {
                    sb.append("    List<").append(poName).append("PO> findBy").append(propertyOut).append("InOrderBySortCode(Collection<Set<").append(propertyOut).append("PO>> ").append(underPropertyOut).append("List);\r\n");
                    sb.append("\r\n");
                }

            }
        }
        sb.append("}\r\n");
        String entityDaoData = sb.toString();
        return new String[]{entityDaoData, poName + "Dao.java"};
    }

    public String[] serviceGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String poName, String underPoName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        packageHandler(propertyPOList, poName, sb, poServicePath);
        sb.append("import org.springframework.data.domain.Page;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("Service {\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO addOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    void deleteOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO updateOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    Page<").append(poName).append("PO> findAll(Integer pageNumber);\r\n");
        sb.append("\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("    Page<").append(poName).append("PO> findAll(Integer pageNumber, ").append(poName).append("PO ").append(underPoName).append(");\r\n");
            sb.append("\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("    Page<").append(poName).append("PO> findAll(Integer pageNumber, ").append(propertyOut).append("PO ").append(underPropertyOut).append(");\r\n");
                    sb.append("\r\n");
                } else {
                    sb.append("    Page<").append(poName).append("PO> findAllBy").append(propertyOut).append("List(Integer pageNumber, Set<").append(propertyOut).append("PO> ").append(underPropertyOut).append("List);\r\n");
                    sb.append("\r\n");
                }
            }
        }
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "Service.java"};
    }

    private void packageHandler(List<PropertyPO> propertyPOList, String poName, StringBuilder sb, String poServicePath) {
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
    }

    public String[] serviceImplGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        List<EntityPO> subEntityPOList = entityDao.findByEntityOrderBySortCode(entityPO);
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import com.example.cyjcommon.dao.").append(subPoName).append("Dao;\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut()) && MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import com.example.cyjcommon.dao.").append(propertyOut).append("Dao;\r\n");
            }
        }
        sb.append("import com.example.cyjcommon.dao.").append(poName).append("Dao;\r\n");
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import com.example.cyjcommon.entity.po.").append(subPoName).append("PO;\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import ").append(poServicePath).append(subPoName).append("Service;\r\n");
        }
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList) || BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import org.springframework.data.domain.Example;\r\n");
        }
        sb.append("import org.springframework.data.domain.Page;\r\n");
        sb.append("import org.springframework.data.domain.PageRequest;\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList) || BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import org.springframework.data.domain.Pageable;\r\n");
        }
        sb.append("import org.springframework.data.domain.Sort;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        if (!subEntityPOList.isEmpty()) {
            sb.append("import java.util.List;\r\n");
            sb.append("\r\n");
        }
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Service\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("ServiceImpl extends BaseService implements ").append(poName).append("Service {\r\n");
        sb.append("\r\n");
        sb.append("    private ").append(poName).append("Dao ").append(underPoName).append("Dao;\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut()) && MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    private ").append(propertyOut).append("Dao ").append(underPropertyOut).append("Dao;\r\n");
            }
        }
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("    private ").append(subPoName).append("Dao ").append(underSubPoName).append("Dao;\r\n");
            sb.append("    private ").append(subPoName).append("Service ").append(underSubPoName).append("Service;\r\n");
        }
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void set").append(poName).append("Dao(").append(poName).append("Dao ").append(underPoName).append("Dao) {\r\n");
        sb.append("        this.").append(underPoName).append("Dao = ").append(underPoName).append("Dao;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut()) && MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @Autowired\r\n");
                sb.append("    public void set").append(propertyOut).append("Dao(").append(propertyOut).append("Dao ").append(underPropertyOut).append("Dao) {\r\n");
                sb.append("        this.").append(underPropertyOut).append("Dao = ").append(underPropertyOut).append("Dao;\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
            }
        }
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("    @Autowired\r\n");
            sb.append("    public void set").append(subPoName).append("Dao(").append(subPoName).append("Dao ").append(underSubPoName).append("Dao) {\r\n");
            sb.append("        this.").append(underSubPoName).append("Dao = ").append(underSubPoName).append("Dao;\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
            sb.append("    @Autowired\r\n");
            sb.append("    public void set").append(subPoName).append("Service(").append(subPoName).append("Service ").append(underSubPoName).append("Service) {\r\n");
            sb.append("        this.").append(underSubPoName).append("Service = ").append(underSubPoName).append("Service;\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
        }
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO addOne(").append(poName).append("PO po) {\r\n");
        addAndUpdataHandler(entityPO, propertyPOList, underPoName, poName, sb);
        sb.append("        return ").append(underPoName).append("Dao.save(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void deleteOne(").append(poName).append("PO po) {\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("        List<").append(poName).append("PO> ").append(underPoName).append("POList = ").append(underPoName).append("Dao.findBy").append(poName).append("OrderBySortCode(po);\r\n");
            sb.append("        for (").append(poName).append("PO ").append(underPoName).append("PO : ").append(underPoName).append("POList) {\r\n");
            sb.append("            deleteOne(").append(underPoName).append("PO);\r\n");
            sb.append("        }\r\n");
        }
        for (EntityPO entityPO1 : subEntityPOList) {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(entityPO1.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("        List<").append(subPoName).append("PO> ").append(underSubPoName).append("POList = ").append(underSubPoName).append("Dao.findBy").append(poName).append("OrderBySortCode(po);\r\n");
            sb.append("        for (").append(subPoName).append("PO ").append(underSubPoName).append("PO : ").append(underSubPoName).append("POList) {\r\n");
            sb.append("            ").append(underSubPoName).append("Service.deleteOne(").append(underSubPoName).append("PO);\r\n");
            sb.append("        }\r\n");
        }
        sb.append("        ").append(underPoName).append("Dao.delete(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
        addAndUpdataHandler(entityPO, propertyPOList, underPoName, poName, sb);
        sb.append("        return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public Page<").append(poName).append("PO> findAll(Integer pageNumber) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending()));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            OverRideHandler(underPoName, poName, sb, underPoName, poName);
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    OverRideHandler(underPoName, poName, sb, underPropertyOut, propertyOut);
                } else {
                    sb.append("    @Override\r\n");
                    sb.append("    public Page<").append(poName).append("PO> findAllBy").append(propertyOut).append("List(Integer pageNumber, Set<").append(propertyOut).append("PO> ").append(underPropertyOut).append("List) {\r\n");
                    sb.append("        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending());\r\n");
                    sb.append("        ").append(poName).append("PO ").append(underPoName).append("PO = new ").append(poName).append("PO();\r\n");
                    sb.append("        ").append(underPoName).append("PO.set").append(propertyOut).append("(").append(underPropertyOut).append("List);\r\n");
                    sb.append("        Example<").append(poName).append("PO> example = Example.of(").append(underPoName).append("PO);\r\n");
                    sb.append("        return ").append(underPoName).append("Dao.findAll(example, pageable);\r\n");
                    sb.append("    }\r\n");
                    sb.append("\r\n");
                }
            }
        }
        sb.append("}\r\n");
        String entityServiceImplData = sb.toString();
        return new String[]{entityServiceImplData, poName + "ServiceImpl.java"};
    }

    private void addAndUpdataHandler(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName, StringBuilder sb) {
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("        if (po.get").append(poName).append("Id() != null){\r\n");
            sb.append("            ").append(poName).append("PO ").append(underPoName).append("PO = ").append(underPoName).append("Dao.getOne(po.get").append(poName).append("Id());\r\n");
            sb.append("            po.set").append(poName).append("(").append(underPoName).append("PO);\r\n");
            sb.append("        }\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut()) && MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("        if (po.get").append(propertyOut).append("Id() != null){\r\n");
                sb.append("            ").append(propertyOut).append("PO ").append(underPropertyOut).append("PO = ").append(underPropertyOut).append("Dao.getOne(po.get").append(propertyOut).append("Id());\r\n");
                sb.append("            po.set").append(propertyOut).append("(").append(underPropertyOut).append("PO);\r\n");
                sb.append("        }\r\n");
            }
        }
    }

    private void OverRideHandler(String underPoName, String poName, StringBuilder sb, String underPropertyOut, String propertyOut) {
        sb.append("    @Override\r\n");
        sb.append("    public Page<").append(poName).append("PO> findAll(Integer pageNumber, ").append(propertyOut).append("PO ").append(underPropertyOut).append(") {\r\n");
        sb.append("        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending());\r\n");
        sb.append("        ").append(poName).append("PO ").append(underPoName).append("PO = new ").append(poName).append("PO();\r\n");
        sb.append("        ").append(underPoName).append("PO.set").append(propertyOut).append("(").append(underPropertyOut).append(");\r\n");
        sb.append("        Example<").append(poName).append("PO> example = Example.of(").append(underPoName).append("PO);\r\n");
        sb.append("        return ").append(underPoName).append("Dao.findAll(example, pageable);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
    }

    public String[] controllerGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        packageHandler(propertyPOList, poName, sb, poControllerPath);
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.validation.BindingResult;\r\n");
        sb.append("import org.springframework.validation.annotation.Validated;\r\n");
        sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public interface ").append(poName).append("Controller {\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"查询所有").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Page\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Page(@RequestParam(\"pageNumber\") Integer pageNumber);\r\n");
        sb.append("\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("    @Operation(summary = \"根据").append(poName).append("查询所有").append(poName).append("\")\r\n");
            sb.append("    @PostMapping(value = \"").append(underPoName).append("PageBy").append(poName).append("\")\r\n");
            sb.append("    ResultVO ").append(underPoName).append("Page(@RequestParam(\"pageNumber\") Integer pageNumber, @RequestBody ").append(poName).append("PO ").append(underPoName).append(");\r\n");
            sb.append("\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @Operation(summary = \"根据").append(propertyOut).append("查询所有").append(poName).append("\")\r\n");
                    sb.append("    @PostMapping(value = \"").append(underPoName).append("PageBy").append(propertyOut).append("\")\r\n");
                    sb.append("    ResultVO ").append(underPoName).append("Page(@RequestParam(\"pageNumber\") Integer pageNumber, @RequestBody ").append(propertyOut).append("PO ").append(underPropertyOut).append(");\r\n");
                    sb.append("\r\n");
                } else {
                    sb.append("    @Operation(summary = \"根据").append(propertyOut).append("List查询所有").append(poName).append("\")\r\n");
                    sb.append("    @PostMapping(value = \"").append(underPoName).append("PageBy").append(propertyOut).append("List\")\r\n");
                    sb.append("    ResultVO ").append(underPoName).append("PageBy").append(propertyOut).append("List(@RequestParam(\"pageNumber\") Integer pageNumber, @RequestBody Set<").append(propertyOut).append("PO> ").append(underPropertyOut).append("List);\r\n");
                    sb.append("\r\n");
                }
            }
        }
        sb.append("    @Operation(summary = \"保存").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Save\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Save(@RequestBody @Validated ").append(poName).append("PO po, BindingResult bindingResult);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Delete\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Delete(@RequestBody ").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "Controller.java"};
    }

    public String[] controllerImplGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //serviceImpl路径
        String poServicePath = packetPath + ".service.auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto.";
        sb.append("package ").append(poControllerPath).append("Impl;\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poControllerPath).append(poName).append("Controller;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.validation.BindingResult;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@CrossOrigin\r\n");
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
        sb.append("public class ").append(poName).append("ControllerImpl implements ").append(poName).append("Controller {\r\n");
        sb.append("\r\n");
        sb.append("    private ").append(poName).append("Service ").append(underPoName).append("Service;\r\n");
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void set").append(poName).append("Service(").append(poName).append("Service ").append(underPoName).append("Service) {\r\n");
        sb.append("        this.").append(underPoName).append("Service = ").append(underPoName).append("Service;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO ").append(underPoName).append("Page(Integer pageNumber) {\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.findAll(pageNumber));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        if ("是".equals(entityPO.getEntitySelf())) {
            sb.append("    @Override\r\n");
            sb.append("    public ResultVO ").append(underPoName).append("Page(Integer pageNumber, ").append(poName).append("PO ").append(underPoName).append(") {\r\n");
            sb.append("        return ResultVO.success(").append(underPoName).append("Service.findAll(pageNumber, ").append(underPoName).append("));\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
        }
        for (PropertyPO propertyPO : propertyPOList) {
            if ("是".equals(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (MANY_TO_ONE.equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @Override\r\n");
                    sb.append("    public ResultVO ").append(underPoName).append("Page(Integer pageNumber, ").append(propertyOut).append("PO ").append(underPropertyOut).append(") {\r\n");
                    sb.append("        return ResultVO.success(").append(underPoName).append("Service.findAll(pageNumber, ").append(underPropertyOut).append("));\r\n");
                    sb.append("    }\r\n");
                    sb.append("\r\n");
                } else {
                    sb.append("    @Override\r\n");
                    sb.append("    public ResultVO ").append(underPoName).append("PageBy").append(propertyOut).append("List(Integer pageNumber, Set<").append(propertyOut).append("PO> ").append(underPropertyOut).append("List) {\r\n");
                    sb.append("        return ResultVO.success(").append(underPoName).append("Service.findAllBy").append(propertyOut).append("List(pageNumber, ").append(underPropertyOut).append("List));\r\n");
                    sb.append("    }\r\n");
                    sb.append("\r\n");
                }
            }
        }
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO ").append(underPoName).append("Save(").append(poName).append("PO po, BindingResult bindingResult) {\r\n");
        sb.append("        if (bindingResult.hasErrors()) {\r\n");
        sb.append("            return ResultVO.failure(bindingResult.getAllErrors().get(0));\r\n");
        sb.append("        }\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.success(").append(underPoName).append("Service.addOne(po));\r\n");
        sb.append("        }\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.updateOne(po));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO ").append(underPoName).append("Delete(").append(poName).append("PO po) {\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.failure();\r\n");
        sb.append("        }\r\n");
        sb.append("        ").append(underPoName).append("Service.deleteOne(po);\r\n");
        sb.append("        return ResultVO.success();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerImplData = sb.toString();
        return new String[]{entityControllerImplData, poName + "ControllerImpl.java"};
    }

    private String[] controllerImplCustomGenerate(String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.custom.";
        sb.append("package ").append(poControllerPath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import ").append(poControllerPath).append(poName).append("CustomController;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@CrossOrigin\r\n");
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
        sb.append("public class ").append(poName).append("CustomControllerImpl implements ").append(poName).append("CustomController {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerImplData = sb.toString();
        return new String[]{entityControllerImplData, poName + "CustomControllerImpl.java"};
    }

    private String[] controllerCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.custom;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public interface ").append(poName).append("CustomController {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "CustomController.java"};
    }

    private String[] serviceImplCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.custom.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("CustomService;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Service\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("CustomServiceImpl extends BaseService implements ").append(poName).append("CustomService {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceImplData = sb.toString();
        return new String[]{entityServiceImplData, poName + "CustomServiceImpl.java"};
    }

    private String[] serviceCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.custom;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("CustomService {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "CustomService.java"};
    }

    private String[] aopCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //serviceImpl路径
        String poServicePath = packetPath + ".service.auto.";
        sb.append("package ").append(packetPath).append(".service.custom.aop;\r\n");
        sb.append("\r\n");
        sb.append("import org.aspectj.lang.JoinPoint;\r\n");
        sb.append("import org.aspectj.lang.annotation.After;\r\n");
        sb.append("import org.aspectj.lang.annotation.Aspect;\r\n");
        sb.append("import org.aspectj.lang.annotation.Before;\r\n");
        sb.append("import org.slf4j.Logger;\r\n");
        sb.append("import org.slf4j.LoggerFactory;\r\n");
        sb.append("import org.springframework.stereotype.Component;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Aspect\r\n");
        sb.append("@Component\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("CustomAop {\r\n");
        sb.append("\r\n");
        sb.append("    private static final Logger logger = LoggerFactory.getLogger(").append(poName).append("CustomAop.class);\r\n");
        sb.append("\r\n");
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.addOne(..))\")\r\n");
        sb.append("    public void addOneBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.addOneBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.addOne(..))\")\r\n");
        sb.append("    public void addOneAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.addOneAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.deleteOne(..))\")\r\n");
        sb.append("    public void deleteOneBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.deleteOneBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.deleteOne(..))\")\r\n");
        sb.append("    public void deleteOneAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.deleteOneAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.updateOne(..))\")\r\n");
        sb.append("    public void updateOneBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.updateOneBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.updateOne(..))\")\r\n");
        sb.append("    public void updateOneAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.updateOneAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findAll(..))\")\r\n");
        sb.append("    public void findAllBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findAllBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findAll(..))\")\r\n");
        sb.append("    public void findAllAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findAllAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityAopData = sb.toString();
        return new String[]{entityAopData, poName + "CustomAop.java"};
    }

    @Override
    public JSONObject findDataTableAndFormByName(String entityCode) {
        EntityPO po = queryFactory.selectFrom(QEntityPO.entityPO).where(QEntityPO.entityPO.entityCode.eq(entityCode)).fetchOne();
        if (po == null) {
            return null;
        }
        List<PropertyPO> propertyPOList = propertyDao.findByEntityOrderBySortCode(po);
        List<PropertyCustomDTO> propertyCustomDTOList = new ArrayList<>();
        for (PropertyPO propertyPO : propertyPOList) {
            PropertyCustomDTO propertyCustomDTO = new PropertyCustomDTO();
            propertyCustomDTO.setId(propertyPO.getId());
            propertyCustomDTO.setPropertyCode(propertyPO.getPropertyCode());
            propertyCustomDTO.setPropertyName(BeanUtils.underline2Camel(propertyPO.getPropertyCode()));
            propertyCustomDTO.setPropertyDirection(propertyPO.getPropertyDirection());
            propertyCustomDTO.setPropertyDisplay("否".equals(propertyPO.getPropertyDisplay()));
            propertyCustomDTO.setPropertyDefaultValue(propertyPO.getPropertyDefaultValue());
            propertyCustomDTO.setPropertyLabel(propertyPO.getPropertyLabel());
            propertyCustomDTO.setPropertyMode(propertyPO.getPropertyMode());
            propertyCustomDTO.setPropertyType(propertyPO.getPropertyType());
            propertyCustomDTO.setPropertyWidth(propertyPO.getPropertyWidth());
            propertyCustomDTO.setSortCode(propertyPO.getSortCode());
            propertyCustomDTO.setPropertyMode(propertyPO.getPropertyMode());
            propertyCustomDTO.setPropertyDataSourceType(propertyPO.getPropertyDataSourceType());
            propertyCustomDTO.setPropertyEditEnable("否".equals(propertyPO.getPropertyEditEnable()));
            propertyCustomDTO.setPropertyRequired("是".equals(propertyPO.getPropertyRequired()));
            if (StringUtils.isNotEmpty(propertyPO.getPropertyDataSourceType())) {
                List<DictionaryPO> dictionaryDTOList = dictionaryCustomService.findCatalogByValue(propertyCustomDTO.getPropertyDataSourceType());
                JSONArray mapList = new JSONArray();
                JSONObject mapNull = new JSONObject();
                mapNull.put("label", "无");
                mapNull.put("value", null);
                mapList.add(mapNull);
                JSONObject mapOut = new JSONObject();
                mapOut.put("label", "外键");
                mapOut.put("value", "out");
                mapList.add(mapOut);
                if (dictionaryDTOList != null && dictionaryDTOList.size() != 0) {
                    for (DictionaryPO dictionaryPO : dictionaryDTOList) {
                        Map<String, String> map = new HashMap<>();
                        map.put("label", dictionaryPO.getDictionaryName());
                        map.put("value", dictionaryPO.getDictionaryValue());
                        mapList.add(map);
                    }
                }
                List<Map<String, Object>> dateSourceList = sqlCustomService.queryBySqlValue(propertyCustomDTO.getPropertyDataSourceType());
                if (dateSourceList != null && dateSourceList.size() != 0) {
                    for (Map<String, Object> dateSourceMap : dateSourceList) {
                        JSONObject map = new JSONObject();
                        if (dateSourceMap.get("label") == null && dateSourceMap.get("value") == null) {
                            continue;
                        }
                        map.put("label", dateSourceMap.get("label").toString());
                        map.put("value", dateSourceMap.get("value").toString());
                        mapList.add(map);
                    }
                }
                propertyCustomDTO.setPropertyDataSource(mapList);
            }
            propertyCustomDTOList.add(propertyCustomDTO);
        }
        List<PropertyCustomDTO> propertyCustomDTOS = propertyCustomDTOList.stream().sorted(Comparator.comparing(PropertyCustomDTO::getSortCode)).collect(Collectors.toList());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataTable", propertyCustomDTOS);
        jsonObject.put("dataForm", propertyCustomDTOS);
        JSONObject customData = new JSONObject();
        customData.put("customType", "是".equals(po.getEntityCustomTable()));
        customData.put("customForm", "是".equals(po.getEntityCustomForm()));
        customData.put("editEnable", "是".equals(po.getEntityEditEnable()));
        customData.put("formType", po.getEntityFormType());
        customData.put("formCol", po.getEntityFormRow());
        customData.put("isOutSelf", "是".equals(po.getEntitySelf()));
        if ("是".equals(po.getEntitySelf())) {
            JSONObject outSelf = new JSONObject();
            outSelf.put("label", po.getEntityName());
            outSelf.put("name", BeanUtils.underline2Camel(po.getEntityCode()) + "Id");
            outSelf.put("code", po.getEntityCode() + "_id");
            JSONArray mapOutList = new JSONArray();
            List<Map<String, Object>> dateSourceList = sqlCustomService.queryBySqlValue("ENTITY_FORM_DATESOURSE");
            if (dateSourceList != null && dateSourceList.size() != 0) {
                for (Map<String, Object> dateSourceMap : dateSourceList) {
                    JSONObject map = new JSONObject();
                    if (dateSourceMap.get("label") == null && dateSourceMap.get("value") == null) {
                        continue;
                    }
                    map.put("label", dateSourceMap.get("label").toString());
                    map.put("value", dateSourceMap.get("value").toString());
                    mapOutList.add(map);
                }
            }
            outSelf.put("dataSource", mapOutList);
            customData.put("outSelf", outSelf);
        }
        jsonObject.put("customData", customData);
        return jsonObject;
    }

}
