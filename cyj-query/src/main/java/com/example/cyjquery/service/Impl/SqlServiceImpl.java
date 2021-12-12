package com.example.cyjquery.service.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjquery.dao.SqlDao;
import com.example.cyjquery.entity.po.SqlPO;
import com.example.cyjquery.service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
@Service
public class SqlServiceImpl extends BaseService implements SqlService {

        private SqlDao sqlDao;

        @Autowired
        public void setSqlDao(SqlDao sqlDao) {
                this.sqlDao = sqlDao;
        }

        @Override
        public SqlPO addOne(SqlPO po) {
                return sqlDao.save(po);
        }

        @Override
        public void deleteOne(String id) {
                sqlDao.deleteById(id);
        }

        @Override
        public SqlPO updateOne(SqlPO po) {
                return sqlDao.saveAndFlush(po);
        }

        @Override
        public Page<SqlPO> findAll(Integer pageNumber, Integer pageSize, String sortCode) {
                Sort sort = Sort.by(sortCode);
                Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
                return sqlDao.findAll(pageable);
        }

        @Override
        public SqlPO findOneById(String id) {
                if (sqlDao.findById(id).isPresent()) {
                        return sqlDao.findById(id).get();
                }
                return null;
        }

}
