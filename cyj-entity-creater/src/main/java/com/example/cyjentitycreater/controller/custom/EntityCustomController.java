package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.custom.PersistentCustomService;
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
public class EntityCustomController {

    private PersistentCustomService persistentCustomService;

    @Autowired
    public void setPersistentCustomService(PersistentCustomService persistentCustomService) {
        this.persistentCustomService = persistentCustomService;
    }

    public ResultVO createEntity(@RequestBody Persistent po) {
        persistentCustomService.generateJavaFile(po);
//        entityCustomService.createComponentFile(po);
        return ResultVO.success();
    }

    public ResultVO findDataTableAndFormByName(String entityCode) {
        return ResultVO.success(persistentCustomService.findDataTableAndFormByName(entityCode));
    }

}
