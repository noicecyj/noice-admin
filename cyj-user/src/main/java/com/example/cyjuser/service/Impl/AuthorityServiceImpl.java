package com.example.cyjuser.service.Impl;

import com.example.cyjuser.dao.AuthorityDao;
import com.example.cyjuser.entity.po.AuthorityPO;
import com.example.cyjuser.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityServiceImpl extends BaseService implements AuthorityService {

        private AuthorityDao authorityDao;

        @Autowired
        public void setAuthorityDao(AuthorityDao authorityDao) {
                this.authorityDao = authorityDao;
        }

        @Override
        public List<AuthorityPO> findRoleAndAuthority() {
                return authorityDao.findAllByStatusEquals(1);
        }

}
