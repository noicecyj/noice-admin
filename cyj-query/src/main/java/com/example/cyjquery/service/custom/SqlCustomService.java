package com.example.cyjquery.service.custom;

import com.example.cyjcommon.entity.QSql;
import com.example.cyjcommon.entity.Sql;
import com.example.cyjcommon.service.BaseService;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlCustomService extends BaseService {

    @PersistenceContext
    EntityManager em;

    public List<Map<String, Object>> queryBySql(String sql) {
        Query query = em.createNativeQuery(sql);
        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    public List<Map<String, Object>> queryBySql(String sql, HashMap<String, String> str) {
        Query query = em.createNativeQuery(sql);
        for (String value : str.keySet()) {
            query.setParameter(value, str.get(value));
        }
        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    public Map<String, Object> queryByOne(String sql, HashMap<String, String> str) {
        List<Map<String, Object>> resultList = queryBySql(sql, str);
        if (resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    public List<Map<String, Object>> queryBySqlValue(String value) {
        Sql sql = queryFactory.selectFrom(QSql.sql).where(QSql.sql.sqlDescription.eq(value)).fetchOne();
        if (sql != null) {
            return queryBySql(sql.getSqlStr());
        }
        return null;
    }

    public List<Map<String, Object>> queryBySqlValue(String value, HashMap<String, String> str) {
        Sql sql = queryFactory.selectFrom(QSql.sql).where(QSql.sql.sqlDescription.eq(value)).fetchOne();
        if (sql != null) {
            return queryBySql(sql.getSqlStr(), str);
        }
        return null;
    }

    public Map<String, Object> queryBySqlOne(String value, HashMap<String, String> str) {
        Sql sql = queryFactory.selectFrom(QSql.sql).where(QSql.sql.sqlDescription.eq(value)).fetchOne();
        if (sql != null) {
            return queryByOne(sql.getSqlStr(), str);
        }
        return null;
    }

    public void excuteSql(String sql) {
        Query query = em.createNativeQuery(sql);
        query.executeUpdate();
    }

    public List<Map<String, Object>> findAllSql(String tableName) {
        String sql = "select * from " + tableName + " where 1=1";
        return queryBySql(sql);
    }

    public Object findSqlById(String tableName, String id) {
        String sql = String.format("select * from %s where id = ?", tableName);
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).getSingleResult();
    }

}
