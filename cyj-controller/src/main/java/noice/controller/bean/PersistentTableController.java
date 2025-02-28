package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.PersistentTableControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentTableControllerConverter;
import noice.entity.vo.bean.PersistentTableVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentTableService;
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
@RequestMapping("entityCreateApi/PersistentTable")
@Tag(name = "PersistentTable")
public class PersistentTableController implements BeanController<PersistentTableVo> {

    private PersistentTableService service;

    private PersistentTableControllerConverter converter;

    private PersistentTableControllerAssembler assembler;

    @Autowired
    public void setService(PersistentTableService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentTableControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表格_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentTableVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表格_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表格_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentTableVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表格_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表格_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表格_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentTableVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}