package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.TestInstance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface TestInstanceDao extends JpaRepository<TestInstance, String> {

}
