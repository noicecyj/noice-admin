## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.UserServiceConverter;
import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.entity.vo.bean.UserVo;
import noice.service.bean.UserService;
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
@RequestMapping("userApi/User")
@Tag(name = "User")
public class UserController extends BaseBeanControllerImpl<UserService, UserServiceConverter, UserPo, UserDto, UserVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody UserVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 12:35:29 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-09-22 12:45:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody UserVo vo) {
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
    public ResultVO update(@RequestBody UserVo vo) {
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
    public ResultVO page(@RequestBody UserVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "roleIds查询")
    @PostMapping(value = "getListByRoleIds")
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}
```

## 2024-10-18 23:25:28 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody UserVo vo) {
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
    public ResultVO update(@RequestBody UserVo vo) {
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
    public ResultVO page(@RequestBody UserVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "RoleIds查询")
    @PostMapping(value = "getListByRoleIds")
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}
```

## 2024-10-20 20:01:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.UserControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.UserControllerConverter;
import noice.entity.vo.bean.UserVo;
import noice.handler.bean.BeanController;
import noice.service.bean.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResultVO delete(String id) {
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
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "用户_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
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
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}
```

## 2024-12-01 09:44:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
    public ResultVO delete(String id) {
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
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "用户_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
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
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

}
```

## 2024-12-04 08:59:03 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.UserControllerAssembler;
import noice.common.entity.vo.OptionVO;
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
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    public ResultVO delete(String id) {
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
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "用户_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
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
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

    @Operation(summary = "用户_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody UserVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getUserName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "用户_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody UserVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(UserVo::getId, option -> Collections.singletonMap("text", option.getUserName()))));
    }

}
```

## 2024-12-06 21:52:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.UserControllerAssembler;
import noice.common.entity.vo.OptionVO;
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
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    public ResultVO delete(String id) {
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
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "用户_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
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
    public ResultVO getListByRoleIds(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findListByRoleIds(ids)));
    }

    @Operation(summary = "用户_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody UserVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(UserVo::getId, option -> Collections.singletonMap("text", option.getUserName()))));
    }

    @Operation(summary = "用户_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody UserVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getUserName()).value(valueEnum.getId()).build()).toList());
    }

}
```

