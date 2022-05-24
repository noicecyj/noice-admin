package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
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
@Tag(name = "SecondMenu")
public interface SecondMenuController {

    @Operation(summary = "根据FirstMenu查询所有SecondMenu")
    @PostMapping(value = "secondMenuPageByFirstMenu")
    ResultVO secondMenuPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody FirstMenuPO firstMenu);

    @Operation(summary = "保存SecondMenu")
    @PostMapping(value = "secondMenuSave")
    ResultVO secondMenuSave(@RequestBody @Validated SecondMenuPO po, BindingResult bindingResult);

    @Operation(summary = "删除SecondMenu")
    @PostMapping(value = "secondMenuDelete")
    ResultVO secondMenuDelete(@RequestBody SecondMenuPO po);

}
