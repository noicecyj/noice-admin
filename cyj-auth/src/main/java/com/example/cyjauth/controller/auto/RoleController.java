package com.example.cyjauth.controller.auto;

import com.example.cyjauth.service.auto.RoleService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "Role")
public class RoleController implements autoController<Role> {

    private RoleService service;

    @Autowired
    public void setService(RoleService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有Role")
    @PostMapping(value = "pageRole")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存Role")
    @PostMapping(value = "saveRole")
    public ResultVO save(@RequestBody @Validated Role po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除Role")
    @PostMapping(value = "deleteRole")
    public ResultVO delete(@RequestBody Role po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据Role查询所有Authority")
    @PostMapping(value = "authorityByRole")
    public ResultVO authorityByRole(@RequestParam("id") String id) {
        if (id == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.authorityByRole(id));
    }

    @Operation(summary = "根据Role保存Authority")
    @PostMapping(value = "authoritySaveRole")
    public ResultVO authoritySaveRole(@RequestParam("id") String id, @RequestBody Set<String> authorityIds) {
        if (id == null) {
            return ResultVO.failure();
        }
        service.authoritySaveRole(id, authorityIds);
        return ResultVO.success();
    }

}
