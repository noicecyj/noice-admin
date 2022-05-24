package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 */
@Tag(name = "FirstMenu")
public interface FirstMenuController {

    @Operation(summary = "查询所有FirstMenu")
    @PostMapping(value = "firstMenuPage")
    ResultVO firstMenuPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FirstMenu")
    @PostMapping(value = "firstMenuSave")
    ResultVO firstMenuSave(@RequestBody @Validated FirstMenuPO po, BindingResult bindingResult);

    @Operation(summary = "删除FirstMenu")
    @PostMapping(value = "firstMenuDelete")
    ResultVO firstMenuDelete(@RequestBody FirstMenuPO po);

}
