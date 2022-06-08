package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.FirstMenu;
import com.example.cyjcommon.entity.SecondMenu;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface SecondMenuService {

    SecondMenu addOne(SecondMenu po);

    void deleteOne(SecondMenu po);

    SecondMenu updateOne(SecondMenu po);

    Page<SecondMenu> findAll(Integer pageNumber, FirstMenu firstMenu);

}
