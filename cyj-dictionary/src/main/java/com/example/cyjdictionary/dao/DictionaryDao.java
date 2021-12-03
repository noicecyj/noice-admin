package com.example.cyjdictionary.dao;

import com.example.cyjdictionary.entity.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
public interface DictionaryDao extends JpaRepository<DictionaryPO, String> {

        @Operation(summary = "删除实体")
        void deleteByPid(String pid);

}
