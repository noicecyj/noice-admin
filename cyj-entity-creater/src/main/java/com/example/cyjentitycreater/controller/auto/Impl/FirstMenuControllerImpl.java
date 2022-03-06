package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.FirstMenuController;
import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import com.example.cyjentitycreater.service.auto.FirstMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
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
    public ResultVO firstMenuSave(FirstMenuPO po) {
        if (po.getId() == null) {
            return ResultVO.success(firstMenuService.addOne(po));
        }
        return ResultVO.success(firstMenuService.updateOne(po));
    }

    @Override
    public void firstMenuDelete(String id) {
        firstMenuService.deleteOne(id);
    }

    @Override
    public ResultVO findFirstMenuById(String id) {
        return ResultVO.success(firstMenuService.findOneById(id));
    }

}
