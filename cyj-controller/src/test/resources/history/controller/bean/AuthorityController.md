## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.vo.bean.AuthorityVo;
import noice.service.bean.AuthorityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("userApi/Authority")
@Tag(name = "Authority")
public class AuthorityController extends BaseBeanControllerImpl<AuthorityService, AuthorityServiceConverter, AuthorityPo, AuthorityDto, AuthorityVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody AuthorityVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 12:35:28 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-09-22 13:32:11 noice 作者大大 曹元杰 天才 笔记本

```java
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-18 23:25:15 noice 作者大大 曹元杰 天才 笔记本

```java
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody AuthorityVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "分页查询所有")
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
```

## 2024-10-20 20:01:11 noice 作者大大 曹元杰 天才 笔记本

```java
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
import org.springframework.web.bind.annotation.*;

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
```

## 2024-12-01 09:44:13 noice 作者大大 曹元杰 天才 笔记本

```java
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
```
