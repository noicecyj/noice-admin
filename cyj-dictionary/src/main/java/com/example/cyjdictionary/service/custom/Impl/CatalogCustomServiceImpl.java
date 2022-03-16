package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.dao.custom.CatalogCustomDao;
import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.example.cyjdictionary.service.custom.CatalogCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
