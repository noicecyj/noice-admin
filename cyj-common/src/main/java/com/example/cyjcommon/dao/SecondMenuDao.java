package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.FirstMenu;
import com.example.cyjcommon.entity.SecondMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface SecondMenuDao extends JpaRepository<SecondMenu, String> {

    List<SecondMenu> findByFirstMenu(FirstMenu firstMenu);

}
