package com.example.cyjentitycreater.service.auto;

import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FirstMenuService {

    FirstMenuPO addOne(FirstMenuPO po);

    void deleteOne(String id);

    FirstMenuPO updateOne(FirstMenuPO po);

    QueryResults<FirstMenuPO> findAll(Integer pageNumber);

    FirstMenuPO findOneById(String id);

}
