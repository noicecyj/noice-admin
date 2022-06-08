package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Entity;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface EntityService {

    Entity addOne(Entity po);

    void deleteOne(Entity po);

    Entity updateOne(Entity po);

    Page<Entity> findAll(Integer pageNumber);

    Page<Entity> findAll(Integer pageNumber, Entity entity);

    Page<Entity> findAll(Integer pageNumber, AppService appService);

}
