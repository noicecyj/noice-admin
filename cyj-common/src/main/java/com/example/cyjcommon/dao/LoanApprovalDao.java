package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.LoanApproval;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface LoanApprovalDao extends JpaRepository<LoanApproval, String> {

}
