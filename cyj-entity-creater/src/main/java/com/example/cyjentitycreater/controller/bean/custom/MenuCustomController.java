package com.example.cyjentitycreater.controller.bean.custom;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.custom.MenuCustomServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi")
@Tag(name = "MenuBean")
public class MenuCustomController {

    private MenuCustomServiceImpl menuCustomService;

    @Autowired
    public void setMenuCustomService(MenuCustomServiceImpl menuCustomService) {
        this.menuCustomService = menuCustomService;
    }

    @Operation(summary = "实体菜单代码")
    @PostMapping(value = "generateMenuFile")
    public ResultVO generateMenuFile() {
        menuCustomService.generateMenuFile();
        return ResultVO.success();
    }
}