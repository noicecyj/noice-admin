package com.example.cyjentitycreater.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.custom.EntityNameCustomController;
import com.example.cyjentitycreater.entity.vo.CreateVO;
import com.example.cyjentitycreater.service.custom.EntityNameCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class EntityNameCustomControllerImpl implements EntityNameCustomController {

    private EntityNameCustomService entityNameCustomService;

    @Autowired
    public void setEntityNameCustomService(EntityNameCustomService entityNameCustomService) {
        this.entityNameCustomService = entityNameCustomService;
    }

    @Override
    public ResultVO createEntity(@RequestBody CreateVO createVO) {
        entityNameCustomService.generateJavaFile(createVO.getId());
        entityNameCustomService.createComponentFile(createVO.getId());
        return ResultVO.success();
    }

    @Override
    public ResultVO findDataTableAndFormByName(String entityCode) {
        return ResultVO.success(entityNameCustomService.findDataTableAndFormByName(entityCode));
    }

}
