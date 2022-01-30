package com.example.cyjdictionary.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-27
 */
@Tag(name = "Dictionary")
public interface DictionaryController {

    @Operation(summary = "查询所有Dictionary")
    @InterFaceMapping(api = "dictionaryApi")
    @PostMapping(value = "dictionaryPage")
    ResultVO dictionaryPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pid") String pid);

    @Operation(summary = "保存Dictionary")
    @InterFaceMapping(api = "dictionaryApi")
    @PostMapping(value = "dictionarySave")
    ResultVO dictionarySave(@RequestBody DictionaryPO po);

    @Operation(summary = "删除Dictionary")
    @InterFaceMapping(api = "dictionaryApi")
    @PostMapping(value = "dictionaryDelete")
    void dictionaryDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Dictionary")
    @InterFaceMapping(api = "dictionaryApi")
    @PostMapping(value = "findDictionaryById")
    ResultVO findDictionaryById(@RequestParam("id") String id);

}
