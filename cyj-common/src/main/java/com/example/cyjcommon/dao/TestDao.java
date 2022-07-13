package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface TestDao extends JpaRepository<Test, String> {

}
