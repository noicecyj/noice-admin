package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.EntityController;
import com.example.cyjentitycreater.service.auto.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
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
    public ResultVO entityPage(Integer pageNumber) {
        return ResultVO.success(entityService.findAll(pageNumber));
    }

    @Override
    public ResultVO entityPage(Integer pageNumber, EntityPO entity) {
        return ResultVO.success(entityService.findAll(pageNumber, entity));
    }

    @Override
    public ResultVO entityPage(Integer pageNumber, AppServicePO appService) {
        return ResultVO.success(entityService.findAll(pageNumber, appService));
    }

    @Override
    public ResultVO entitySave(EntityPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(entityService.addOne(po));
        }
        return ResultVO.success(entityService.updateOne(po));
    }

    @Override
    public ResultVO entityDelete(EntityPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        entityService.deleteOne(po);
        return ResultVO.success();
    }

}
