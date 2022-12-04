package com.example.cyjauth.controller.bean.auto;

import com.example.cyjauth.service.bean.auto.AuthorityServiceImpl;
import com.example.cyjcommon.entity.bean.Authority;
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

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "Authority")
public class AuthorityController {

    private AuthorityServiceImpl service;

    @Autowired
    public void setService(AuthorityServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Authority")
    @PostMapping(value = "pageAuthority")
    public ResultVO page(@RequestBody @Validated Authority po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Authority")
    @PostMapping(value = "saveAuthority")
    public ResultVO save(@RequestBody @Validated Authority po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Authority")
    @PostMapping(value = "deleteAuthority")
    public ResultVO delete(@RequestBody Authority po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据Persistent查询所有Authority")
    @PostMapping(value = "pageAuthorityByPersistent")
    public ResultVO pageAuthorityByPersistent(@RequestBody @Validated Authority po,
                                              @RequestParam("pageNumber") Integer pageNumber,
                                              @RequestParam("pageSize") Integer pageSize,
                                              @RequestParam("id") String id) {
        return ResultVO.success(service.pageAuthorityByPersistent(po, pageNumber, pageSize, id));
    }

    @Operation(summary = "根据AppService查询所有Authority")
    @PostMapping(value = "pageAuthorityByAppService")
    public ResultVO pageAuthorityByAppService(@RequestBody @Validated Authority po,
                                              @RequestParam("pageNumber") Integer pageNumber,
                                              @RequestParam("pageSize") Integer pageSize,
                                              @RequestParam("id") String id) {
        return ResultVO.success(service.pageAuthorityByAppService(po, pageNumber, pageSize, id));
    }

}
