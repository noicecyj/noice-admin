package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.QuestionInstanceAnswer;
import com.example.cyjcommon.utils.ResultVO;
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
@Tag(name = "QuestionInstanceAnswer")
public class QuestionInstanceAnswerController implements autoController<QuestionInstanceAnswer> {

    private QuestionInstanceAnswerService service;

    @Autowired
    public void setService(QuestionInstanceAnswerService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有QuestionInstanceAnswer")
    @PostMapping(value = "pageQuestionInstanceAnswer")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存QuestionInstanceAnswer")
    @PostMapping(value = "saveQuestionInstanceAnswer")
    public ResultVO save(@RequestBody @Validated QuestionInstanceAnswer po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除QuestionInstanceAnswer")
    @PostMapping(value = "deleteQuestionInstanceAnswer")
    public ResultVO delete(@RequestBody QuestionInstanceAnswer po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
