package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.RoleControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.RoleControllerConverter;
import noice.entity.vo.bean.RoleVo;
import noice.handler.bean.BeanController;
import noice.service.bean.RoleService;
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
@RequestMapping("userApi/Role")
@Tag(name = "Role")
public class RoleController implements BeanController<RoleVo> {

    private RoleService service;

    private RoleControllerConverter converter;

    private RoleControllerAssembler assembler;

    @Autowired
    public void setService(RoleService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(RoleControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "角色_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody RoleVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "角色_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "角色_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody RoleVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "角色_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "角色_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "角色_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody RoleVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "UserIds查询")
    @PostMapping(value = "getListByUserIds")
    public ResultVO getListByUserIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByUserIds(ids)));
    }

    @Operation(summary = "AuthorityIds查询")
    @PostMapping(value = "getListByAuthorityIds")
    public ResultVO getListByAuthorityIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByAuthorityIds(ids)));
    }

    @Operation(summary = "角色_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody RoleVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(RoleVo::getId, option -> Collections.singletonMap("text", option.getRoleName()))));
    }

    @Operation(summary = "角色_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody RoleVo vo) {
        IPage<RoleVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getRoleName()).value(valueEnum.getId()).build()).toList()));
    }

}