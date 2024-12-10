## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.entity.vo.bean.RoleVo;
import noice.service.bean.RoleService;
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
@RequestMapping("userApi/Role")
@Tag(name = "Role")
public class RoleController extends BaseBeanControllerImpl<RoleService, RoleServiceConverter, RolePo, RoleDto, RoleVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody RoleVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 12:35:29 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-09-22 13:32:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody RoleVo vo) {
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
    public ResultVO update(@RequestBody RoleVo vo) {
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
    public ResultVO page(@RequestBody RoleVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-18 23:25:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody RoleVo vo) {
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
    public ResultVO update(@RequestBody RoleVo vo) {
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

}
```

## 2024-10-20 20:01:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.RoleControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.RoleControllerConverter;
import noice.entity.vo.bean.RoleVo;
import noice.handler.bean.BeanController;
import noice.service.bean.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
```

## 2024-12-01 09:44:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

}
```

## 2024-12-04 08:59:03 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

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
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getRoleName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "角色_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody RoleVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(RoleVo::getId, option -> Collections.singletonMap("text", option.getRoleName()))));
    }

}
```

## 2024-12-06 21:52:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

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
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getRoleName()).value(valueEnum.getId()).build()).toList());
    }

}
```

## 2024-12-10 14:32:49 noice 作者大大 曹元杰 天才 笔记本

```java
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
```

## 2024-12-10 14:34:42 noice 作者大大 曹元杰 天才 笔记本

```java
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

    @Operation(summary = "角色_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody RoleVo vo) {
        IPage<RoleVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getRoleName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

