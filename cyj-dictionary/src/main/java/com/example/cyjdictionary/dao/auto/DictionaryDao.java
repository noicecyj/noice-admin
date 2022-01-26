package com.example.cyjdictionary.dao.auto;

import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-27
 */
public interface DictionaryDao extends JpaRepository<DictionaryPO, String> {
}
