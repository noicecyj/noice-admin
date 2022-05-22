package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.custom.PropertyCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class PropertyCustomServiceImpl extends BaseService implements PropertyCustomService {

}