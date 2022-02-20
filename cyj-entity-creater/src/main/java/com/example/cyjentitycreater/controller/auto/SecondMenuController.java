package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.auto.po.SecondMenuPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
@Tag(name = "SecondMenu")
public interface SecondMenuController {

    @Operation(summary = "查询所有SecondMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "secondMenuPage")
    ResultVO secondMenuPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pid") String pid);

    @Operation(summary = "保存SecondMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "secondMenuSave")
    ResultVO secondMenuSave(@RequestBody SecondMenuPO po);

    @Operation(summary = "删除SecondMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "secondMenuDelete")
    void secondMenuDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询SecondMenu")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "findSecondMenuById")
    ResultVO findSecondMenuById(@RequestParam("id") String id);

}
