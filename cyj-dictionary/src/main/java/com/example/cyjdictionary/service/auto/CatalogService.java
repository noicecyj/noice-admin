package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.Catalog;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface CatalogService {

    Catalog addOne(Catalog po);

    void deleteOne(Catalog po);

    Catalog updateOne(Catalog po);

    Page<Catalog> findAll(Integer pageNumber);

}
