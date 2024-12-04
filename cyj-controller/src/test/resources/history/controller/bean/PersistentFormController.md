## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormConverter;
import noice.service.bean.PersistentFormService;
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
@RequestMapping("entityCreateApi/PersistentForm")
@Tag(name = "PersistentForm")
public class PersistentFormController extends BaseBeanControllerImpl<PersistentFormService, PersistentFormConverter, PersistentFormPo, PersistentFormDto, PersistentFormVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-18 23:25:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormControllerConverter;
import noice.entity.vo.bean.PersistentFormVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormService;
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
@RequestMapping("entityCreateApi/PersistentForm")
@Tag(name = "PersistentForm")
public class PersistentFormController implements BeanController<PersistentFormVo> {

    private PersistentFormService service;

    private PersistentFormControllerConverter converter;

    private PersistentFormControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormVo vo) {
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
    public ResultVO update(@RequestBody PersistentFormVo vo) {
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
    public ResultVO page(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-20 20:01:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormControllerConverter;
import noice.entity.vo.bean.PersistentFormVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/PersistentForm")
@Tag(name = "PersistentForm")
public class PersistentFormController implements BeanController<PersistentFormVo> {

    private PersistentFormService service;

    private PersistentFormControllerConverter converter;

    private PersistentFormControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表单_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表单_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表单_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表单_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-01 09:44:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormControllerConverter;
import noice.entity.vo.bean.PersistentFormVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormService;
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
@RequestMapping("entityCreateApi/PersistentForm")
@Tag(name = "PersistentForm")
public class PersistentFormController implements BeanController<PersistentFormVo> {

    private PersistentFormService service;

    private PersistentFormControllerConverter converter;

    private PersistentFormControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表单_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表单_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表单_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表单_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-04 08:59:02 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormControllerConverter;
import noice.entity.vo.bean.PersistentFormVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormService;
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
@RequestMapping("entityCreateApi/PersistentForm")
@Tag(name = "PersistentForm")
public class PersistentFormController implements BeanController<PersistentFormVo> {

    private PersistentFormService service;

    private PersistentFormControllerConverter converter;

    private PersistentFormControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表单_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表单_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表单_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表单_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "实体表单_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getPersistentFormName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "实体表单_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody PersistentFormVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(PersistentFormVo::getId, option -> Collections.singletonMap("text", option.getPersistentFormName()))));
    }

}
```

