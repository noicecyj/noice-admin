package com.example.cyjquery.service.custom;

import com.example.cyjcommon.entity.QSql;
import com.example.cyjcommon.entity.Sql;
import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 */
@Aspect
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


    private static final Logger logger = LoggerFactory.getLogger(SqlCustomService.class);

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SqlService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SqlService.findAllAfter:{}", joinPoint);
    }

}
