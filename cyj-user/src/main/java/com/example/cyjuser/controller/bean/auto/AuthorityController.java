package com.example.cyjuser.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjuser.service.bean.auto.AuthorityServiceImpl;
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
@Tag(name = "AuthorityBean")
public class AuthorityController {

    private AuthorityServiceImpl service;

    @Autowired
    public void setService(AuthorityServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Authority")
    @PostMapping(value = "pageAuthority")
    public ResultVO page(@RequestBody PageBeanVo<AuthorityBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存Authority")
    @PostMapping(value = "saveAuthority")
    public ResultVO save(@RequestBody PageBeanVo<AuthorityBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除Authority")
    @PostMapping(value = "deleteAuthority")
    public ResultVO delete(@RequestBody PageBeanVo<AuthorityBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
