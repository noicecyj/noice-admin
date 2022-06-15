package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-12-26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogCustomService extends BaseService {

}
