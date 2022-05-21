package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.service.custom.AuthorityCustomService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.QAuthorityPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.BeanUtils;
import com.example.cyjquery.service.custom.SqlCustomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityCustomServiceImpl extends BaseService implements AuthorityCustomService {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityCustomServiceImpl.class);

    private final static String ENTITY_FORM_DATESOURSE = "ENTITY_FORM_DATESOURSE";
    private final static String SELECT_SERVICE_BY_NAME = "SELECT_SERVICE_BY_NAME";
    private final static String SELECT_ENTITY_BY_NAME = "SELECT_ENTITY_BY_NAME";
    private final static String POST = "POST";
    private final static String VERSION = "1.0";
    private final static String STATUS = "有效";
    private final static String SORTCODE = "10";

    private AuthorityDao authorityDao;
    private SqlCustomService sqlCustomService;

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Autowired
    public void setSqlCustomService(SqlCustomService sqlCustomService) {
        this.sqlCustomService = sqlCustomService;
    }

    @Override
    public List<AuthorityPO> findRoleAndAuthority() {
        return queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.status.eq("有效"))
                .fetch();
    }

    @Override
    public void createAuthority() {
        List<Map<String, Object>> entitySqlList = sqlCustomService
                .queryBySqlValue(ENTITY_FORM_DATESOURSE);
        for (Map<String, Object> entityMap : entitySqlList) {
            //驼峰名
            String underPoName = BeanUtils.underline2Camel(entityMap.get("value").toString());
            //文件名
            String poName = BeanUtils.captureName(underPoName);
            HashMap<String, String> entityCodeMap = new HashMap<>();
            entityCodeMap.put("entityCode", entityMap.get("value").toString());
            //根据名称获取entity
            Map<String, Object> entitySqlData = sqlCustomService
                    .queryBySqlOne(SELECT_ENTITY_BY_NAME, entityCodeMap);
            HashMap<String, String> nameMap = new HashMap<>();
            nameMap.put("name", entitySqlData.get("app_name").toString());
            //根据名称获取app
            Map<String, Object> appService = sqlCustomService
                    .queryBySqlOne(SELECT_SERVICE_BY_NAME, nameMap);
            AuthorityPO page = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Page", "查询所有" + poName);
            if (page == null) {
                page = new AuthorityPO();
                page.setMethod(POST);
                page.setName("查询所有" + poName);
                page.setPath(appService.get("app_api").toString() + "/" + underPoName + "Page");
                page.setAppName(appService.get("name").toString());
                page.setVersion(VERSION);
                page.setStatus(STATUS);
                page.setSortCode(SORTCODE);
                authorityDao.save(page);
                logger.info("生成分页权限:" + page.getName());
            }
            AuthorityPO save = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Save", "保存" + poName);
            if (save == null) {
                save = new AuthorityPO();
                save.setMethod(POST);
                save.setName("保存" + poName);
                save.setPath(appService.get("app_api").toString() + "/" + underPoName + "Save");
                save.setAppName(appService.get("name").toString());
                save.setVersion(VERSION);
                save.setStatus(STATUS);
                save.setSortCode(SORTCODE);
                authorityDao.save(save);
                logger.info("生成保存权限:" + save.getName());
            }
            AuthorityPO delete = findByPathAndName(appService.get("app_api").toString() + "/" + underPoName + "Delete", "删除" + poName);
            if (delete == null) {
                delete = new AuthorityPO();
                delete.setMethod(POST);
                delete.setName("删除" + poName);
                delete.setPath(appService.get("app_api").toString() + "/" + underPoName + "Delete");
                delete.setAppName(appService.get("name").toString());
                delete.setVersion(VERSION);
                delete.setStatus(STATUS);
                delete.setSortCode(SORTCODE);
                authorityDao.save(delete);
                logger.info("生成删除权限:" + delete.getName());
            }
            AuthorityPO find = findByPathAndName(appService.get("app_api").toString() + "/find" + poName + "ById", "根据ID查询" + poName);
            if (find == null) {
                find = new AuthorityPO();
                find.setMethod(POST);
                find.setName("根据ID查询" + poName);
                find.setPath(appService.get("app_api").toString() + "/find" + poName + "ById");
                find.setAppName(appService.get("name").toString());
                find.setVersion(VERSION);
                find.setStatus(STATUS);
                find.setSortCode(SORTCODE);
                authorityDao.save(find);
                logger.info("生成ID查询权限:" + find.getName());
            }
        }
    }

    @Override
    public AuthorityPO findByPathAndName(String path, String name) {
        return queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.path.eq(path).and(QAuthorityPO.authorityPO.name.eq(name)))
                .fetchOne();
    }

}
