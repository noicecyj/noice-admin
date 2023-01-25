package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl;
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
@RequestMapping("entityCreateApi")
@Tag(name = "AppServiceBean")
public class AppServiceController {

    private AppServiceServiceImpl service;

    @Autowired
    public void setService(AppServiceServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有AppService")
    @PostMapping(value = "pageAppService")
    public ResultVO page(@RequestBody PageBeanVo<AppServiceBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存AppService")
    @PostMapping(value = "saveAppService")
    public ResultVO save(@RequestBody PageBeanVo<AppServiceBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除AppService")
    @PostMapping(value = "deleteAppService")
    public ResultVO delete(@RequestBody PageBeanVo<AppServiceBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
