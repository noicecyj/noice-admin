package com.example.cyjentitycreater.dao;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
public interface FirstMenuCustomDao extends JpaRepository<FirstMenuPO, String> {
}
