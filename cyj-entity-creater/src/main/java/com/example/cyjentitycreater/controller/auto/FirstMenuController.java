package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
@Tag(name = "FirstMenu")
public interface FirstMenuController {

    @Operation(summary = "查询所有FirstMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "firstMenuPage")
    ResultVO firstMenuPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FirstMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "firstMenuSave")
    ResultVO firstMenuSave(@RequestBody FirstMenuPO po);

    @Operation(summary = "删除FirstMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "firstMenuDelete")
    void firstMenuDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询FirstMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "findFirstMenuById")
    ResultVO findFirstMenuById(@RequestParam("id") String id);

}
