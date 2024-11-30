package noice.controller.relation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.relation.RoleAuthorityControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.relation.RoleAuthorityControllerConverter;
import noice.entity.vo.relation.RoleAuthorityVo;
import noice.handler.relation.RelationController;
import noice.service.relation.RoleAuthorityService;
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
@RequestMapping("userApi/RoleAuthority")
@Tag(name = "RoleAuthority")
public class RoleAuthorityController implements RelationController<RoleAuthorityVo> {

    private RoleAuthorityService service;

    private RoleAuthorityControllerConverter converter;

    private RoleAuthorityControllerAssembler assembler;

    @Autowired
    public void setService(RoleAuthorityService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(RoleAuthorityControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleAuthorityControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "角色权限_保存")
    @PostMapping(value = "set")
    @Override
    public ResultVO set(@RequestBody List<String> ids, @RequestBody List<RoleAuthorityVo> voList) {
        service.set(ids, converter.voListToDtoList(voList));
        return ResultVO.success();
    }

    @Operation(summary = "角色权限_查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody RoleAuthorityVo vo) {
        return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));
    }

}