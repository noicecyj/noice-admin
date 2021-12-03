package com.example.cyjauth.dao;


import com.example.cyjauth.entity.po.AuthorityPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {

        @Operation(summary = "根据状态查询权限")
        List<AuthorityPO> findAllByStatusEquals(Integer status);

}
