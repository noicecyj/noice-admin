package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjauth.controller.auto.AuthorityController;
import com.example.cyjauth.service.auto.AuthorityService;
import com.example.cyjcommon.entity.dto.RoleAuthorityDTO;
import com.example.cyjcommon.entity.dto.UserAuthorityDTO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
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
    public ResultVO authoritySave(AuthorityPO po) {
        if (po.getId() == null) {
            return ResultVO.success(authorityService.addOne(po));
        }
        return ResultVO.success(authorityService.updateOne(po));
    }

    @Override
    public void authorityDelete(String id) {
        authorityService.deleteOne(id);
    }

    @Override
    public ResultVO findAuthorityById(String id) {
        return ResultVO.success(authorityService.findOneById(id));
    }

    @Override
    public ResultVO getUserAuthority(String userId) {
        return ResultVO.success(authorityService.getUserAuthority(userId));
    }

    @Override
    public ResultVO setUserAuthority(UserAuthorityDTO userAuthorityDTO) {
        authorityService.setUserAuthority(userAuthorityDTO.getUserId(), userAuthorityDTO.getAuthorityIds());
        return ResultVO.success();
    }

    @Override
    public ResultVO getRoleAuthority(String roleId) {
        return ResultVO.success(authorityService.getRoleAuthority(roleId));
    }

    @Override
    public ResultVO setRoleAuthority(RoleAuthorityDTO roleAuthorityDTO) {
        authorityService.setRoleAuthority(roleAuthorityDTO.getRoleId(), roleAuthorityDTO.getAuthorityIds());
        return ResultVO.success();
    }

}
