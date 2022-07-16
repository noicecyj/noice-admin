package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.custom.PersistentCustomService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class PersistentCustomController {

    private PersistentCustomService persistentCustomService;

    @Autowired
    public void setPersistentCustomService(PersistentCustomService persistentCustomService) {
        this.persistentCustomService = persistentCustomService;
    }

    @Operation(summary = "生成实体类文件")
    @PostMapping(value = "createEntity")
    public ResultVO createEntity(@RequestBody Persistent po) {
        persistentCustomService.generateJavaFile(po);
        return ResultVO.success();
    }

    @Operation(summary = "创建表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    public ResultVO findDataTableAndFormByName(String entityCode) {
        return ResultVO.success(persistentCustomService.findDataTableAndFormByName(entityCode));
    }

}
