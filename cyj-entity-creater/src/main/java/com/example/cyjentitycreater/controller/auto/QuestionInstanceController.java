package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.bean.QuestionInstance;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.QuestionInstanceServiceImpl;
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
@Tag(name = "QuestionInstance")
public class QuestionInstanceController {

    private QuestionInstanceServiceImpl service;

    @Autowired
    public void setService(QuestionInstanceServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有QuestionInstance")
    @PostMapping(value = "pageQuestionInstance")
    public ResultVO page(@RequestBody @Validated QuestionInstance po, @RequestParam("pageNumber") Integer pageNumber, @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存QuestionInstance")
    @PostMapping(value = "saveQuestionInstance")
    public ResultVO save(@RequestBody @Validated QuestionInstance po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除QuestionInstance")
    @PostMapping(value = "deleteQuestionInstance")
    public ResultVO delete(@RequestBody QuestionInstance po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据TestPaperInstance查询所有QuestionInstance")
    @PostMapping(value = "pageQuestionInstanceByTestPaperInstance")
    public ResultVO pageQuestionInstanceByTestPaperInstance(@RequestBody @Validated QuestionInstance po,
                                                            @RequestParam("pageNumber") Integer pageNumber,
                                                            @RequestParam("pageSize") Integer pageSize,
                                                            @RequestParam("id") String id) {
        return ResultVO.success(service.pageQuestionInstanceByTestPaperInstance(po, pageNumber, pageSize, id));
    }

}
