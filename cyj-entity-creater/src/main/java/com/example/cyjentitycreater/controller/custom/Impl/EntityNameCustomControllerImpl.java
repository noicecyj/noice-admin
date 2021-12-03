package com.example.cyjentitycreater.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.custom.EntityNameCustomController;
import com.example.cyjentitycreater.entity.custom.vo.CreateVO;
import com.example.cyjentitycreater.service.custom.EntityNameCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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
                try {
                        entityNameCustomService.generateJavaFile(createVO.getId());
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return ResultVO.success();
        }

        @Override
        public ResultVO createComponentFile(@RequestBody CreateVO createVO) {
                entityNameCustomService.createComponentFile(createVO.getId());
                return ResultVO.success();
        }

        @Override
        public ResultVO findDataTableAndFormByName(CreateVO createVO) {
                return ResultVO.success(entityNameCustomService.findDataTableAndFormByName(createVO.getEntityCode()));
        }

}
