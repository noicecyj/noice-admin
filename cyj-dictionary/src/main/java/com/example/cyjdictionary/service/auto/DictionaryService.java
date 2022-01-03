package com.example.cyjdictionary.service.auto;

import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-04
 */
public interface DictionaryService {

        DictionaryPO addOne(DictionaryPO po);
        void deleteOne(String id);
        DictionaryPO updateOne(DictionaryPO po);
        QueryResults<DictionaryPO> findAll(Integer pageNumber);
        DictionaryPO findOneById(String id);

}
