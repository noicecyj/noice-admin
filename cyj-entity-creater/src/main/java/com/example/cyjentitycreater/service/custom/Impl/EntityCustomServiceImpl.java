package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.custom.EntityCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class EntityCustomServiceImpl extends BaseService implements EntityCustomService {

}
