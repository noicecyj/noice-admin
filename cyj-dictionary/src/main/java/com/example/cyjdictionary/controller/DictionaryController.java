package com.example.cyjdictionary.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
@Tag(name = "数据目录相关接口")
public interface DictionaryController {

        @Operation(summary = "查询所有Dictionary")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "dictionaryPage")
        ResultVO dictionaryFindAll(@RequestParam("id") String id,
                                   @RequestParam("pageNumber") Integer pageNumber,
                                   @RequestParam("pageSize") Integer pageSize,
                                   @RequestParam("sortCode") String sortCode);

        @Operation(summary = "保存Dictionary")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "dictionarySave")
        ResultVO dictionarySave(@RequestBody Map<String, Object> vo);

        @Operation(summary = "删除Dictionary")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "dictionaryDelete")
        void dictionaryDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询Dictionary")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findDictionaryById")
        ResultVO findDictionaryById(@RequestParam("id") String id);

}
