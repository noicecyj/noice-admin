package com.example.cyjworkflow.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.custom.FlowGroupCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowGroupCustomServiceImpl extends BaseService implements FlowGroupCustomService {

}
