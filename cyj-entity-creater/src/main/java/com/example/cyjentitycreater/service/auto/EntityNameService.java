package com.example.cyjentitycreater.service.auto;

import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.example.cyjentitycreater.entity.auto.vo.EntityNameVO;
import com.querydsl.core.QueryResults;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
public interface EntityNameService {

        EntityNamePO addOne(EntityNamePO po);

        void deleteOne(String id);

        EntityNamePO updateOne(EntityNamePO po);

        QueryResults<EntityNameVO> entityNamePage(Integer pageNumber);

        EntityNamePO findOneById(String id);

        List<EntityNamePO> findListByPid(String id);

}
