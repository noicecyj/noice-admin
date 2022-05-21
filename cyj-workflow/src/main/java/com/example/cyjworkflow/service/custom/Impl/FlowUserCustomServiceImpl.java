package com.example.cyjworkflow.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.custom.FlowUserCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowUserCustomServiceImpl extends BaseService implements FlowUserCustomService {

}
