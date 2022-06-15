package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface PersistentDao extends JpaRepository<Persistent, String> {

}