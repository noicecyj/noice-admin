package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentPropertyControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentPropertyControllerConverter;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/PersistentProperty")
@Tag(name = "PersistentProperty")
public class PersistentPropertyController implements BeanController<PersistentPropertyVo> {

    private PersistentPropertyService service;

    private PersistentPropertyControllerConverter converter;

    private PersistentPropertyControllerAssembler assembler;

    @Autowired
    public void setService(PersistentPropertyService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentPropertyControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体属性_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体属性_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体属性_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体属性_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体属性_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体属性_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "实体属性_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getPersistentPropertyName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "实体属性_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody PersistentPropertyVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(PersistentPropertyVo::getId, option -> Collections.singletonMap("text", option.getPersistentPropertyName()))));
    }

}