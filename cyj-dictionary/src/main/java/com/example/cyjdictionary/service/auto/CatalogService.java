package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface CatalogService {

    CatalogPO addOne(CatalogPO po);

    void deleteOne(CatalogPO po);

    CatalogPO updateOne(CatalogPO po);

    Page<CatalogPO> findAll(Integer pageNumber);

}
