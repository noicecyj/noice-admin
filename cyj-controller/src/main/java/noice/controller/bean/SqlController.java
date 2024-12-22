package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}