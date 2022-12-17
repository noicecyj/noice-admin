package com.example.cyjauth.controller.relation.auto;

import com.example.cyjcommon.entity.relation.UserRole;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.service.relation.auto.UserRoleServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "UserRole")
public class UserRoleController {

    private UserRoleServiceImpl service;

    @Autowired
    public void setService(UserRoleServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "查询UserRole关联关系")
    @PostMapping("getUserRole")
    public ResultVO getUserRole(@RequestBody @Validated UserRole po) {
        return ResultVO.success(service.getUserRole(po));
    }

    @Operation(summary = "保存UserRole关联关系")
    @PostMapping("setUserRole")
    public ResultVO setUserRole(@RequestBody @Validated UserRole po,
                                     @RequestBody @Validated List<UserRole> poList) {
        service.setUserRole(po, poList);
        return ResultVO.success();
    }

}
