package noice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.FormAndTableControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.service.TableAndFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/TableAndForm")
@Tag(name = "TableAndForm", description = "表单和表格相关接口")
public class TableAndFormController {

    private TableAndFormService tableAndFormService;

    private FormAndTableControllerAssembler formAndTableControllerAssembler;

    @Autowired
    public void setFormAndTableControllerAssembler(FormAndTableControllerAssembler formAndTableControllerAssembler) {
        this.formAndTableControllerAssembler = formAndTableControllerAssembler;
    }

    @Autowired
    public void setTableAndFormService(TableAndFormService tableAndFormService) {
        this.tableAndFormService = tableAndFormService;
    }

    @Operation(summary = "获取表格")
    @GetMapping(value = "getTable/{persistentCode}")
    public ResultVO getTable(@PathVariable("persistentCode") String persistentCode) {
        return ResultVO.success(formAndTableControllerAssembler.dtoToVo(tableAndFormService.getTable(persistentCode)));
    }

    @Operation(summary = "获取表单")
    @GetMapping(value = "getForm/{persistentCode}")
    public ResultVO getForm(@PathVariable("persistentCode") String persistentCode) {
        return ResultVO.success(formAndTableControllerAssembler.dtoToVo(tableAndFormService.getForm(persistentCode)));
    }

}
