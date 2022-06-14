package com.example.cyjentitycreater.controller.custom.Impl;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.custom.EntityCustomController;
import com.example.cyjentitycreater.service.custom.EntityCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class EntityCustomControllerImpl implements EntityCustomController {

    private EntityCustomService entityCustomService;

    @Autowired
    public void setEntityCustomService(EntityCustomService entityCustomService) {
        this.entityCustomService = entityCustomService;
    }

    @Override
    public ResultVO createEntity(@RequestBody Persistent po) {
        entityCustomService.generateJavaFile(po);
//        entityCustomService.createComponentFile(po);
        return ResultVO.success();
    }

    @Override
    public ResultVO findDataTableAndFormByName(String entityCode) {
        return ResultVO.success(entityCustomService.findDataTableAndFormByName(entityCode));
    }

}
