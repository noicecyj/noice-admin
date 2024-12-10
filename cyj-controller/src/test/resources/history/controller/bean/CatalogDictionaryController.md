## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController extends BaseBeanControllerImpl<CatalogDictionaryService, CatalogDictionaryServiceConverter, CatalogDictionaryPo, CatalogDictionaryDto, CatalogDictionaryVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 12:35:28 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    //******************************代码生成方法，请勿改动*************************************//

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(@RequestBody String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(@RequestBody List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(@RequestBody String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-10-18 23:25:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
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
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
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
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-20 20:01:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-01 09:44:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-04 08:59:02 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "目录字典_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getCatalogDictionaryName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "目录字典_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(CatalogDictionaryVo::getId, option -> Collections.singletonMap("text", option.getCatalogDictionaryName()))));
    }

}
```

## 2024-12-06 21:52:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "目录字典_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(CatalogDictionaryVo::getId, option -> Collections.singletonMap("text", option.getCatalogDictionaryName()))));
    }

    @Operation(summary = "目录字典_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getCatalogDictionaryName()).value(valueEnum.getId()).build()).toList());
    }

}
```

## 2024-12-10 14:32:43 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "目录字典_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(CatalogDictionaryVo::getId, option -> Collections.singletonMap("text", option.getCatalogDictionaryName()))));
    }

    @Operation(summary = "目录字典_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody CatalogDictionaryVo vo) {
        IPage<CatalogDictionaryVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getCatalogDictionaryName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-10 14:34:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogDictionaryControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogDictionaryControllerConverter;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogDictionaryService;
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
@RequestMapping("dictionaryApi/CatalogDictionary")
@Tag(name = "CatalogDictionary")
public class CatalogDictionaryController implements BeanController<CatalogDictionaryVo> {

    private CatalogDictionaryService service;

    private CatalogDictionaryControllerConverter converter;

    private CatalogDictionaryControllerAssembler assembler;

    @Autowired
    public void setService(CatalogDictionaryService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogDictionaryControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录字典_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录字典_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录字典_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录字典_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录字典_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogDictionaryVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "目录字典_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody CatalogDictionaryVo vo) {
        IPage<CatalogDictionaryVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getCatalogDictionaryName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

