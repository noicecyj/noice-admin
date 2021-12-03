package com.example.cyjdictionary.service;

import com.example.cyjdictionary.entity.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
public interface DictionaryService {

        @Operation(summary = "添加实体")
        DictionaryPO addOne(DictionaryPO po);

        @Operation(summary = "删除实体")
        void deleteOne(String id);

        @Operation(summary = "更新实体")
        DictionaryPO updateOne(DictionaryPO po);

        @Operation(summary = "查找所有实体(分页排序)")
        Page<DictionaryPO> findAll(String id, Integer pageNumber, Integer pageSize, String sortCode);

        @Operation(summary = "查找实体列表")
        List<DictionaryPO> findListById(String id);

        @Operation(summary = "查找实体")
        DictionaryPO findOneById(String id);

}
