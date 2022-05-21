package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.SecondMenuController;
import com.example.cyjentitycreater.service.auto.SecondMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
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
    public ResultVO secondMenuPage(Integer pageNumber, String pid) {
        return ResultVO.success(secondMenuService.findAll(pageNumber, pid));
    }

    @Override
    public ResultVO secondMenuSave(SecondMenuPO po) {
        if (po.getId() == null) {
            return ResultVO.success(secondMenuService.addOne(po));
        }
        return ResultVO.success(secondMenuService.updateOne(po));
    }

    @Override
    public void secondMenuDelete(String id) {
        secondMenuService.deleteOne(id);
    }

    @Override
    public ResultVO findSecondMenuById(String id) {
        return ResultVO.success(secondMenuService.findOneById(id));
    }

}
