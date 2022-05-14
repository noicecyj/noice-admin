package com.example.cyjentitycreater.dao;

import com.example.cyjcommon.entity.AppServicePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface AppServiceCustomDao extends JpaRepository<AppServicePO, String> {

    AppServicePO findAppServicePOByName(String name);

}
