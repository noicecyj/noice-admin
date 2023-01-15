package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.PersistentTableSearchConfigBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl;
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
@Tag(name = "PersistentTableSearchConfigBean")
public class PersistentTableSearchConfigController {

    private PersistentTableSearchConfigServiceImpl service;

    @Autowired
    public void setService(PersistentTableSearchConfigServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentTableSearchConfig")
    @PostMapping(value = "pagePersistentTableSearchConfig")
    public ResultVO page(@RequestBody PageBeanVo<PersistentTableSearchConfigBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存PersistentTableSearchConfig")
    @PostMapping(value = "savePersistentTableSearchConfig")
    public ResultVO save(@RequestBody PersistentTableSearchConfigBean po) {
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentTableSearchConfig")
    @PostMapping(value = "deletePersistentTableSearchConfig")
    public ResultVO delete(@RequestBody PersistentTableSearchConfigBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
