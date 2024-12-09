package noice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.TableAndFormAndUrlControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.service.TableAndFormAndUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/TableAndFormAndUrl")
@Tag(name = "TableAndFormAndUrl", description = "表单和表格相关接口")
public class TableAndFormAndUrlController {


    private TableAndFormAndUrlService tableAndFormAndUrlService;

    private TableAndFormAndUrlControllerAssembler tableAndFormAndUrlControllerAssembler;

    @Autowired
    public void setTableAndFormAndUrlService(TableAndFormAndUrlService tableAndFormAndUrlService) {
        this.tableAndFormAndUrlService = tableAndFormAndUrlService;
    }

    @Autowired
    public void setTableAndFormAndUrlControllerAssembler(TableAndFormAndUrlControllerAssembler tableAndFormAndUrlControllerAssembler) {
        this.tableAndFormAndUrlControllerAssembler = tableAndFormAndUrlControllerAssembler;
    }

    @Operation(summary = "获取表格")
    @GetMapping(value = "getTable/{persistentCode}")
    public ResultVO getTable(@PathVariable("persistentCode") String persistentCode) {
        return ResultVO.success(tableAndFormAndUrlControllerAssembler.dtoToVo(tableAndFormAndUrlService.getTable(persistentCode)));
    }

    @Operation(summary = "获取表单")
    @GetMapping(value = "getForm/{persistentCode}")
    public ResultVO getForm(@PathVariable("persistentCode") String persistentCode) {
        return ResultVO.success(tableAndFormAndUrlControllerAssembler.dtoToVo(tableAndFormAndUrlService.getForm(persistentCode)));
    }

    @Operation(summary = "获取接口")
    @GetMapping(value = "getUrl/{persistentCode}")
    public ResultVO getUrl(@PathVariable("persistentCode") String persistentCode) {
        return ResultVO.success(tableAndFormAndUrlControllerAssembler.dtoUrlListToVoUrlList(tableAndFormAndUrlService.getUrl(persistentCode)));
    }

}
