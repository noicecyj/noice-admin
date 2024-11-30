## 2024-03-17 12:51:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.relation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.relation.UserRoleControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.relation.UserRoleControllerConverter;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.relation.RelationController;
import noice.service.relation.UserRoleService;
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
@RequestMapping("userApi/UserRole")
@Tag(name = "UserRole")
public class UserRoleController implements RelationController<UserRoleVo> {
    //******************************代码生成方法，请勿改动*************************************//

    private UserRoleService service;

    private UserRoleControllerConverter converter;

    private UserRoleControllerAssembler assembler;

    @Autowired
    public void setService(UserRoleService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(UserRoleControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserRoleControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody UserRoleVo vo) {
        return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));
    }

    @Operation(summary = "保存")
    @PostMapping(value = "set")
    @Override
    public ResultVO set(List<String> ids, List<UserRoleVo> voList) {
        service.set(ids, converter.voListToDtoList(voList));
        return ResultVO.success();
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-10-19 07:16:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.relation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.relation.UserRoleControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.relation.UserRoleControllerConverter;
import noice.entity.vo.relation.UserRoleVo;
import noice.handler.relation.RelationController;
import noice.service.relation.UserRoleService;
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
@RequestMapping("userApi/UserRole")
@Tag(name = "UserRole")
public class UserRoleController implements RelationController<UserRoleVo> {

    private UserRoleService service;

    private UserRoleControllerConverter converter;

    private UserRoleControllerAssembler assembler;

    @Autowired
    public void setService(UserRoleService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(UserRoleControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserRoleControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "保存")
    @PostMapping(value = "set")
    @Override
    public ResultVO set(@RequestBody List<String> ids, @RequestBody List<UserRoleVo> voList) {
        service.set(ids, converter.voListToDtoList(voList));
        return ResultVO.success();
    }

    @Operation(summary = "查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody UserRoleVo vo) {
        return ResultVO.success(assembler.dtoToVo(service.get(converter.voToDto(vo))));
    }

}
```

