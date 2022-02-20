package com.example.cyjentitycreater.dao.auto;

import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
public interface FirstMenuDao extends JpaRepository<FirstMenuPO, String> {
}
