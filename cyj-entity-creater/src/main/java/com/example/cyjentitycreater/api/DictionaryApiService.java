package com.example.cyjentitycreater.api;


import com.example.cyjentitycreater.entity.custom.dto.DictionaryDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Component
@FeignClient(name = "cyj-dictionary")
public interface DictionaryApiService {

        @Operation(summary = "根据目录名称查询字典")
        @PostMapping(value = "/dictionaryApi/findCatalogByName")
        List<DictionaryDTO> findCatalogByName(@RequestParam("name") String name);

        @Operation(summary = "根据目录值查询字典")
        @PostMapping(value = "/dictionaryApi/findCatalogByValue")
        List<DictionaryDTO> findCatalogByValue(@RequestParam("value") String value);

        @Operation(summary = "根据目录值查询字典")
        @PostMapping(value = "/dictionaryApi/findDictionaryByCatalogValueAndDictionaryKey")
        DictionaryDTO findDictionaryByCatalogValueAndDictionaryKey(@RequestParam("value") String value,
                                                                   @RequestParam("key") String key);

        @Operation(summary = "根据目录值查询字典")
        @PostMapping(value = "/dictionaryApi/findDictionaryByCatalogValueAndDictionaryValue")
        DictionaryDTO findDictionaryByCatalogValueAndDictionaryValue(@RequestParam("value") String value,
                                                                     @RequestParam("value2") String value2);

}
