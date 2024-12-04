package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.EnterpriseControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.EnterpriseControllerConverter;
import noice.entity.vo.bean.EnterpriseVo;
import noice.handler.bean.BeanController;
import noice.service.bean.EnterpriseService;
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
@RequestMapping("userApi/Enterprise")
@Tag(name = "Enterprise")
public class EnterpriseController implements BeanController<EnterpriseVo> {

    private EnterpriseService service;

    private EnterpriseControllerConverter converter;

    private EnterpriseControllerAssembler assembler;

    @Autowired
    public void setService(EnterpriseService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(EnterpriseControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "企业_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody EnterpriseVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "企业_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "企业_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody EnterpriseVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "企业_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "企业_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "企业_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody EnterpriseVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "企业_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody EnterpriseVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(EnterpriseVo::getId, option -> Collections.singletonMap("text", option.getEnterpriseName()))));
    }

    @Operation(summary = "企业_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody EnterpriseVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getEnterpriseName()).value(valueEnum.getId()).build()).toList());
    }

}