package com.example.cyjentitycreater.service.custom.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.VoPoConverter;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import com.example.cyjentitycreater.dao.custom.EntityCustomDao;
import com.example.cyjentitycreater.dao.custom.EntityNameCustomDao;
import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import com.example.cyjentitycreater.entity.custom.dto.EntityCustomDTO;
import com.example.cyjentitycreater.service.auto.EntityNameService;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.example.cyjentitycreater.service.custom.AppServiceCustomService;
import com.example.cyjentitycreater.service.custom.EntityNameCustomService;
import com.example.cyjentitycreater.utils.BeanUtils;
import com.example.cyjquery.service.custom.SqlCustomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntityNameCustomServiceImpl extends BaseService implements EntityNameCustomService {

    private final static String componentPath = "C:/Users/noice/IdeaProjects/noice-admin/noice/src/pages/";

    private EntityNameService entityNameService;
    private EntityService entityService;
    private EntityNameCustomDao entityNameCustomDao;
    private EntityCustomDao entityCustomDao;
    private AppServiceCustomService appServiceCustomService;
    private DictionaryCustomService dictionaryCustomService;
    private SqlCustomService sqlCustomService;

    @Autowired
    public void setEntityNameService(EntityNameService entityNameService) {
        this.entityNameService = entityNameService;
    }

    @Autowired
    public void setEntityNameCustomDao(EntityNameCustomDao entityNameCustomDao) {
        this.entityNameCustomDao = entityNameCustomDao;
    }

    @Autowired
    public void setEntityCustomDao(EntityCustomDao entityCustomDao) {
        this.entityCustomDao = entityCustomDao;
    }

    @Autowired
    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

    @Autowired
    public void setAppServiceCustomService(AppServiceCustomService appServiceCustomService) {
        this.appServiceCustomService = appServiceCustomService;
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
    public void generateJavaFile(String id) {
        //获取实例po
        EntityNamePO po = entityNameService.findOneById(id);
        if (po == null) {
            return;
        }
        List<EntityPO> poList = entityService.findListByPid(po.getId());
        //驼峰名
        String underPoName = BeanUtils.underline2Camel(po.getEntityCode());
        //文件名
        String poName = BeanUtils.captureName(underPoName);
        AppServicePO appServicePO = appServiceCustomService.findOneByName(po.getAppName());
        if (appServicePO == null) {
            return;
        }
        //服务路径
        String appPath = appServicePO.getAppPath();
        //服务接口
        String appApi = appServicePO.getAppApi();
        createJavaFile(po, poList, underPoName, poName, appPath, appApi);
        List<EntityNamePO> entityNamePOList = entityNameCustomDao.findByParentEntityName(po.getEntityCode());
        entityNamePOList.forEach(subPo -> {
            List<EntityPO> subPoList = entityService.findListByPid(subPo.getId());
            //驼峰名
            String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
            //文件名
            String SubPoName = BeanUtils.captureName(underSubPoName);
            createSubJavaFile(subPo, subPoList, underSubPoName, SubPoName, appPath, appApi);
        });
    }

    private void createJavaFile(EntityNamePO po, List<EntityPO> poList, String underPoName, String poName,
                                String appPath, String appApi) {
        try {
            createJavaFile(appPath + "/entity/auto/po", poGenerate(po, poList, poName, appPath));
            createJavaFile(appPath + "/dao/auto", daoGenerate(poName, appPath));
            createJavaFile(appPath + "/dao/custom", daoCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/auto", serviceGenerate(poName, appPath));
            createJavaFile(appPath + "/service/auto/Impl", serviceImplGenerate(underPoName, poName, appPath));
            createJavaFile(appPath + "/service/custom", serviceCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/auto", controllerGenerate(underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/auto/Impl", controllerImplGenerate(underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createSubJavaFile(EntityNamePO po, List<EntityPO> poList, String underPoName, String poName, String appPath, String appApi) {
        try {
            createJavaFile(appPath + "/entity/auto/po", poGenerate(po, poList, poName, appPath));
            createJavaFile(appPath + "/dao/auto", daoGenerate(poName, appPath));
            createJavaFile(appPath + "/dao/custom", daoCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/auto", serviceSubGenerate(poName, appPath));
            createJavaFile(appPath + "/service/auto/Impl", serviceImplSubGenerate(underPoName, poName, appPath));
            createJavaFile(appPath + "/service/custom", serviceCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/auto", controllerSubGenerate(underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/auto/Impl", controllerImplSubGenerate(underPoName, poName, appPath, appApi));
            createJavaFile(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath), false);
            createJavaFile(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("CustomService {\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "CustomService.java"};
    }

    public String[] poGenerate(EntityNamePO po, List<EntityPO> poList, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] poPathArr = appPath.split("java");
        String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
        sb.append("package ").append(poPath).append(".auto.po;\r\n");
        sb.append("\r\n");
        sb.append("import lombok.Getter;\r\n");
        sb.append("import lombok.RequiredArgsConstructor;\r\n");
        sb.append("import lombok.Setter;\r\n");
        sb.append("import lombok.ToString;\r\n");
        sb.append("import org.hibernate.Hibernate;\r\n");
        sb.append("import org.hibernate.annotations.GenericGenerator;\r\n");
        sb.append("\r\n");
        sb.append("import javax.persistence.Column;\r\n");
        sb.append("import javax.persistence.Entity;\r\n");
        sb.append("import javax.persistence.GeneratedValue;\r\n");
        sb.append("import javax.persistence.Id;\r\n");
        sb.append("import javax.persistence.Table;\r\n");
        sb.append("import java.io.Serializable;\r\n");
        if (BeanUtils.ifDate(poList)) {
            sb.append("import java.sql.Date;\r\n");
        }
        if (BeanUtils.ifTimestamp(poList)) {
            sb.append("import java.sql.Timestamp;\r\n");
        }
        sb.append("import java.util.Objects;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("@Entity\r\n");
        sb.append("@Table(name = ").append(poName).append("PO.T_").append(po.getEntityCode().toUpperCase()).append(")\r\n");
        sb.append("@Getter\r\n");
        sb.append("@Setter\r\n");
        sb.append("@ToString\r\n");
        sb.append("@RequiredArgsConstructor\r\n");
        sb.append("@GenericGenerator(name = \"uuid2\", strategy = \"org.hibernate.id.UUIDGenerator\")\r\n");
        sb.append("public class ").append(poName).append("PO implements Serializable {\r\n");
        sb.append("\r\n");
        sb.append("    static final String T_").append(po.getEntityCode().toUpperCase()).append(" = \"t_").append(po.getEntityCode()).append("\";\r\n");
        sb.append("\r\n");
        sb.append("    @Id\r\n");
        sb.append("    @GeneratedValue(generator = \"uuid2\")\r\n");
        sb.append("    @Column(name = \"id\", length = 36)\r\n");
        sb.append("    private String id;\r\n");
        poList.forEach(entityPO -> {
            sb.append("    @Column(name = \"").append(entityPO.getPropertyCode()).append("\")\r\n");
            sb.append("    private ").append(entityPO.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(entityPO.getPropertyCode())).append(";\r\n");
        });
        sb.append("    @Column(name = \"status\")\r\n");
        sb.append("    private String status;\r\n");
        sb.append("    @Column(name = \"sort_code\")\r\n");
        sb.append("    private String sortCode;\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public boolean equals(Object o) {\r\n");
        sb.append("        if (this == o) return true;\r\n");
        sb.append("        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;\r\n");
        sb.append("        ").append(poName).append("PO that = (").append(poName).append("PO) o;\r\n");
        sb.append("        return Objects.equals(id, that.id);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public int hashCode() {\r\n");
        sb.append("        return 0;\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}");
        String entityData = sb.toString();
        return new String[]{entityData, poName + "PO.java"};
    }

    public String[] daoGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity";
        //dao路径
        String poDaoPath = packetPath + ".dao";
        sb.append("package ").append(poDaoPath).append(".auto;\r\n");
        sb.append("\r\n");
        sb.append("import ").append(poPath).append(".auto.po.").append(poName).append("PO;\r\n");
        sb.append("import org.springframework.data.jpa.repository.JpaRepository;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("Dao extends JpaRepository<").append(poName).append("PO, String> {\r\n");
        sb.append("}\r\n");
        String entityDaoData = sb.toString();
        return new String[]{entityDaoData, poName + "Dao.java"};
    }

    public String[] daoCustomGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity";
        //dao路径
        String poDaoPath = packetPath + ".dao";
        sb.append("package ").append(poDaoPath).append(".custom;\r\n");
        sb.append("\r\n");
        sb.append("import ").append(poPath).append(".auto.po.").append(poName).append("PO;\r\n");
        sb.append("import org.springframework.data.jpa.repository.JpaRepository;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("CustomDao extends JpaRepository<").append(poName).append("PO, String> {\r\n");
        sb.append("}\r\n");
        String entityDaoData = sb.toString();
        return new String[]{entityDaoData, poName + "CustomDao.java"};
    }

    public String[] serviceGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import com.querydsl.core.QueryResults;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("Service {\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO addOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    void deleteOne(String id);\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO updateOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    QueryResults<").append(poName).append("PO> findAll(Integer pageNumber);\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO findOneById(String id);\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "Service.java"};
    }

    public String[] serviceSubGenerate(String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //service路径
        String poServicePath = packetPath + ".service.auto;\r\n";
        sb.append("package ").append(poServicePath);
        sb.append("\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import com.querydsl.core.QueryResults;\r\n");
        sb.append("\r\n");
        sb.append("import java.util.List;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("public interface ").append(poName).append("Service {\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO addOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    void deleteOne(String id);\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO updateOne(").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    QueryResults<").append(poName).append("PO> findAll(Integer pageNumber, String pid);\r\n");
        sb.append("\r\n");
        sb.append("    ").append(poName).append("PO findOneById(String id);\r\n");
        sb.append("\r\n");
        sb.append("    List<").append(poName).append("PO> findListByPid(String id);\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceData = sb.toString();
        return new String[]{entityServiceData, poName + "Service.java"};
    }

    public String[] serviceImplGenerate(String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //dao路径
        String poDaoPath = packetPath + ".dao.auto.";
        //service路径
        String poServicePath = packetPath + ".service.auto.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
        sb.append("import ").append(poDaoPath).append(poName).append("Dao;\r\n");
        sb.append("import ").append(poPath).append("Q").append(poName).append("PO;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import com.querydsl.core.QueryResults;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append("    public void deleteOne(String id) {\r\n");
        sb.append("        ").append(underPoName).append("Dao.deleteById(id);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public QueryResults<").append(poName).append("PO> findAll(Integer pageNumber) {\r\n");
        sb.append("        return queryFactory\r\n");
        sb.append("                .selectFrom(Q").append(poName).append("PO.").append(underPoName).append("PO)\r\n");
        sb.append("                .where(Q").append(poName).append("PO.").append(underPoName).append("PO.sortCode.isNotNull())\r\n");
        sb.append("                .offset((pageNumber - 1) * 10L)\r\n");
        sb.append("                .orderBy(Q").append(poName).append("PO.").append(underPoName).append("PO.sortCode.asc())\r\n");
        sb.append("                .limit(10)\r\n");
        sb.append("                .fetchResults();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO findOneById(String id) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.findById(id).orElse(null);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceImplData = sb.toString();
        return new String[]{entityServiceImplData, poName + "ServiceImpl.java"};
    }

    private String[] serviceImplSubGenerate(String underPoName, String poName, String appPath) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //dao路径
        String poDaoPath = packetPath + ".dao.auto.";
        //service路径
        String poServicePath = packetPath + ".service.auto.";
        //serviceImpl路径
        sb.append("package ").append(poServicePath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.service.BaseService;\r\n");
        sb.append("import ").append(poDaoPath).append(poName).append("Dao;\r\n");
        sb.append("import ").append(poPath).append("Q").append(poName).append("PO;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import com.querydsl.core.QueryResults;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.stereotype.Service;\r\n");
        sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
        sb.append("\r\n");
        sb.append("import java.util.List;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append("    public void deleteOne(String id) {\r\n");
        sb.append("        ").append(underPoName).append("Dao.deleteById(id);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public QueryResults<").append(poName).append("PO> findAll(Integer pageNumber, String pid) {\r\n");
        sb.append("        return queryFactory\r\n");
        sb.append("                .selectFrom(Q").append(poName).append("PO.").append(underPoName).append("PO)\r\n");
        sb.append("                .where(Q").append(poName).append("PO.").append(underPoName).append("PO.pid.eq(pid).and(Q").append(poName).append("PO.").append(underPoName).append("PO.sortCode.isNotNull()))\r\n");
        sb.append("                .offset((pageNumber - 1) * 10L)\r\n");
        sb.append("                .orderBy(Q").append(poName).append("PO.").append(underPoName).append("PO.sortCode.asc())\r\n");
        sb.append("                .limit(10)\r\n");
        sb.append("                .fetchResults();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ").append(poName).append("PO findOneById(String id) {\r\n");
        sb.append("        return ").append(underPoName).append("Dao.findById(id).orElse(null);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public List<").append(poName).append("PO> findListByPid(String id) {\r\n");
        sb.append("        return queryFactory\r\n");
        sb.append("                .selectFrom(Q").append(poName).append("PO.").append(underPoName).append("PO)\r\n");
        sb.append("                .where(Q").append(poName).append("PO.").append(underPoName).append("PO.pid.eq(id))\r\n");
        sb.append("                .fetch();\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityServiceImplData = sb.toString();
        return new String[]{entityServiceImplData, poName + "ServiceImpl.java"};
    }

    public String[] controllerGenerate(String underPoName, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public interface ").append(poName).append("Controller {\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"查询所有").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Page\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Page(@RequestParam(\"pageNumber\") Integer pageNumber);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"保存").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Save\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Save(@RequestBody ").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Delete\")\r\n");
        sb.append("    void ").append(underPoName).append("Delete(@RequestParam(\"id\") String id);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"根据ID查询").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"find").append(poName).append("ById\")\r\n");
        sb.append("    ResultVO find").append(poName).append("ById(@RequestParam(\"id\") String id);\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "Controller.java"};
    }

    public String[] controllerImplGenerate(String underPoName, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //serviceImpl路径
        String poServicePath = packetPath + ".service.auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto.";
        sb.append("package ").append(poControllerPath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poControllerPath).append(poName).append("Controller;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO ").append(underPoName).append("Save(").append(poName).append("PO po) {\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.success(").append(underPoName).append("Service.addOne(po));\r\n");
        sb.append("        }\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.updateOne(po));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void ").append(underPoName).append("Delete(String id) {\r\n");
        sb.append("        ").append(underPoName).append("Service.deleteOne(id);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO find").append(poName).append("ById(String id) {\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.findOneById(id));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerImplData = sb.toString();
        return new String[]{entityControllerImplData, poName + "ControllerImpl.java"};
    }

    private String[] controllerSubGenerate(String underPoName, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto;\r\n";
        sb.append("package ").append(poControllerPath);
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
        sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
        sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
        sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
        sb.append("public interface ").append(poName).append("Controller {\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"查询所有").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Page\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Page(@RequestParam(\"pageNumber\") Integer pageNumber, @RequestParam(\"pid\") String pid);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"保存").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Save\")\r\n");
        sb.append("    ResultVO ").append(underPoName).append("Save(@RequestBody ").append(poName).append("PO po);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"删除").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"").append(underPoName).append("Delete\")\r\n");
        sb.append("    void ").append(underPoName).append("Delete(@RequestParam(\"id\") String id);\r\n");
        sb.append("\r\n");
        sb.append("    @Operation(summary = \"根据ID查询").append(poName).append("\")\r\n");
        sb.append("    @PostMapping(value = \"find").append(poName).append("ById\")\r\n");
        sb.append("    ResultVO find").append(poName).append("ById(@RequestParam(\"id\") String id);\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerData = sb.toString();
        return new String[]{entityControllerData, poName + "Controller.java"};
    }

    private String[] controllerImplSubGenerate(String underPoName, String poName, String appPath, String appApi) {
        StringBuilder sb = new StringBuilder();
        String[] PathArr = appPath.split("java");
        String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
        //entity路径
        String poPath = packetPath + ".entity.auto.po.";
        //serviceImpl路径
        String poServicePath = packetPath + ".service.auto.";
        //controller路径
        String poControllerPath = packetPath + ".controller.auto.";
        sb.append("package ").append(poControllerPath).append("Impl;\r\n");
        sb.append("\r\n");
        sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
        sb.append("import ").append(poControllerPath).append(poName).append("Controller;\r\n");
        sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
        sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
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
        sb.append("    public ResultVO ").append(underPoName).append("Page(Integer pageNumber, String pid) {\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.findAll(pageNumber, pid));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO ").append(underPoName).append("Save(").append(poName).append("PO po) {\r\n");
        sb.append("        if (po.getId() == null) {\r\n");
        sb.append("            return ResultVO.success(").append(underPoName).append("Service.addOne(po));\r\n");
        sb.append("        }\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.updateOne(po));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public void ").append(underPoName).append("Delete(String id) {\r\n");
        sb.append("        ").append(underPoName).append("Service.deleteOne(id);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("    @Override\r\n");
        sb.append("    public ResultVO find").append(poName).append("ById(String id) {\r\n");
        sb.append("        return ResultVO.success(").append(underPoName).append("Service.findOneById(id));\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String entityControllerImplData = sb.toString();
        return new String[]{entityControllerImplData, poName + "ControllerImpl.java"};
    }

    @Override
    public void createComponentFile(String id) {
        try {
            //获取实例po
            EntityNamePO po = entityNameService.findOneById(id);
            if (po == null) {
                return;
            }
            //驼峰名
            String underPoName = BeanUtils.underline2Camel(po.getEntityCode());
            //文件名
            String poName = BeanUtils.captureName(underPoName);
            AppServicePO appServicePO = appServiceCustomService.findOneByName(po.getAppName());
            if (appServicePO == null) {
                return;
            }
            //服务接口
            String appApi = appServicePO.getAppApi();
            List<EntityNamePO> entityNamePOList = entityNameCustomDao.findByParentEntityName(po.getEntityCode());
            createComponentFile(appApi, entityNamePOList, po, underPoName, poName);
            entityNamePOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                //文件名
                String subPoName = BeanUtils.captureName(underSubPoName);
                createSubComponentFile(appApi, subPo, poName, underPoName, underSubPoName, subPoName);
            });
            createJavaFile(componentPath + poName, indexGenerate(entityNamePOList, underPoName, poName));
            createJavaFile(componentPath + poName, storeGenerate(entityNamePOList, underPoName, poName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createComponentFile(String appApi, List<EntityNamePO> entityNamePOList, EntityNamePO po, String underPoName, String poName) {
        try {
            createJavaFile(componentPath + poName + "/view/auto", viewAutoGenerate(entityNamePOList, underPoName, poName));
            createJavaFile(componentPath + poName + "/view/custom", viewCustomGenerate(underPoName, poName), false);
            createJavaFile(componentPath + poName + "/services/auto", servicesAutoGenerate(appApi, underPoName, poName));
            createJavaFile(componentPath + poName + "/services/custom", servicesCustomGenerate(underPoName), false);
            createJavaFile(componentPath + poName + "/models/auto", modelsAutoGenerate(po, underPoName, poName));
            createJavaFile(componentPath + poName + "/models/custom", modelsCustomGenerate(underPoName, poName), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createSubComponentFile(String appApi, EntityNamePO subPo, String poName, String underPoName, String underSubPoName, String subPoName) {
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

    private String[] modelsSubAutoGenerate(EntityNamePO subPo, String poName, String underPoName, String underSubPoName, String subPoName) {
        String viewData = "import " + underSubPoName + "Service from '@/pages/" + poName + "/services/auto/" + underSubPoName + "';\r\n" +
                "import initService from '@/services/init';\r\n" +
                "\r\n" +
                "export default {\r\n" +
                "\r\n" +
                "  namespace: '" + underSubPoName + "',\r\n" +
                "\r\n" +
                "  state: {\r\n" +
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
                "    customType: false,\r\n" +
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
                "    async " + underSubPoName + "Edit(data) {\r\n" +
                "      if (data) {\r\n" +
                "        const " + underSubPoName + " = await " + underSubPoName + "Service.find" + subPoName + "ById(data.id);\r\n" +
                "        const fromData = {\r\n" +
                "          ..." + underSubPoName + ".data,\r\n" +
                "        };\r\n" +
                "        const payload = {\r\n" +
                "          " + underSubPoName + "FormData: fromData,\r\n" +
                "          " + underSubPoName + "Visible: true,\r\n" +
                "        };\r\n" +
                "        dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "      } else {\r\n" +
                "        const payload = {\r\n" +
                "          " + underSubPoName + "FormData: {},\r\n" +
                "          " + underSubPoName + "Visible: true,\r\n" +
                "        };\r\n" +
                "        dispatch." + underSubPoName + ".setState(payload);\r\n" +
                "      }\r\n" +
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
                "          createItem={data => " + underSubPoName + "Dispatchers." + underSubPoName + "Edit(data)}\r\n" +
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
                "          columnRender={" + underSubPoName + "State.customType ? (value, index, record) => {\r\n" +
                "            return (\r\n" +
                "              <CustomColumn" + subPoName + " value={value} index={index} record={record}/>\r\n" +
                "            );\r\n" +
                "          } : null}\r\n" +
                "          customMethod1={() => custom" + subPoName + "Dispatchers.customMethod1()}\r\n" +
                "          customMethod2={() => custom" + subPoName + "Dispatchers.customMethod2()}\r\n" +
                "          customMethod3={() => custom" + subPoName + "Dispatchers.customMethod3()}\r\n" +
                "          customMethodName1={custom" + subPoName + "State.customMethodName1}\r\n" +
                "          customMethodName2={custom" + subPoName + "State.customMethodName2}\r\n" +
                "          customMethodName3={custom" + subPoName + "State.customMethodName3}\r\n" +
                "        />\r\n" +
                "      </Dialog>\r\n" +
                "      <DataFormTemple\r\n" +
                "        title=\"菜单\"\r\n" +
                "        visibleDialog={" + underSubPoName + "State." + underSubPoName + "Visible}\r\n" +
                "        onClose={() => " + underSubPoName + "Dispatchers.setState({" + underSubPoName + "Visible: false})}\r\n" +
                "        items={" + underSubPoName + "State." + underSubPoName + "Form}\r\n" +
                "        dispatchers={value => " + underSubPoName + "Dispatchers.setDataForm(value)}\r\n" +
                "        onOk={() => " + underSubPoName + "Dispatchers." + underSubPoName + "Save({\r\n" +
                "          " + underSubPoName + "FormData: " + underSubPoName + "State." + underSubPoName + "FormData,\r\n" +
                "          pageNumber: " + underSubPoName + "State." + underSubPoName + "Current,\r\n" +
                "          pid: " + underSubPoName + "State." + underPoName + "Id,\r\n" +
                "        })}\r\n" +
                "        formDataValue={" + underSubPoName + "State." + underSubPoName + "FormData}\r\n" +
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

    private String[] modelsAutoGenerate(EntityNamePO po, String underPoName, String poName) {
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
                "    customType: false,\r\n" +
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
                "    async " + underPoName + "Edit(data) {\r\n" +
                "      if (data) {\r\n" +
                "        const " + underPoName + " = await " + underPoName + "Service.find" + poName + "ById(data.id);\r\n" +
                "        const fromData = {\r\n" +
                "          ..." + underPoName + ".data,\r\n" +
                "        };\r\n" +
                "        const payload = {\r\n" +
                "          " + underPoName + "FormData: fromData,\r\n" +
                "          " + underPoName + "Title: '编辑',\r\n" +
                "          " + underPoName + "Visible: true,\r\n" +
                "        };\r\n" +
                "        dispatch." + underPoName + ".setState(payload);\r\n" +
                "      } else {\r\n" +
                "        const payload = {\r\n" +
                "          " + underPoName + "FormData: {},\r\n" +
                "          " + underPoName + "Title: '添加',\r\n" +
                "          " + underPoName + "Visible: true,\r\n" +
                "        };\r\n" +
                "        dispatch." + underPoName + ".setState(payload);\r\n" +
                "      }\r\n" +
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

    private String[] viewAutoGenerate(List<EntityNamePO> entityNamePOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import React, {useEffect} from 'react';\r\n");
        sb.append("import pageStore from '@/pages/").append(poName).append("/store';\r\n");
        sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
        sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
        sb.append("import {CustomColumn").append(poName).append("} from '@/pages/").append(poName).append("/view/custom/").append(underPoName).append("';\r\n");
        sb.append("\r\n");
        sb.append("function ").append(poName).append("() {\r\n");
        sb.append("  const [").append(underPoName).append("State, ").append(underPoName).append("Dispatchers] = pageStore.useModel('").append(underPoName).append("');\r\n");
        entityNamePOList.forEach(subPo -> {
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
        sb.append("        createItem={data => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Edit(data)}\r\n");
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
        if (entityNamePOList.size() != 0) {
            sb.append("        rowSelection={{\r\n");
            sb.append("          mode: 'single',\r\n");
            sb.append("          onSelect: (selected, record) => {\r\n");
            sb.append("            ").append(underPoName).append("Dispatchers.setState({").append(underPoName).append("Id: record.id});\r\n");
            entityNamePOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                sb.append("            ").append(underSubPoName).append("Dispatchers.onRowClick({selected, record});\r\n");
            });
            sb.append("          },\r\n");
            sb.append("          selectedRowKeys: [\r\n");
            entityNamePOList.forEach(subPo -> {
                //驼峰名
                String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                sb.append("            ").append(underSubPoName).append("State.").append(underPoName).append("Id,\r\n");
            });
            sb.append("          ],\r\n");
            sb.append("        }}\r\n");
        }
        sb.append("        primaryKey=\"id\"\r\n");
        sb.append("        columnRender={").append(underPoName).append("State.customType ? (value, index, record) => {\r\n");
        sb.append("          return (\r\n");
        sb.append("            <CustomColumn").append(poName).append(" value={value} index={index} record={record}/>\r\n");
        sb.append("          );\r\n");
        sb.append("        } : null}\r\n");
        sb.append("        customMethod1={() => custom").append(poName).append("Dispatchers.customMethod1()}\r\n");
        sb.append("        customMethod2={() => custom").append(poName).append("Dispatchers.customMethod2()}\r\n");
        sb.append("        customMethod3={() => custom").append(poName).append("Dispatchers.customMethod3()}\r\n");
        sb.append("        customMethodName1={custom").append(poName).append("State.customMethodName1}\r\n");
        sb.append("        customMethodName2={custom").append(poName).append("State.customMethodName2}\r\n");
        sb.append("        customMethodName3={custom").append(poName).append("State.customMethodName3}\r\n");
        sb.append("      />\r\n");
        sb.append("      <DataFormTemple\r\n");
        sb.append("        title={").append(underPoName).append("State.").append(underPoName).append("Title}\r\n");
        sb.append("        visibleDialog={").append(underPoName).append("State.").append(underPoName).append("Visible}\r\n");
        sb.append("        onClose={() => ").append(underPoName).append("Dispatchers.setState({").append(underPoName).append("Visible: false})}\r\n");
        sb.append("        items={").append(underPoName).append("State.").append(underPoName).append("Form}\r\n");
        sb.append("        dispatchers={value => ").append(underPoName).append("Dispatchers.setDataForm(value)}\r\n");
        sb.append("        onOk={() => ").append(underPoName).append("Dispatchers.").append(underPoName).append("Save({\r\n");
        sb.append("          ").append(underPoName).append("FormData: ").append(underPoName).append("State.").append(underPoName).append("FormData,\r\n");
        sb.append("          pageNumber: ").append(underPoName).append("State.").append(underPoName).append("Current,\r\n");
        sb.append("        })}\r\n");
        sb.append("        formDataValue={").append(underPoName).append("State.").append(underPoName).append("FormData}\r\n");
        sb.append("      />\r\n");
        sb.append("    </>\r\n");
        sb.append("  );\r\n");
        sb.append("}\r\n");
        sb.append("\r\n");
        sb.append("export default ").append(poName).append(";\r\n");
        String viewData = sb.toString();
        return new String[]{viewData, underPoName + ".tsx"};
    }

    private String[] storeGenerate(List<EntityNamePO> entityNamePOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import {createStore} from 'ice';\r\n");
        sb.append("import ").append(underPoName).append(" from './models/auto/").append(underPoName).append("';\r\n");
        sb.append("import custom").append(poName).append(" from './models/custom/").append(underPoName).append("';\r\n");
        entityNamePOList.forEach(subPo -> {
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
        entityNamePOList.forEach(subPo -> {
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

    private String[] indexGenerate(List<EntityNamePO> entityNamePOList, String underPoName, String poName) {
        StringBuilder sb = new StringBuilder();
        sb.append("import React from 'react';\r\n");
        sb.append("import ").append(poName).append(" from '@/pages/").append(poName).append("/view/auto/").append(underPoName).append("';\r\n");
        entityNamePOList.forEach(subPo -> {
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
        entityNamePOList.forEach(subPo -> {
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
        EntityNamePO po = entityNameCustomDao.findEntityNamePOByEntityCodeAndEntityType(entityCode, "PO");
        List<EntityPO> entityPOList = entityCustomDao.findEntityPOByPidAndPropertyDisplayEquals(po.getId(), "是");
        List<EntityCustomDTO> entityCustomDTOList = new ArrayList<>();
        for (EntityPO entityPO : entityPOList) {
            EntityCustomDTO entityCustomDTO = new EntityCustomDTO();
            VoPoConverter.copyProperties(entityPO, entityCustomDTO);
            if (StringUtils.isNotEmpty(entityPO.getPropertyDataSourceType())) {
                List<DictionaryPO> dictionaryDTOList = dictionaryCustomService
                        .findCatalogByValue(entityCustomDTO.getPropertyDataSourceType());
                List<Map<String, String>> mapList = new ArrayList<>();
                Map<String, String> mapNull = new HashMap<>();
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
                        .queryBySqlValue(entityCustomDTO.getPropertyDataSourceType());
                if (dateSourceList != null && dateSourceList.size() != 0) {
                    for (Map<String, Object> dateSourceMap : dateSourceList) {
                        Map<String, String> map = new HashMap<>();
                        map.put("label", dateSourceMap.get("label").toString());
                        map.put("value", dateSourceMap.get("value").toString());
                        mapList.add(map);
                    }
                }
                entityCustomDTO.setPropertyDataSource(mapList);
            }
            entityCustomDTOList.add(entityCustomDTO);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataTable", entityCustomDTOList);
        jsonObject.put("dataForm", entityCustomDTOList);
        return jsonObject;
    }

}
