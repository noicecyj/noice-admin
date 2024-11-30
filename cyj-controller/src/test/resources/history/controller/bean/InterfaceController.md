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

