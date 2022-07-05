package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface QuestionDao extends JpaRepository<Question, String> {

}
