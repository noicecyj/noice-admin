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