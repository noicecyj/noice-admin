package com.example.cyjcommon.service.Impl;

import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.dto.AuthorityDTO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.service.AuthorityService;
import com.example.cyjcommon.utils.VoPoConverter;
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

    @Override
    public void InterFaceMethod(AuthorityDTO dto) {
        AuthorityPO po = authorityDao.findByPathAndName(dto.getPath(), dto.getName());
        if (po == null) {
            AuthorityPO insertPo = new AuthorityPO();
            VoPoConverter.copyProperties(dto, insertPo);
            insertPo.setSortCode("0010");
            authorityDao.save(insertPo);
        }
    }

}
