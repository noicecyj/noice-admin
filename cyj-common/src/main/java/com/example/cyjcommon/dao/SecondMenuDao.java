package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface SecondMenuDao extends JpaRepository<SecondMenuPO, String> {

    List<SecondMenuPO> findByFirstMenu(FirstMenuPO firstMenu);

}
