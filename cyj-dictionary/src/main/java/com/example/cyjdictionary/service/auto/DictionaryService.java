package com.example.cyjdictionary.service.auto;

import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.querydsl.core.QueryResults;
import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-27
 */
public interface DictionaryService {

        DictionaryPO addOne(DictionaryPO po);
        void deleteOne(String id);
        DictionaryPO updateOne(DictionaryPO po);
        QueryResults<DictionaryPO> findAll(Integer pageNumber, String pid);
        DictionaryPO findOneById(String id);
        List<DictionaryPO> findListByPid(String id);

}
