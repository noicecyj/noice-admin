package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.EntityController;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import com.example.cyjentitycreater.service.auto.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class EntityControllerImpl implements EntityController {

    private EntityService entityService;

    @Autowired
    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

    @Override
    public ResultVO entityPage(Integer pageNumber, String pid) {
        return ResultVO.success(entityService.findAll(pageNumber, pid));
    }

    @Override
    public ResultVO entitySave(EntityPO po) {
        if (po.getId() == null) {
            return ResultVO.success(entityService.addOne(po));
        }
        return ResultVO.success(entityService.updateOne(po));
    }

    @Override
    public void entityDelete(String id) {
        entityService.deleteOne(id);
    }

    @Override
    public ResultVO findEntityById(String id) {
        return ResultVO.success(entityService.findOneById(id));
    }

}
