package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.MenuControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.MenuControllerConverter;
import noice.entity.vo.bean.MenuVo;
import noice.handler.bean.BeanController;
import noice.service.bean.MenuService;
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
@RequestMapping("entityCreateApi/Menu")
@Tag(name = "Menu")
public class MenuController implements BeanController<MenuVo> {

    private MenuService service;

    private MenuControllerConverter converter;

    private MenuControllerAssembler assembler;

    @Autowired
    public void setService(MenuService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(MenuControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "菜单_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody MenuVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "菜单_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "菜单_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody MenuVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "菜单_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "菜单_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "菜单_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody MenuVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "菜单_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody MenuVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(MenuVo::getId, option -> Collections.singletonMap("text", option.getMenuName()))));
    }

    @Operation(summary = "菜单_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody MenuVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getMenuName()).value(valueEnum.getId()).build()).toList());
    }

}