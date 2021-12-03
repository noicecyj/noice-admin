package com.example.cyjdictionary.controller.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjcommon.utils.VoPoConverter;
import com.example.cyjdictionary.controller.DictionaryController;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import com.example.cyjdictionary.service.Impl.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class DictionaryControllerImpl implements DictionaryController {

        private DictionaryServiceImpl dictionaryService;

        @Autowired
        public void setDictionaryService(DictionaryServiceImpl dictionaryService) {
                this.dictionaryService = dictionaryService;
        }

        @Override
        public ResultVO dictionaryFindAll(String id, Integer pageNumber, Integer pageSize, String sortCode) {
                return ResultVO.success(dictionaryService.findAll(id, pageNumber, pageSize, sortCode));
        }

        @Override
        public ResultVO dictionarySave(Map<String, Object> vo) {
                DictionaryPO po = new DictionaryPO();
                VoPoConverter.copyProperties(vo, po);
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
