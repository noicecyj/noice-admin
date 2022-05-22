package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
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
@Tag(name = "Role")
public interface RoleController {

    @Operation(summary = "查询所有Role")
    @PostMapping(value = "rolePage")
    ResultVO rolePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据User查询所有Role")
    @PostMapping(value = "rolePageByUser")
    ResultVO rolePage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody UserPO user);

    @Operation(summary = "保存Role")
    @PostMapping(value = "roleSave")
    ResultVO roleSave(@RequestBody @Validated RolePO po, BindingResult bindingResult);

    @Operation(summary = "删除Role")
    @PostMapping(value = "roleDelete")
    ResultVO roleDelete(@RequestBody RolePO po);

}
