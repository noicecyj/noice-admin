package com.example.cyjentitycreater.service.custom.Impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
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

    private final static String commonPath = "C:/Users/noice/IdeaProjects/noice-admin/cyj-common/src/main/java/com/example/cyjcommon";
    private EntityDao entityDao;
    private PropertyDao propertyDao;
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
        List<PropertyPO> propertyPOList = propertyDao.findAllByEntity(entityPO)
                .stream()
                .sorted(Comparator.comparing(PropertyPO::getSortCode))
                .collect(Collectors.toList());
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
        createJavaFile(entityPO, propertyPOList, underPoName, poName, appPath, appApi);
        List<EntityPO> entityPOList = entityDao.findAllByEntity(entityPO);
        entityPOList.forEach(subPo -> {
            List<PropertyPO> subPoList = propertyDao.findAllByEntity(subPo);
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String SubPoName = BeanUtils.captureName(underSubPoName);
            createSubJavaFile(subPo, subPoList, underSubPoName, SubPoName, appPath, appApi);
        });
    }

//    private void authorityCenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName,
//                              String appPath, String appApi){
//            //根据名称获取app
//            AppServicePO appServicePO = entityPO.getAppService();
//            AuthorityPO page = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Page", "查询所有" + poName);
//            if (page == null) {
//                page = new AuthorityPO();
//                page.setMethod(POST);
//                page.setName("查询所有" + poName);
//                page.setPath(appService.get("app_api").toString() + "/" + underPoName + "Page");
//                page.setAppName(appService.get("name").toString());
//                page.setVersion(VERSION);
//                page.setStatus(STATUS);
//                page.setSortCode(SORTCODE);
//                authorityDao.save(page);
//                logger.info("生成分页权限:" + page.getName());
//            }
//            AuthorityPO save = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Save", "保存" + poName);
//            if (save == null) {
//                save = new AuthorityPO();
//                save.setMethod(POST);
//                save.setName("保存" + poName);
//                save.setPath(appService.get("app_api").toString() + "/" + underPoName + "Save");
//                save.setAppName(appService.get("name").toString());
//                save.setVersion(VERSION);
//                save.setStatus(STATUS);
//                save.setSortCode(SORTCODE);
//                authorityDao.save(save);
//                logger.info("生成保存权限:" + save.getName());
//            }
//            AuthorityPO delete = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Delete", "删除" + poName);
//            if (delete == null) {
//                delete = new AuthorityPO();
//                delete.setMethod(POST);
//                delete.setName("删除" + poName);
//                delete.setPath(appService.get("app_api").toString() + "/" + underPoName + "Delete");
//                delete.setAppName(appService.get("name").toString());
//                delete.setVersion(VERSION);
//                delete.setStatus(STATUS);
//                delete.setSortCode(SORTCODE);
//                authorityDao.save(delete);
//                logger.info("生成删除权限:" + delete.getName());
//            }
//            AuthorityPO find = findByPathAndName(appService.get("app_api").toString() + "/find" + poName + "ById", "根据ID查询" + poName);
//            if (find == null) {
//                find = new AuthorityPO();
//                find.setMethod(POST);
//                find.setName("根据ID查询" + poName);
//                find.setPath(appService.get("app_api").toString() + "/find" + poName + "ById");
//                find.setAppName(appService.get("name").toString());
//                find.setVersion(VERSION);
//                find.setStatus(STATUS);
//                find.setSortCode(SORTCODE);
//                authorityDao.save(find);
//                logger.info("生成ID查询权限:" + find.getName());
//            }
//    }

    private void createJavaFile(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName,
                                String appPath, String appApi) {
        try {
            createJavaFile(commonPath + "/entity/po", poGenerate(entityPO, propertyPOList, poName));
            createJavaFile(commonPath + "/dao", daoGenerate(propertyPOList, poName));
            createJavaFile(appPath + "/service/auto", serviceGenerate(propertyPOList, poName, appPath));
            createJavaFile(appPath + "/service/auto/Impl", serviceImplGenerate(propertyPOList, underPoName, poName, appPath));
            createJavaFile(appPath + "/service/custom", serviceCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/aop", aopCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/auto", controllerGenerate(propertyPOList, underPoName, poName, appPath));
            createJavaFile(appPath + "/controller/auto/Impl", controllerImplGenerate(propertyPOList, underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createSubJavaFile(EntityPO entityPO, List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath, String appApi) {
        try {
            createJavaFile(commonPath + "/entity/po", poGenerate(entityPO, propertyPOList, poName));
            createJavaFile(commonPath + "/dao", daoGenerate(propertyPOList, poName));
            createJavaFile(appPath + "/service/auto", serviceSubGenerate(propertyPOList, poName, appPath));
            createJavaFile(appPath + "/service/auto/Impl", serviceImplSubGenerate(propertyPOList, underPoName, poName, appPath));
            createJavaFile(appPath + "/service/custom", serviceCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/aop", aopSubCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/auto", controllerSubGenerate(propertyPOList, underPoName, poName, appPath));
            createJavaFile(appPath + "/controller/auto/Impl", controllerImplSubGenerate(propertyPOList, underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] poGenerate(EntityPO entityPO, List<PropertyPO> propertyPOList, String poName) {
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
        sb.append("import javax.persistence.Column;\r\n");
        sb.append("import javax.persistence.Entity;\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList) || BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import javax.persistence.FetchType;\r\n");
        }
        sb.append("import javax.persistence.GeneratedValue;\r\n");
        sb.append("import javax.persistence.Id;\r\n");
        if (BeanUtils.ifManyToOne(propertyPOList)) {
            sb.append("import javax.persistence.JoinColumn;\r\n");
        }
        if (BeanUtils.ifManyToMany(propertyPOList)) {
            sb.append("import javax.persistence.ManyToMany;\r\n");
        }
        if (BeanUtils.ifManyToOne(propertyPOList)) {
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
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)\r\n");
                    sb.append("    @JoinColumn(name = \"").append(propertyPO.getPropertyOut()).append("_id\")\r\n");
                    String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                    String propertyOut = BeanUtils.captureName(underPropertyOut);
                    sb.append("    private ").append(propertyOut).append("PO ").append(underPropertyOut).append(";\r\n");
                } else {
                    String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                    String propertyOut = BeanUtils.captureName(underPropertyOut);
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

    public String[] daoGenerate(List<PropertyPO> propertyPOList, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.cyjcommon.dao;\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
                    sb.append("    List<").append(poName).append("PO> findBy").append(propertyOut).append("(").append(propertyOut).append("PO ").append(underPropertyOut).append(");\r\n");
                    sb.append("\r\n");
                } else {
                    sb.append("    List<").append(poName).append("PO> findBy").append(propertyOut).append("In(Collection<Set<").append(propertyOut).append("PO>> ").append(underPropertyOut).append("List);\r\n");
                    sb.append("\r\n");
                }

            }
        }
        sb.append("}\r\n");
        String entityDaoData = sb.toString();
        return new String[]{entityDaoData, poName + "Dao.java"};
    }

    public String[] serviceGenerate(List<PropertyPO> propertyPOList, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    public String[] serviceImplGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.dao.").append(poName).append("Dao;\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
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
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void set").append(poName).append("Dao(").append(poName).append("Dao ").append(underPoName).append("Dao) {\r\n");
        sb.append("        this.").append(underPoName).append("Dao = ").append(underPoName).append("Dao;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO addOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.save(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void deleteOne(").append(poName).append("PO po) {\r\n");
        sb.append("        ").append(underPoName).append("Dao.delete(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public Page<").append(poName).append("PO> findAll(Integer pageNumber) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending()));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @Override\r\n");
                    sb.append("    public Page<").append(poName).append("PO> findAll(Integer pageNumber, ").append(propertyOut).append("PO ").append(underPropertyOut).append(") {\r\n");
                    sb.append("        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending());\r\n");
                    sb.append("        ").append(poName).append("PO ").append(underPoName).append("PO = new ").append(poName).append("PO();\r\n");
                    sb.append("        ").append(underPoName).append("PO.set").append(propertyOut).append("(").append(underPropertyOut).append(");\r\n");
                    sb.append("        Example<").append(poName).append("PO> example = Example.of(").append(underPoName).append("PO);\r\n");
                    sb.append("        return ").append(underPoName).append("Dao.findAll(example, pageable);\r\n");
                    sb.append("    }\r\n");
                    sb.append("\r\n");
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

    public String[] controllerGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    public String[] controllerImplGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath, String appApi) {
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
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    public String[] serviceSubGenerate(List<PropertyPO> propertyPOList, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    private String[] serviceImplSubGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //service路径
        String poServicePath = packetPath + ".service.auto.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.dao.").append(poName).append("Dao;\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
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
        sb.append("\r\n");
        sb.append("    @Autowired\r\n");
        sb.append("    public void set").append(poName).append("Dao(").append(poName).append("Dao ").append(underPoName).append("Dao) {\r\n");
        sb.append("        this.").append(underPoName).append("Dao = ").append(underPoName).append("Dao;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO addOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.save(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void deleteOne(").append(poName).append("PO po) {\r\n");
        sb.append("        ").append(underPoName).append("Dao.delete(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
                    sb.append("    @Override\r\n");
                    sb.append("    public Page<").append(poName).append("PO> findAll(Integer pageNumber, ").append(propertyOut).append("PO ").append(underPropertyOut).append(") {\r\n");
                    sb.append("        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by(\"sortCode\").ascending());\r\n");
                    sb.append("        ").append(poName).append("PO ").append(underPoName).append("PO = new ").append(poName).append("PO();\r\n");
                    sb.append("        ").append(underPoName).append("PO.set").append(propertyOut).append("(").append(underPropertyOut).append(");\r\n");
                    sb.append("        Example<").append(poName).append("PO> example = Example.of(").append(underPoName).append("PO);\r\n");
                    sb.append("        return ").append(underPoName).append("Dao.findAll(example, pageable);\r\n");
                    sb.append("    }\r\n");
                    sb.append("\r\n");
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

    private String[] controllerSubGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
            }
        }
        sb.append("import com.example.cyjcommon.entity.po.").append(poName).append("PO;\r\n");
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    private String[] controllerImplSubGenerate(List<PropertyPO> propertyPOList, String underPoName, String poName, String appPath, String appApi) {
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
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    sb.append("import com.example.cyjcommon.entity.po.").append(propertyOut).append("PO;\r\n");
                }
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
        for (PropertyPO propertyPO : propertyPOList) {
            if (StringUtils.isNotEmpty(propertyPO.getPropertyOut())) {
                String underPropertyOut = BeanUtils.underline2Camel(propertyPO.getPropertyOut());
                String propertyOut = BeanUtils.captureName(underPropertyOut);
                if (!propertyOut.equals(poName)) {
                    if ("ManyToOne".equals(propertyPO.getPropertyOutType())) {
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

    @Override
    public void createComponentFile(EntityPO entityPO) {
        try {
            if (entityPO == null) {
                return;
            }
            //驼峰名
            String underPoName = BeanUtils.underline2Camel(entityPO.getEntityCode());
            //文件名
            String poName = BeanUtils.captureName(underPoName);
            AppServicePO appServicePO = entityPO.getAppService();
            if (appServicePO == null) {
                return;
            }
            //服务接口
            String appApi = appServicePO.getAppServiceApi();
            List<EntityPO> entityPOList = entityDao.findAllByEntity(entityPO);
            createComponentFile(appApi, entityPOList, entityPO, underPoName, poName);
            entityPOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                //文件名
                String subPoName = BeanUtils.captureName(underSubPoName);
                createSubComponentFile(appApi, subPo, poName, underPoName, underSubPoName, subPoName);
            });
            createJavaFile(componentPath + poName, indexGenerate(entityPOList, underPoName, poName));
            createJavaFile(componentPath + poName, storeGenerate(entityPOList, underPoName, poName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createComponentFile(String appApi, List<EntityPO> entityPOList, EntityPO po, String underPoName, String poName) {
        try {
            createJavaFile(componentPath + poName + "/view/auto", viewAutoGenerate(entityPOList, underPoName, poName));
            createJavaFile(componentPath + poName + "/view/custom", viewCustomGenerate(underPoName, poName), false);
            createJavaFile(componentPath + poName + "/services/auto", servicesAutoGenerate(appApi, underPoName, poName));
            createJavaFile(componentPath + poName + "/services/custom", servicesCustomGenerate(underPoName), false);
            createJavaFile(componentPath + poName + "/models/auto", modelsAutoGenerate(po, underPoName, poName));
            createJavaFile(componentPath + poName + "/models/custom", modelsCustomGenerate(underPoName, poName), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createSubComponentFile(String appApi, EntityPO subPo, String poName, String underPoName, String underSubPoName, String subPoName) {
        try {
            createJavaFile(componentPath + poName + "/view/auto", viewSubAutoGenerate(poName, underPoName, underSubPoName, subPoName));
            createJavaFile(componentPath + poName + "/view/custom", viewSubCustomGenerate(poName, underSubPoName, subPoName), false);
            createJavaFile(componentPath + poName + "/services/auto", servicesSubAutoGenerate(appApi, underSubPoName, subPoName));
            createJavaFile(componentPath + poName + "/services/custom", servicesCustomGenerate(underSubPoName), false);
            createJavaFile(componentPath + poName + "/models/auto", modelsSubAutoGenerate(subPo, poName, underPoName, underSubPoName, subPoName));
            createJavaFile(componentPath + poName + "/models/custom", modelsSubCustomGenerate(underSubPoName, subPoName), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] modelsSubAutoGenerate(EntityPO subPo, String poName, String underPoName, String underSubPoName, String subPoName) {
        String viewData = "import " + underSubPoName + "Service from '@/pages/" + poName + "/services/auto/" + underSubPoName + "';\r\n" +
                "import initService from '@/services/init';\r\n" +
                "\r\n" +
                "export default {\r\n" +
                "\r\n" +
                "  namespace: '" + underSubPoName + "',\r\n" +
                "\r\n" +
                "  state: {\r\n" +
                "    " + underSubPoName + "Title: '添加',\r\n" +
                "    " + underSubPoName + "TableData: [],\r\n" +
                "    " + underSubPoName + "FormData: {},\r\n" +
                "    " + underSubPoName + "LoadingVisible: true,\r\n" +
                "    " + underSubPoName + "Total: 0,\r\n" +
                "    " + underSubPoName + "Current: 1,\r\n" +
                "    " + underSubPoName + "Form: [],\r\n" +
                "    " + underSubPoName + "Table: [],\r\n" +
                "    " + underSubPoName + "Visible: false,\r\n" +
                "    divVisible: false,\r\n" +
                "    " + underPoName + "Id: '',\r\n" +
                "    customData: {},\r\n" +
                "  },\r\n" +
                "\r\n" +
                "  reducers: {\r\n" +
                "    setState(prevState, payload) {\r\n" +
                "      return {...prevState, ...payload};\r\n" +
                "    },\r\n" +
                "  },\r\n" +
                "\r\n" +
                "  effects: (dispatch) => ({\r\n" +
                "    async " + underSubPoName + "Page(data) {\r\n" +
                "      const dataRes = await " + underSubPoName + "Service." + underSubPoName + "Page(data." + underSubPoName + "Current, data.pid);\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "TableData: dataRes.data.results,\r\n" +
                "        " + underSubPoName + "Total: dataRes.data.total,\r\n" +
                "        " + underSubPoName + "Current: data." + underSubPoName + "Current,\r\n" +
                "        " + underSubPoName + "LoadingVisible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underSubPoName + "Add() {\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "FormData: {},\r\n" +
                "        " + underSubPoName + "Title: '添加',\r\n" +
                "        " + underSubPoName + "Visible: true,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underSubPoName + "Edit(data) {\r\n" +
                "      const " + underSubPoName + " = await " + underSubPoName + "Service.find" + subPoName + "ById(data.id);\r\n" +
                "      const fromData = {\r\n" +
                "        ..." + underSubPoName + ".data,\r\n" +
                "      };\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "FormData: fromData,\r\n" +
                "        " + underSubPoName + "Title: '编辑',\r\n" +
                "        " + underSubPoName + "Visible: true,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underSubPoName + "Delete(data) {\r\n" +
                "      await " + underSubPoName + "Service." + underSubPoName + "Delete(data.record.id);\r\n" +
                "      await this." + underSubPoName + "Page({" + underSubPoName + "Current: data.data.pageNumber, pid: data.data.pid});\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "Visible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underSubPoName + "Save(data) {\r\n" +
                "      await " + underSubPoName + "Service." + underSubPoName + "Save({...data." + underSubPoName + "FormData, pid: data.pid});\r\n" +
                "      await this." + underSubPoName + "Page({" + underSubPoName + "Current: data.pageNumber, pid: data.pid});\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "Visible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    setDataForm(data) {\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "FormData: data,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async findDataTableAndFormByName(pid) {\r\n" +
                "      const ret = await initService.findDataTableAndFormByName('" + subPo.getEntityCode() + "');\r\n" +
                "      await this." + underSubPoName + "Page({" + underSubPoName + "Current: 1, pid});\r\n" +
                "      const payload = {\r\n" +
                "        " + underSubPoName + "Table: ret.data.dataTable,\r\n" +
                "        " + underSubPoName + "Form: ret.data.dataForm,\r\n" +
                "        customData: ret.data.customData,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async onRowClick(data) {\r\n" +
                "      await this.findDataTableAndFormByName(data.record.id);\r\n" +
                "      await this." + underSubPoName + "Page({" + underSubPoName + "Current: 1, pid: data.record.id});\r\n" +
                "      const payload = {\r\n" +
                "        divVisible: data.selected,\r\n" +
                "        " + underPoName + "Id: data.record.id,\r\n" +
                "        " + underSubPoName + "Visible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "  }),\r\n" +
                "};\r\n";
        return new String[]{viewData, underSubPoName + ".tsx"};
    }


    private String[] servicesSubAutoGenerate(String appApi, String underSubPoName, String subPoName) {
        String viewData = "import {request} from 'ice';\r\n" +
                "\r\n" +
                "export default {\r\n" +
                "  " + underSubPoName + "Page(pageNumber, pid) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underSubPoName + "Page',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        pageNumber,\r\n" +
                "        pid,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  " + underSubPoName + "Save(data) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underSubPoName + "Save',\r\n" +
                "      method: 'post',\r\n" +
                "      data,\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  " + underSubPoName + "Delete(id) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underSubPoName + "Delete',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        id,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  find" + subPoName + "ById(id) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/find" + subPoName + "ById',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        id,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "};\r\n";
        return new String[]{viewData, underSubPoName + ".tsx"};
    }


    private String[] viewSubAutoGenerate(String poName, String underPoName, String underSubPoName, String subPoName) {
        String viewData = "import {Dialog} from '@alifd/next';\r\n" +
                "import React from 'react';\r\n" +
                "import pageStore from '@/pages/" + poName + "/store';\r\n" +
                "import DataFormTemple from '@/components/dataForm';\r\n" +
                "import DataTableTemple from '@/components/dataTable';\r\n" +
                "import {CustomColumn" + subPoName + "} from '@/pages/" + poName + "/view/custom/" + underSubPoName + "';\r\n" +
                "\r\n" +
                "function " + subPoName + "() {\r\n" +
                "  const [" + underSubPoName + "State, " + underSubPoName + "Dispatchers] = pageStore.useModel('" + underSubPoName + "');\r\n" +
                "\r\n" +
                "  const [custom" + subPoName + "State, custom" + subPoName + "Dispatchers] = pageStore.useModel('custom" + subPoName + "');\r\n" +
                "\r\n" +
                "  return (\r\n" +
                "    <div>\r\n" +
                "      <Dialog\r\n" +
                "        v2\r\n" +
                "        visible={" + underSubPoName + "State.divVisible}\r\n" +
                "        footer={false}\r\n" +
                "        onClose={() => " + underSubPoName + "Dispatchers.setState({\r\n" +
                "          divVisible: false,\r\n" +
                "          " + underPoName + "Id: '',\r\n" +
                "        })}\r\n" +
                "        style={{width: '90%'}}\r\n" +
                "      >\r\n" +
                "        <DataTableTemple\r\n" +
                "          createItem={() => " + underSubPoName + "Dispatchers." + underSubPoName + "Add()}\r\n" +
                "          editItem={record => " + underSubPoName + "Dispatchers." + underSubPoName + "Edit(record)}\r\n" +
                "          deleteItem={record => " + underSubPoName + "Dispatchers." + underSubPoName + "Delete({\r\n" +
                "            record,\r\n" +
                "            data: {\r\n" +
                "              pageNumber: " + underSubPoName + "State." + underSubPoName + "Current,\r\n" +
                "              pid: " + underSubPoName + "State." + underPoName + "Id,\r\n" +
                "            },\r\n" +
                "          })}\r\n" +
                "          visibleLoading={" + underSubPoName + "State." + underSubPoName + "LoadingVisible}\r\n" +
                "          dataSource={" + underSubPoName + "State." + underSubPoName + "TableData}\r\n" +
                "          items={" + underSubPoName + "State." + underSubPoName + "Table}\r\n" +
                "          total={" + underSubPoName + "State." + underSubPoName + "Total}\r\n" +
                "          primaryKey=\"id\"\r\n" +
                "          getPage={" + underSubPoName + "Current => " + underSubPoName + "Dispatchers." + underSubPoName + "Page({\r\n" +
                "            " + underSubPoName + "Current,\r\n" +
                "            pid: " + underSubPoName + "State." + underPoName + "Id\r\n" +
                "          })}\r\n" +
                "          customData={" + underSubPoName + "State.customData}\r\n" +
                "          columnRender={(value, index, record) => {\r\n" +
                "            return (\r\n" +
                "              <CustomColumn" + subPoName + " value={value} index={index} record={record}/>\r\n" +
                "            );\r\n" +
                "          }}\r\n" +
                "          customMethod1={() => custom" + subPoName + "Dispatchers.customMethod1()}\r\n" +
                "          customMethod2={() => custom" + subPoName + "Dispatchers.customMethod2()}\r\n" +
                "          customMethod3={() => custom" + subPoName + "Dispatchers.customMethod3()}\r\n" +
                "          customMethodName1={custom" + subPoName + "State.customMethodName1}\r\n" +
                "          customMethodName2={custom" + subPoName + "State.customMethodName2}\r\n" +
                "          customMethodName3={custom" + subPoName + "State.customMethodName3}\r\n" +
                "        />\r\n" +
                "      </Dialog>\r\n" +
                "      <DataFormTemple\r\n" +
                "        customData={" + underSubPoName + "State.customData}\r\n" +
                "        title={" + underSubPoName + "State." + underSubPoName + "Title}\r\n" +
                "        visibleDialog={" + underSubPoName + "State." + underSubPoName + "Visible}\r\n" +
                "        onClose={() => " + underSubPoName + "Dispatchers.setState({" + underSubPoName + "Visible: false})}\r\n" +
                "        items={[..." + underSubPoName + "State." + underSubPoName + "Form, ...custom" + subPoName + "State.customFrom]}\r\n" +
                "        dispatchers={value => " + underSubPoName + "Dispatchers.setDataForm(value)}\r\n" +
                "        onOk={() => " + underSubPoName + "Dispatchers." + underSubPoName + "Save({\r\n" +
                "          " + underSubPoName + "FormData: " + underSubPoName + "State." + underSubPoName + "FormData,\r\n" +
                "          pageNumber: " + underSubPoName + "State." + underSubPoName + "Current,\r\n" +
                "          pid: " + underSubPoName + "State." + underPoName + "Id,\r\n" +
                "        })}\r\n" +
                "        formDataValue={" + underSubPoName + "State." + underSubPoName + "FormData}\r\n" +
                "        formSortCode={String(Number.parseInt(String(" + underSubPoName + "State." + underSubPoName + "Total)) + 10)}\r\n" +
                "      />\r\n" +
                "    </div>\r\n" +
                "  );\r\n" +
                "}\r\n" +
                "\r\n" +
                "export default " + subPoName + ";\r\n";
        return new String[]{viewData, underSubPoName + ".tsx"};
    }

    private String[] modelsSubCustomGenerate(String underSubPoName, String subPoName) {
        String viewData =
                "export default {\r\n" +
                        "\r\n" +
                        "  namespace: 'custom" + subPoName + "',\r\n" +
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
                        "\r\n" +
                        "  effects: () => ({\r\n" +
                        "    customMethod1() {\r\n" +
                        "    },\r\n" +
                        "    customMethod2() {\r\n" +
                        "    },\r\n" +
                        "    customMethod3() {\r\n" +
                        "    },\r\n" +
                        "  }),\r\n" +
                        "};\r\n";
        return new String[]{viewData, underSubPoName + ".tsx"};
    }

    private String[] modelsCustomGenerate(String underPoName, String poName) {
        String viewData =
                "export default {\r\n" +
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
                        "\r\n" +
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

    private String[] modelsAutoGenerate(EntityPO po, String underPoName, String poName) {
        String viewData = "import " + underPoName + "Service from '@/pages/" + poName + "/services/auto/" + underPoName + "';\r\n" +
                "import initService from '@/services/init';\r\n" +
                "\r\n" +
                "export default {\r\n" +
                "\r\n" +
                "  namespace: '" + underPoName + "',\r\n" +
                "\r\n" +
                "  state: {\r\n" +
                "    " + underPoName + "Title: '添加',\r\n" +
                "    " + underPoName + "TableData: [],\r\n" +
                "    " + underPoName + "Visible: false,\r\n" +
                "    " + underPoName + "FormData: {},\r\n" +
                "    " + underPoName + "LoadingVisible: true,\r\n" +
                "    " + underPoName + "Total: 0,\r\n" +
                "    " + underPoName + "Current: 1,\r\n" +
                "    " + underPoName + "Form: [],\r\n" +
                "    " + underPoName + "Table: [],\r\n" +
                "    " + underPoName + "Id: '',\r\n" +
                "    customData: {},\r\n" +
                "  },\r\n" +
                "\r\n" +
                "  reducers: {\r\n" +
                "    setState(prevState, payload) {\r\n" +
                "      return {...prevState, ...payload};\r\n" +
                "    },\r\n" +
                "  },\r\n" +
                "\r\n" +
                "  effects: (dispatch) => ({\r\n" +
                "    async " + underPoName + "Page(" + underPoName + "Current) {\r\n" +
                "      const dataRes = await " + underPoName + "Service." + underPoName + "Page(" + underPoName + "Current);\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "TableData: dataRes.data.results,\r\n" +
                "        " + underPoName + "Total: dataRes.data.total,\r\n" +
                "        " + underPoName + "Current,\r\n" +
                "        " + underPoName + "LoadingVisible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underPoName + "Add() {\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "FormData: {},\r\n" +
                "        " + underPoName + "Title: '添加',\r\n" +
                "        " + underPoName + "Visible: true,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underPoName + "Edit(data) {\r\n" +
                "      const " + underPoName + " = await " + underPoName + "Service.find" + poName + "ById(data.id);\r\n" +
                "      const fromData = {\r\n" +
                "        ..." + underPoName + ".data,\r\n" +
                "      };\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "FormData: fromData,\r\n" +
                "        " + underPoName + "Title: '编辑',\r\n" +
                "        " + underPoName + "Visible: true,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underPoName + "Delete(data) {\r\n" +
                "      await " + underPoName + "Service." + underPoName + "Delete(data.record.id);\r\n" +
                "      await this." + underPoName + "Page(data.data.pageNumber);\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "Visible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async " + underPoName + "Save(data) {\r\n" +
                "      await " + underPoName + "Service." + underPoName + "Save(data." + underPoName + "FormData);\r\n" +
                "      await this." + underPoName + "Page(data.pageNumber);\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "Visible: false,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    setDataForm(data) {\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "FormData: data,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "    async findDataTableAndFormByName() {\r\n" +
                "      const ret = await initService.findDataTableAndFormByName('" + po.getEntityCode() + "');\r\n" +
                "      await this." + underPoName + "Page(1);\r\n" +
                "      const payload = {\r\n" +
                "        " + underPoName + "Table: ret.data.dataTable,\r\n" +
                "        " + underPoName + "Form: ret.data.dataForm,\r\n" +
                "        customData: ret.data.customData,\r\n" +
                "      };\r\n" +
                "      dispatch." + underPoName + ".setState(payload);\r\n" +
                "    },\r\n" +
                "  }),\r\n" +
                "};\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] servicesCustomGenerate(String underPoName) {
        String viewData = "// import {request} from 'ice';\r\n" +
                "// export default {\r\n" +
                "// \r\n" +
                "// };\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] servicesAutoGenerate(String appApi, String underPoName, String poName) {
        String viewData = "import {request} from 'ice';\r\n" +
                "\r\n" +
                "export default {\r\n" +
                "  " + underPoName + "Page(pageNumber) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underPoName + "Page',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        pageNumber,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  " + underPoName + "Save(data) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underPoName + "Save',\r\n" +
                "      method: 'post',\r\n" +
                "      data,\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  " + underPoName + "Delete(id) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/" + underPoName + "Delete',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        id,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "  find" + poName + "ById(id) {\r\n" +
                "    return request({\r\n" +
                "      url: '/" + appApi + "/find" + poName + "ById',\r\n" +
                "      method: 'post',\r\n" +
                "      params: {\r\n" +
                "        id,\r\n" +
                "      },\r\n" +
                "    });\r\n" +
                "  },\r\n" +
                "};\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] viewSubCustomGenerate(String poName, String underSubPoName, String subPoName) {
        String viewData = "import React from 'react';\r\n" +
                "// import pageStore from '@/pages/" + poName + "/store';\r\n" +
                "\r\n" +
                "// const formItemLayout = {\r\n" +
                "//   labelCol: {\r\n" +
                "//     fixedSpan: 6,\r\n" +
                "//   },\r\n" +
                "//   wrapperCol: {\r\n" +
                "//     span: 40,\r\n" +
                "//   },\r\n" +
                "// };\r\n" +
                "\r\n" +
                "function CustomColumn" + subPoName + "(props) {\r\n" +
                "//   const {value, index, record} = props;\r\n" +
                "//   const [custom" + subPoName + "State, custom" + subPoName + "Dispatchers] = pageStore.useModel('custom" + poName + "');\r\n" +
                "\r\n" +
                "  return (\r\n" +
                "    <>\r\n" +
                "    </>\r\n" +
                "  );\r\n" +
                "}\r\n" +
                "\r\n" +
                "export {CustomColumn" + subPoName + "};\r\n";
        return new String[]{viewData, underSubPoName + ".tsx"};
    }

    private String[] viewCustomGenerate(String underPoName, String poName) {
        String viewData = "import React from 'react';\r\n" +
                "// import pageStore from '@/pages/" + poName + "/store';\r\n" +
                "\r\n" +
                "// const formItemLayout = {\r\n" +
                "//   labelCol: {\r\n" +
                "//     fixedSpan: 6,\r\n" +
                "//   },\r\n" +
                "//   wrapperCol: {\r\n" +
                "//     span: 40,\r\n" +
                "//   },\r\n" +
                "// };\r\n" +
                "// \r\n" +
                "function CustomColumn" + poName + "(props) {\r\n" +
                "//   const {value, index, record} = props;\r\n" +
                "//   const [custom" + poName + "State, custom" + poName + "Dispatchers] = pageStore.useModel('custom" + poName + "');\r\n" +
                "\r\n" +
                "  return (\r\n" +
                "    <>\r\n" +
                "    </>\r\n" +
                "  );\r\n" +
                "}\r\n" +
                "\r\n" +
                "export {CustomColumn" + poName + "};\r\n";
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] viewAutoGenerate(List<EntityPO> entityPOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import React, {useEffect} from 'react';\r\n");
        sb.append("import pageStore from '@/pages/").append(poName).append("/store';\r\n");
        sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
        sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
        sb.append("import {CustomColumn").append(poName).append("} from '@/pages/").append(poName).append("/view/custom/").append(underPoName).append("';\r\n");
        sb.append("\r\n");
        sb.append("function ").append(poName).append("() {\r\n");
        sb.append("  const [").append(underPoName).append("State, ").append(underPoName).append("Dispatchers] = pageStore.useModel('").append(underPoName).append("');\r\n");
        entityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            sb.append("  const [").append(underSubPoName).append("State, ").append(underSubPoName).append("Dispatchers] = pageStore.useModel('").append(underSubPoName).append("');\r\n");
        });
        sb.append("\r\n");
        sb.append("  const [custom").append(poName).append("State, custom").append(poName).append("Dispatchers] = pageStore.useModel('custom").append(poName).append("');\r\n");
        sb.append("\r\n");
        sb.append("  useEffect(() => {\r\n");
        sb.append("    ").append(underPoName).append("Dispatchers.findDataTableAndFormByName().then(r => console.log(r));\r\n");
        sb.append("  }, [").append(underPoName).append("Dispatchers]);\r\n");
        sb.append("\r\n");
        sb.append("  return (\r\n");
        sb.append("    <>\r\n");
        sb.append("      <DataTableTemple\r\n");
        sb.append("        createItem={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Add()}\r\n");
        sb.append("        editItem={record => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Edit(record)}\r\n");
        sb.append("        deleteItem={record => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Delete({\r\n");
        sb.append("          record,\r\n");
        sb.append("          data: {\r\n");
        sb.append("            pageNumber: ").append(underPoName).append("State.").append(underPoName).append("Current,\r\n");
        sb.append("          },\r\n");
        sb.append("        })}\r\n");
        sb.append("        visibleLoading={").append(underPoName).append("State.").append(underPoName).append("LoadingVisible}\r\n");
        sb.append("        dataSource={").append(underPoName).append("State.").append(underPoName).append("TableData}\r\n");
        sb.append("        items={").append(underPoName).append("State.").append(underPoName).append("Table}\r\n");
        sb.append("        total={").append(underPoName).append("State.").append(underPoName).append("Total}\r\n");
        sb.append("        getPage={").append(underPoName).append("Current => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Page(").append(underPoName).append("Current)}\r\n");
        if (entityPOList.size() != 0) {
            sb.append("        rowSelection={{\r\n");
            sb.append("          mode: 'single',\r\n");
            sb.append("          onSelect: (selected, record) => {\r\n");
            sb.append("            ").append(underPoName).append("Dispatchers.setState({").append(underPoName).append("Id: record.id});\r\n");
            entityPOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                sb.append("            ").append(underSubPoName).append("Dispatchers.onRowClick({selected, record});\r\n");
            });
            sb.append("          },\r\n");
            sb.append("          selectedRowKeys: [\r\n");
            entityPOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                sb.append("            ").append(underSubPoName).append("State.").append(underPoName).append("Id,\r\n");
            });
            sb.append("          ],\r\n");
            sb.append("        }}\r\n");
        }
        sb.append("        primaryKey=\"id\"\r\n");
        sb.append("        customData={").append(underPoName).append("State.customData}\r\n");
        sb.append("        columnRender={(value, index, record) => {\r\n");
        sb.append("          return (\r\n");
        sb.append("            <CustomColumn").append(poName).append(" value={value} index={index} record={record}/>\r\n");
        sb.append("          );\r\n");
        sb.append("        }}\r\n");
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
        sb.append("        onOk={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Save({\r\n");
        sb.append("          ").append(underPoName).append("FormData: ").append(underPoName).append("State.").append(underPoName).append("FormData,\r\n");
        sb.append("          pageNumber: ").append(underPoName).append("State.").append(underPoName).append("Current,\r\n");
        sb.append("        })}\r\n");
        sb.append("        formDataValue={").append(underPoName).append("State.").append(underPoName).append("FormData}\r\n");
        sb.append("        formSortCode={String(Number.parseInt(String(").append(underPoName).append("State.").append(underPoName).append("Total)) + 10)}\r\n");
        sb.append("      />\r\n");
        sb.append("    </>\r\n");
        sb.append("  );\r\n");
        sb.append("}\r\n");
        sb.append("\r\n");
        sb.append("export default ").append(poName).append(";\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] storeGenerate(List<EntityPO> entityPOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import {createStore} from 'ice';\r\n");
        sb.append("import ").append(underPoName).append(" from './models/auto/").append(underPoName).append("';\r\n");
        sb.append("import custom").append(poName).append(" from './models/custom/").append(underPoName).append("';\r\n");
        entityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("import ").append(underSubPoName).append(" from './models/auto/").append(underSubPoName).append("';\r\n");
            sb.append("import custom").append(subPoName).append(" from './models/custom/").append(underSubPoName).append("';\r\n");
        });
        sb.append("\r\n");
        sb.append("const store = createStore({\r\n");
        sb.append("  ").append(underPoName).append(",\r\n");
        sb.append("  custom").append(poName).append(",\r\n");
        entityPOList.forEach(subPo -> {
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String subPoName = BeanUtils.captureName(underSubPoName);
            sb.append("  ").append(underSubPoName).append(",\r\n");
            sb.append("  custom").append(subPoName).append(",\r\n");
        });
        sb.append("});\r\n");
        sb.append("\r\n");
        sb.append("export default store;\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, "store.ts"};
    }

    private String[] indexGenerate(List<EntityPO> entityPOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import React from 'react';\r\n");
        sb.append("import ").append(poName).append(" from '@/pages/").append(poName).append("/view/auto/").append(underPoName).append("';\r\n");
        entityPOList.forEach(subPo -> {
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
        entityPOList.forEach(subPo -> {
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

    @Override
    public JSONObject findDataTableAndFormByName(String entityCode) {
        EntityPO po = queryFactory.selectFrom(QEntityPO.entityPO)
                .where(QEntityPO.entityPO.entityCode.eq(entityCode))
                .fetchOne();
        if (po == null) {
            return null;
        }
        List<PropertyPO> propertyPOList = propertyDao.findAllByEntity(po);
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
                List<DictionaryPO> dictionaryDTOList = dictionaryCustomService
                        .findCatalogByValue(propertyCustomDTO.getPropertyDataSourceType());
                JSONArray mapList = new JSONArray();
                JSONObject mapNull = new JSONObject();
                mapNull.put("label", "无");
                mapNull.put("value", null);
                mapList.add(mapNull);
                if (dictionaryDTOList != null && dictionaryDTOList.size() != 0) {
                    for (DictionaryPO dictionaryPO : dictionaryDTOList) {
                        Map<String, String> map = new HashMap<>();
                        map.put("label", dictionaryPO.getDictionaryName());
                        map.put("value", dictionaryPO.getDictionaryValue());
                        mapList.add(map);
                    }
                }
                List<Map<String, Object>> dateSourceList = sqlCustomService
                        .queryBySqlValue(propertyCustomDTO.getPropertyDataSourceType());
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
        List<PropertyCustomDTO> propertyCustomDTOS = propertyCustomDTOList.stream()
                .sorted(Comparator.comparing(PropertyCustomDTO::getSortCode))
                .collect(Collectors.toList());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataTable", propertyCustomDTOS);
        jsonObject.put("dataForm", propertyCustomDTOS);
        JSONObject customData = new JSONObject();
        customData.put("customType", "是".equals(po.getEntityCustomTable()));
        customData.put("customForm", "是".equals(po.getEntityCustomForm()));
        customData.put("editEnable", "是".equals(po.getEntityEditEnable()));
        customData.put("formType", po.getEntityFormType());
        customData.put("formCol", po.getEntityFormRow());
        jsonObject.put("customData", customData);
        return jsonObject;
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

    private String[] aopSubCustomGenerate(String poName, String appPath) {
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
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findOneById(..))\")\r\n");
        sb.append("    public void findOneByIdBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findOneByIdBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findOneById(..))\")\r\n");
        sb.append("    public void findOneByIdAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findOneByIdAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Before(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findListByPid(..))\")\r\n");
        sb.append("    public void findListByPidBefore(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findListByPidBefore:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @After(value = \"execution(* ").append(poServicePath).append(poName).append("Service.findListByPid(..))\")\r\n");
        sb.append("    public void findListByPidAfter(JoinPoint joinPoint) {\r\n");
        sb.append("        logger.info(\"").append(poName).append("CustomAop.findListByPidAfter:{}\", joinPoint);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entitySubAopData = sb.toString();
        return new String[]{entitySubAopData, poName + "CustomAop.java"};
    }

}
