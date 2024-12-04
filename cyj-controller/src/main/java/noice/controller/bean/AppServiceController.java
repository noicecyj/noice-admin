package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.AppServiceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.AppServiceControllerConverter;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.AppServiceService;
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
@RequestMapping("entityCreateApi/AppService")
@Tag(name = "AppService")
public class AppServiceController implements BeanController<AppServiceVo> {

    private AppServiceService service;

    private AppServiceControllerConverter converter;

    private AppServiceControllerAssembler assembler;

    @Autowired
    public void setService(AppServiceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(AppServiceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "服务_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody AppServiceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "服务_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "服务_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody AppServiceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "服务_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "服务_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "服务_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody AppServiceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "服务_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody AppServiceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(AppServiceVo::getId, option -> Collections.singletonMap("text", option.getAppServiceName()))));
    }

    @Operation(summary = "服务_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody AppServiceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getAppServiceName()).value(valueEnum.getId()).build()).toList());
    }

}