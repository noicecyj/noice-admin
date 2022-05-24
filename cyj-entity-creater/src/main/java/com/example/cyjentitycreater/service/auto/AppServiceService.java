package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface AppServiceService {

    AppServicePO addOne(AppServicePO po);

    void deleteOne(AppServicePO po);

    AppServicePO updateOne(AppServicePO po);

    Page<AppServicePO> findAll(Integer pageNumber);

}
