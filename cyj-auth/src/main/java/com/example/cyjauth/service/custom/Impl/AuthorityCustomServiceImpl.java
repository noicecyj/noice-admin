package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.custom.AuthorityCustomDao;
import com.example.cyjauth.entity.custom.po.AuthorityPO;
import com.example.cyjauth.service.custom.AuthorityCustomService;
import com.example.cyjcommon.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityCustomServiceImpl extends BaseService implements AuthorityCustomService {

    private AuthorityCustomDao authorityCustomDao;

    @Autowired
    public void setAuthorityCustomDao(AuthorityCustomDao authorityCustomDao) {
        this.authorityCustomDao = authorityCustomDao;
    }

    @Override
    public List<AuthorityPO> findRoleAndAuthority() {
        return authorityCustomDao.findAllByStatusEquals("1");
    }

}
