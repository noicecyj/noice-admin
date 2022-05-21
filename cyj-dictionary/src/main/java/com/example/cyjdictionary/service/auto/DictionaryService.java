package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import com.querydsl.core.QueryResults;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface DictionaryService {

    DictionaryPO addOne(DictionaryPO po);

    void deleteOne(String id);

    DictionaryPO updateOne(DictionaryPO po);

    Page<DictionaryPO> findAll(Integer pageNumber, CatalogPO catalog);

    DictionaryPO findOneById(String id);

    List<DictionaryPO> findAllByCatalog(CatalogPO catalog);
}
