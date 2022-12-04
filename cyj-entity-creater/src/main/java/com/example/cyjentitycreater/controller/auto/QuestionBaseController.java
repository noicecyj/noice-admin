package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.bean.QuestionBase;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.QuestionBaseServiceImpl;
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
@RequestMapping(value = "entityCreateApi")
@Tag(name = "QuestionBase")
public class QuestionBaseController {

    private QuestionBaseServiceImpl service;

    @Autowired
    public void setService(QuestionBaseServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有QuestionBase")
    @PostMapping(value = "pageQuestionBase")
    public ResultVO page(@RequestBody @Validated QuestionBase po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存QuestionBase")
    @PostMapping(value = "saveQuestionBase")
    public ResultVO save(@RequestBody @Validated QuestionBase po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除QuestionBase")
    @PostMapping(value = "deleteQuestionBase")
    public ResultVO delete(@RequestBody QuestionBase po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }


}
