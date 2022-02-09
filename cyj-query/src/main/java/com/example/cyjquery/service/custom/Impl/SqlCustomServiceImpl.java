package com.example.cyjquery.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjquery.dao.custom.SqlCustomDao;
import com.example.cyjquery.entity.auto.po.SqlPO;
import com.example.cyjquery.service.custom.SqlCustomService;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlCustomServiceImpl extends BaseService implements SqlCustomService {

    @PersistenceContext
    EntityManager em;
    private SqlCustomDao sqlCustomDao;

    @Autowired
    public void setSqlCustomDao(SqlCustomDao sqlCustomDao) {
        this.sqlCustomDao = sqlCustomDao;
    }

    @Override
    public List<Map<String, Object>> queryBySql(String sql) {
        Query query = em.createNativeQuery(sql);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> list = query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        return list;
    }

    @Override
    public List<Map<String, Object>> queryBySqlValue(String value) {
        SqlPO sqlPO = sqlCustomDao.findBySqlDescription(value);
        if (sqlPO != null){
            return queryBySql(sqlPO.getSqlStr());
        }
        return null;
    }

    @Override
    public void excuteSql(String sql) {
        Query query = em.createNativeQuery(sql);
        query.executeUpdate();
    }

    @Override
    public List<Map<String, Object>> findAllSql(String tableName) {
        String sql = "select * from " + tableName + " where 1=1";
        return queryBySql(sql);
    }

    @Override
    public Object findSqlById(String tableName, String id) {
        String sql = String.format("select * from %s where id = ?", tableName);
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).getSingleResult();
    }

}
