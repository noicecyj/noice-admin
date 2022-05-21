package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.custom.SecondMenuCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-20
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SecondMenuCustomServiceImpl extends BaseService implements SecondMenuCustomService {

}
