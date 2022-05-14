package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.service.custom.EnterpriseCustomService;
import com.example.cyjcommon.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseCustomServiceImpl extends BaseService implements EnterpriseCustomService {

}
