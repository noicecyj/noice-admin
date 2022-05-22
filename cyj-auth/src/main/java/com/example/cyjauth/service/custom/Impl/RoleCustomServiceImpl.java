package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.service.custom.RoleCustomService;
import com.example.cyjcommon.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleCustomServiceImpl extends BaseService implements RoleCustomService {
}
