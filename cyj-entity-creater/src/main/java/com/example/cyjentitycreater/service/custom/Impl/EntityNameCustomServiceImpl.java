package com.example.cyjentitycreater.service.custom.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjentitycreater.dao.custom.EntityCustomDao;
import com.example.cyjentitycreater.dao.custom.EntityNameCustomDao;
import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import com.example.cyjentitycreater.service.auto.EntityNameService;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.example.cyjentitycreater.service.custom.EntityNameCustomService;
import com.example.cyjentitycreater.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntityNameCustomServiceImpl extends BaseService implements EntityNameCustomService {

        private EntityNameService entityNameService;
        private EntityService entityService;
        private EntityNameCustomDao entityNameCustomDao;
        private AppServiceService appServiceService;
        private EntityCustomDao entityCustomDao;

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
        public void setAppServiceService(AppServiceService appServiceService) {
                this.appServiceService = appServiceService;
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

                AppServicePO appServicePO = appServiceService.findOneById(po.getAppId());
                if (appServicePO == null) {
                        return;
                }
                //服务路径
                String appPath = appServicePO.getAppPath();
                //服务接口
                String appApi = appServicePO.getAppApi();
                createJavaFile(po, poList, underPoName, poName, appPath, appApi);
                List<EntityNamePO> entityNamePOList = entityNameService.findListByPid(po.getId()).stream()
                        .filter(entityNamePO -> !"VO".equals(entityNamePO.getEntityType()) && !"DTO".equals(entityNamePO.getEntityType())).collect(Collectors.toList());
                entityNamePOList.forEach(subPo -> {
                        List<EntityPO> subPoList = entityService.findListByPid(subPo.getId());
                        //驼峰名
                        String underSubPoName = BeanUtils.underline2Camel(subPo.getEntityCode());
                        //文件名
                        String SubPoName = BeanUtils.captureName(underSubPoName);
                        createJavaFile(subPo, subPoList, underSubPoName, SubPoName, appPath, appApi);
                });

        }

        private void createJavaFile(EntityNamePO po, List<EntityPO> poList, String underPoName, String poName, String appPath, String appApi) {
                try {
                        createJavaFile(appPath + "/entity/auto/po", poGenerate(po, poList, poName, appPath));
                        createJavaFile(appPath + "/entity/auto/dto", dtoGenerate(poList, poName, appPath));
                        createJavaFile(appPath + "/entity/auto/vo", voGenerate(poList, poName, appPath));
                        createJavaFile(appPath + "/entity/custom/dto", dtoCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/entity/custom/vo", voCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/dao/auto", daoGenerate(poName, appPath));
                        createJavaFile(appPath + "/dao/custom", daoCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/service/auto", serviceGenerate(poName, appPath));
                        createJavaFile(appPath + "/service/auto/Impl", serviceImplGenerate(poList, underPoName, poName, appPath));
                        createJavaFile(appPath + "/service/custom", serviceCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/service/custom/Impl", serviceImplCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/controller/auto", controllerGenerate(underPoName, poName, appPath, appApi));
                        createJavaFile(appPath + "/controller/auto/Impl", controllerImplGenerate(underPoName, poName, appPath, appApi));
                        createJavaFile(appPath + "/controller/custom", controllerCustomGenerate(poName, appPath));
                        createJavaFile(appPath + "/controller/custom/Impl", controllerImplCustomGenerate(poName, appPath, appApi));
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                sb.append("import ").append(packetPath).append(".service.BaseService;\r\n");
                sb.append("import ").append(poServicePath).append(poName).append("CustomService;\r\n");
                sb.append("import org.springframework.stereotype.Service;\r\n");
                sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("public interface ").append(poName).append("CustomService {\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityServiceData = sb.toString();
                return new String[]{entityServiceData, poName + "CustomService.java"};
        }

        private String[] voCustomGenerate(String poName, String appPath) {
                StringBuilder sb = new StringBuilder();
                String[] poPathArr = appPath.split("java");
                String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
                sb.append("package ").append(poPath).append(".custom.vo;\r\n");
                sb.append("\r\n");
                sb.append("import lombok.Data;\r\n");
                sb.append("\r\n");
                sb.append("import java.io.Serializable;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Data\r\n");
                sb.append("public class ").append(poName).append("CustomVO implements Serializable {\r\n");
                sb.append("\r\n");
                sb.append("        private String id;\r\n");
                sb.append("        private Integer pageNumber;\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityData = sb.toString();
                return new String[]{entityData, poName + "CustomVO.java"};
        }

        private String[] dtoCustomGenerate(String poName, String appPath) {
                StringBuilder sb = new StringBuilder();
                String[] poPathArr = appPath.split("java");
                String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
                sb.append("package ").append(poPath).append(".custom.dto;\r\n");
                sb.append("\r\n");
                sb.append("import lombok.Data;\r\n");
                sb.append("\r\n");
                sb.append("import java.io.Serializable;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Data\r\n");
                sb.append("public class ").append(poName).append("CustomDTO implements Serializable {\r\n");
                sb.append("\r\n");
                sb.append("        private String id;\r\n");
                sb.append("        private Integer pageNumber;\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityData = sb.toString();
                return new String[]{entityData, poName + "CustomDTO.java"};
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                sb.append("        static final String T_").append(po.getEntityCode().toUpperCase()).append(" = \"t_").append(po.getEntityCode()).append("\";\r\n");
                sb.append("\r\n");
                sb.append("        @Id\r\n");
                sb.append("        @GeneratedValue(generator = \"uuid2\")\r\n");
                sb.append("        @Column(name = \"id\", length = 36)\r\n");
                sb.append("        private String id;\r\n");
                poList.forEach(entityPO -> {
                        sb.append("        @Column(name = \"").append(entityPO.getPropertyCode()).append("\")\r\n");
                        sb.append("        private ").append(entityPO.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(entityPO.getPropertyCode())).append(";\r\n");
                });
                sb.append("        @Column(name = \"sort_code\")\r\n");
                sb.append("        private String sortCode;\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public boolean equals(Object o) {\r\n");
                sb.append("                if (this == o) return true;\r\n");
                sb.append("                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;\r\n");
                sb.append("                ").append(poName).append("PO that = (").append(poName).append("PO) o;\r\n");
                sb.append("                return Objects.equals(id, that.id);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public int hashCode() {\r\n");
                sb.append("                return 0;\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("}");
                String entityData = sb.toString();
                return new String[]{entityData, poName + "PO.java"};
        }

        public String[] dtoGenerate(List<EntityPO> poList, String poName, String appPath) {
                StringBuilder sb = new StringBuilder();
                String[] poPathArr = appPath.split("java");
                String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
                sb.append("package ").append(poPath).append(".auto.dto;\r\n");
                sb.append("\r\n");
                sb.append("import lombok.Data;\r\n");
                sb.append("\r\n");
                sb.append("import java.io.Serializable;\r\n");
                if (BeanUtils.ifDate(poList)) {
                        sb.append("import java.sql.Date;\r\n");
                }
                if (BeanUtils.ifTimestamp(poList)) {
                        sb.append("import java.sql.Timestamp;\r\n");
                }
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Data\r\n");
                sb.append("public class ").append(poName).append("DTO implements Serializable {\r\n");
                sb.append("\r\n");
                sb.append("        private String id;\r\n");
                poList.forEach(entityPO -> sb.append("        private ").append(entityPO.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(entityPO.getPropertyCode())).append(";\r\n"));
                sb.append("        private String sortCode;\r\n");
                sb.append("\r\n");
                sb.append("}");
                String entityData = sb.toString();
                return new String[]{entityData, poName + "DTO.java"};
        }

        public String[] voGenerate(List<EntityPO> poList, String poName, String appPath) {
                StringBuilder sb = new StringBuilder();
                String[] poPathArr = appPath.split("java");
                String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
                sb.append("package ").append(poPath).append(".auto.vo;\r\n");
                sb.append("\r\n");
                sb.append("import lombok.Data;\r\n");
                sb.append("\r\n");
                sb.append("import java.io.Serializable;\r\n");
                if (BeanUtils.ifDate(poList)) {
                        sb.append("import java.sql.Date;\r\n");
                }
                if (BeanUtils.ifTimestamp(poList)) {
                        sb.append("import java.sql.Timestamp;\r\n");
                }
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Data\r\n");
                sb.append("public class ").append(poName).append("VO implements Serializable {\r\n");
                sb.append("\r\n");
                sb.append("        private String id;\r\n");
                poList.forEach(entityPO -> sb.append("        private ").append(entityPO.getPropertyType()).append(" ").append(BeanUtils.underline2Camel(entityPO.getPropertyCode())).append(";\r\n"));
                sb.append("        private Integer pageNumber;\r\n");
                sb.append("\r\n");
                sb.append("}");
                String entityData = sb.toString();
                return new String[]{entityData, poName + "VO.java"};
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
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
                String voPath = packetPath + ".entity.auto.vo.";
                //service路径
                String poServicePath = packetPath + ".service.auto;\r\n";
                sb.append("package ").append(poServicePath);
                sb.append("\r\n");
                sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
                sb.append("import ").append(voPath).append(poName).append("VO;\r\n");
                sb.append("import com.querydsl.core.QueryResults;");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("public interface ").append(poName).append("Service {\r\n");
                sb.append("\r\n");
                sb.append("        ").append(poName).append("PO addOne(").append(poName).append("PO po);\r\n");
                sb.append("        void deleteOne(String id);\r\n");
                sb.append("        ").append(poName).append("PO updateOne(").append(poName).append("PO po);\r\n");
                sb.append("        QueryResults<").append(poName).append("VO> findAll(").append(poName).append("VO vo);\r\n");
                sb.append("        ").append(poName).append("PO findOneById(String id);\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityServiceData = sb.toString();
                return new String[]{entityServiceData, poName + "Service.java"};
        }

        public String[] serviceImplGenerate(List<EntityPO> poList, String underPoName, String poName, String appPath) {
                StringBuilder sb = new StringBuilder();
                String[] PathArr = appPath.split("java");
                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
                //entity路径
                String poPath = packetPath + ".entity.auto.po.";
                String voPath = packetPath + ".entity.auto.vo.";
                //dao路径
                String poDaoPath = packetPath + ".dao.auto.";
                //service路径
                String poServicePath = packetPath + ".service.auto.";
                //serviceImpl路径
                sb.append("package ").append(poServicePath).append("Impl;\r\n");
                sb.append("\r\n");
                sb.append("import ").append(poDaoPath).append(poName).append("Dao;\r\n");
                sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
                sb.append("import ").append(poPath).append("Q").append(poName).append("PO;\r\n");
                sb.append("import ").append(voPath).append(poName).append("VO;\r\n");
                sb.append("import ").append(packetPath).append(".service.BaseService;\r\n");
                sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
                sb.append("import com.querydsl.core.QueryResults;\r\n");
                sb.append("import com.querydsl.core.types.ExpressionUtils;\r\n");
                sb.append("import com.querydsl.core.types.Predicate;\r\n");
                sb.append("import com.querydsl.core.types.Projections;\r\n");
                sb.append("import com.querydsl.core.types.QBean;\r\n");
                sb.append("import org.apache.commons.lang3.StringUtils;\r\n");
                sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
                sb.append("import org.springframework.stereotype.Service;\r\n");
                sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Service\r\n");
                sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
                sb.append("public class ").append(poName).append("ServiceImpl extends BaseService implements ").append(poName).append("Service {\r\n");
                sb.append("\r\n");
                sb.append("        private ").append(poName).append("Dao ").append(underPoName).append("Dao;\r\n");
                sb.append("\r\n");
                sb.append("        @Autowired\r\n");
                sb.append("        public void set").append(poName).append("Dao(").append(poName).append("Dao ").append(underPoName).append("Dao) {\r\n");
                sb.append("                this.").append(underPoName).append("Dao = ").append(underPoName).append("Dao;\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ").append(poName).append("PO addOne(").append(poName).append("PO po) {\r\n");
                sb.append("                return ").append(underPoName).append("Dao.save(po);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public void deleteOne(String id) {\r\n");
                sb.append("                ").append(underPoName).append("Dao.deleteById(id);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ").append(poName).append("PO updateOne(").append(poName).append("PO po) {\r\n");
                sb.append("                return ").append(underPoName).append("Dao.saveAndFlush(po);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public QueryResults<").append(poName).append("VO> findAll(").append(poName).append("VO vo) {\r\n");
                sb.append("                Q").append(poName).append("PO q").append(poName).append("PO = Q").append(poName).append("PO.").append(underPoName).append("PO;\r\n");
                sb.append("                QBean<").append(poName).append("VO> qBean = Projections.bean(").append(poName).append("VO.class, q").append(poName).append("PO.id,\r\n");
                poList.forEach(entityPO -> {
                        if (!"pid".equals(entityPO.getPropertyCode())) {
                                //驼峰名
                                String underPropertyCode = BeanUtils.underline2Camel(entityPO.getPropertyCode());
                                sb.append("                        q").append(poName).append("PO.").append(underPropertyCode).append(",\r\n");
                        }
                });
                sb.append("                        q").append(poName).append("PO.sortCode);\r\n");
                sb.append("                Predicate predicate = q").append(poName).append("PO.sortCode.isNotNull();\r\n");
                poList.forEach(entityPO -> {
                        if (!"pid".equals(entityPO.getPropertyCode())) {
                                //驼峰名
                                String underPropertyCode = BeanUtils.underline2Camel(entityPO.getPropertyCode());
                                //文件名
                                String propertyCode = BeanUtils.captureName(underPropertyCode);
                                sb.append("                predicate = StringUtils.isEmpty(vo.get").append(propertyCode).append("()) ?\r\n");
                                sb.append("                        predicate : ExpressionUtils.and(predicate, q").append(poName).append("PO.").append(underPropertyCode).append(".like(\"%\" + vo.get").append(propertyCode).append("() + " +
                                        "\"%\"));\r\n");
                        }
                });
                sb.append("                return queryFactory.select(qBean)\r\n");
                sb.append("                        .from(q").append(poName).append("PO)\r\n");
                sb.append("                        .where(predicate)\r\n");
                sb.append("                        .offset(vo.getPageNumber())\r\n");
                sb.append("                        .orderBy(q").append(poName).append("PO.sortCode.asc())\r\n");
                sb.append("                        .limit(8)\r\n");
                sb.append("                        .fetchResults();\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ").append(poName).append("PO findOneById(String id) {\r\n");
                sb.append("                return ").append(underPoName).append("Dao.findById(id).orElse(null);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityServiceImplData = sb.toString();
                return new String[]{entityServiceImplData, poName + "ServiceImpl.java"};
        }

        public String[] controllerGenerate(String underPoName, String poName, String appPath, String appApi) {
                StringBuilder sb = new StringBuilder();
                String[] PathArr = appPath.split("java");
                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
                String dtoPath = packetPath + ".entity.auto.dto.";
                String voPath = packetPath + ".entity.auto.vo.";
                //controller路径
                String poControllerPath = packetPath + ".controller.auto;\r\n";
                sb.append("package ").append(poControllerPath);
                sb.append("\r\n");
                sb.append("import com.example.cyjcommon.annotation.InterFaceMapping;\r\n");
                sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
                sb.append("import ").append(dtoPath).append(poName).append("DTO;\r\n");
                sb.append("import ").append(voPath).append(poName).append("VO;\r\n");
                sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
                sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
                sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
                sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
                sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
                sb.append("\r\n");
                sb.append("import java.util.Map;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@Tag(name = \"").append(poName).append("\")\r\n");
                sb.append("public interface ").append(poName).append("Controller {\r\n");
                sb.append("\r\n");
                sb.append("        @Operation(summary = \"查询所有").append(poName).append("\")\r\n");
                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
                sb.append("        @PostMapping(value = \"").append(underPoName).append("Page\")\r\n");
                sb.append("        ResultVO ").append(underPoName).append("Page(@RequestBody ").append(poName).append("VO vo);\r\n");
                sb.append("\r\n");
                sb.append("        @Operation(summary = \"保存").append(poName).append("\")\r\n");
                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
                sb.append("        @PostMapping(value = \"").append(underPoName).append("Save\")\r\n");
                sb.append("        ResultVO ").append(underPoName).append("Save(@RequestBody ").append(poName).append("DTO dto);\r\n");
                sb.append("\r\n");
                sb.append("        @Operation(summary = \"删除").append(poName).append("\")\r\n");
                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
                sb.append("        @PostMapping(value = \"").append(underPoName).append("Delete\")\r\n");
                sb.append("        void ").append(underPoName).append("Delete(@RequestParam(\"id\") String id);\r\n");
                sb.append("\r\n");
                sb.append("        @Operation(summary = \"根据ID查询").append(poName).append("\")\r\n");
                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
                sb.append("        @PostMapping(value = \"find").append(poName).append("ById\")\r\n");
                sb.append("        ResultVO find").append(poName).append("ById(@RequestParam(\"id\") String id);\r\n");
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
                String dtoPath = packetPath + ".entity.auto.dto.";
                String voPath = packetPath + ".entity.auto.vo.";
                //serviceImpl路径
                String poServicePath = packetPath + ".service.auto.";
                //controller路径
                String poControllerPath = packetPath + ".controller.auto.";
                sb.append("package ").append(poControllerPath).append("Impl;\r\n");
                sb.append("\r\n");
                sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
                sb.append("import com.example.cyjcommon.utils.VoPoConverter;\r\n");
                sb.append("import ").append(poControllerPath).append(poName).append("Controller;\r\n");
                sb.append("import ").append(dtoPath).append(poName).append("DTO;\r\n");
                sb.append("import ").append(poPath).append(poName).append("PO;\r\n");
                sb.append("import ").append(voPath).append(poName).append("VO;\r\n");
                sb.append("import ").append(poServicePath).append(poName).append("Service;\r\n");
                sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
                sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
                sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
                sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
                sb.append("\r\n");
                sb.append("/**\r\n");
                sb.append(" * @author 曹元杰\r\n");
                sb.append(" * @version 1.0\r\n");
                sb.append(" * @date ").append(LocalDate.now()).append("\r\n");
                sb.append(" */\r\n");
                sb.append("@CrossOrigin\r\n");
                sb.append("@RestController\r\n");
                sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
                sb.append("public class ").append(poName).append("ControllerImpl implements ").append(poName).append("Controller {\r\n");
                sb.append("\r\n");
                sb.append("        private ").append(poName).append("Service ").append(underPoName).append("Service;\r\n");
                sb.append("\r\n");
                sb.append("        @Autowired\r\n");
                sb.append("        public void set").append(poName).append("Service(").append(poName).append("Service ").append(underPoName).append("Service) {\r\n");
                sb.append("                this.").append(underPoName).append("Service = ").append(underPoName).append("Service;\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ResultVO ").append(underPoName).append("Page(").append(poName).append("VO vo) {\r\n");
                sb.append("                return ResultVO.success(").append(underPoName).append("Service.findAll(vo));\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ResultVO ").append(underPoName).append("Save(").append(poName).append("DTO dto) {\r\n");
                sb.append("                ").append(poName).append("PO po = new ").append(poName).append("PO();\r\n");
                sb.append("                VoPoConverter.copyProperties(dto, po);\r\n");
                sb.append("                if (po.getId() == null) {\r\n");
                sb.append("                        return ResultVO.success(").append(underPoName).append("Service.addOne(po));\r\n");
                sb.append("                }\r\n");
                sb.append("                return ResultVO.success(").append(underPoName).append("Service.updateOne(po));\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public void ").append(underPoName).append("Delete(String id) {\r\n");
                sb.append("                ").append(underPoName).append("Service.deleteOne(id);\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("        @Override\r\n");
                sb.append("        public ResultVO find").append(poName).append("ById(String id) {\r\n");
                sb.append("                return ResultVO.success(").append(underPoName).append("Service.findOneById(id));\r\n");
                sb.append("        }\r\n");
                sb.append("\r\n");
                sb.append("}\r\n");
                String entityControllerImplData = sb.toString();
                return new String[]{entityControllerImplData, poName + "ControllerImpl.java"};
        }

        @Override
        public void createComponentFile(String id) {
//                EntityNamePO po = entityNameCustomService.findOneById(id);
//                List<DictionaryDTO> pos = dictionaryApiService.findCatalogByValue("FILE_PATH");
//                String pagePath = CommonUtils.listToMap(pos, "dictionaryName").get("componentPath").getDictionaryValue();
//                AppServicePO appServicePO = appServiceCustomService.findOneById(po.getAppId());
//                String componentName = BeanUtils.captureName(BeanUtils.underline2Camel(po.getName()));
//                String componentPath = pagePath + "/" + componentName;
//                String[] relEntities = null;
//                if (StringUtils.isNotEmpty(po.getRelEntity())) {
//                        String str = po.getRelEntity().substring(po.getRelEntity().indexOf("[") + 1, po.getRelEntity().indexOf("]"));
//                        relEntities = str.split(",");
//                }
//                createJavaFile(componentPath + "/models");
//                createJavaFile(componentPath + "/services");
//                createJavaFile(componentPath + "/view");
//                createJavaFile(componentPath + "/models/custom");
//                createJavaFile(componentPath + "/services/custom");
//                createJavaFile(componentPath + "/view/custom");
//                for (String cho : choose) {
//                        switch (cho) {
//                                case "service":
//                                        createJavaFile(componentPath + "/services/custom", createCustomServiceJsx(po.getName()));
//                                        createJavaFile(componentPath + "/services", createServiceJsx(po.getName(), appServicePO.getAppApi()));
//                                        break;
//                                case "model":
//                                        createJavaFile(componentPath + "/models/custom", createCustomModelsJsx(po.getName()));
//                                        createJavaFile(componentPath + "/models", createModelsJsx(po.getName(), po.getFormModelCode(), po.getTableModelCode()));
//                                        break;
//                                case "view":
//                                        createJavaFile(componentPath + "/view/custom", createCustomViewJsx(po.getName()));
//                                        createJavaFile(componentPath + "/view/custom", createIndexCss());
//                                        createJavaFile(componentPath + "/view", createViewJsx(po.getName(), relEntities));
//                                        createJavaFile(componentPath + "/view", createIndexCss());
//                                        break;
//                                case "index":
//                                        createJavaFile(componentPath, createIndexJsx(po, relEntities));
//                                        createJavaFile(componentPath, createIndexStore(po, relEntities));
//                                        break;
//                                default:
//                                        break;
//                        }
//                        if (relEntities != null) {
//                                for (String relEntity : relEntities) {
//                                        EntityNamePO subPo = entityNameCustomService.findOneById(relEntity);
//                                        AppServicePO subAppServicePO = appServiceCustomService.findOneById(subPo.getAppId());
//                                        switch (cho) {
//                                                case "service":
//                                                        createJavaFile(componentPath + "/services/custom", createCustomServiceJsx(subPo.getName()));
//                                                        createJavaFile(componentPath + "/services", createSubServiceJsx(subPo.getName(), subAppServicePO.getAppApi(), po.getName()));
//                                                        break;
//                                                case "model":
//                                                        createJavaFile(componentPath + "/models/custom", createCustomModelsJsx(subPo.getName()));
//                                                        createJavaFile(componentPath + "/models", createSubModelsJsx(subPo.getName(), po.getName(), subPo.getFormModelCode(), subPo.getTableModelCode()));
//                                                        break;
//                                                case "view":
//                                                        createJavaFile(componentPath + "/view/custom", createCustomSubViewJsx(subPo.getName(), po.getName()));
//                                                        createJavaFile(componentPath + "/view", createSubViewJsx(subPo.getName(), po.getName()));
//                                                        break;
//                                                default:
//                                                        break;
//                                        }
//                                }
//                        }
//                }
        }

        @Override
        public JSONObject findDataTableAndFormByName(String entityCode) {
                EntityNamePO po = entityNameCustomDao.findEntityNamePOByEntityCodeAndEntityType(entityCode, "PO");
                List<EntityPO> entityPOList = entityCustomDao.findEntityPOByPidAndPropertyDisplayEquals(po.getId(), "是");
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("dataTable", entityPOList);
                jsonObject.put("dataForm", entityPOList);
                return jsonObject;
        }


//
//        private String[] entitySubGenerate(EntityNamePO subPo, String subFileName, String appPath) {
//                return entityGenerate(subPo, subFileName, appPath);
//        }
//

//
//        private String[] daoSubGenerate(String subFileName, String appPath) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //entity路径
//                String poPath = packetPath + ".entity";
//                //dao路径
//                String poDaoPath = packetPath + ".dao";
//                sb.append("package ").append(poDaoPath).append(";\r\n");
//                sb.append("\r\n");
//                sb.append("import ").append(poPath).append(".po.").append(subFileName).append("PO;\r\n");
//                sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
//                sb.append("import org.springframework.data.jpa.repository.JpaRepository;\r\n");
//                sb.append("\r\n");
//                generateAuthor(sb);
//                sb.append("public interface ").append(subFileName).append("Dao extends JpaRepository<").append(subFileName).append("PO, String> {\r\n");
//                sb.append("\r\n");
//                sb.append("        @Operation(summary = \"删除实体\")\r\n");
//                sb.append("        void deleteByPid(String pid);\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityDaoData = sb.toString();
//                return new String[]{entityDaoData, subFileName + "Dao.java"};
//        }
//

//
//        private String[] serviceSubGenerate(String subFileName, String appPath) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //entity路径
//                String poPath = packetPath + ".entity";
//                //service路径
//                String poServicePath = packetPath + ".service";
//                sb.append("package ").append(poServicePath).append(";\r\n");
//                sb.append("\r\n");
//                sb.append("import ").append(poPath).append(".po.").append(subFileName).append("PO;\r\n");
//                sb.append("import org.springframework.data.domain.Page;");
//                sb.append("\r\n");
//                sb.append("import java.util.List;\r\n");
//                generateAuthor(sb);
//                sb.append("public interface ").append(subFileName).append("Service {\r\n");
//                sb.append("\r\n");
//                sb.append("        ").append(subFileName).append("PO addOne(").append(subFileName).append("PO po);\r\n");
//                sb.append("        void deleteOne(String id);\r\n");
//                sb.append("        ").append(subFileName).append("PO updateOne(").append(subFileName).append("PO po);\r\n");
//                sb.append("        Page<").append(subFileName).append("PO> findAll(String id, Integer pageNumber, Integer pageSize, String sortCode);\r\n");
//                sb.append("        List<").append(subFileName).append("PO> findListById(String id);\r\n");
//                sb.append("        ").append(subFileName).append("PO findOneById(String id);\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityServiceData = sb.toString();
//                return new String[]{entityServiceData, subFileName + "Service.java"};
//        }
//

//
//        private String[] serviceImplSubGenerate(String underSubFileName, String subFileName, String underFileName, String fileName, String appPath) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //entity路径
//                String poPath = packetPath + ".entity";
//                //dao路径
//                String poDaoPath = packetPath + ".dao";
//                //service路径
//                String poServicePath = packetPath + ".service";
//                //serviceImpl路径
//                String poServiceImplPath = poServicePath + ".Impl";
//                sb.append("package ").append(poServiceImplPath).append(";\r\n");
//                sb.append("\r\n");
//                sb.append("import com.example.cyjcommon.utils.CommonUtils;\r\n");
//                sb.append("import ").append(poDaoPath).append(".").append(subFileName).append("Dao;\r\n");
//                sb.append("import ").append(poPath).append(".po.").append(subFileName).append("PO;\r\n");
//                sb.append("import ").append(poPath).append(".po.Q").append(subFileName).append("PO;\r\n");
//                sb.append("import ").append(poPath).append(".po.Q").append(fileName).append("PO;\r\n");
//                sb.append("import ").append(poServicePath).append(".").append(subFileName).append("Service;\r\n");
//                sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
//                sb.append("import org.springframework.data.domain.Page;\r\n");
//                sb.append("import org.springframework.data.domain.PageImpl;\r\n");
//                sb.append("import org.springframework.data.domain.PageRequest;\r\n");
//                sb.append("import org.springframework.data.domain.Pageable;\r\n");
//                sb.append("import org.springframework.data.domain.Sort;\r\n");
//                sb.append("import org.springframework.stereotype.Service;\r\n");
//                sb.append("import org.springframework.transaction.annotation.Transactional;\r\n");
//                sb.append("\r\n");
//                sb.append("import java.util.List;\r\n");
//                generateAuthor(sb);
//                sb.append("\r\n");
//                sb.append("@Service\r\n");
//                sb.append("@Transactional(rollbackFor = Exception.class)\r\n");
//                sb.append("public class ").append(subFileName).append("ServiceImpl extends BaseService implements ").append(subFileName).append("Service {\r\n");
//                sb.append("\r\n");
//                sb.append("        private ").append(subFileName).append("Dao ").append(underSubFileName).append("Dao;\r\n");
//                sb.append("\r\n");
//                sb.append("        @Autowired\r\n");
//                sb.append("        public void set").append(subFileName).append("Dao(").append(subFileName).append("Dao ").append(underSubFileName).append("Dao) {\r\n");
//                sb.append("                this.").append(underSubFileName).append("Dao = ").append(underSubFileName).append("Dao;\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ").append(subFileName).append("PO addOne(").append(subFileName).append("PO po) {\r\n");
//                sb.append("                return ").append(underSubFileName).append("Dao.save(po);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public void deleteOne(String id) {\r\n");
//                sb.append("                ").append(underSubFileName).append("Dao.deleteById(id);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ").append(subFileName).append("PO updateOne(").append(subFileName).append("PO po) {\r\n");
//                sb.append("                return ").append(underSubFileName).append("Dao.saveAndFlush(po);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public Page<").append(subFileName).append("PO> findAll(String id, Integer pageNumber, Integer pageSize, String sortCode) {\r\n");
//                sb.append("                Sort sort = Sort.by(sortCode);\r\n");
//                sb.append("                Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, sort);\r\n");
//                sb.append("                List<").append(subFileName).append("PO> poList = findListById(id);\r\n");
//                sb.append("                List<").append(subFileName).append("PO> poPage = CommonUtils.page(poList, pageSize, pageNumber);\r\n");
//                sb.append("                return new PageImpl<>(poPage, pageable, poList.size());\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public List<").append(subFileName).append("PO> findListById(String id) {\r\n");
//                sb.append("                Q").append(fileName).append("PO q").append(fileName).append("PO = Q").append(fileName).append("PO.").append(underFileName).append("PO;\r\n");
//                sb.append("                Q").append(subFileName).append("PO q").append(subFileName).append("PO = Q").append(subFileName).append("PO.").append(underSubFileName).append("PO;\r\n");
//                sb.append("                return queryFactory.selectFrom(q").append(subFileName).append("PO)\r\n");
//                sb.append("                        .innerJoin(q").append(fileName).append("PO)\r\n");
//                sb.append("                        .on(q").append(subFileName).append("PO.pid.eq(q").append(fileName).append("PO.id))\r\n");
//                sb.append("                        .where(q").append(fileName).append("PO.id.eq(id))\r\n");
//                sb.append("                        .orderBy(q").append(subFileName).append("PO.sortCode.asc()).fetch();\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ").append(subFileName).append("PO findOneById(String id) {\r\n");
//                sb.append("                if (").append(underSubFileName).append("Dao.findById(id).isPresent()) {\r\n");
//                sb.append("                        return ").append(underSubFileName).append("Dao.findById(id).get();\r\n");
//                sb.append("                }\r\n");
//                sb.append("                return null;\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityServiceImplData = sb.toString();
//                return new String[]{entityServiceImplData, subFileName + "ServiceImpl.java"};
//        }
//

//
//        private String[] controllerSubGenerate(String underSubFileName, String subFileName, String appPath, String appApi) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //controller路径
//                String poControllerPath = packetPath + ".controller";
//                sb.append("package ").append(poControllerPath).append(";\r\n");
//                sb.append("\r\n");
//                sb.append("import com.example.cyjcommon.annotation.InterFaceMapping;\r\n");
//                sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
//                sb.append("import io.swagger.v3.oas.annotations.Operation;\r\n");
//                sb.append("import io.swagger.v3.oas.annotations.tags.Tag;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.PostMapping;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RequestBody;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RequestParam;\r\n");
//                sb.append("\r\n");
//                sb.append("import java.util.Map;\r\n");
//                sb.append("\r\n");
//                generateAuthor(sb);
//                sb.append("@Tag(name = \"").append(subFileName).append("\")\r\n");
//                sb.append("public interface ").append(subFileName).append("Controller {\r\n");
//                sb.append("\r\n");
//                sb.append("        @Operation(summary = \"查询所有").append(subFileName).append("\")\r\n");
//                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
//                sb.append("        @PostMapping(value = \"").append(underSubFileName).append("Page\")\r\n");
//                sb.append("        ResultVO ").append(underSubFileName).append("FindAll(@RequestParam(\"id\") String id,\r\n");
//                sb.append("                                 @RequestParam(\"pageNumber\") Integer pageNumber,\r\n");
//                sb.append("                                 @RequestParam(\"pageSize\") Integer pageSize,\r\n");
//                sb.append("                                 @RequestParam(\"sortCode\") String sortCode);\r\n");
//                sb.append("\r\n");
//                sb.append("        @Operation(summary = \"保存").append(subFileName).append("\")\r\n");
//                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
//                sb.append("        @PostMapping(value = \"").append(underSubFileName).append("Save\")\r\n");
//                sb.append("        ResultVO ").append(underSubFileName).append("Save(@RequestBody Map<String, Object> vo);\r\n");
//                sb.append("\r\n");
//                sb.append("        @Operation(summary = \"删除").append(subFileName).append("\")\r\n");
//                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
//                sb.append("        @PostMapping(value = \"").append(underSubFileName).append("Delete\")\r\n");
//                sb.append("        void ").append(underSubFileName).append("Delete(@RequestParam(\"id\") String id);\r\n");
//                sb.append("\r\n");
//                sb.append("        @Operation(summary = \"根据ID查询").append(subFileName).append("\")\r\n");
//                sb.append("        @InterFaceMapping(api = \"").append(appApi).append("\")\r\n");
//                sb.append("        @PostMapping(value = \"find").append(subFileName).append("ById\")\r\n");
//                sb.append("        ResultVO find").append(subFileName).append("ById(@RequestParam(\"id\") String id);\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityControllerData = sb.toString();
//                return new String[]{entityControllerData, subFileName + "Controller.java"};
//        }
//
//        public String[] controllerImplGenerate(String underFileName, String fileName, String appPath, String appApi) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //entity路径
//                String poPath = packetPath + ".entity";
//                //serviceImpl路径
//                String poServicePath = packetPath + ".service";
//                //controller路径
//                String poControllerPath = packetPath + ".controller";
//                sb.append("package ").append(poControllerPath).append(".Impl;\r\n");
//                sb.append("\r\n");
//                sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
//                sb.append("import com.example.cyjcommon.utils.VoPoConverter;\r\n");
//                sb.append("import ").append(poControllerPath).append(".").append(fileName).append("Controller;\r\n");
//                sb.append("import ").append(poPath).append(".po.").append(fileName).append("PO;\r\n");
//                sb.append("import ").append(poServicePath).append(".").append(fileName).append("Service;\r\n");
//                sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
//                sb.append("\r\n");
//                sb.append("import java.util.Map;\r\n");
//                sb.append("\r\n");
//                generateAuthor(sb);
//                sb.append("@CrossOrigin\r\n");
//                sb.append("@RestController\r\n");
//                sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
//                sb.append("public class ").append(fileName).append("ControllerImpl implements ").append(fileName).append("Controller {\r\n");
//                sb.append("\r\n");
//                sb.append("        private ").append(fileName).append("Service ").append(underFileName).append("Service;\r\n");
//                sb.append("\r\n");
//                sb.append("        @Autowired\r\n");
//                sb.append("        public void set").append(fileName).append("Service(").append(fileName).append("Service ").append(underFileName).append("Service) {\r\n");
//                sb.append("                this.").append(underFileName).append("Service = ").append(underFileName).append("Service;\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO ").append(underFileName).append("FindAll(Integer pageNumber, Integer pageSize, String sortCode) {\r\n");
//                sb.append("                return ResultVO.success(").append(underFileName).append("Service.findAll(pageNumber - 1, pageSize, sortCode));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO ").append(underFileName).append("Save").append("(Map<String, Object> vo) {\r\n");
//                sb.append("                ").append(fileName).append("PO po = new ").append(fileName).append("PO();\r\n");
//                sb.append("                VoPoConverter.copyProperties(vo, po);\r\n");
//                sb.append("                if (po.getId() == null) {\r\n");
//                sb.append("                        return ResultVO.success(").append(underFileName).append("Service.addOne(po));\r\n");
//                sb.append("                }\r\n");
//                sb.append("                return ResultVO.success(").append(underFileName).append("Service.updateOne(po));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public void ").append(underFileName).append("Delete(String id) {\r\n");
//                sb.append("                ").append(underFileName).append("Service.deleteOne(id);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO find").append(fileName).append("ById(String id) {\r\n");
//                sb.append("                return ResultVO.success(").append(underFileName).append("Service.findOneById(id));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityControllerImplData = sb.toString();
//                return new String[]{entityControllerImplData, fileName + "ControllerImpl.java"};
//        }
//
//        private String[] controllerImplSubGenerate(String underSubFileName, String subFileName, String appPath, String appApi) {
//                StringBuilder sb = new StringBuilder();
//                String[] PathArr = appPath.split("java");
//                String packetPath = PathArr[1].substring(1).replaceAll("\\\\", ".");
//                //entity路径
//                String poPath = packetPath + ".entity";
//                //serviceImpl路径
//                String poServicePath = packetPath + ".service";
//                //controller路径
//                String poControllerPath = packetPath + ".controller";
//                sb.append("package ").append(poControllerPath).append(".Impl;\r\n");
//                sb.append("\r\n");
//                sb.append("import com.example.cyjcommon.utils.ResultVO;\r\n");
//                sb.append("import com.example.cyjcommon.utils.VoPoConverter;\r\n");
//                sb.append("import ").append(poControllerPath).append(".").append(subFileName).append("Controller;\r\n");
//                sb.append("import ").append(poPath).append(".po.").append(subFileName).append("PO;\r\n");
//                sb.append("import ").append(poServicePath).append(".").append(subFileName).append("Service;\r\n");
//                sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.CrossOrigin;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
//                sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
//                sb.append("\r\n");
//                sb.append("import java.util.Map;\r\n");
//                sb.append("\r\n");
//                generateAuthor(sb);
//                sb.append("@CrossOrigin\r\n");
//                sb.append("@RestController\r\n");
//                sb.append("@RequestMapping(value = \"").append(appApi).append("\")\r\n");
//                sb.append("public class ").append(subFileName).append("ControllerImpl implements ").append(subFileName).append("Controller {\r\n");
//                sb.append("\r\n");
//                sb.append("        private ").append(subFileName).append("Service ").append(underSubFileName).append("Service;\r\n");
//                sb.append("\r\n");
//                sb.append("        @Autowired\r\n");
//                sb.append("        public void set").append(subFileName).append("Service(").append(subFileName).append("Service ").append(underSubFileName).append("Service) {\r\n");
//                sb.append("                this.").append(underSubFileName).append("Service = ").append(underSubFileName).append("Service;\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO ").append(underSubFileName).append("FindAll(String id, Integer pageNumber, Integer pageSize, String sortCode) {\r\n");
//                sb.append("                return ResultVO.success(").append(underSubFileName).append("Service.findAll(id, pageNumber, pageSize, sortCode));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO ").append(underSubFileName).append("Save").append("(Map<String, Object> vo) {\r\n");
//                sb.append("                ").append(subFileName).append("PO po = new ").append(subFileName).append("PO();\r\n");
//                sb.append("                VoPoConverter.copyProperties(vo, po);\r\n");
//                sb.append("                if (po.getId() == null) {\r\n");
//                sb.append("                        return ResultVO.success(").append(underSubFileName).append("Service.addOne(po));\r\n");
//                sb.append("                }\r\n");
//                sb.append("                return ResultVO.success(").append(underSubFileName).append("Service.updateOne(po));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public void ").append(underSubFileName).append("Delete(String id) {\r\n");
//                sb.append("                ").append(underSubFileName).append("Service.deleteOne(id);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public ResultVO find").append(subFileName).append("ById(String id) {\r\n");
//                sb.append("                return ResultVO.success(").append(underSubFileName).append("Service.findOneById(id));\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("}\r\n");
//                String entityControllerImplData = sb.toString();
//                return new String[]{entityControllerImplData, subFileName + "ControllerImpl.java"};
//        }
//
//
//
//        private String[] createCustomSubViewJsx(String subEntityName, String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(subEntityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                String underEntityName = BeanUtils.underline2Camel(entityName);
//                String EntityName = BeanUtils.captureName(underEntityName);
//                sb.append("/* eslint-disable no-unused-vars */\r\n");
//                sb.append("import React, { useEffect } from 'react';\r\n");
//                sb.append("import pageStore from '@/pages/").append(EntityName).append("/store';\r\n");
//                sb.append("import styles from './index.module.scss';\r\n");
//                sb.append("\r\n");
//                sb.append("function Custom").append(ComponentName).append("(props) {\r\n");
//                sb.append("  const { ").append(underComponentName).append("State, ").append(underComponentName).append("Dispatchers } = props;\r\n");
//                sb.append("  const [custom").append(ComponentName).append("State, custom").append(ComponentName).append("Dispatchers] = pageStore.useModel('custom").append(ComponentName).append("');\r\n");
//                sb.append("  const formItemLayout = {\r\n");
//                sb.append("    labelCol: {\r\n");
//                sb.append("      fixedSpan: 6,\r\n");
//                sb.append("    },\r\n");
//                sb.append("    wrapperCol: {\r\n");
//                sb.append("      span: 40,\r\n");
//                sb.append("    },\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  return (\r\n");
//                sb.append("    <div />\r\n");
//                sb.append("  );\r\n");
//                sb.append("}\r\n");
//                sb.append("\r\n");
//                sb.append("export default Custom").append(ComponentName).append(";\r\n");
//                String viewData = sb.toString();
//                return new String[]{viewData, underComponentName + ".jsx"};
//        }
//
//        private String[] createSubViewJsx(String subEntityName, String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(subEntityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                String underEntityName = BeanUtils.underline2Camel(entityName);
//                String EntityName = BeanUtils.captureName(underEntityName);
//                sb.append("/* eslint-disable no-unused-vars */\r\n");
//                sb.append("import { Button, Dialog } from '@alifd/next';\r\n");
//                sb.append("import React from 'react';\r\n");
//                sb.append("import pageStore from '@/pages/").append(EntityName).append("/store';\r\n");
//                sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
//                sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
//                sb.append("import Custom").append(ComponentName).append(" from '@/pages/").append(EntityName).append("/view/custom/").append(underComponentName).append("';\r\n");
//                sb.append("import styles from './index.module.scss';\r\n");
//                sb.append("\r\n");
//                sb.append("function ").append(ComponentName).append("() {\r\n");
//                sb.append("  const [").append(underComponentName).append("State, ").append(underComponentName).append("Dispatchers] = pageStore.useModel('").append(underComponentName).append("');\r\n");
//                sb.append("  const [custom").append(ComponentName).append("State, custom").append(ComponentName).append("Dispatchers] = pageStore.useModel('custom").append(ComponentName).append("');\r\n");
//                sb.append("\r\n");
//                sb.append("  const ").append(underComponentName).append("PageRender = (value, index, record) => {\r\n");
//                sb.append("    return (\r\n");
//                sb.append("      <div className={styles.opt}>\r\n");
//                sb.append("        <Button type=\"primary\" size=\"small\" onClick={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Edit(record)} > 编辑 </Button>\r\n");
//                sb.append("        <Button type=\"primary\" size=\"small\" onClick={() => deleteConfirm(record)} warning > 删除 </Button>\r\n");
//                sb.append("      </div>\r\n");
//                sb.append("    );\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  const deleteConfirm = (record) => {\r\n");
//                sb.append("    Dialog.confirm({\r\n");
//                sb.append("      title: '删除',\r\n");
//                sb.append("      content: '是否确认删除',\r\n");
//                sb.append("      onOk: () => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Delete({\r\n");
//                sb.append("        record,\r\n");
//                sb.append("        ").append(underComponentName).append("Current: ").append(underComponentName).append("State.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("        ").append(underEntityName).append("Id: ").append(underComponentName).append("State.").append(underEntityName).append("Id,\r\n");
//                sb.append("      }),\r\n");
//                sb.append("    });\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  const ").append(underComponentName).append("OperationRender = (value, index, record) => {\r\n");
//                sb.append("    return (\r\n");
//                sb.append("      <div className={styles.opt} />\r\n");
//                sb.append("    );\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  return (\r\n");
//                sb.append("    <div>\r\n");
//                sb.append("      <Dialog\r\n");
//                sb.append("        visible={").append(underComponentName).append("State.divVisible}\r\n");
//                sb.append("        footer={false}\r\n");
//                sb.append("        onClose={() => ").append(underComponentName).append("Dispatchers.setState({ divVisible: false })}\r\n");
//                sb.append("        style={{ width: '90%' }}\r\n");
//                sb.append("      >\r\n");
//                sb.append("        <div className={styles.Main}>\r\n");
//                sb.append("          <div className={styles.add}>\r\n");
//                sb.append("            <Button type=\"primary\" onClick={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Edit()}> 添加菜单 </Button>\r\n");
//                sb.append("          </div>\r\n");
//                sb.append("          <DataTableTemple\r\n");
//                sb.append("            visibleLoading={").append(underComponentName).append("State.").append(underComponentName).append("LoadingVisible}\r\n");
//                sb.append("            dataSource={").append(underComponentName).append("State.").append(underComponentName).append("TableData}\r\n");
//                sb.append("            items={").append(underComponentName).append("State.").append(underComponentName).append("Table}\r\n");
//                sb.append("            total={").append(underComponentName).append("State.").append(underComponentName).append("Total}\r\n");
//                sb.append("            getPage={(").append(underComponentName).append("Current) => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Page({\r\n");
//                sb.append("              ").append(underComponentName).append("Current,\r\n");
//                sb.append("              ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("              ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("              ").append(underEntityName).append("Id: ").append(underComponentName).append("State.").append(underEntityName).append("Id,\r\n");
//                sb.append("            })}\r\n");
//                sb.append("            operationRender={").append(underComponentName).append("OperationRender}\r\n");
//                sb.append("            pageRender={").append(underComponentName).append("PageRender}\r\n");
//                sb.append("          />\r\n");
//                sb.append("        </div>\r\n");
//                sb.append("      </Dialog>\r\n");
//                sb.append("      <DataFormTemple\r\n");
//                sb.append("        title=\"菜单\"\r\n");
//                sb.append("        visibleDialog={").append(underComponentName).append("State.").append(underComponentName).append("Visible}\r\n");
//                sb.append("        onClose={() => ").append(underComponentName).append("Dispatchers.setState({ ").append(underComponentName).append("Visible: false })}\r\n");
//                sb.append("        items={").append(underComponentName).append("State.").append(underComponentName).append("FormItem}\r\n");
//                sb.append("        dispatchers={(value) => ").append(underComponentName).append("Dispatchers.setDataForm(value)}\r\n");
//                sb.append("        onOk={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Save({\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: ").append(underComponentName).append("State.").append(underComponentName).append("FormData,\r\n");
//                sb.append("          ").append(underComponentName).append("Current: ").append(underComponentName).append("State.").append(underComponentName).append("Current,\r\n");
//                sb.append("          ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("          ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("          ").append(underEntityName).append("Id: ").append(underComponentName).append("State.").append(underEntityName).append("Id,\r\n");
//                sb.append("        })}\r\n");
//                sb.append("        formDataValue={").append(underComponentName).append("State.").append(underComponentName).append("FormData}\r\n");
//                sb.append("      />\r\n");
//                sb.append("      <Custom").append(ComponentName).append("\r\n");
//                sb.append("        ").append(underComponentName).append("State={").append(underComponentName).append("State}\r\n");
//                sb.append("        ").append(underComponentName).append("Dispatchers={").append(underComponentName).append("Dispatchers}\r\n");
//                sb.append("      />\r\n");
//                sb.append("    </div>\r\n");
//                sb.append("  );\r\n");
//                sb.append("}\r\n");
//                sb.append("\r\n");
//                sb.append("export default ").append(ComponentName).append(";\r\n");
//                String viewData = sb.toString();
//                return new String[]{viewData, underComponentName + ".jsx"};
//        }
//
//        private String[] createSubModelsJsx(String subEntityName, String entityName, String form, String table) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(subEntityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                String underEntityName = BeanUtils.underline2Camel(entityName);
//                sb.append("import ").append(underComponentName).append("Service from '../services/").append(underComponentName).append("';\r\n");
//                sb.append("import initService from '@/services/init';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("\r\n");
//                sb.append("  namespace: '").append(underComponentName).append("',\r\n");
//                sb.append("\r\n");
//                sb.append("  state: {\r\n");
//                sb.append("    ").append(underComponentName).append("TableData: [],\r\n");
//                sb.append("    ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("    ").append(underComponentName).append("FormData: {},\r\n");
//                sb.append("    ").append(underComponentName).append("LoadingVisible: true,\r\n");
//                sb.append("    ").append(underComponentName).append("Total: 0,\r\n");
//                sb.append("    ").append(underComponentName).append("Current: 1,\r\n");
//                sb.append("    ").append(underComponentName).append("FormItem: [],\r\n");
//                sb.append("    ").append(form).append(": [],\r\n");
//                sb.append("    ").append(table).append(": [],\r\n");
//                sb.append("    divVisible: false,\r\n");
//                sb.append("    ").append(underEntityName).append("Id: '',\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  reducers: {\r\n");
//                sb.append("    setState(prevState, payload) {\r\n");
//                sb.append("      return { ...prevState, ...payload };\r\n");
//                sb.append("    },\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  effects: (dispatch) => ({\r\n");
//                sb.append("    async ").append(underComponentName).append("Page(data) {\r\n");
//                sb.append("      const dataRes = await ").append(underComponentName).append("Service.").append(underComponentName).append("Page(data.").append(underEntityName).append("Id, data.").append(underComponentName).append("Current);\r\n");
//                sb.append("      const transformData = await initService.transformData(dataRes.data.content, data.").append(underComponentName).append("Table, data.").append(underComponentName).append("Form);\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Total: dataRes.data.totalElements,\r\n");
//                sb.append("        ").append(underComponentName).append("FormItem: transformData.data.objectForm,\r\n");
//                sb.append("        ").append(underComponentName).append("TableData: transformData.data.objectList,\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("LoadingVisible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Edit(data) {\r\n");
//                sb.append("      if (data) {\r\n");
//                sb.append("        const ").append(underComponentName).append(" = await ").append(underComponentName).append("Service.find").append(ComponentName).append("ById(data.id);\r\n");
//                sb.append("        const fromData = {\r\n");
//                sb.append("          ...").append(underComponentName).append(".data,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: fromData,\r\n");
//                sb.append("          ").append(underComponentName).append("Visible: true,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: {},\r\n");
//                sb.append("          ").append(underComponentName).append("Visible: true,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Delete(data) {\r\n");
//                sb.append("      await ").append(underComponentName).append("Service.").append(underComponentName).append("Delete(data.record);\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: data.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: data.").append(underComponentName).append("Form,\r\n");
//                sb.append("        ").append(underEntityName).append("Id: data.").append(underEntityName).append("Id,\r\n");
//                sb.append("      });\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Save(data) {\r\n");
//                sb.append("      await ").append(underComponentName).append("Service.").append(underComponentName).append("Save(data.").append(underEntityName).append("Id, data.").append(underComponentName).append("FormData);\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: data.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: data.").append(underComponentName).append("Form,\r\n");
//                sb.append("        ").append(underEntityName).append("Id: data.").append(underEntityName).append("Id,\r\n");
//                sb.append("      });\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    setDataForm(data) {\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("FormData: data,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async onRowClick(data) {\r\n");
//                sb.append("      const dataFormRes = await initService.findDataFormByName('").append(form).append("');\r\n");
//                sb.append("      const dataTableRes = await initService.findDataTableByName('").append(table).append("');\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        divVisible: data.selected,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: dataTableRes.data,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: dataFormRes.data,\r\n");
//                sb.append("        ").append(underEntityName).append("Id: data.record.id,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: 1,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: dataTableRes.data,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: dataFormRes.data,\r\n");
//                sb.append("        ").append(underEntityName).append("Id: data.record.id,\r\n");
//                sb.append("      });\r\n");
//                sb.append("    },\r\n");
//                sb.append("  }),\r\n");
//                sb.append("};\r\n");
//                String modelData = sb.toString();
//                return new String[]{modelData, underComponentName + ".jsx"};
//        }
//
//        private String[] createCustomViewJsx(String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("/* eslint-disable no-unused-vars */\r\n");
//                sb.append("import React, { useEffect } from 'react';\r\n");
//                sb.append("import pageStore from '@/pages/").append(ComponentName).append("/store';\r\n");
//                sb.append("import styles from './index.module.scss';\r\n");
//                sb.append("\r\n");
//                sb.append("function Custom").append(ComponentName).append("(props) {\r\n");
//                sb.append("  const { ").append(underComponentName).append("State, ").append(underComponentName).append("Dispatchers } = props;\r\n");
//                sb.append("  const [custom").append(ComponentName).append("State, custom").append(ComponentName).append("Dispatchers] = pageStore.useModel('custom").append(ComponentName).append("');\r\n");
//                sb.append("  const formItemLayout = {\r\n");
//                sb.append("    labelCol: {\r\n");
//                sb.append("      fixedSpan: 6,\r\n");
//                sb.append("    },\r\n");
//                sb.append("    wrapperCol: {\r\n");
//                sb.append("      span: 40,\r\n");
//                sb.append("    },\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  return (\r\n");
//                sb.append("    <div />\r\n");
//                sb.append("  );\r\n");
//                sb.append("}\r\n");
//                sb.append("\r\n");
//                sb.append("export default Custom").append(ComponentName).append(";\r\n");
//                String viewData = sb.toString();
//                return new String[]{viewData, underComponentName + ".jsx"};
//        }
//
//        private String[] createModelsJsx(String entityName, String form, String table) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("import ").append(underComponentName).append("Service from '../services/").append(underComponentName).append("';\r\n");
//                sb.append("import initService from '@/services/init';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("\r\n");
//                sb.append("  namespace: '").append(underComponentName).append("',\r\n");
//                sb.append("\r\n");
//                sb.append("  state: {\r\n");
//                sb.append("    ").append(underComponentName).append("TableData: [],\r\n");
//                sb.append("    ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("    ").append(underComponentName).append("FormData: {},\r\n");
//                sb.append("    ").append(underComponentName).append("LoadingVisible: true,\r\n");
//                sb.append("    ").append(underComponentName).append("Total: 0,\r\n");
//                sb.append("    ").append(underComponentName).append("Current: 1,\r\n");
//                sb.append("    ").append(underComponentName).append("FormItem: [],\r\n");
//                sb.append("    ").append(form).append(": [],\r\n");
//                sb.append("    ").append(table).append(": [],\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  reducers: {\r\n");
//                sb.append("    setState(prevState, payload) {\r\n");
//                sb.append("      return { ...prevState, ...payload };\r\n");
//                sb.append("    },\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  effects: (dispatch) => ({\r\n");
//                sb.append("    async ").append(underComponentName).append("Page(data) {\r\n");
//                sb.append("      const dataRes = await ").append(underComponentName).append("Service.").append(underComponentName).append("Page(data.").append(underComponentName).append("Current);\r\n");
//                sb.append("      const transformData = await initService.transformData(dataRes.data.content, data.").append(underComponentName).append("Table, data.").append(underComponentName).append("Form);\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Total: dataRes.data.totalElements,\r\n");
//                sb.append("        ").append(underComponentName).append("FormItem: transformData.data.objectForm,\r\n");
//                sb.append("        ").append(underComponentName).append("TableData: transformData.data.objectList,\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("LoadingVisible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Edit(data) {\r\n");
//                sb.append("      if (data) {\r\n");
//                sb.append("        const ").append(underComponentName).append(" = await ").append(underComponentName).append("Service.find").append(ComponentName).append("ById(data.id);\r\n");
//                sb.append("        const fromData = {\r\n");
//                sb.append("          ...").append(underComponentName).append(".data,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: fromData,\r\n");
//                sb.append("          ").append(underComponentName).append("Visible: true,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("      } else {\r\n");
//                sb.append("        const payload = {\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: {},\r\n");
//                sb.append("          ").append(underComponentName).append("Visible: true,\r\n");
//                sb.append("        };\r\n");
//                sb.append("        dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("      }\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Delete(data) {\r\n");
//                sb.append("      await ").append(underComponentName).append("Service.").append(underComponentName).append("Delete(data.record);\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: data.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: data.").append(underComponentName).append("Form,\r\n");
//                sb.append("      });\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async ").append(underComponentName).append("Save(data) {\r\n");
//                sb.append("      await ").append(underComponentName).append("Service.").append(underComponentName).append("Save(data.").append(underComponentName).append("FormData);\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: data.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: data.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: data.").append(underComponentName).append("Form,\r\n");
//                sb.append("      });\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Visible: false,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    setDataForm(data) {\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("FormData: data,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("    async findDataTableAndFormByName() {\r\n");
//                sb.append("      const dataTableRes = await initService.findDataTableByName('").append(underComponentName).append("Table');\r\n");
//                sb.append("      const dataFormRes = await initService.findDataFormByName('").append(underComponentName).append("Form');\r\n");
//                sb.append("      this.").append(underComponentName).append("Page({\r\n");
//                sb.append("        ").append(underComponentName).append("Current: 1,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: dataTableRes.data,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: dataFormRes.data,\r\n");
//                sb.append("      });\r\n");
//                sb.append("      const payload = {\r\n");
//                sb.append("        ").append(underComponentName).append("Table: dataTableRes.data,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: dataFormRes.data,\r\n");
//                sb.append("      };\r\n");
//                sb.append("      dispatch.").append(underComponentName).append(".setState(payload);\r\n");
//                sb.append("    },\r\n");
//                sb.append("  }),\r\n");
//                sb.append("};\r\n");
//                String modelData = sb.toString();
//                return new String[]{modelData, underComponentName + ".jsx"};
//        }
//
//        private String[] createServiceJsx(String entityName, String appApi) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("import { request } from 'ice';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("  ").append(underComponentName).append("Page(value) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Page',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        pageNumber: value,\r\n");
//                sb.append("        pageSize: 8,\r\n");
//                sb.append("        sortCode: 'sortCode',\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  ").append(underComponentName).append("Save(data) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Save',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      data,\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  ").append(underComponentName).append("Delete(record) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Delete',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id: record.id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  find").append(ComponentName).append("ById(id) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/find").append(ComponentName).append("ById',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("};\r\n");
//                String serviceData = sb.toString();
//                return new String[]{serviceData, underComponentName + ".jsx"};
//        }
//
//        private String[] createSubServiceJsx(String subEntityName, String appApi, String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(subEntityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                String underEntityName = BeanUtils.underline2Camel(entityName);
//                sb.append("import { request } from 'ice';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("  ").append(underComponentName).append("Page(id, value) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Page',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id,\r\n");
//                sb.append("        pageNumber: value,\r\n");
//                sb.append("        pageSize: 8,\r\n");
//                sb.append("        sortCode: 'sortCode',\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  ").append(underComponentName).append("Save(").append(underEntityName).append("Id, ").append(underComponentName).append("FormData) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Save',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      data: { ...").append(underComponentName).append("FormData, pid: ").append(underEntityName).append("Id },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  ").append(underComponentName).append("Delete(record) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/").append(underComponentName).append("Delete',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id: record.id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("  find").append(ComponentName).append("ById(id) {\r\n");
//                sb.append("    return request({\r\n");
//                sb.append("      url: '/").append(appApi).append("/find").append(ComponentName).append("ById',\r\n");
//                sb.append("      method: 'post',\r\n");
//                sb.append("      params: {\r\n");
//                sb.append("        id,\r\n");
//                sb.append("      },\r\n");
//                sb.append("    });\r\n");
//                sb.append("  },\r\n");
//                sb.append("};\r\n");
//                String serviceData = sb.toString();
//                return new String[]{serviceData, underComponentName + ".jsx"};
//        }
//
//        private String[] createCustomServiceJsx(String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                sb.append("import { request } from 'ice';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("\r\n");
//                sb.append("};\r\n");
//                String customData = sb.toString();
//                return new String[]{customData, underComponentName + ".jsx"};
//        }
//
//        private String[] createCustomModelsJsx(String entityName) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("import custom").append(ComponentName).append("Services from '../../services/custom/").append(underComponentName).append("';\r\n");
//                sb.append("import initService from '@/services/init';\r\n");
//                sb.append("\r\n");
//                sb.append("export default {\r\n");
//                sb.append("\r\n");
//                sb.append("  namespace: 'custom").append(ComponentName).append("',\r\n");
//                sb.append("\r\n");
//                sb.append("  state: {\r\n");
//                sb.append("\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  reducers: {\r\n");
//                sb.append("    setState(prevState, payload) {\r\n");
//                sb.append("      return { ...prevState, ...payload };\r\n");
//                sb.append("    },\r\n");
//                sb.append("  },\r\n");
//                sb.append("\r\n");
//                sb.append("  effects: (dispatch) => ({\r\n");
//                sb.append("    findCatalogByValue(data) {\r\n");
//                sb.append("      initService.findCatalogByValue(data).then((res) => {\r\n");
//                sb.append("        const formArr = [];\r\n");
//                sb.append("        res.forEach((item) => {\r\n");
//                sb.append("          formArr.push({\r\n");
//                sb.append("            label: item.dictionaryName,\r\n");
//                sb.append("            value: item.dictionaryValue,\r\n");
//                sb.append("          });\r\n");
//                sb.append("        });\r\n");
//                sb.append("        const payload = JSON.parse(JSON.stringify({\r\n");
//                sb.append("          data: formArr,\r\n");
//                sb.append("        }).replace(/data/g, data));\r\n");
//                sb.append("        dispatch.custom").append(ComponentName).append(".setState(payload);\r\n");
//                sb.append("      });\r\n");
//                sb.append("    },\r\n");
//                sb.append("  }),\r\n");
//                sb.append("};\r\n");
//                String customData = sb.toString();
//                return new String[]{customData, underComponentName + ".jsx"};
//        }
//
//        private String[] createViewJsx(String entityName, String[] relEntities) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(entityName);
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("/* eslint-disable no-unused-vars */\r\n");
//                sb.append("import { ResponsiveGrid, Button, Dialog } from '@alifd/next';\r\n");
//                sb.append("import React, { useEffect } from 'react';\r\n");
//                sb.append("import pageStore from '@/pages/").append(ComponentName).append("/store';\r\n");
//                sb.append("import DataFormTemple from '@/components/dataForm';\r\n");
//                sb.append("import DataTableTemple from '@/components/dataTable';\r\n");
//                sb.append("import Custom").append(ComponentName).append(" from '@/pages/").append(ComponentName).append("/view/custom/").append(underComponentName).append("';\r\n");
//                sb.append("import styles from './index.module.scss';\r\n");
//                sb.append("\r\n");
//                sb.append("const { Cell } = ResponsiveGrid;\r\n");
//                sb.append("\r\n");
//                sb.append("function ").append(ComponentName).append("() {\r\n");
//                sb.append("  const [").append(underComponentName).append("State, ").append(underComponentName).append("Dispatchers] = pageStore.useModel('").append(underComponentName).append("');\r\n");
//                sb.append("  const [custom").append(ComponentName).append("State, custom").append(ComponentName).append("Dispatchers] = pageStore.useModel('custom").append(ComponentName).append("');\r\n");
//                if (relEntities != null) {
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                String RelEntity = BeanUtils.captureName(underRelEntity);
//                                sb.append("  const [").append(underRelEntity).append("State, ").append(underRelEntity).append("Dispatchers] = pageStore.useModel('").append(underRelEntity).append("');\r\n");
//                                sb.append("  const [custom").append(RelEntity).append("State, custom").append(RelEntity).append("Dispatchers] = pageStore.useModel('custom").append(RelEntity).append("');\r\n");
//                        }
//                }
//                sb.append("\r\n");
//                sb.append("  useEffect(() => {\r\n");
//                sb.append("    ").append(underComponentName).append("Dispatchers.findDataTableAndFormByName();\r\n");
//                sb.append("  }, [").append(underComponentName).append("Dispatchers]);\r\n");
//                sb.append("\r\n");
//                sb.append("  const ").append(underComponentName).append("PageRender = (value, index, record) => {\r\n");
//                sb.append("    return (\r\n");
//                sb.append("      <div className={styles.opt}>\r\n");
//                sb.append("        <Button type=\"primary\" size=\"small\" onClick={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Edit(record)} > 编辑 </Button>\r\n");
//                sb.append("        <Button type=\"primary\" size=\"small\" onClick={() => deleteConfirm(record)} warning > 删除 </Button>\r\n");
//                sb.append("      </div>\r\n");
//                sb.append("    );\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  const deleteConfirm = (record) => {\r\n");
//                sb.append("    Dialog.confirm({\r\n");
//                sb.append("      title: '删除',\r\n");
//                sb.append("      content: '是否确认删除',\r\n");
//                sb.append("      onOk: () => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Delete({\r\n");
//                sb.append("        record,\r\n");
//                sb.append("        ").append(underComponentName).append("Current: ").append(underComponentName).append("State.").append(underComponentName).append("Current,\r\n");
//                sb.append("        ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("        ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("      }),\r\n");
//                sb.append("    });\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  const ").append(underComponentName).append("OperationRender = (value, index, record) => {\r\n");
//                sb.append("    return (\r\n");
//                sb.append("      <div className={styles.opt} />\r\n");
//                sb.append("    );\r\n");
//                sb.append("  };\r\n");
//                sb.append("\r\n");
//                sb.append("  return (\r\n");
//                sb.append("    <ResponsiveGrid gap={20}>\r\n");
//                sb.append("      <Cell colSpan={12}>\r\n");
//                sb.append("        <div className={styles.Main}>\r\n");
//                sb.append("          <div className={styles.add}>\r\n");
//                sb.append("            <Button type=\"primary\" onClick={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Edit()}> 添加菜单 </Button>\r\n");
//                sb.append("          </div>\r\n");
//                sb.append("          <DataTableTemple\r\n");
//                sb.append("            visibleLoading={").append(underComponentName).append("State.").append(underComponentName).append("LoadingVisible}\r\n");
//                sb.append("            dataSource={").append(underComponentName).append("State.").append(underComponentName).append("TableData}\r\n");
//                sb.append("            items={").append(underComponentName).append("State.").append(underComponentName).append("Table}\r\n");
//                sb.append("            total={").append(underComponentName).append("State.").append(underComponentName).append("Total}\r\n");
//                sb.append("            getPage={(").append(underComponentName).append("Current) => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Page({\r\n");
//                sb.append("              ").append(underComponentName).append("Current,\r\n");
//                sb.append("              ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("              ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("            })}\r\n");
//                if (relEntities != null) {
//                        sb.append("            rowSelection={{\r\n");
//                        sb.append("              mode: 'single',\r\n");
//                        sb.append("              onSelect: (selected, record) => {\r\n");
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                sb.append("                ").append(underRelEntity).append("Dispatchers.onRowClick({ selected, record });\r\n");
//                        }
//                        sb.append("              },\r\n");
//                        sb.append("            }}\r\n");
//                }
//                sb.append("            operationRender={").append(underComponentName).append("OperationRender}\r\n");
//                sb.append("            pageRender={").append(underComponentName).append("PageRender}\r\n");
//                sb.append("          />\r\n");
//                sb.append("        </div>\r\n");
//                sb.append("      </Cell>\r\n");
//                sb.append("      <DataFormTemple\r\n");
//                sb.append("        title=\"菜单\"\r\n");
//                sb.append("        visibleDialog={").append(underComponentName).append("State.").append(underComponentName).append("Visible}\r\n");
//                sb.append("        onClose={() => ").append(underComponentName).append("Dispatchers.setState({ ").append(underComponentName).append("Visible: false })}\r\n");
//                sb.append("        items={").append(underComponentName).append("State.").append(underComponentName).append("FormItem}\r\n");
//                sb.append("        dispatchers={(value) => ").append(underComponentName).append("Dispatchers.setDataForm(value)}\r\n");
//                sb.append("        onOk={() => ").append(underComponentName).append("Dispatchers.").append(underComponentName).append("Save({\r\n");
//                sb.append("          ").append(underComponentName).append("FormData: ").append(underComponentName).append("State.").append(underComponentName).append("FormData,\r\n");
//                sb.append("          ").append(underComponentName).append("Current: ").append(underComponentName).append("State.").append(underComponentName).append("Current,\r\n");
//                sb.append("          ").append(underComponentName).append("Table: ").append(underComponentName).append("State.").append(underComponentName).append("Table,\r\n");
//                sb.append("          ").append(underComponentName).append("Form: ").append(underComponentName).append("State.").append(underComponentName).append("Form,\r\n");
//                sb.append("        })}\r\n");
//                sb.append("        formDataValue={").append(underComponentName).append("State.").append(underComponentName).append("FormData}\r\n");
//                sb.append("      />\r\n");
//                sb.append("      <Custom").append(ComponentName).append("\r\n");
//                sb.append("        ").append(underComponentName).append("State={").append(underComponentName).append("State}\r\n");
//                sb.append("        ").append(underComponentName).append("Dispatchers={").append(underComponentName).append("Dispatchers}\r\n");
//                sb.append("      />\r\n");
//                sb.append("    </ResponsiveGrid>\r\n");
//                sb.append("  );\r\n");
//                sb.append("}\r\n");
//                sb.append("\r\n");
//                sb.append("export default ").append(ComponentName).append(";\r\n");
//                String viewData = sb.toString();
//                return new String[]{viewData, underComponentName + ".jsx"};
//        }
//
//        private String[] createIndexJsx(EntityNamePO po, String[] relEntities) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(po.getName());
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("import React from 'react';\r\n");
//                sb.append("import ").append(ComponentName).append(" from '@/pages/").append(ComponentName).append("/view/").append(underComponentName).append("';\r\n");
//                if (relEntities != null) {
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                String RelEntity = BeanUtils.captureName(underRelEntity);
//                                sb.append("import ").append(RelEntity).append(" from '@/pages/").append(ComponentName).append("/view/").append(underRelEntity).append("';\r\n");
//                        }
//                }
//                sb.append("\r\n");
//                sb.append("function ").append(ComponentName).append("Page() {\r\n");
//                sb.append("  return (\r\n");
//                sb.append("    <div>\r\n");
//                sb.append("      <").append(ComponentName).append(" />\r\n");
//                if (relEntities != null) {
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                String RelEntity = BeanUtils.captureName(underRelEntity);
//                                sb.append("      <").append(RelEntity).append(" />\r\n");
//                        }
//                }
//                sb.append("    </div>\r\n");
//                sb.append("  );\r\n");
//                sb.append("}\r\n");
//                sb.append("\r\n");
//                sb.append("export default ").append(ComponentName).append("Page;\r\n");
//                String indexData = sb.toString();
//                return new String[]{indexData, "index.jsx"};
//        }
//
//        private String[] createIndexStore(EntityNamePO po, String[] relEntities) {
//                StringBuilder sb = new StringBuilder();
//                String underComponentName = BeanUtils.underline2Camel(po.getName());
//                String ComponentName = BeanUtils.captureName(underComponentName);
//                sb.append("import { createStore } from 'ice';\r\n");
//                sb.append("import ").append(underComponentName).append(" from './models/").append(underComponentName).append("';\r\n");
//                sb.append("import custom").append(ComponentName).append(" from './models/custom/").append(underComponentName).append("';\r\n");
//                if (relEntities != null) {
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                String RelEntity = BeanUtils.captureName(underRelEntity);
//                                sb.append("import ").append(underRelEntity).append(" from './models/").append(underRelEntity).append("';\r\n");
//                                sb.append("import custom").append(RelEntity).append(" from './models/custom/").append(underRelEntity).append("';\r\n");
//                        }
//                }
//                sb.append("\r\n");
//                sb.append("const store = createStore({\r\n");
//                sb.append("  ").append(underComponentName).append(",\r\n");
//                sb.append("  custom").append(ComponentName).append(",\r\n");
//                if (relEntities != null) {
//                        for (String relEntity : relEntities) {
//                                EntityNamePO relPo = entityNameCustomService.findOneById(relEntity);
//                                String underRelEntity = BeanUtils.underline2Camel(relPo.getName());
//                                String RelEntity = BeanUtils.captureName(underRelEntity);
//                                sb.append("  ").append(underRelEntity).append(",\r\n");
//                                sb.append("  custom").append(RelEntity).append(",\r\n");
//                        }
//                }
//                sb.append("});\r\n");
//                sb.append("\r\n");
//                sb.append("export default store;\r\n");
//                String storeData = sb.toString();
//                return new String[]{storeData, "store.js"};
//        }
//
//        private String[] createIndexCss() {
//                String css = "@import \"~@alifd/next/variables.scss\";\r\n" +
//                        "\r\n" +
//                        ".icon {\r\n" +
//                        "  color: #999\r\n" +
//                        "}\r\n" +
//                        "\r\n" +
//                        ".searchIcon {\r\n" +
//                        "  margin-right: 5px;\r\n" +
//                        "  color: #999;\r\n" +
//                        "}\r\n" +
//                        "\r\n" +
//                        ".Operation {\r\n" +
//                        "  padding: 10px 10px 5px;\r\n" +
//                        "  border-bottom: 1px dashed #eee;\r\n" +
//                        "\r\n" +
//                        "  .btns {\r\n" +
//                        "    margin-top: 14px;\r\n" +
//                        "    button {\r\n" +
//                        "      margin-left: 10px;\r\n" +
//                        "    }\r\n" +
//                        "  }\r\n" +
//                        "}\r\n" +
//                        "\r\n" +
//                        ".Main {\r\n" +
//                        "  padding: 15px 10px;\r\n" +
//                        "  .add {\r\n" +
//                        "    padding-bottom: 15px;\r\n" +
//                        "    button {\r\n" +
//                        "      margin-right: 10px;\r\n" +
//                        "    }\r\n" +
//                        "  }\r\n" +
//                        "\r\n" +
//                        "  .opt {\r\n" +
//                        "    button {\r\n" +
//                        "      margin-right: 5px;\r\n" +
//                        "    }\r\n" +
//                        "  }\r\n" +
//                        "\r\n" +
//                        "  .total {\r\n" +
//                        "    color: #4A5B6D;\r\n" +
//                        "    font-size: 12px;\r\n" +
//                        "    span {\r\n" +
//                        "      padding:0 3px;\r\n" +
//                        "      color: #5584FF;\r\n" +
//                        "    }\r\n" +
//                        "  }\r\n" +
//                        "}";
//                return new String[]{css, "index.module.scss"};
//        }
//
//        public void generateAuthor(StringBuilder sb) {
//                LocalDate localDate = LocalDate.now();
//                sb.append("/**\r\n");
//                sb.append(" * @author 曹元杰\r\n");
//                sb.append(" * @version 1.0\r\n");
//                sb.append(" * @date ").append(localDate).append("\r\n");
//                sb.append(" */\r\n");
//        }
//
//        public void generateClass(EntityNamePO po, StringBuilder sb, String fileName) {
//                sb.append("@Entity\r\n");
//                sb.append("@Table(name = ").append(fileName).append("PO.T_").append(po.getName().toUpperCase()).append(")\r\n");
//                sb.append("@Getter\r\n");
//                sb.append("@Setter\r\n");
//                sb.append("@ToString\r\n");
//                sb.append("@RequiredArgsConstructor\r\n");
//                sb.append("@GenericGenerator(name = \"uuid2\", strategy = \"org.hibernate.id.UUIDGenerator\")\r\n");
//                sb.append("public class ").append(fileName).append("PO implements Serializable {\r\n");
//                sb.append("\r\n");
//                sb.append("        static final String T_").append(po.getName().toUpperCase()).append(" = \"t_").append(po.getName()).append("\";\r\n");
//                sb.append("\r\n");
//        }
//
//        public void generatePackage(List<EntityPO> poList, String appPath, StringBuilder sb) {
//                //pojo路径
//                String[] poPathArr = appPath.split("java");
//                String poPath = poPathArr[1].substring(1).replaceAll("\\\\", ".") + ".entity";
//                sb.append("package ").append(poPath).append(".po;\r\n");
//                sb.append("\r\n");
//                sb.append("import lombok.Getter;\r\n");
//                sb.append("import lombok.RequiredArgsConstructor;\r\n");
//                sb.append("import lombok.Setter;\r\n");
//                sb.append("import lombok.ToString;\r\n");
//                sb.append("import org.hibernate.Hibernate;\r\n");
//                sb.append("import org.hibernate.annotations.GenericGenerator;\r\n");
//                sb.append("\r\n");
//                sb.append("import javax.persistence.Column;\r\n");
//                sb.append("import javax.persistence.Entity;\r\n");
//                sb.append("import javax.persistence.GeneratedValue;\r\n");
//                sb.append("import javax.persistence.Id;\r\n");
//                sb.append("import javax.persistence.Table;\r\n");
//                sb.append("import java.io.Serializable;\r\n");
//                if (BeanUtils.ifDate(poList)) {
//                        sb.append("import java.sql.Date;\r\n");
//                }
//                if (BeanUtils.ifTimestamp(poList)) {
//                        sb.append("import java.sql.Timestamp;\r\n");
//                }
//                sb.append("import java.util.Objects;\r\n");
//                sb.append("\r\n");
//                generateAuthor(sb);
//        }
//
//        public void generateOverride(StringBuilder sb, String fileName) {
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public boolean equals(Object o) {\r\n");
//                sb.append("                if (this == o) return true;\r\n");
//                sb.append("                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;\r\n");
//                sb.append("                ").append(fileName).append("PO that = (").append(fileName).append("PO) o;\r\n");
//                sb.append("                return Objects.equals(id, that.id);\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("        @Override\r\n");
//                sb.append("        public int hashCode() {\r\n");
//                sb.append("                return 0;\r\n");
//                sb.append("        }\r\n");
//                sb.append("\r\n");
//                sb.append("}");
//        }
//
//        public void generateEntity(List<EntityPO> poList, StringBuilder sb) {
//                for (EntityPO entityPO : poList) {
//                        String idValue = "id";
//                        if (entityPO.getEntityName().equals(idValue)) {
//                                sb.append("        @Id\r\n");
//                                sb.append("        @GeneratedValue(generator = \"uuid2\")\r\n");
//                                sb.append("        @Column(name = \"").append(entityPO.getEntityName()).append("\", length = 36)\r\n");
//                        } else {
//                                sb.append("        @Column(name = \"").append(entityPO.getEntityName()).append("\")\r\n");
//                        }
//                        sb.append("        private ").append(entityPO.getEntityProperty()).append(" ").append(BeanUtils.underline2Camel(entityPO.getEntityName())).append(";\r\n");
//                }
//        }

}
