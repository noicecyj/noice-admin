package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface DictionaryService {

    DictionaryPO addOne(DictionaryPO po);

    void deleteOne(DictionaryPO po);

    DictionaryPO updateOne(DictionaryPO po);

    Page<DictionaryPO> findAll(Integer pageNumber, CatalogPO catalog);

}
