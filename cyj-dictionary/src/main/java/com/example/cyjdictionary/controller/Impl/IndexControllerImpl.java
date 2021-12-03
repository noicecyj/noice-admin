package com.example.cyjdictionary.controller.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.IndexController;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import com.example.cyjdictionary.service.Impl.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class IndexControllerImpl implements IndexController {

        private IndexServiceImpl indexService;

        @Autowired
        public void setIndexService(IndexServiceImpl indexService) {
                this.indexService = indexService;
        }

        @Override
        public List<DictionaryPO> findCatalogByName(@RequestParam("name") String name) {
                return indexService.findCatalogByName(name);
        }

        @Override
        public List<DictionaryPO> findCatalogByValue(@RequestParam("value") String value) {
                return indexService.findCatalogByValue(value);
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(@RequestParam("value") String value,
                                                                         @RequestParam("key") String key) {
                return indexService.findDictionaryByCatalogValueAndDictionaryKey(value, key);
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(@RequestParam("value") String value,
                                                                           @RequestParam("value2") String value2) {
                return indexService.findDictionaryByCatalogValueAndDictionaryValue(value, value2);
        }

        @Override
        public ResultVO findAllByCatalogNameContainsOrCatalogValueContains(@RequestParam("catalogName") String catalogName,
                                                                           @RequestParam("catalogValue") String catalogValue,
                                                                           @RequestParam("pageNumber") Integer pageNumber,
                                                                           @RequestParam("pageSize") Integer pageSize,
                                                                           @RequestParam("sortCode") String sortCode) {
                return ResultVO.success(indexService
                        .findAllByCatalogNameContainsOrCatalogValueContains(catalogName, catalogValue, pageNumber - 1, pageSize, sortCode));
        }

}
