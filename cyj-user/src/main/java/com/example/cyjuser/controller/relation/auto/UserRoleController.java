package com.example.cyjuser.controller.relation.auto;

import com.example.cyjcommon.entity.relation.UserRoleRelation;
import com.example.cyjcommon.entity.vo.PageRelationVo;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjuser.service.relation.auto.UserRoleServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@RequestMapping("userApi")
@Tag(name = "UserRoleBean")
public class UserRoleController {

    private UserRoleServiceImpl service;

    @Autowired
    public void setService(UserRoleServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "查询UserRole关联关系")
    @PostMapping("getUserRole")
    public ResultVO getUserRole(@RequestBody UserRoleRelation po) {
        return ResultVO.success(service.getUserRole(po));
    }

    @Operation(summary = "保存UserRole关联关系")
    @PostMapping("setUserRole")
    public ResultVO setUserRole(@RequestBody PageRelationVo<UserRoleRelation> vo) {
        service.setUserRole(vo.po, vo.poList);
        return ResultVO.success();
    }

}
