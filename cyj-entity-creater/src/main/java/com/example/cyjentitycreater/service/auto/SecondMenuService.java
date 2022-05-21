package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.querydsl.core.QueryResults;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 */
public interface SecondMenuService {

    SecondMenuPO addOne(SecondMenuPO po);

    void deleteOne(String id);

    SecondMenuPO updateOne(SecondMenuPO po);

    QueryResults<SecondMenuPO> findAll(Integer pageNumber, String pid);

    SecondMenuPO findOneById(String id);

    List<SecondMenuPO> findListByPid(String id);

}
