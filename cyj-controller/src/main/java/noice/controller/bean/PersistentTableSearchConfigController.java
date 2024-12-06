package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.PersistentTableSearchConfigControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.PersistentTableSearchConfigControllerConverter;
import noice.entity.vo.bean.PersistentTableSearchConfigVo;
import noice.handler.bean.BeanController;
import noice.service.bean.PersistentTableSearchConfigService;
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
@RequestMapping("entityCreateApi/PersistentTableSearchConfig")
@Tag(name = "PersistentTableSearchConfig")
public class PersistentTableSearchConfigController implements BeanController<PersistentTableSearchConfigVo> {

    private PersistentTableSearchConfigService service;

    private PersistentTableSearchConfigControllerConverter converter;

    private PersistentTableSearchConfigControllerAssembler assembler;

    @Autowired
    public void setService(PersistentTableSearchConfigService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "实体表格搜索配置_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody PersistentTableSearchConfigVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表格搜索配置_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "实体表格搜索配置_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody PersistentTableSearchConfigVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "实体表格搜索配置_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "实体表格搜索配置_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "实体表格搜索配置_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody PersistentTableSearchConfigVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "实体表格搜索配置_获取ValueEnum")
    @PostMapping(value = "getValueEnum")
    @Override
    public ResultVO getValueEnum(@RequestBody PersistentTableSearchConfigVo vo) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(converter.voToDto(vo))).stream().collect(Collectors.toMap(PersistentTableSearchConfigVo::getId, option -> Collections.singletonMap("text", option.getPersistentTableSearchConfigName()))));
    }

    @Operation(summary = "实体表格搜索配置_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody PersistentTableSearchConfigVo vo) {
        IPage<PersistentTableSearchConfigVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getPersistentTableSearchConfigName()).value(valueEnum.getId()).build()).toList()));
    }

}