package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.bean.Persistent;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.custom.PersistentCustomServiceImpl;
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

    private PersistentCustomServiceImpl persistentCustomServiceImpl;

    @Autowired
    public void setPersistentCustomService(PersistentCustomServiceImpl persistentCustomServiceImpl) {
        this.persistentCustomServiceImpl = persistentCustomServiceImpl;
    }

    @Operation(summary = "生成实体类文件")
    @PostMapping(value = "createEntity")
    public ResultVO createEntity(@RequestBody Persistent po) {
        persistentCustomServiceImpl.generateJavaFile(po);
        return ResultVO.success();
    }

    @Operation(summary = "删除实体类文件")
    @PostMapping(value = "deleteEntity")
    public ResultVO deleteEntity(@RequestBody Persistent po) {
        persistentCustomServiceImpl.deleteJavaFile(po);
        return ResultVO.success();
    }

    @Operation(summary = "创建表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    public ResultVO findDataTableAndFormByName(String entityCode) {
        return ResultVO.success(persistentCustomServiceImpl.findDataTableAndFormByName(entityCode));
    }

}
