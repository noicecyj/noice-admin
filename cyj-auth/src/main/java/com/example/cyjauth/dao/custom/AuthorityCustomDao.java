package com.example.cyjauth.dao.custom;

import com.example.cyjauth.entity.custom.po.AuthorityCustomPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityCustomDao extends JpaRepository<AuthorityCustomPO, String> {

    List<AuthorityCustomPO> findAllByStatusEquals(String status);

    AuthorityCustomPO findByPathAndName(String path, String name);

}
