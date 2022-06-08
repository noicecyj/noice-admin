package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.AppService;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface AppServiceService {

    AppService addOne(AppService po);

    void deleteOne(AppService po);

    AppService updateOne(AppService po);

    Page<AppService> findAll(Integer pageNumber);

}
