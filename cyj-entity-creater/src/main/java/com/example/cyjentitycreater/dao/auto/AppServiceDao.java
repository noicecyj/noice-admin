package com.example.cyjentitycreater.dao.auto;

import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
public interface AppServiceDao extends JpaRepository<AppServicePO, String> {
}
