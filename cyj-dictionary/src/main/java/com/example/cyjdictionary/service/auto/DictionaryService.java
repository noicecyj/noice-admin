package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.entity.Dictionary;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface DictionaryService {

    Dictionary addOne(Dictionary po);

    void deleteOne(Dictionary po);

    Dictionary updateOne(Dictionary po);

    Page<Dictionary> findAll(Integer pageNumber);

    Page<Dictionary> findAll(Integer pageNumber, Catalog catalog);

}
