package com.example.cyjuser.controller.relation.auto;

import com.example.cyjcommon.entity.relation.RoleAuthorityRelation;
import com.example.cyjcommon.entity.vo.PageRelationVo;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjuser.service.relation.auto.RoleAuthorityServiceImpl;
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
@Tag(name = "RoleAuthorityBean")
public class RoleAuthorityController {

    private RoleAuthorityServiceImpl service;

    @Autowired
    public void setService(RoleAuthorityServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "查询RoleAuthority关联关系")
    @PostMapping("getRoleAuthority")
    public ResultVO getRoleAuthority(@RequestBody RoleAuthorityRelation po) {
        return ResultVO.success(service.getRoleAuthority(po));
    }

    @Operation(summary = "保存RoleAuthority关联关系")
    @PostMapping("setRoleAuthority")
    public ResultVO setRoleAuthority(@RequestBody PageRelationVo<RoleAuthorityRelation> vo) {
        service.setRoleAuthority(vo.po, vo.poList);
        return ResultVO.success();
    }

}
