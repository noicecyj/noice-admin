package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.entity.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface DictionaryDao extends JpaRepository<Dictionary, String> {

    List<Dictionary> findByCatalogOrderBySortCode(Catalog catalog);

}
