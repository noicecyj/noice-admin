package com.example.cyjauth.controller.bean.auto;

import com.example.cyjcommon.entity.bean.User;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.service.bean.auto.UserServiceImpl;
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

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("authApi")
@Tag(name = "User")
public class UserController {

    private UserServiceImpl service;

    @Autowired
    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有User")
    @PostMapping(value = "pageUser")
    public ResultVO page(@RequestBody @Validated User po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存User")
    @PostMapping(value = "saveUser")
    public ResultVO save(@RequestBody @Validated User po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除User")
    @PostMapping(value = "deleteUser")
    public ResultVO delete(@RequestBody User po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
