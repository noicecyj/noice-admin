package com.example.cyjentitycreater.service.auto;

import com.example.cyjentitycreater.entity.auto.po.SecondMenuPO;
import com.querydsl.core.QueryResults;
import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
public interface SecondMenuService {

    SecondMenuPO addOne(SecondMenuPO po);
    void deleteOne(String id);
    SecondMenuPO updateOne(SecondMenuPO po);
    QueryResults<SecondMenuPO> findAll(Integer pageNumber, String pid);
    SecondMenuPO findOneById(String id);
    List<SecondMenuPO> findListByPid(String id);

}
