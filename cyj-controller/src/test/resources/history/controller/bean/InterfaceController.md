## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-18 23:25:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
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
    public ResultVO update(@RequestBody InterfaceVo vo) {
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
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-20 20:01:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-01 09:44:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-04 08:59:02 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody InterfaceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(InterfaceVo::getId, option -> Collections.singletonMap("text", option.getInterfaceName()))));
    }

}
```

## 2024-12-06 21:52:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody InterfaceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(InterfaceVo::getId, option -> Collections.singletonMap("text", option.getInterfaceName()))));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList());
    }

}
```

## 2024-12-10 14:32:44 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody InterfaceVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(InterfaceVo::getId, option -> Collections.singletonMap("text", option.getInterfaceName()))));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-10 14:34:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-13 01:24:54 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-13 15:48:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestParam @NotNull String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestParam @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-22 20:39:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import noice.assembler.bean.InterfaceControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.InterfaceControllerConverter;
import noice.entity.vo.bean.InterfaceVo;
import noice.handler.bean.BeanController;
import noice.service.bean.InterfaceService;
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
@RequestMapping("entityCreateApi/Interface")
@Tag(name = "Interface")
public class InterfaceController implements BeanController<InterfaceVo> {

    private InterfaceService service;

    private InterfaceControllerConverter converter;

    private InterfaceControllerAssembler assembler;

    @Autowired
    public void setService(InterfaceService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(InterfaceControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "接口_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "接口_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "接口_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestParam("id") @NotNull String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "接口_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "接口_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody InterfaceVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "接口_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody InterfaceVo vo) {
        IPage<InterfaceVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getInterfaceName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

