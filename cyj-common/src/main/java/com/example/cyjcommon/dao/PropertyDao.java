package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface PropertyDao extends JpaRepository<Property, String> {

}
