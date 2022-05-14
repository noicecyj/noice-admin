package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "SecondMenu")
public interface SecondMenuController {

    @Operation(summary = "查询所有SecondMenu")
    @PostMapping(value = "secondMenuPage")
    ResultVO secondMenuPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pid") String pid);

    @Operation(summary = "保存SecondMenu")
    @PostMapping(value = "secondMenuSave")
    ResultVO secondMenuSave(@RequestBody SecondMenuPO po);

    @Operation(summary = "删除SecondMenu")
    @PostMapping(value = "secondMenuDelete")
    void secondMenuDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询SecondMenu")
    @PostMapping(value = "findSecondMenuById")
    ResultVO findSecondMenuById(@RequestParam("id") String id);

}
