package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.controller.auto.AuthorityController;
import com.example.cyjauth.service.auto.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class AuthorityControllerImpl implements AuthorityController {

    private AuthorityService authorityService;

    @Autowired
    public void setAuthorityService(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    @Override
    public ResultVO authorityPage(Integer pageNumber) {
        return ResultVO.success(authorityService.findAll(pageNumber));
    }

    @Override
    public ResultVO authorityPage(Integer pageNumber, AppServicePO appService) {
        return ResultVO.success(authorityService.findAll(pageNumber, appService));
    }

    @Override
    public ResultVO authorityPage(Integer pageNumber, EntityPO entity) {
        return ResultVO.success(authorityService.findAll(pageNumber, entity));
    }

    @Override
    public ResultVO authorityPageByUserList(Integer pageNumber, Set<String> userList) {
        return ResultVO.success(authorityService.findAllByUserList(pageNumber, userList));
    }

    @Override
    public ResultVO authorityPageByRoleList(Integer pageNumber, Set<String> roleList) {
        return ResultVO.success(authorityService.findAllByRoleList(pageNumber, roleList));
    }

    @Override
    public ResultVO authoritySave(AuthorityPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(authorityService.addOne(po));
        }
        return ResultVO.success(authorityService.updateOne(po));
    }

    @Override
    public ResultVO authorityDelete(AuthorityPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        authorityService.deleteOne(po);
        return ResultVO.success();
    }

}
