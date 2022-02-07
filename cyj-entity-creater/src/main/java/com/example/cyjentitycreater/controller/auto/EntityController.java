package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
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
 * @date 2022-02-07
 */
@Tag(name = "Entity")
public interface EntityController {

    @Operation(summary = "查询所有Entity")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "entityPage")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pid") String pid);

    @Operation(summary = "保存Entity")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "entitySave")
    ResultVO entitySave(@RequestBody EntityPO po);

    @Operation(summary = "删除Entity")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "entityDelete")
    void entityDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Entity")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "findEntityById")
    ResultVO findEntityById(@RequestParam("id") String id);

}
