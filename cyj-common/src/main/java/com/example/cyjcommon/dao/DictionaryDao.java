package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface DictionaryDao extends JpaRepository<DictionaryPO, String> {

    List<DictionaryPO> findByCatalogOrderBySortCode(CatalogPO catalog);

}
