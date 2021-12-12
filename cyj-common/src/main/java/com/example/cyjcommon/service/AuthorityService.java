package com.example.cyjcommon.service;


import com.example.cyjcommon.entity.dto.AuthorityDTO;
import com.example.cyjcommon.entity.po.AuthorityPO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public interface AuthorityService {

        List<AuthorityPO> findRoleAndAuthority();

        void InterFaceMethod(AuthorityDTO dto);
}
