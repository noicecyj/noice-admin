package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.PropertyController;
import com.example.cyjentitycreater.service.auto.PropertyService;
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
public class PropertyControllerImpl implements PropertyController {

    private PropertyService propertyService;

    @Autowired
    public void setPropertyService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @Override
    public ResultVO propertyPage(Integer pageNumber) {
        return ResultVO.success(propertyService.findAll(pageNumber));
    }

    @Override
    public ResultVO propertyPage(Integer pageNumber, Persistent persistent) {
        return ResultVO.success(propertyService.findAll(pageNumber, persistent));
    }

    @Override
    public ResultVO propertySave(Property po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(propertyService.addOne(po));
        }
        return ResultVO.success(propertyService.updateOne(po));
    }

    @Override
    public ResultVO propertyDelete(Property po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        propertyService.deleteOne(po);
        return ResultVO.success();
    }

}
