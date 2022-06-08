package com.example.cyjcommon.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Noice
 */
@Service
public class BaseService {

    @PersistenceContext
    protected EntityManager entityManager;
    protected JPAQueryFactory queryFactory;

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PostConstruct
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

}
