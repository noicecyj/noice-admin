package com.example.cyjauth.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjauth.service.custom.UserCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCustomServiceImpl extends BaseService implements UserCustomService {

}