package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.Bpmn;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 * @version 1.0
 */
@Tag(name = "Bpmn")
public interface BpmnController {

    @Operation(summary = "查询所有Bpmn")
    @PostMapping(value = "bpmnPage")
    ResultVO bpmnPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Bpmn")
    @PostMapping(value = "bpmnSave")
    ResultVO bpmnSave(@RequestBody Bpmn po);

    @Operation(summary = "删除Bpmn")
    @PostMapping(value = "bpmnDelete")
    void bpmnDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Bpmn")
    @PostMapping(value = "findBpmnById")
    ResultVO findBpmnById(@RequestParam("id") String id);

}
