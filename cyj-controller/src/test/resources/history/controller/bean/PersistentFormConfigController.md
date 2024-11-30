## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.common.annotation.AuthHandler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormConfigConverter;
import noice.service.bean.PersistentFormConfigService;
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
@RequestMapping("entityCreateApi/PersistentFormConfig")
@Tag(name = "PersistentFormConfig")
public class PersistentFormConfigController extends BaseBeanControllerImpl<PersistentFormConfigService, PersistentFormConfigConverter, PersistentFormConfigPo, PersistentFormConfigDto, PersistentFormConfigVo> {

    //******************************代码生成方法，请勿改动*************************************//

    @Operation(summary = "分页查询所有")
    @AuthHandler(authPath = "page")
    @PostMapping(value = "page")
    public ResultVO page(@RequestBody PersistentFormConfigVo vo) {
        return ResultVO.success(getBaseService().findPage(getBaseConverter().voToDto(vo)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-10-18 23:25:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormConfigControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormConfigControllerConverter;
import noice.entity.vo.bean.PersistentFormConfigVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormConfigService;
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
@RequestMapping("entityCreateApi/PersistentFormConfig")
@Tag(name = "PersistentFormConfig")
public class PersistentFormConfigController implements BeanController<PersistentFormConfigVo> {

    private PersistentFormConfigService service;

    private PersistentFormConfigControllerConverter converter;

    private PersistentFormConfigControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormConfigService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormConfigControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormConfigControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormConfigVo vo) {
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
    public ResultVO update(@RequestBody PersistentFormConfigVo vo) {
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
    public ResultVO page(@RequestBody PersistentFormConfigVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

## 2024-10-20 20:01:16 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.controller.bean;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentFormConfigControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentFormConfigControllerConverter;
import noice.entity.vo.bean.PersistentFormConfigVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentFormConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("entityCreateApi/PersistentFormConfig")
@Tag(name = "PersistentFormConfig")
public class PersistentFormConfigController implements BeanController<PersistentFormConfigVo> {

    private PersistentFormConfigService service;

    private PersistentFormConfigControllerConverter converter;

    private PersistentFormConfigControllerAssembler assembler;

    @Autowired
    public void setService(PersistentFormConfigService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentFormConfigControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormConfigControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表单配置_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentFormConfigVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单配置_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表单配置_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentFormConfigVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表单配置_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表单配置_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表单配置_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentFormConfigVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

}
```

