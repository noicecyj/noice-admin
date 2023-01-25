package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl;
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
@Tag(name = "PersistentBean")
public class PersistentController {

    private PersistentServiceImpl service;

    @Autowired
    public void setService(PersistentServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Persistent")
    @PostMapping(value = "pagePersistent")
    public ResultVO page(@RequestBody PageBeanVo<PersistentBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存Persistent")
    @PostMapping(value = "savePersistent")
    public ResultVO save(@RequestBody PageBeanVo<PersistentBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除Persistent")
    @PostMapping(value = "deletePersistent")
    public ResultVO delete(@RequestBody PageBeanVo<PersistentBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
