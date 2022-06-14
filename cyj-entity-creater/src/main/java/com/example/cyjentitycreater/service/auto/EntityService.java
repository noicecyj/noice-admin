package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Persistent;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface EntityService {

    Persistent addOne(Persistent po);

    void deleteOne(Persistent po);

    Persistent updateOne(Persistent po);

    Page<Persistent> findAll(Integer pageNumber);

    Page<Persistent> findAll(Integer pageNumber, AppService appService);

}
