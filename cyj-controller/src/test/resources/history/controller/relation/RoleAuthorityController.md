## 2024-03-17 12:51:56 noice 作者大大 曹元杰 天才 笔记本

```java
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

    //******************************代码生成方法，请勿改动*************************************//

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

    @Operation(summary = "查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody RoleAuthorityVo vo) {
        return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));
    }

    @Operation(summary = "保存")
    @PostMapping(value = "set")
    @Override
    public ResultVO set(@RequestBody List<String> ids, @RequestBody List<RoleAuthorityVo> voList) {
        service.set(ids, converter.voListToDtoList(voList));
        return ResultVO.success();
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-10-19 07:16:35 noice 作者大大 曹元杰 天才 笔记本

```java
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

    @Operation(summary = "保存")
    @PostMapping(value = "set")
    @Override
    public ResultVO set(@RequestBody List<String> ids, @RequestBody List<RoleAuthorityVo> voList) {
        service.set(ids, converter.voListToDtoList(voList));
        return ResultVO.success();
    }

    @Operation(summary = "查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody RoleAuthorityVo vo) {
        return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));
    }

}
```

