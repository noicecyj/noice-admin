package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.EntityNameController;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.example.cyjentitycreater.service.auto.EntityNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-18
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class EntityNameControllerImpl implements EntityNameController {

    private EntityNameService entityNameService;

    @Autowired
    public void setEntityNameService(EntityNameService entityNameService) {
        this.entityNameService = entityNameService;
    }

    @Override
    public ResultVO entityNamePage(Integer pageNumber) {
        return ResultVO.success(entityNameService.findAll(pageNumber));
    }

    @Override
    public ResultVO entityNameSave(EntityNamePO po) {
        if (po.getId() == null) {
            return ResultVO.success(entityNameService.addOne(po));
        }
        return ResultVO.success(entityNameService.updateOne(po));
    }

    @Override
    public void entityNameDelete(String id) {
        entityNameService.deleteOne(id);
    }

    @Override
    public ResultVO findEntityNameById(String id) {
        return ResultVO.success(entityNameService.findOneById(id));
    }

}
