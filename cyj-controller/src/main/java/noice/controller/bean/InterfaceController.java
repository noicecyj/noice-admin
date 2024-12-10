package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}