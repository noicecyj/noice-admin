package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.custom.CatalogCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogCustomServiceImpl extends BaseService implements CatalogCustomService {

}
