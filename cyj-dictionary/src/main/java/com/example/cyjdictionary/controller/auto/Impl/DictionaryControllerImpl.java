package com.example.cyjdictionary.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.auto.DictionaryController;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.example.cyjdictionary.service.auto.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class DictionaryControllerImpl implements DictionaryController {

    private DictionaryService dictionaryService;

    @Autowired
    public void setDictionaryService(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @Override
    public ResultVO dictionaryPage(Integer pageNumber, String pid) {
        return ResultVO.success(dictionaryService.findAll(pageNumber, pid));
    }

    @Override
    public ResultVO dictionarySave(DictionaryPO po) {
        if (po.getId() == null) {
            return ResultVO.success(dictionaryService.addOne(po));
        }
        return ResultVO.success(dictionaryService.updateOne(po));
    }

    @Override
    public void dictionaryDelete(String id) {
        dictionaryService.deleteOne(id);
    }

    @Override
    public ResultVO findDictionaryById(String id) {
        return ResultVO.success(dictionaryService.findOneById(id));
    }

}
