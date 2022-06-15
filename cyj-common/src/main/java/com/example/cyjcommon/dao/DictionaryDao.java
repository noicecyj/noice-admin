package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface DictionaryDao extends JpaRepository<Dictionary, String> {

}
