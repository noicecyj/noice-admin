package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.service.custom.RoleCustomService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleCustomServiceImpl extends BaseService implements RoleCustomService {
}
