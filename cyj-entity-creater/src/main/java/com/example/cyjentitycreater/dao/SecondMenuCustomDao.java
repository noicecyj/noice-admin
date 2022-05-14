package com.example.cyjentitycreater.dao;

import com.example.cyjcommon.entity.po.SecondMenuPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
public interface SecondMenuCustomDao extends JpaRepository<SecondMenuPO, String> {

    List<SecondMenuPO> findByPid(String pid);

}
