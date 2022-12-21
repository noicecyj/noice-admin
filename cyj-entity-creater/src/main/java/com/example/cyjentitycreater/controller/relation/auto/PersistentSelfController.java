package com.example.cyjentitycreater.controller.relation.auto;

import com.example.cyjcommon.entity.relation.PersistentSelfRelation;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.relation.auto.PersistentSelfServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
@RequestMapping("entityCreateApi")
@Tag(name = "PersistentSelfBean")
public class PersistentSelfController {

    private PersistentSelfServiceImpl service;

    @Autowired
    public void setService(PersistentSelfServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "查询PersistentSelf关联关系")
    @PostMapping("getPersistentSelf")
    public ResultVO getPersistentSelf(@RequestBody @Validated PersistentSelfRelation po) {
        return ResultVO.success(service.getPersistentSelf(po));
    }

    @Operation(summary = "保存PersistentSelf关联关系")
    @PostMapping("setPersistentSelf")
    public ResultVO setPersistentSelf(@RequestBody @Validated PersistentSelfRelation po,
                                     @RequestBody @Validated List<PersistentSelfRelation> poList) {
        service.setPersistentSelf(po, poList);
        return ResultVO.success();
    }

}
