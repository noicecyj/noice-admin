package com.example.cyjuser.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjuser.service.bean.auto.UserServiceImpl;
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
@Tag(name = "UserBean")
public class UserController {

    private UserServiceImpl service;

    @Autowired
    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有User")
    @PostMapping(value = "pageUser")
    public ResultVO page(@RequestBody PageBeanVo<UserBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存User")
    @PostMapping(value = "saveUser")
    public ResultVO save(@RequestBody PageBeanVo<UserBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除User")
    @PostMapping(value = "deleteUser")
    public ResultVO delete(@RequestBody PageBeanVo<UserBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
