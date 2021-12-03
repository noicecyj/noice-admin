package com.example.cyjuser.dao;

import com.example.cyjuser.entity.po.AuthorityPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {

        List<AuthorityPO> findAllByStatusEquals(Integer status);

        AuthorityPO findByPathAndName(String path, String name);

}
