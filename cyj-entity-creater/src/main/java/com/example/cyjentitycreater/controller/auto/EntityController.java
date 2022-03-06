package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
@Tag(name = "Entity")
public interface EntityController {

    @Operation(summary = "查询所有Entity")
    @PostMapping(value = "entityPage")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pid") String pid);

    @Operation(summary = "保存Entity")
    @PostMapping(value = "entitySave")
    ResultVO entitySave(@RequestBody EntityPO po);

    @Operation(summary = "删除Entity")
    @PostMapping(value = "entityDelete")
    void entityDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Entity")
    @PostMapping(value = "findEntityById")
    ResultVO findEntityById(@RequestParam("id") String id);

}
