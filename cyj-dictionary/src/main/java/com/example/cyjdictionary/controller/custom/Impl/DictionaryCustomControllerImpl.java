package com.example.cyjdictionary.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.custom.DictionaryCustomController;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.example.cyjdictionary.service.auto.CatalogService;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class DictionaryCustomControllerImpl implements DictionaryCustomController {

        private DictionaryCustomService dictionaryCustomService;

        @Autowired
        public void setDictionaryCustomService(DictionaryCustomService dictionaryCustomService) {
                this.dictionaryCustomService = dictionaryCustomService;
        }

        @Override
        public List<DictionaryPO> findCatalogByName(@RequestParam("name") String name) {
                return dictionaryCustomService.findCatalogByName(name);
        }

        @Override
        public List<DictionaryPO> findCatalogByValue(@RequestParam("value") String value) {
                return dictionaryCustomService.findCatalogByValue(value);
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(@RequestParam("value") String value,
                                                                         @RequestParam("key") String key) {
                return dictionaryCustomService.findDictionaryByCatalogValueAndDictionaryKey(value, key);
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(@RequestParam("value") String value,
                                                                           @RequestParam("value2") String value2) {
                return dictionaryCustomService.findDictionaryByCatalogValueAndDictionaryValue(value, value2);
        }



}
