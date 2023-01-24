package com.example.cyjentitycreater.controller.bean.custom;

import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.custom.PersistentCustomServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi")
@Tag(name = "Persistent")
public class PersistentCustomController {

    private PersistentCustomServiceImpl persistentCustomService;

    @Autowired
    public void setPersistentCustomService(PersistentCustomServiceImpl persistentCustomService) {
        this.persistentCustomService = persistentCustomService;
    }

    @Operation(summary = "获取表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    public ResultVO findDataTableAndFormByName(@RequestParam("persistentCode") String persistentCode) {
        return ResultVO.success(persistentCustomService.findDataTableAndFormByName(persistentCode));
    }

    @Operation(summary = "实体生成代码")
    @PostMapping(value = "generateJavaFile")
    public ResultVO generateJavaFile(@RequestBody PersistentBean po) {
        persistentCustomService.generateJavaFile(po);
        return ResultVO.success();
    }

    @Operation(summary = "实体生成全部代码")
    @PostMapping(value = "generateAllJavaFile")
    public ResultVO generateAllJavaFile() {
        persistentCustomService.generateAllJavaFile();
        return ResultVO.success();
    }

}