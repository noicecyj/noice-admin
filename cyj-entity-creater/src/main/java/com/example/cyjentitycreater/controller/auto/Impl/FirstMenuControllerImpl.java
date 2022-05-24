package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.FirstMenuController;
import com.example.cyjentitycreater.service.auto.FirstMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class FirstMenuControllerImpl implements FirstMenuController {

    private FirstMenuService firstMenuService;

    @Autowired
    public void setFirstMenuService(FirstMenuService firstMenuService) {
        this.firstMenuService = firstMenuService;
    }

    @Override
    public ResultVO firstMenuPage(Integer pageNumber) {
        return ResultVO.success(firstMenuService.findAll(pageNumber));
    }

    @Override
    public ResultVO firstMenuSave(FirstMenuPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(firstMenuService.addOne(po));
        }
        return ResultVO.success(firstMenuService.updateOne(po));
    }

    @Override
    public ResultVO firstMenuDelete(FirstMenuPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        firstMenuService.deleteOne(po);
        return ResultVO.success();
    }

}
