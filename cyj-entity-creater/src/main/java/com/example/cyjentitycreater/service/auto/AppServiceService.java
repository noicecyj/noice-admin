package com.example.cyjentitycreater.service.auto;

import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import com.example.cyjentitycreater.entity.auto.vo.AppServiceVO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface AppServiceService {

        AppServicePO addOne(AppServicePO po);

        void deleteOne(String id);

        AppServicePO updateOne(AppServicePO po);

        QueryResults<AppServiceVO> findAll(AppServiceVO vo);

        AppServicePO findOneById(String id);

}
