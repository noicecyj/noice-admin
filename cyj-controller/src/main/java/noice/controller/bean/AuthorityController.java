package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.AuthorityControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.AuthorityControllerConverter;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.bean.BeanController;
import noice.service.bean.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("userApi/Authority")
@Tag(name = "Authority")
public class AuthorityController implements BeanController<AuthorityVo> {

    private AuthorityService service;

    private AuthorityControllerConverter converter;

    private AuthorityControllerAssembler assembler;

    @Autowired
    public void setService(AuthorityService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(AuthorityControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "权限_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "权限_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "权限_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "权限_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "权限_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "权限_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "RoleIds查询")
    @PostMapping(value = "getListByRoleIds")
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}