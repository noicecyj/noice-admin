package noice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentControllerConverter;
import noice.converter.bean.PersistentPropertyControllerConverter;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.entity.vo.bean.PersistentVo;
import noice.service.OperateTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("sqlApi/operateTable")
@Tag(name = "OperateTable")
public class OperateTableController {

    private OperateTableService service;

    private PersistentControllerConverter persistentControllerConverter;

    private PersistentPropertyControllerConverter persistentPropertyControllerConverter;

    @Autowired
    public void setService(OperateTableService service) {
        this.service = service;
    }

    @Autowired
    public void setPersistentControllerConverter(PersistentControllerConverter persistentControllerConverter) {
        this.persistentControllerConverter = persistentControllerConverter;
    }

    @Autowired
    public void setPersistentPropertyControllerConverter(PersistentPropertyControllerConverter persistentPropertyControllerConverter) {
        this.persistentPropertyControllerConverter = persistentPropertyControllerConverter;
    }

    @Operation(summary = "查询表")
    @GetMapping(value = "queryTable")
    public ResultVO queryTable() {
        return ResultVO.success();
    }

    @Operation(summary = "创建表")
    @PostMapping(value = "addTable")
    public ResultVO addTable(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.addTable(persistentControllerConverter.voToDto(vo)));
    }

    @Operation(summary = "删除表")
    @PostMapping(value = "dropTable")
    public ResultVO dropTable(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.dropTable(persistentControllerConverter.voToDto(vo)));
    }

    @Operation(summary = "修改表")
    @PostMapping(value = "updateTable")
    public ResultVO updateTable(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.updateTable(persistentControllerConverter.voToDto(vo)));
    }

    @Operation(summary = "创建字段")
    @PostMapping(value = "addColumn")
    public ResultVO addColumn(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.addColumn(persistentPropertyControllerConverter.voToDto(vo)));
    }

    @Operation(summary = "删除字段")
    @PostMapping(value = "dropColumn")
    public ResultVO dropColumn(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.dropColumn(persistentPropertyControllerConverter.voToDto(vo)));
    }

    @Operation(summary = "修改字段")
    @PostMapping(value = "updateColumn")
    public ResultVO updateColumn(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.updateColumn(persistentPropertyControllerConverter.voToDto(vo)));
    }

}
