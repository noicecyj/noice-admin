package com.example.cyjcommon.service.Impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Service
public class BaseService {

        private final Logger logger = LoggerFactory.getLogger(BaseService.class);

        @PersistenceContext
        protected EntityManager entityManager;

        @Autowired
        public void setEntityManager(EntityManager entityManager) {
                this.entityManager = entityManager;
        }

        protected JPAQueryFactory queryFactory;

        @PostConstruct
        public void init() {
                queryFactory = new JPAQueryFactory(entityManager);
        }

        /**
         * 生成文件
         *
         * @param path   路径
         * @param result 内容
         */
        public void createJavaFile(String path, String[] result, boolean reWrite) throws IOException {
                File file = new File(path);
                File file2 = new File(path + "/" + result[1]);
                //如果文件不存在，创建一个文件
                if (file.mkdirs()) {
                        logger.info("生成路径文件夹");
                }
                if (file2.createNewFile()) {
                        logger.info("生成文件,路径为：{}", path + "/" + result[1]);
                }
                if (reWrite) {
                        FileWriter fw = null;
                        BufferedWriter bw = null;
                        try {
                                fw = new FileWriter(file2);
                                bw = new BufferedWriter(fw);
                                bw.write(result[0]);
                        } catch (IOException e) {
                                e.printStackTrace();
                        } finally {
                                assert bw != null;
                                bw.close();
                                fw.close();
                        }
                }
        }

        public void createJavaFile(String path, String[] result) throws IOException {
                createJavaFile(path, result, true);
        }

        /**
         * 生成文件夹
         *
         * @param path 路径
         */
        public void createJavaFile(String path) {
                File file = new File(path);
                if (!file.exists()) {
                        if (file.mkdirs()) {
                                logger.info("生成文件夹,路径为：{}", path);
                        }
                }
        }

}
