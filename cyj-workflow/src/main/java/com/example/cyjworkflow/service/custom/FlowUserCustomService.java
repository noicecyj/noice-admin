package com.example.cyjworkflow.service.custom;

import com.example.cyjcommon.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowUserCustomService extends BaseService {

}
