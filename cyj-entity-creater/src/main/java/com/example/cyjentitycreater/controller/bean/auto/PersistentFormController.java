package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.PersistentFormBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentFormServiceImpl;
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
@Tag(name = "PersistentFormBean")
public class PersistentFormController {

    private PersistentFormServiceImpl service;

    @Autowired
    public void setService(PersistentFormServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentForm")
    @PostMapping(value = "pagePersistentForm")
    public ResultVO page(@RequestBody PageBeanVo<PersistentFormBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存PersistentForm")
    @PostMapping(value = "savePersistentForm")
    public ResultVO save(@RequestBody PersistentFormBean po) {
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentForm")
    @PostMapping(value = "deletePersistentForm")
    public ResultVO delete(@RequestBody PersistentFormBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
