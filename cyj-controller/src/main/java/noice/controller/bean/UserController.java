package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.UserControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.UserControllerConverter;
import noice.entity.vo.bean.UserVo;
import noice.handler.bean.BeanController;
import noice.service.bean.UserService;
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
@RequestMapping("userApi/User")
@Tag(name = "User")
public class UserController implements BeanController<UserVo> {

    private UserService service;

    private UserControllerConverter converter;

    private UserControllerAssembler assembler;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(UserControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "用户_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody UserVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "用户_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "用户_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody UserVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "用户_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "用户_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "用户_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody UserVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "RoleIds查询")
    @PostMapping(value = "getListByRoleIds")
    public ResultVO getListByRoleIds(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}