package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FirstMenuService {

    FirstMenuPO addOne(FirstMenuPO po);

    void deleteOne(FirstMenuPO po);

    FirstMenuPO updateOne(FirstMenuPO po);

    Page<FirstMenuPO> findAll(Integer pageNumber);

}
