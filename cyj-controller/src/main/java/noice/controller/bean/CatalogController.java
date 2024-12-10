package noice.controller.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.bean.CatalogControllerAssembler;
import noice.common.entity.vo.OptionVO;
import noice.common.entity.vo.ResultVO;
import noice.converter.bean.CatalogControllerConverter;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.bean.BeanController;
import noice.service.bean.CatalogService;
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
@RequestMapping("dictionaryApi/Catalog")
@Tag(name = "Catalog")
public class CatalogController implements BeanController<CatalogVo> {

    private CatalogService service;

    private CatalogControllerConverter converter;

    private CatalogControllerAssembler assembler;

    @Autowired
    public void setService(CatalogService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(CatalogControllerConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogControllerAssembler assembler) {
        this.assembler = assembler;
    }

    @Operation(summary = "目录_添加")
    @PostMapping(value = "add")
    @Override
    public ResultVO add(@RequestBody CatalogVo vo) {
        return ResultVO.success(service.addOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录_删除")
    @PostMapping(value = "delete")
    @Override
    public ResultVO delete(String id) {
        return ResultVO.success(service.deleteOne(id));
    }

    @Operation(summary = "目录_更新")
    @PostMapping(value = "update")
    @Override
    public ResultVO update(@RequestBody CatalogVo vo) {
        return ResultVO.success(service.updateOne(converter.voToDto(vo)));
    }

    @Operation(summary = "目录_id查询")
    @PostMapping(value = "get")
    @Override
    public ResultVO get(String id) {
        return ResultVO.success(assembler.dtoToVo(service.findOne(id)));
    }

    @Operation(summary = "目录_ids查询")
    @PostMapping(value = "getList")
    @Override
    public ResultVO getList(List<String> ids) {
        return ResultVO.success(assembler.dtoListToVoList(service.findList(ids)));
    }

    @Operation(summary = "目录_分页查询所有")
    @PostMapping(value = "page")
    @Override
    public ResultVO page(@RequestBody CatalogVo vo) {
        return ResultVO.success(service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto)));
    }

    @Operation(summary = "目录_获取Options")
    @PostMapping(value = "getOptions")
    @Override
    public ResultVO getOptions(@RequestBody CatalogVo vo) {
        IPage<CatalogVo> convert = service.findPage(converter.voToDto(vo)).convert(dto -> assembler.dtoToVo(dto));
        return ResultVO.success(new Page<OptionVO>(vo.getCurrent(), vo.getPageSize()).setTotal(convert.getTotal()).setRecords(convert.getRecords().stream().map(valueEnum -> OptionVO.builder().label(valueEnum.getCatalogName()).value(valueEnum.getId()).build()).toList()));
    }

}