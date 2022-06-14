package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface PropertyDao extends JpaRepository<Property, String> {

    List<Property> findByPersistentOrderBySortCode(Persistent persistent);

}
