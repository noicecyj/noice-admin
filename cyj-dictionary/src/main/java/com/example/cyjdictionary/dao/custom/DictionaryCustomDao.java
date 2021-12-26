package com.example.cyjdictionary.dao.custom;

import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
public interface DictionaryCustomDao extends JpaRepository<DictionaryPO, String> {
}
