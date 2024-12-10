package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentControllerConverter;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentService;
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
@RequestMapping("entityCreateApi/Persistent")
@Tag(name = "Persistent")
public class PersistentController implements BeanController<PersistentVo> {

    private PersistentService service;

    private PersistentControllerConverter converter;

    private PersistentControllerAssembler assembler;

    @Autowired
    public void setService(PersistentService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "实体_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody PersistentVo vo) {
        IPage<PersistentVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getPersistentName()).value(valueEnum.getId()).build()).toList()));
    }

}