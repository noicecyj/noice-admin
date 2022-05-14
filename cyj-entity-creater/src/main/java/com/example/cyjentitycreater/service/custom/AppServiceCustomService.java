package com.example.cyjentitycreater.service.custom;

import com.example.cyjcommon.entity.AppServicePO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface AppServiceCustomService {

    AppServicePO findOneByName(String name);

    void createAppFile(String id);

}
