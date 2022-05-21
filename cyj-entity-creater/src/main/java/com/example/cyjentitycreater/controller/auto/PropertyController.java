package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "Property")
public interface PropertyController {

    @Operation(summary = "查询所有Property")
    @PostMapping(value = "propertyPage")
    ResultVO propertyPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody EntityPO entity);

    @Operation(summary = "保存Property")
    @PostMapping(value = "propertySave")
    ResultVO propertySave(@RequestBody @Validated PropertyPO po, BindingResult bindingResult);

    @Operation(summary = "删除Property")
    @PostMapping(value = "propertyDelete")
    ResultVO propertyDelete(@RequestBody PropertyPO po);

}
