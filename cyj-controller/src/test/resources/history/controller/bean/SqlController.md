## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlConverter;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController extends BaseBeanControllerImpl<SqlService, SqlConverter, SqlPo, SqlDto, SqlVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-18 23:25:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
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
    public ResultVO update(@RequestBody SqlVo vo) {
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
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-20 20:01:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-01 09:44:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-12-04 08:59:03 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "查询_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody SqlVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getSqlName()).value(valueEnum.getId()).build()).toList());
    }

    @Operation(summary = "查询_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody SqlVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(SqlVo::getId, option -> Collections.singletonMap("text", option.getSqlName()))));
    }

}
```

## 2024-12-06 21:52:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "查询_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody SqlVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(SqlVo::getId, option -> Collections.singletonMap("text", option.getSqlName()))));
    }

    @Operation(summary = "查询_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody SqlVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getSqlName()).value(valueEnum.getId()).build()).toList());
    }

}
```

## 2024-12-10 14:32:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "查询_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody SqlVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(SqlVo::getId, option -> Collections.singletonMap("text", option.getSqlName()))));
    }

    @Operation(summary = "查询_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody SqlVo vo) {
        IPage<SqlVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getSqlName()).value(valueEnum.getId()).build()).toList()));
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
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "查询_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody SqlVo vo) {
        IPage<SqlVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getSqlName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

## 2024-12-13 01:24:58 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.SqlControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.SqlControllerConverter;
import noice.entity.vo.bean.SqlVo;
import noice.handler.bean.BeanController;
import noice.service.bean.SqlService;
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
@RequestMapping("sqlApi/Sql")
@Tag(name = "Sql")
public class SqlController implements BeanController<SqlVo> {

    private SqlService service;

    private SqlControllerConverter converter;

    private SqlControllerAssembler assembler;

    @Autowired
    public void setService(SqlService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(SqlControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "查询_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody SqlVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "查询_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody SqlVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "查询_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "查询_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "查询_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody SqlVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "查询_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody SqlVo vo) {
        IPage<SqlVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getSqlName()).value(valueEnum.getId()).build()).toList()));
    }

}
```

