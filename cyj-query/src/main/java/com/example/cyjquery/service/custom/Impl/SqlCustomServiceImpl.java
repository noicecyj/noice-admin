package com.example.cyjquery.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjquery.service.custom.SqlCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlCustomServiceImpl extends BaseService implements SqlCustomService {

}