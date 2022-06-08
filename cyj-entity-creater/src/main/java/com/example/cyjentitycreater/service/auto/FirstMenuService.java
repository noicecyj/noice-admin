package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.FirstMenu;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FirstMenuService {

    FirstMenu addOne(FirstMenu po);

    void deleteOne(FirstMenu po);

    FirstMenu updateOne(FirstMenu po);

    Page<FirstMenu> findAll(Integer pageNumber);

}
