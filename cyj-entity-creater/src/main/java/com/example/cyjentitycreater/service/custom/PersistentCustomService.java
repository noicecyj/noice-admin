package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.entity.QAuthority;
import com.example.cyjcommon.entity.QEntity;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.BeanUtils;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import com.example.cyjentitycreater.entity.dto.PropertyCustomDTO;
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
public class PersistentCustomService extends BaseService {

    private final static String componentPath = "C:/Users/noice/IdeaProjects/noice-admin/noice/src/pages/";
    private final static String POST = "POST";
    private final static String AUTO = "auto";
    private final static String STATUS = "有效";
    private final static String SORTCODE = "10";
    private final static String commonPath = "C:/Users/noice/IdeaProjects/noice-admin/cyj-common/src/main/java/com/example/cyjcommon";
    private PersistentDao persistentDao;
    private PropertyDao propertyDao;
    private AuthorityDao authorityDao;
    private DictionaryCustomService dictionaryCustomService;
    private SqlCustomService sqlCustomService;

    @Autowired
    public void setEntityDao(PersistentDao persistentDao) {
        this.persistentDao = persistentDao;
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

    public void generateJavaFile(Persistent persistent) {
        if (persistent == null) {
            return;
        }
        entityHandler(persistent);
    }

    private void authorityHandler(Persistent persistent) {
        List<Property> propertyList = propertyDao.findByPersistentOrderBySortCode(persistent);
        List<Property> outPropertyList = propertyList.stream()
                .filter(property -> "是".equals(property.getPropertyOut())).collect(Collectors.toList());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        Authority findAll = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/page" + poName)).fetchOne();
        if (findAll == null) {
            findAll = new Authority();
            findAll.setAuthorityMethod(POST);
            findAll.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/page" + poName);
            findAll.setAuthorityName("查询所有" + poName);
            findAll.setAuthorityType(AUTO);
            findAll.setAuthorityDescription("查询所有" + poName);
            findAll.setPersistent(persistent);
            findAll.setAppService(persistent.getAppService());
            findAll.setSortCode(SORTCODE);
            findAll.setStatus(STATUS);
            authorityDao.save(findAll);
        }
        for (Property property : outPropertyList) {
            String underPropertyPoName = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyPoName = BeanUtils.captureName(underPropertyPoName);
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                oneToManyAuthorityHandler(persistent, poName, propertyPoName);
            }
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                manyToManyAuthorityHandler(persistent, poName, propertyPoName);
            }
        }
        Authority save = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/save" + poName)).fetchOne();
        if (save == null) {
            save = new Authority();
            save.setAuthorityMethod(POST);
            save.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/save" + poName);
            save.setAuthorityName("保存" + poName);
            save.setAuthorityType(AUTO);
            save.setAuthorityDescription("保存" + poName);
            save.setPersistent(persistent);
            save.setAppService(persistent.getAppService());
            save.setSortCode(SORTCODE);
            save.setStatus(STATUS);
            authorityDao.save(save);
        }
        Authority delete = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/delete" + poName)).fetchOne();
        if (delete == null) {
            delete = new Authority();
            delete.setAuthorityMethod(POST);
            delete.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/delete" + poName);
            delete.setAuthorityName("删除" + poName);
            delete.setAuthorityType(AUTO);
            delete.setAuthorityDescription("删除" + poName);
            delete.setPersistent(persistent);
            delete.setAppService(persistent.getAppService());
            delete.setSortCode(SORTCODE);
            delete.setStatus(STATUS);
            authorityDao.save(delete);
        }
    }

    private void oneToManyAuthorityHandler(Persistent persistent, String poName, String propertyPoName) {
        Authority oneToMany = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/page" + propertyPoName + "By" + poName)).fetchOne();
        if (oneToMany == null) {
            oneToMany = new Authority();
            oneToMany.setAuthorityMethod(POST);
            oneToMany.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/page" + propertyPoName + "By" + poName);
            oneToMany.setAuthorityName("根据" + propertyPoName + "查询所有" + poName);
            oneToMany.setAuthorityType(AUTO);
            oneToMany.setAuthorityDescription("根据" + propertyPoName + "查询所有" + poName);
            oneToMany.setPersistent(persistent);
            oneToMany.setAppService(persistent.getAppService());
            oneToMany.setSortCode(SORTCODE);
            oneToMany.setStatus(STATUS);
            authorityDao.save(oneToMany);
        }
    }

    private void manyToManyAuthorityHandler(Persistent persistent, String poName, String propertyPoName) {
        Authority manyToMany1 = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/" + propertyPoName + "By" + poName)).fetchOne();
        Authority manyToMany2 = queryFactory
                .selectFrom(QAuthority.authority)
                .where(QAuthority.authority.authorityPath
                        .eq(persistent.getAppService().getAppServiceApi() + "/" + propertyPoName + "Save" + poName)).fetchOne();
        if (manyToMany1 == null) {
            manyToMany1 = new Authority();
            manyToMany1.setAuthorityMethod(POST);
            manyToMany1.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/" + propertyPoName + "By" + poName);
            manyToMany1.setAuthorityName("根据" + poName + "查询所有" + propertyPoName);
            manyToMany1.setAuthorityType(AUTO);
            manyToMany1.setAuthorityDescription("根据" + poName + "查询所有" + propertyPoName);
            manyToMany1.setPersistent(persistent);
            manyToMany1.setAppService(persistent.getAppService());
            manyToMany1.setSortCode(SORTCODE);
            manyToMany1.setStatus(STATUS);
            authorityDao.save(manyToMany1);
        }
        if (manyToMany2 == null) {
            manyToMany2 = new Authority();
            manyToMany2.setAuthorityMethod(POST);
            manyToMany2.setAuthorityPath(persistent.getAppService().getAppServiceApi() + "/" + propertyPoName + "Save" + poName);
            manyToMany2.setAuthorityName("根据" + poName + "保存" + propertyPoName);
            manyToMany2.setAuthorityType(AUTO);
            manyToMany2.setAuthorityDescription("根据" + poName + "保存" + propertyPoName);
            manyToMany2.setPersistent(persistent);
            manyToMany2.setAppService(persistent.getAppService());
            manyToMany2.setSortCode(SORTCODE);
            manyToMany2.setStatus(STATUS);
            authorityDao.save(manyToMany2);
        }
    }

    public void entityHandler(Persistent persistent) {
        //查询是否存在子实体
        createEntityHandler(persistent);
        authorityHandler(persistent);
    }

    private void createEntityHandler(Persistent persistent) {
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(persistent.getPersistentCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AppService appService = persistent.getAppService();
        if (appService == null) {
            return;
        }
        //服务路径
        String appPath = appService.getAppServicePath();
        //服务接口
        String appApi = appService.getAppServiceApi();
        List<Property> propertyList = propertyDao.findByPersistentOrderBySortCode(persistent);
        Map<String, String[]> entityObj = new HashMap<>();
        List<Property> inPropertyList = propertyList.stream()
                .filter(property -> !"是".equals(property.getPropertyOut())).collect(Collectors.toList());
        List<Property> outPropertyList = propertyList.stream()
                .filter(property -> "是".equals(property.getPropertyOut())).collect(Collectors.toList());
        entityObj.put(commonPath + "/entity", poGenerate(persistent, inPropertyList, outPropertyList, poName, underPoName));
        entityObj.put(commonPath + "/dao", daoGenerate(poName));
        entityObj.put(appPath + "/service/auto", serviceGenerate(outPropertyList, poName, appPath));
        entityObj.put(appPath + "/controller/auto", controllerGenerate(outPropertyList, poName, appPath, appApi));
        entityObj.put(componentPath + poName + "/services/auto", servicesAutoGenerate(outPropertyList, appApi, underPoName, poName));
        entityObj.put(componentPath + poName + "/models/auto", modelsAutoGenerate(outPropertyList, underPoName, poName));
        entityObj.put(componentPath + poName + "/view/auto", viewAutoGenerate(outPropertyList, underPoName, poName));
        entityObj.put(componentPath + poName, indexGenerate(poName));
        entityObj.put(componentPath + poName, storeGenerate(outPropertyList, underPoName, poName));
        Map<String, String[]> entityCustomObj = new HashMap<>();
        entityCustomObj.put(appPath + "/service/custom", serviceCustomGenerate(poName, appPath));
        entityCustomObj.put(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath, appApi));
        entityCustomObj.put(componentPath + poName + "/services/custom", servicesCustomGenerate(poName));
        entityCustomObj.put(componentPath + poName + "/models/custom", modelsCustomGenerate(poName));
        entityCustomObj.put(componentPath + poName + "/view/custom", viewCustomGenerate(poName));
        createEntityCodeHandler(entityObj, entityCustomObj);
    }

    private String[] servicesAutoGenerate(List<Property> outPropertyList, String appApi, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import {request} from 'ice';\r\n");
        sb.append("\r\n");
        sb.append("export default {\r\n");
        sb.append("  page(pageNumber) {\r\n");
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/page").append(poName).append("',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      params: {\r\n");
        sb.append("        pageNumber,\r\n");
        sb.append("      },\r\n");
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        sb.append("  save(data) {\r\n");
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/save").append(poName).append("',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      data,\r\n");
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        sb.append("  delete(data) {\r\n");
        sb.append("    return request({\r\n");
        sb.append("      url: '/").append(appApi).append("/delete").append(poName).append("',\r\n");
        sb.append("      method: 'post',\r\n");
        sb.append("      data,\r\n");
        sb.append("    });\r\n");
        sb.append("  },\r\n");
        oneToManyServiceHandler(outPropertyList, sb, appApi, poName);
        manyToManyServiceHandler(outPropertyList, sb, appApi, poName);
        sb.append("};\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, poName + ".tsx"};
    }

    private void oneToManyServiceHandler(List<Property> outPropertyList, StringBuilder sb, String appApi, String poName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("  page").append(propertyOut).append("By").append(poName).append("(pageNumber, id) {\r\n");
                sb.append("    return request({\r\n");
                sb.append("      url: '/").append(appApi).append("/page").append(propertyOut).append("By").append(poName).append("',\r\n");
                sb.append("      method: 'post',\r\n");
                sb.append("      params: {\r\n");
                sb.append("        pageNumber,\r\n");
                sb.append("        id,\r\n");
                sb.append("      },\r\n");
                sb.append("    });\r\n");
                sb.append("  },\r\n");
            }
        }
    }

    private void manyToManyServiceHandler(List<Property> outPropertyList, StringBuilder sb, String appApi, String poName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                sb.append("  ").append(underPropertyOut).append("By").append(poName).append("(id) {\r\n");
                sb.append("    return request({\r\n");
                sb.append("      url: '/").append(appApi).append("/").append(underPropertyOut).append("By").append(poName).append("',\r\n");
                sb.append("      method: 'post',\r\n");
                sb.append("      params: {\r\n");
                sb.append("        id,\r\n");
                sb.append("      },\r\n");
                sb.append("    });\r\n");
                sb.append("  },\r\n");
                sb.append("  ").append(underPropertyOut).append("Save").append(poName).append("(id, data) {\r\n");
                sb.append("    return request({\r\n");
                sb.append("      url: '/").append(appApi).append("/").append(underPropertyOut).append("Save").append(poName).append("',\r\n");
                sb.append("      method: 'post',\r\n");
                sb.append("      params: {\r\n");
                sb.append("        id,\r\n");
                sb.append("      },\r\n");
                sb.append("      data,\r\n");
                sb.append("    });\r\n");
                sb.append("  },\r\n");
            }
        }
    }

    private String[] storeGenerate(List<Property> outPropertyList, String underPoName, String poName) {
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

    private void storeHandler1(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            sb.append("  ").append(underPropertyOut).append(",\r\n");
        }
    }

    private void storeHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("import ").append(underPropertyOut).append(" from '@/pages/").append(propertyOut).append("/models/auto/").append(propertyOut).append("';\r\n");
        }
    }


    private String[] indexGenerate(String poName) {
        String viewData = "import React from 'react';\r\n" +
                "import " + poName + " from '@/pages/" + poName + "/view/auto/" + poName + "';\r\n" +
                "\r\n" +
                "function " + poName + "Page() {\r\n" +
                "  return (\r\n" +
                "    <div>\r\n" +
                "      <" + poName + "/>\r\n" +
                "    </div>\r\n" +
                "  );\r\n" +
                "}\r\n" +
                "\r\n" +
                "export default " + poName + "Page;\r\n";
        return new String[]{viewData, "index.tsx"};
    }

    private String[] modelsCustomGenerate(String poName) {
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
        return new String[]{viewData, poName + ".tsx"};
    }

    private String[] servicesCustomGenerate(String poName) {
        String viewData = "\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

    private String[] viewCustomGenerate(String poName) {
        String viewData = "import React from \"react\";\r\n" +
                "\r\n" +
                "function CustomColumn" + poName + "(props) {\r\n" +
                "\r\n" +
                "  console.log(props)\r\n" +
                "\r\n" +
                "  return (\r\n" +
                "    <></>\r\n" +
                "  );\r\n" +
                "\r\n" +
                "}\r\n" +
                "\r\n" +
                "export {CustomColumn" + poName + "};\r\n";
        return new String[]{viewData, poName + ".tsx"};
    }

    private String[] modelsAutoGenerate(List<Property> outPropertyList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import initService from '@/services/init';\r\n");
        sb.append("import {Message} from \"@alifd/next\";\r\n");
        sb.append("import service from '@/pages/").append(poName).append("/services/auto/").append(poName).append("';\r\n");
        oneToManyModelServiceHandler(outPropertyList, sb);
        sb.append("\r\n");
        sb.append("export default {\r\n");
        sb.append("\r\n");
        sb.append("  namespace: '").append(underPoName).append("',\r\n");
        sb.append("\r\n");
        sb.append("  state: {\r\n");
        sb.append("    title: '添加',\r\n");
        sb.append("    tableData: [],\r\n");
        sb.append("    visible: false,\r\n");
        sb.append("    formData: {},\r\n");
        sb.append("    loadingVisible: true,\r\n");
        sb.append("    total: 0,\r\n");
        sb.append("    current: 1,\r\n");
        sb.append("    form: [],\r\n");
        sb.append("    table: [],\r\n");
        sb.append("    customData: {},\r\n");
        sb.append("    divVisible: false,\r\n");
        sb.append("    parent: \"\",\r\n");
        sb.append("    select: [],\r\n");
        sb.append("  },\r\n");
        sb.append("\r\n");
        sb.append("  reducers: {\r\n");
        sb.append("    setState(prevState, payload) {\r\n");
        sb.append("      return {...prevState, ...payload};\r\n");
        sb.append("    },\r\n");
        sb.append("  },\r\n");
        sb.append("\r\n");
        sb.append("  effects: (dispatch) => ({\r\n");
        sb.append("    async page(current) {\r\n");
        sb.append("      const dataRes = await service.page(current);\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        tableData: dataRes.data.content,\r\n");
        sb.append("        total: dataRes.data.totalElements,\r\n");
        sb.append("        current,\r\n");
        sb.append("        loadingVisible: false,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    async save(data) {\r\n");
        sb.append("      const ret = await service.save(data.formData);\r\n");
        sb.append("      if (ret.code === 400) {\r\n");
        sb.append("        Message.error(ret.data.defaultMessage);\r\n");
        sb.append("      } else {\r\n");
        sb.append("        Message.success('保存成功');\r\n");
        sb.append("        await this.page(data.current);\r\n");
        sb.append("        const payload = {\r\n");
        sb.append("          visible: false,\r\n");
        sb.append("        };\r\n");
        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("      }\r\n");
        sb.append("    },\r\n");
        sb.append("    async delete(data) {\r\n");
        sb.append("      const ret = await service.delete(data.record);\r\n");
        sb.append("      if (ret.code === 400) {\r\n");
        sb.append("        Message.error('删除失败');\r\n");
        sb.append("      } else {\r\n");
        sb.append("        Message.success('删除成功');\r\n");
        sb.append("        await this.page(data.current);\r\n");
        sb.append("        const payload = {\r\n");
        sb.append("          visible: false,\r\n");
        sb.append("        };\r\n");
        sb.append("        dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("      }\r\n");
        sb.append("    },\r\n");
        sb.append("    add() {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        formData: {},\r\n");
        sb.append("        title: '添加',\r\n");
        sb.append("        visible: true,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    edit(data) {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        formData: data,\r\n");
        sb.append("        title: '编辑',\r\n");
        sb.append("        visible: true,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    setDataForm(data) {\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        formData: data,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        sb.append("    async findDataTableAndFormByName() {\r\n");
        sb.append("      const ret = await initService.findDataTableAndFormByName('").append(underPoName).append("');\r\n");
        sb.append("      await this.page(1);\r\n");
        sb.append("      const payload = {\r\n");
        sb.append("        table: ret.data.dataTable,\r\n");
        sb.append("        form: ret.data.dataForm,\r\n");
        sb.append("        customData: ret.data.customData,\r\n");
        sb.append("      };\r\n");
        sb.append("      dispatch.").append(underPoName).append(".setState(payload);\r\n");
        sb.append("    },\r\n");
        oneToManyModelHandler(outPropertyList, sb, poName);
        manyToManyModelHandler(outPropertyList, sb, poName);
        sb.append("  }),\r\n");
        sb.append("};\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, poName + ".tsx"};
    }

    private void oneToManyModelServiceHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("import ").append(underPropertyOut).append("Service from '@/pages/").append(propertyOut).append("/services/auto/").append(propertyOut).append("'\r\n");
            }
        }
    }

    private void oneToManyModelHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    async page").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
                sb.append("      const ret = await initService.findDataTableAndFormByName('").append(underPropertyOut).append("');\r\n");
                sb.append("      const dataRes = await service.page").append(propertyOut).append("By").append(poName).append("(data.current, data.id);\r\n");
                sb.append("      const payload = {\r\n");
                sb.append("        table: ret.data.dataTable,\r\n");
                sb.append("        form: ret.data.dataForm,\r\n");
                sb.append("        customData: ret.data.customData,\r\n");
                sb.append("        tableData: dataRes.data.content,\r\n");
                sb.append("        total: dataRes.data.totalElements,\r\n");
                sb.append("        current: data.current,\r\n");
                sb.append("        loadingVisible: false,\r\n");
                sb.append("        divVisible: true,\r\n");
                sb.append("        parent: data.id,\r\n");
                sb.append("        visible: false,\r\n");
                sb.append("      };\r\n");
                sb.append("      dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
                sb.append("    },\r\n");
                sb.append("    async save").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
                sb.append("      const ret = await ").append(underPropertyOut).append("Service.save(data.formData);\r\n");
                sb.append("      if (ret.code === 400) {\r\n");
                sb.append("        Message.error(ret.data.defaultMessage);\r\n");
                sb.append("      } else {\r\n");
                sb.append("        Message.success('保存成功');\r\n");
                sb.append("        await this.page").append(propertyOut).append("By").append(poName).append("({\r\n");
                sb.append("          current: data.current,\r\n");
                sb.append("          id: data.id,\r\n");
                sb.append("        });\r\n");
                sb.append("        const payload = {\r\n");
                sb.append("          visible: false,\r\n");
                sb.append("        };\r\n");
                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
                sb.append("      }\r\n");
                sb.append("    },\r\n");
                sb.append("    async delete").append(propertyOut).append("By").append(poName).append("(data) {\r\n");
                sb.append("      const ret = await ").append(underPropertyOut).append("Service.delete(data.record);\r\n");
                sb.append("      if (ret.code === 400) {\r\n");
                sb.append("        Message.error('删除失败');\r\n");
                sb.append("      } else {\r\n");
                sb.append("        Message.success('删除成功');\r\n");
                sb.append("        await this.page").append(propertyOut).append("By").append(poName).append("({\r\n");
                sb.append("          current: data.current,\r\n");
                sb.append("          id: data.id,\r\n");
                sb.append("        });\r\n");
                sb.append("        const payload = {\r\n");
                sb.append("          visible: false,\r\n");
                sb.append("        };\r\n");
                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
                sb.append("      }\r\n");
                sb.append("    },\r\n");


            }
        }
    }

    private void manyToManyModelHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                sb.append("    async ").append(underPropertyOut).append("By").append(poName).append("(data) {\r\n");
                sb.append("      await dispatch.").append(underPropertyOut).append(".findDataTableAndFormByName();\r\n");
                sb.append("      const ret = await service.").append(underPropertyOut).append("By").append(poName).append("(data.id);\r\n");
                sb.append("      if (ret.code === 400) {\r\n");
                sb.append("        Message.error('获取失败');\r\n");
                sb.append("      } else {\r\n");
                sb.append("        const payload = {\r\n");
                sb.append("          divVisible: true,\r\n");
                sb.append("          parent: data.id,\r\n");
                sb.append("          select: ret.data,\r\n");
                sb.append("        };\r\n");
                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
                sb.append("      }\r\n");
                sb.append("    },\r\n");
                sb.append("    async ").append(underPropertyOut).append("Save").append(poName).append("(data) {\r\n");
                sb.append("      const ret = await service.").append(underPropertyOut).append("Save").append(poName).append("(data.parent, data.select);\r\n");
                sb.append("      if (ret.code === 400) {\r\n");
                sb.append("        Message.error('保存失败');\r\n");
                sb.append("      } else {\r\n");
                sb.append("        Message.success('保存成功');\r\n");
                sb.append("        const payload = {\r\n");
                sb.append("          divVisible: false,\r\n");
                sb.append("        };\r\n");
                sb.append("        dispatch.").append(underPropertyOut).append(".setState(payload);\r\n");
                sb.append("      }\r\n");
                sb.append("    },\r\n");
            }
        }
    }

    private String[] viewAutoGenerate(List<Property> outPropertyList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import React, {useEffect} from 'react';\r\n");
        sb.append("import pageStore from '@/pages/").append(poName).append("/store';\r\n");
        sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
        sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
        sb.append("import {CustomColumn} from '@/pages/").append(poName).append("/view/custom/").append(poName).append("';\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)){
            sb.append("import {Dialog} from \"@alifd/next\";\r\n");
        }
        sb.append("\r\n");
        sb.append("function ").append(poName).append("() {\r\n");
        sb.append("\r\n");
        sb.append("  const [state, dispatchers] = pageStore.useModel('").append(underPoName).append("');\r\n");
        sb.append("\r\n");
        sb.append("  const [customState, customDispatchers] = pageStore.useModel('").append(underPoName).append("Custom');\r\n");
        sb.append("\r\n");
        ViewStoreHandler(outPropertyList, sb);
        sb.append("  useEffect(() => {\r\n");
        sb.append("    dispatchers.findDataTableAndFormByName().then(r => console.log(r));\r\n");
        sb.append("  }, [dispatchers]);\r\n");
        sb.append("\r\n");
        sb.append("  return (\r\n");
        sb.append("    <>\r\n");
        sb.append("      <DataTableTemple\r\n");
        sb.append("        createItem={() => dispatchers.add()}\r\n");
        sb.append("        editItem={record => dispatchers.edit(record)}\r\n");
        sb.append("        deleteItem={record => dispatchers.delete({\r\n");
        sb.append("          current: state.current,\r\n");
        sb.append("          record,\r\n");
        sb.append("        })}\r\n");
        sb.append("        visibleLoading={state.loadingVisible}\r\n");
        sb.append("        dataSource={state.tableData}\r\n");
        sb.append("        items={state.table}\r\n");
        sb.append("        total={state.total}\r\n");
        sb.append("        getPage={current => dispatchers.page(current)}\r\n");
        sb.append("        primaryKey=\"id\"\r\n");
        sb.append("        customData={state.customData}\r\n");
        sb.append("        columnRender={(value, index, record) => {\r\n");
        sb.append("          return (\r\n");
        sb.append("            <CustomColumn value={value} index={index} record={record}/>\r\n");
        sb.append("          );\r\n");
        sb.append("        }}\r\n");
        oneToManyViewMethodHandler(outPropertyList, sb, poName);
        manyToManyViewMethodHandler(outPropertyList, sb, poName);
        sb.append("        customMethod1={() => customDispatchers.customMethod1()}\r\n");
        sb.append("        customMethod2={() => customDispatchers.customMethod2()}\r\n");
        sb.append("        customMethod3={() => customDispatchers.customMethod3()}\r\n");
        sb.append("        customMethodName1={customState.customMethodName1}\r\n");
        sb.append("        customMethodName2={customState.customMethodName2}\r\n");
        sb.append("        customMethodName3={customState.customMethodName3}\r\n");
        sb.append("      />\r\n");
        sb.append("      <DataFormTemple\r\n");
        sb.append("        customData={state.customData}\r\n");
        sb.append("        title={state.title}\r\n");
        sb.append("        visibleDialog={state.visible}\r\n");
        sb.append("        onClose={() => dispatchers.setState({visible: false})}\r\n");
        sb.append("        items={[...state.form, ...customState.customFrom]}\r\n");
        sb.append("        dispatchers={value => dispatchers.setDataForm(value)}\r\n");
        sb.append("        onOk={() => dispatchers.save({\r\n");
        sb.append("          current: state.current,\r\n");
        sb.append("          formData: state.formData,\r\n");
        sb.append("        })}\r\n");
        sb.append("        formDataValue={state.formData}\r\n");
        sb.append("        formSortCode={String(Number.parseInt(String(state.total)) + 10)}\r\n");
        sb.append("      />\r\n");
        oneToManyViewDialogHandler(outPropertyList, sb, poName, underPoName);
        manyToManyViewDialogHandler(outPropertyList, sb, poName);
        sb.append("    </>\r\n");
        sb.append("  );\r\n");
        sb.append("}\r\n");
        sb.append("\r\n");
        sb.append("export default ").append(poName).append(";\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, poName + ".tsx"};
    }

    private void ViewStoreHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            if (!BeanUtils.MANY_TO_ONE.equals(property.getPropertyOutType())) {
                sb.append("  const [").append(underPropertyOut).append("State, ").append(underPropertyOut).append("Dispatchers] = pageStore.useModel('").append(underPropertyOut).append("');\r\n");
                sb.append("\r\n");
            }
        }
    }

    private void oneToManyViewMethodHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
        List<Property> oneToManyPropertyList = outPropertyList.stream()
                .filter(property -> BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())).collect(Collectors.toList());
        for (int i = 0; i < oneToManyPropertyList.size(); i++) {
            Property property = oneToManyPropertyList.get(i);
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("        son").append(i + 1).append("=\"").append(property.getPropertyLabel()).append("\"\r\n");
            sb.append("        sonMethod").append(i + 1).append("={record => dispatchers.page").append(propertyOut).append("By").append(poName).append("({\r\n");
            sb.append("          current: 1,\r\n");
            sb.append("          id: record.id,\r\n");
            sb.append("        })}\r\n");
        }
    }

    private void manyToManyViewMethodHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
        List<Property> manyToManyPropertyList = outPropertyList.stream()
                .filter(property -> BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())).collect(Collectors.toList());
        for (int i = 0; i < manyToManyPropertyList.size(); i++) {
            Property property = manyToManyPropertyList.get(i);
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            sb.append("        manyToMany").append(i + 1).append("=\"").append(property.getPropertyLabel()).append("\"\r\n");
            sb.append("        manyToManyMethod").append(i + 1).append("={record => dispatchers.").append(underPropertyOut).append("By").append(poName).append("(record)}\r\n");
        }
    }

    private void manyToManyViewDialogHandler(List<Property> outPropertyList, StringBuilder sb, String poName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                sb.append("      <Dialog\r\n");
                sb.append("        v2\r\n");
                sb.append("        title=\"").append(property.getPropertyLabel()).append("\"\r\n");
                sb.append("        visible={").append(underPropertyOut).append("State.divVisible}\r\n");
                sb.append("        onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
                sb.append("          divVisible: false,\r\n");
                sb.append("          parent: \"\",\r\n");
                sb.append("          select: [],\r\n");
                sb.append("        })}\r\n");
                sb.append("        onOk={() => dispatchers.").append(underPropertyOut).append("Save").append(poName).append("({\r\n");
                sb.append("          parent: ").append(underPropertyOut).append("State.parent,\r\n");
                sb.append("          select: ").append(underPropertyOut).append("State.select,\r\n");
                sb.append("        })}\r\n");
                sb.append("        style={{width: '90%'}}\r\n");
                sb.append("      >\r\n");
                sb.append("        <DataTableTemple\r\n");
                sb.append("          customData={{customType: false}}\r\n");
                sb.append("          visibleLoading={").append(underPropertyOut).append("State.loadingVisible}\r\n");
                sb.append("          dataSource={").append(underPropertyOut).append("State.tableData}\r\n");
                sb.append("          items={").append(underPropertyOut).append("State.table}\r\n");
                sb.append("          total={").append(underPropertyOut).append("State.total}\r\n");
                sb.append("          getPage={(current) => ").append(underPropertyOut).append("Dispatchers.page(current)}\r\n");
                sb.append("          primaryKey=\"id\"\r\n");
                sb.append("          rowSelection={{\r\n");
                sb.append("            onChange: (ids) => {\r\n");
                sb.append("              ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
                sb.append("                select: ids,\r\n");
                sb.append("              })\r\n");
                sb.append("            },\r\n");
                sb.append("            selectedRowKeys: ").append(underPropertyOut).append("State.select,\r\n");
                sb.append("          }}\r\n");
                sb.append("        />\r\n");
                sb.append("      </Dialog>\r\n");
            }
        }
    }

    private void oneToManyViewDialogHandler(List<Property> outPropertyList, StringBuilder sb, String poName, String underPoName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("      <Dialog\r\n");
                sb.append("        v2\r\n");
                sb.append("        visible={").append(underPropertyOut).append("State.divVisible}\r\n");
                sb.append("        footer={false}\r\n");
                sb.append("        onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({\r\n");
                sb.append("          divVisible: false,\r\n");
                sb.append("          parent: \"\",\r\n");
                sb.append("        })}\r\n");
                sb.append("        style={{width: '100%'}}\r\n");
                sb.append("      >\r\n");
                sb.append("        <DataTableTemple\r\n");
                sb.append("          createItem={() => ").append(underPropertyOut).append("Dispatchers.add()}\r\n");
                sb.append("          editItem={record => ").append(underPropertyOut).append("Dispatchers.edit(record)}\r\n");
                sb.append("          deleteItem={record => dispatchers.delete").append(propertyOut).append("By").append(poName).append("({\r\n");
                sb.append("            current: ").append(underPropertyOut).append("State.current,\r\n");
                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
                sb.append("            record,\r\n");
                sb.append("          })}\r\n");
                sb.append("          visibleLoading={").append(underPropertyOut).append("State.loadingVisible}\r\n");
                sb.append("          dataSource={").append(underPropertyOut).append("State.tableData}\r\n");
                sb.append("          items={").append(underPropertyOut).append("State.table}\r\n");
                sb.append("          total={").append(underPropertyOut).append("State.total}\r\n");
                sb.append("          getPage={current => dispatchers.page").append(propertyOut).append("By").append(poName).append("({\r\n");
                sb.append("            current,\r\n");
                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
                sb.append("          })}\r\n");
                sb.append("          primaryKey=\"id\"\r\n");
                sb.append("          customData={").append(underPropertyOut).append("State.customData}\r\n");
                sb.append("        />\r\n");
                sb.append("        <DataFormTemple\r\n");
                sb.append("          customData={").append(underPropertyOut).append("State.customData}\r\n");
                sb.append("          title={").append(underPropertyOut).append("State.title}\r\n");
                sb.append("          visibleDialog={").append(underPropertyOut).append("State.visible}\r\n");
                sb.append("          onClose={() => ").append(underPropertyOut).append("Dispatchers.setState({visible: false})}\r\n");
                sb.append("          items={").append(underPropertyOut).append("State.form}\r\n");
                sb.append("          dispatchers={value => ").append(underPropertyOut).append("Dispatchers.setDataForm(value)}\r\n");
                sb.append("          onOk={() => dispatchers.save").append(propertyOut).append("By").append(poName).append("({\r\n");
                sb.append("            current: ").append(underPropertyOut).append("State.current,\r\n");
                sb.append("            id: ").append(underPropertyOut).append("State.parent,\r\n");
                sb.append("            formData: {\r\n");
                sb.append("              ...").append(underPropertyOut).append("State.formData,\r\n");
                sb.append("              ").append(underPoName).append("Id: ").append(underPropertyOut).append("State.parent,\r\n");
                sb.append("            },\r\n");
                sb.append("          })}\r\n");
                sb.append("          formDataValue={").append(underPropertyOut).append("State.formData}\r\n");
                sb.append("          formSortCode={String(Number.parseInt(String(").append(underPropertyOut).append("State.total)) + 10)}\r\n");
                sb.append("        />\r\n");
                sb.append("      </Dialog>\r\n");
            }
        }
    }

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

    public String[] poGenerate(Persistent persistent, List<Property> inPropertyList, List<Property> outPropertyList, String poName, String underPoName) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.cyjcommon.entity;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import com.fasterxml.jackson.annotation.JsonIgnore;\r\n");
        }
        sb.append("import com.fasterxml.jackson.annotation.JsonIgnoreProperties;\r\n");
        sb.append("import lombok.Getter;\r\n");
        sb.append("import lombok.RequiredArgsConstructor;\r\n");
        sb.append("import lombok.Setter;\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import org.hibernate.annotations.BatchSize;\r\n");
        }
        sb.append("import org.hibernate.annotations.GenericGenerator;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToOne(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList) || BeanUtils.ifManyToMany(outPropertyList)) {
            sb.append("import javax.persistence.CascadeType;\r\n");
        }
        if (BeanUtils.ifManyToOne(outPropertyList)) {
            sb.append("import javax.persistence.ConstraintMode;\r\n");
        }
        sb.append("import javax.persistence.Column;\r\n");
        sb.append("import javax.persistence.Entity;\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import javax.persistence.FetchType;\r\n");
        }
        if (BeanUtils.ifManyToOne(outPropertyList)) {
            sb.append("import javax.persistence.ForeignKey;\r\n");
        }
        sb.append("import javax.persistence.GeneratedValue;\r\n");
        sb.append("import javax.persistence.Id;\r\n");
        if (BeanUtils.ifManyToOne(outPropertyList)) {
            sb.append("import javax.persistence.JoinColumn;\r\n");
        }
        if (BeanUtils.ifManyToMany(outPropertyList)) {
            sb.append("import javax.persistence.ManyToMany;\r\n");
        }
        if (BeanUtils.ifManyToOne(outPropertyList)) {
            sb.append("import javax.persistence.ManyToOne;\r\n");
        }
        if (BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import javax.persistence.OneToMany;\r\n");
        }
        sb.append("import javax.persistence.Table;\r\n");
        sb.append("import javax.validation.constraints.NotNull;\r\n");
        sb.append("import java.io.Serializable;\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList) || BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import java.util.HashSet;\r\n");
            sb.append("import java.util.Set;\r\n");
        }
        if (BeanUtils.ifDate(inPropertyList)) {
            sb.append("import java.sql.Date;\r\n");
        }
        if (BeanUtils.ifTimestamp(inPropertyList)) {
            sb.append("import java.sql.Timestamp;\r\n");
        }
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Entity\r\n");
        sb.append("@Table(name = ").append(poName).append(".T_").append(persistent.getPersistentCode().toUpperCase()).append(")\r\n");
        sb.append("@Getter\r\n");
        sb.append("@Setter\r\n");
        sb.append("@RequiredArgsConstructor\r\n");
        sb.append("@GenericGenerator(name = \"uuid2\", strategy = \"org.hibernate.id.UUIDGenerator\")\r\n");
        sb.append("@JsonIgnoreProperties(value = {\"hibernateLazyInitializer\", \"handler\"})\r\n");
        sb.append("public class ").append(poName).append(" implements Serializable {\r\n");
        sb.append("\r\n");
        sb.append("    static final String T_").append(persistent.getPersistentCode().toUpperCase()).append(" = \"t_").append(persistent.getPersistentCode()).append("\";\r\n");
        sb.append("\r\n");
        sb.append("    @Id\r\n");
        sb.append("    @GeneratedValue(generator = \"uuid2\")\r\n");
        sb.append("    @Column(name = \"id\", length = 36)\r\n");
        sb.append("    private String id;\r\n");
        sb.append("\r\n");
        propertyEntityHandler(inPropertyList, sb);
        oneToManyEntityHandler(outPropertyList, sb, underPoName);
        manyToOneEntityHandler(outPropertyList, sb);
        manyToManyEntityHandler(outPropertyList, sb);
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
        return new String[]{entityData, poName + ".java"};
    }

    private void propertyEntityHandler(List<Property> inPropertyList, StringBuilder sb) {
        for (Property property : inPropertyList) {
            if (StringUtils.isNotEmpty(property.getPropertyRequired()) && "是".equals(property.getPropertyRequired())) {
                sb.append("    @NotNull(message = \"").append(property.getPropertyLabel()).append("不能为空\")\r\n");
            }
            if (StringUtils.isNotEmpty(property.getPropertyLength())) {
                sb.append("    @Column(name = \"").append(property.getPropertyCode()).append("\", length = ").append(property.getPropertyLength()).append(")\r\n");
            } else {
                sb.append("    @Column(name = \"").append(property.getPropertyCode()).append("\")\r\n");
            }
            sb.append("    private ").append(property.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(property.getPropertyCode())).append(";\r\n");
            sb.append("\r\n");
        }
    }

    private void oneToManyEntityHandler(List<Property> outPropertyList, StringBuilder sb, String underPoName) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @JsonIgnore\r\n");
                sb.append("    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = \"").append(underPoName).append("\")\r\n");
                sb.append("    @BatchSize(size = 20)\r\n");
                sb.append("    private Set<").append(propertyOut).append("> ").append(underPropertyOut).append(" = new HashSet<>();\r\n");
                sb.append("\r\n");
            }
        }
    }

    private void manyToOneEntityHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_ONE.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @Column(name = \"").append(property.getPropertyCode()).append("_id\", insertable = false, updatable = false)\r\n");
                sb.append("    private String ").append(underPropertyOut).append("Id;\r\n");
                sb.append("\r\n");
                sb.append("    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})\r\n");
                sb.append("    @JoinColumn(name = \"").append(property.getPropertyCode()).append("_id\", foreignKey = @ForeignKey(name = \"none\", value = ConstraintMode.NO_CONSTRAINT))\r\n");
                sb.append("    private ").append(propertyOut).append(" ").append(underPropertyOut).append(";\r\n");
                sb.append("\r\n");
            }
        }
    }

    private void manyToManyEntityHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @JsonIgnore\r\n");
                sb.append("    @ManyToMany(cascade = CascadeType.ALL, targetEntity = ").append(propertyOut).append(".class, fetch = FetchType.EAGER)\r\n");
                sb.append("    @BatchSize(size = 20)\r\n");
                sb.append("    private Set<").append(propertyOut).append("> ").append(underPropertyOut).append(" = new HashSet<>();\r\n");
                sb.append("\r\n");
            }
        }
    }

    public String[] daoGenerate(String poName) {
        String entityDaoData =
                "package com.example.cyjcommon.dao;\r\n" +
                        "\r\n" +
                        "import com.example.cyjcommon.entity." + poName + ";\r\n" +
                        "import org.springframework.data.jpa.repository.JpaRepository;\r\n" +
                        "\r\n" +
                        "/**\r\n" +
                        " * @author Noice\r\n" +
                        " */\r\n" +
                        "public interface " + poName + "Dao extends JpaRepository<" + poName + ", String> {\r\n" +
                        "\r\n" +
                        "}\r\n";
        return new String[]{entityDaoData, poName + "Dao.java"};
    }

    public String[] serviceGenerate(List<Property> outPropertyList, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        packageServiceHandler(outPropertyList, poName, sb, poServicePath);
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
        sb.append("import com.example.cyjcommon.service.autoService;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        if (BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import org.springframework.data.domain.Example;\r\n");
        }
        sb.append("import org.springframework.data.domain.Page;\r\n");
        sb.append("import org.springframework.data.domain.PageRequest;\r\n");
        if (BeanUtils.ifOneToMany(outPropertyList)) {
            sb.append("import org.springframework.data.domain.Pageable;\r\n");
        }
        sb.append("import org.springframework.data.domain.Sort;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList)) {
            sb.append("import java.util.HashSet;\r\n");
            sb.append("import java.util.Optional;\r\n");
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@Service\r\n");
        sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
        sb.append("public class ").append(poName).append("Service extends BaseService implements autoService<").append(poName).append("> {\r\n");
        sb.append("\r\n");
        daoServiceHandler(outPropertyList, poName, sb);
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append(" addOne(").append(poName).append(" po) {\r\n");
        manyToOneSetHandler(outPropertyList, sb);
        sb.append("        return dao.save(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void deleteOne(").append(poName).append(" po) {\r\n");
        sb.append("        dao.delete(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append(" updateOne(").append(poName).append(" po) {\r\n");
        manyToOneSetHandler(outPropertyList, sb);
        sb.append("        return dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public Page<").append(poName).append("> findAll(Integer pageNumber) {\r\n");
        sb.append("        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending()));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        oneToManyServiceHandler(outPropertyList, poName, sb);
        manyToManyServiceHandler(outPropertyList, poName, sb);
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "Service.java"};
    }


    private void packageServiceHandler(List<Property> outPropertyList, String poName, StringBuilder sb, String poServicePath) {
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("import com.example.cyjcommon.dao.").append(propertyOut).append("Dao;\r\n");
        }
        sb.append("import com.example.cyjcommon.dao.").append(poName).append("Dao;\r\n");
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("import com.example.cyjcommon.entity.").append(propertyOut).append(";\r\n");
        }
        sb.append("import com.example.cyjcommon.entity.").append(poName).append(";\r\n");
    }

    private void daoServiceHandler(List<Property> outPropertyList, String poName, StringBuilder sb) {
        sb.append("    private ").append(poName).append("Dao dao;\r\n");
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("    private ").append(propertyOut).append("Dao ").append(underPropertyOut).append("Dao;\r\n");
        }
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void setDao(").append(poName).append("Dao dao) {\r\n");
        sb.append("        this.dao = dao;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        for (Property property : outPropertyList) {
            String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
            String propertyOut = BeanUtils.captureName(underPropertyOut);
            sb.append("    @Autowired\r\n");
            sb.append("    public void set").append(propertyOut).append("Dao(").append(propertyOut).append("Dao ").append(underPropertyOut).append("Dao) {\r\n");
            sb.append("        this.").append(underPropertyOut).append("Dao = ").append(underPropertyOut).append("Dao;\r\n");
            sb.append("    }\r\n");
            sb.append("\r\n");
        }
    }

    private void manyToOneSetHandler(List<Property> outPropertyList, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_ONE.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("        if (po.get").append(propertyOut).append("Id() != null) {\r\n");
                sb.append("            ").append(propertyOut).append(" ").append(underPropertyOut).append(" = ").append(underPropertyOut).append("Dao.getOne(po.get").append(propertyOut).append("Id());\r\n");
                sb.append("            po.set").append(propertyOut).append("(").append(underPropertyOut).append(");\r\n");
                sb.append("        }\r\n");
            }
        }
    }

    private void oneToManyServiceHandler(List<Property> outPropertyList, String poName, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    public Page<").append(propertyOut).append("> page").append(propertyOut).append("By").append(poName).append("(Integer pageNumber, String id) {\r\n");
                sb.append("        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending());\r\n");
                sb.append("        ").append(poName).append(" po = dao.getOne(id);\r\n");
                sb.append("        ").append(propertyOut).append(" ").append(underPropertyOut).append(" = new ").append(propertyOut).append("();\r\n");
                sb.append("        ").append(underPropertyOut).append(".set").append(poName).append("(po);\r\n");
                sb.append("        Example<").append(propertyOut).append("> example = Example.of(").append(underPropertyOut).append(");\r\n");
                sb.append("        return ").append(underPropertyOut).append("Dao.findAll(example, pageable);\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
            }
        }
    }

    private void manyToManyServiceHandler(List<Property> outPropertyList, String poName, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    public Set<String> ").append(underPropertyOut).append("By").append(poName).append("(String id) {\r\n");
                sb.append("        Set<String> ").append(underPropertyOut).append("Ids = new HashSet<>();\r\n");
                sb.append("        Optional<").append(poName).append("> po = dao.findById(id);\r\n");
                sb.append("        if (po.isPresent()) {\r\n");
                sb.append("            Set<").append(propertyOut).append("> ").append(underPropertyOut).append("Set = po.get().get").append(propertyOut).append("();\r\n");
                sb.append("            for (").append(propertyOut).append(" ").append(underPropertyOut).append(" : ").append(underPropertyOut).append("Set) {\r\n");
                sb.append("                ").append(underPropertyOut).append("Ids.add(").append(underPropertyOut).append(".getId());\r\n");
                sb.append("            }\r\n");
                sb.append("        }\r\n");
                sb.append("        return ").append(underPropertyOut).append("Ids;\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
                sb.append("    public void ").append(underPropertyOut).append("Save").append(poName).append("(String id, Set<String> ").append(underPropertyOut).append("Ids) {\r\n");
                sb.append("        Set<").append(propertyOut).append("> ").append(underPropertyOut).append("Set = new HashSet<>();\r\n");
                sb.append("        Optional<").append(poName).append("> po = dao.findById(id);\r\n");
                sb.append("        if (po.isPresent()) {\r\n");
                sb.append("            for (String ").append(underPropertyOut).append("Id : ").append(underPropertyOut).append("Ids) {\r\n");
                sb.append("                ").append(propertyOut).append(" ").append(underPropertyOut).append(" = ").append(underPropertyOut).append("Dao.getOne(").append(underPropertyOut).append("Id);\r\n");
                sb.append("                ").append(underPropertyOut).append("Set.add(").append(underPropertyOut).append(");\r\n");
                sb.append("            }\r\n");
                sb.append("            po.get().set").append(propertyOut).append("(").append(underPropertyOut).append("Set);\r\n");
                sb.append("            dao.save(po.get());\r\n");
                sb.append("        }\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
            }
        }
    }

    public String[] controllerGenerate(List<Property> outPropertyList, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //serviceImpl路径
        String poServicePath = packetPath + ".service.auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import com.example.cyjcommon.controller.autoController;\r\n");
        sb.append("import com.example.cyjcommon.entity.").append(poName).append(";\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.validation.BindingResult;\r\n");
        sb.append("import org.springframework.validation.annotation.Validated;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        if (BeanUtils.ifManyToMany(outPropertyList)) {
            sb.append("import java.util.Set;\r\n");
            sb.append("\r\n");
        }
        sb.append("/**\r\n");
        sb.append(" * @author Noice\r\n");
        sb.append(" */\r\n");
        sb.append("@CrossOrigin\r\n");
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public class ").append(poName).append("Controller implements autoController<").append(poName).append("> {\r\n");
        sb.append("\r\n");
        sb.append("    private ").append(poName).append("Service service;\r\n");
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void setService(").append(poName).append("Service service) {\r\n");
        sb.append("        this.service = service;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    @Operation(summary = \"分页查询所有").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"page").append(poName).append("\")\r\n");
        sb.append("    public ResultVO page(@RequestParam(\"pageNumber\") Integer pageNumber) {\r\n");
        sb.append("        return ResultVO.success(service.findAll(pageNumber));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    @Operation(summary = \"保存").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"save").append(poName).append("\")\r\n");
        sb.append("    public ResultVO save(@RequestBody @Validated ").append(poName).append(" po, BindingResult bindingResult) {\r\n");
        sb.append("        if (bindingResult.hasErrors()) {\r\n");
        sb.append("            return ResultVO.failure(bindingResult.getAllErrors().get(0));\r\n");
        sb.append("        }\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.success(service.addOne(po));\r\n");
        sb.append("        }\r\n");
        sb.append("        return ResultVO.success(service.updateOne(po));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"delete").append(poName).append("\")\r\n");
        sb.append("    public ResultVO delete(@RequestBody ").append(poName).append(" po) {\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.failure();\r\n");
        sb.append("        }\r\n");
        sb.append("        service.deleteOne(po);\r\n");
        sb.append("        return ResultVO.success();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        oneToManyControllerHandler(outPropertyList, poName, sb);
        manyToManyControllerHandler(outPropertyList, poName, sb);
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "Controller.java"};
    }

    private void oneToManyControllerHandler(List<Property> outPropertyList, String poName, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.ONE_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @Operation(summary = \"根据").append(poName).append("查询所有").append(propertyOut).append("\")\r\n");
                sb.append("    @PostMapping(value = \"page").append(propertyOut).append("By").append(poName).append("\")\r\n");
                sb.append("    public ResultVO page").append(propertyOut).append("By").append(poName).append("(@RequestParam(\"pageNumber\") Integer pageNumber, @RequestParam(\"id\") String id) {\r\n");
                sb.append("        return ResultVO.success(service.page").append(propertyOut).append("By").append(poName).append("(pageNumber, id));\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
            }
        }
    }

    private void manyToManyControllerHandler(List<Property> outPropertyList, String poName, StringBuilder sb) {
        for (Property property : outPropertyList) {
            if (BeanUtils.MANY_TO_MANY.equals(property.getPropertyOutType())) {
                String underPropertyOut = BeanUtils.underline2Camel(property.getPropertyCode());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                sb.append("    @Operation(summary = \"根据").append(poName).append("查询所有").append(propertyOut).append("\")\r\n");
                sb.append("    @PostMapping(value = \"").append(underPropertyOut).append("By").append(poName).append("\")\r\n");
                sb.append("    public ResultVO ").append(underPropertyOut).append("By").append(poName).append("(@RequestParam(\"id\") String id) {\r\n");
                sb.append("        if (id == null) {\r\n");
                sb.append("            return ResultVO.failure();\r\n");
                sb.append("        }\r\n");
                sb.append("        return ResultVO.success(service.").append(underPropertyOut).append("By").append(poName).append("(id));\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
                sb.append("    @Operation(summary = \"根据").append(poName).append("保存").append(propertyOut).append("\")\r\n");
                sb.append("    @PostMapping(value = \"").append(underPropertyOut).append("Save").append(poName).append("\")\r\n");
                sb.append("    public ResultVO ").append(underPropertyOut).append("Save").append(poName).append("(@RequestParam(\"id\") String id, @RequestBody Set<String> ").append(underPropertyOut).append("Ids) {\r\n");
                sb.append("        if (id == null) {\r\n");
                sb.append("            return ResultVO.failure();\r\n");
                sb.append("        }\r\n");
                sb.append("        service.").append(underPropertyOut).append("Save").append(poName).append("(id, ").append(underPropertyOut).append("Ids);\r\n");
                sb.append("        return ResultVO.success();\r\n");
                sb.append("    }\r\n");
                sb.append("\r\n");
            }
        }
    }

    private String[] controllerCustomGenerate(String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.custom;\r\n";
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
        sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public interface ").append(poName).append("CustomController {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "CustomController.java"};
    }

    private String[] serviceCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.custom;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
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
        sb.append("public class ").append(poName).append("CustomService extends BaseService {\r\n");
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
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "CustomService.java"};
    }

    public JSONObject findDataTableAndFormByName(String entityCode) {
        Persistent po = queryFactory.selectFrom(QEntity.entity).where(QEntity.entity.entityCode.eq(entityCode)).fetchOne();
        if (po == null) {
            return null;
        }
        List<Property> propertyList = propertyDao.findByPersistentOrderBySortCode(po);
        List<PropertyCustomDTO> propertyCustomDTOList = new ArrayList<>();
        for (Property property : propertyList) {
            PropertyCustomDTO propertyCustomDTO = new PropertyCustomDTO();
            propertyCustomDTO.setId(property.getId());
            propertyCustomDTO.setPropertyCode(property.getPropertyCode());
            propertyCustomDTO.setPropertyName(BeanUtils.underline2Camel(property.getPropertyCode()));
            propertyCustomDTO.setPropertyDirection(property.getPropertyDirection());
            propertyCustomDTO.setPropertyDisplay("否".equals(property.getPropertyDisplay()));
            propertyCustomDTO.setPropertyDefaultValue(property.getPropertyDefaultValue());
            propertyCustomDTO.setPropertyLabel(property.getPropertyLabel());
            propertyCustomDTO.setPropertyMode(property.getPropertyMode());
            propertyCustomDTO.setPropertyType(property.getPropertyType());
            propertyCustomDTO.setPropertyWidth(property.getPropertyWidth());
            propertyCustomDTO.setSortCode(property.getSortCode());
            propertyCustomDTO.setPropertyMode(property.getPropertyMode());
            propertyCustomDTO.setPropertyDataSourceType(property.getPropertyDataSourceType());
            propertyCustomDTO.setPropertyEditEnable("否".equals(property.getPropertyEditEnable()));
            propertyCustomDTO.setPropertyRequired("是".equals(property.getPropertyRequired()));
            if (StringUtils.isNotEmpty(property.getPropertyDataSourceType())) {
                List<Dictionary> dictionaryDTOList = dictionaryCustomService.findCatalogByValue(propertyCustomDTO.getPropertyDataSourceType());
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
                    for (Dictionary dictionary : dictionaryDTOList) {
                        Map<String, String> map = new HashMap<>();
                        map.put("label", dictionary.getDictionaryName());
                        map.put("value", dictionary.getDictionaryValue());
                        mapList.add(map);
                    }
                }
                List<Map<String, Object>> dateSourceList = sqlCustomService.queryBySqlValue(propertyCustomDTO.getPropertyDataSourceType());
                dateSourceHandler(mapList, dateSourceList);
                propertyCustomDTO.setPropertyDataSource(mapList);
            }
            propertyCustomDTOList.add(propertyCustomDTO);
        }
        List<PropertyCustomDTO> propertyCustomDTOS = propertyCustomDTOList.stream().sorted(Comparator.comparing(PropertyCustomDTO::getSortCode)).collect(Collectors.toList());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataTable", propertyCustomDTOS);
        jsonObject.put("dataForm", propertyCustomDTOS);
        JSONObject customData = new JSONObject();
        customData.put("customType", "是".equals(po.getPersistentCustomTable()));
        customData.put("customForm", "是".equals(po.getPersistentCustomForm()));
        customData.put("editEnable", "是".equals(po.getPersistentEditEnable()));
        customData.put("formType", po.getPersistentFormType());
        customData.put("formCol", po.getPersistentFormRow());
//        if ("是".equals(po.getEntitySelf())) {
//            JSONObject outSelf = new JSONObject();
//            outSelf.put("label", po.getEntityName());
//            outSelf.put("name", BeanUtils.underline2Camel(po.getEntityCode()) + "Id");
//            outSelf.put("code", po.getEntityCode() + "_id");
//            JSONArray mapOutList = new JSONArray();
//            List<Map<String, Object>> dateSourceList = sqlCustomService.queryBySqlValue("ENTITY_FORM_DATESOURSE");
//            dateSourceHandler(mapOutList, dateSourceList);
//            outSelf.put("dataSource", mapOutList);
//            customData.put("outSelf", outSelf);
//        }
        jsonObject.put("customData", customData);
        return jsonObject;
    }

    private void dateSourceHandler(JSONArray mapList, List<Map<String, Object>> dateSourceList) {
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
    }

}
