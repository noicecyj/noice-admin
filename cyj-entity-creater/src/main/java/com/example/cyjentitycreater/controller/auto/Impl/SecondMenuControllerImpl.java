package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.FirstMenu;
import com.example.cyjcommon.entity.SecondMenu;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.SecondMenuController;
import com.example.cyjentitycreater.service.auto.SecondMenuService;
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
public class SecondMenuControllerImpl implements SecondMenuController {

    private SecondMenuService secondMenuService;

    @Autowired
    public void setSecondMenuService(SecondMenuService secondMenuService) {
        this.secondMenuService = secondMenuService;
    }

    @Override
    public ResultVO secondMenuPage(Integer pageNumber, FirstMenu firstMenu) {
        return ResultVO.success(secondMenuService.findAll(pageNumber, firstMenu));
    }

    @Override
    public ResultVO secondMenuSave(SecondMenu po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(secondMenuService.addOne(po));
        }
        return ResultVO.success(secondMenuService.updateOne(po));
    }

    @Override
    public ResultVO secondMenuDelete(SecondMenu po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        secondMenuService.deleteOne(po);
        return ResultVO.success();
    }

}
