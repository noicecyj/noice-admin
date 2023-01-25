package com.example.cyjdictionary.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.DictionaryBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl;
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
@RequestMapping("dictionaryApi")
@Tag(name = "DictionaryBean")
public class DictionaryController {

    private DictionaryServiceImpl service;

    @Autowired
    public void setService(DictionaryServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Dictionary")
    @PostMapping(value = "pageDictionary")
    public ResultVO page(@RequestBody PageBeanVo<DictionaryBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存Dictionary")
    @PostMapping(value = "saveDictionary")
    public ResultVO save(@RequestBody PageBeanVo<DictionaryBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除Dictionary")
    @PostMapping(value = "deleteDictionary")
    public ResultVO delete(@RequestBody PageBeanVo<DictionaryBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
