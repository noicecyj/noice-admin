package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryCustomServiceImpl extends BaseService implements DictionaryCustomService {

}
