package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.RoleControllerAssembler;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ResultVO delete(@RequestParam("id") @NotNull String id) {
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
    public ResultVO get(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "角色_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
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
    public ResultVO getListByUserIds(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByUserIds(ids)));
    }

    @Operation(summary = "AuthorityIds查询")
    @PostMapping(value = "getListByAuthorityIds")
    public ResultVO getListByAuthorityIds(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByAuthorityIds(ids)));
    }

}