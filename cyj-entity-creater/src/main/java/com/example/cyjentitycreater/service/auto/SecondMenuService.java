package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface SecondMenuService {

    SecondMenuPO addOne(SecondMenuPO po);

    void deleteOne(SecondMenuPO po);

    SecondMenuPO updateOne(SecondMenuPO po);

    Page<SecondMenuPO> findAll(Integer pageNumber, FirstMenuPO firstMenu);

}
