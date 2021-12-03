package com.example.cyjentitycreater.api;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Component
@FeignClient(name = "cyj-query")
public interface QueryApiService {

        @Operation(summary = "根据表名查询全部")
        @PostMapping(value = "/sqlApi/doFindAllSql")
        Object doFindAllSql(@RequestParam("tableName") String tableName);

        @Operation(summary = "通过主键sql查询")
        @PostMapping(value = "/sqlApi/doFindSqlById")
        Object findSqlById(@RequestParam("tableName") String tableName, @RequestParam("id") String id);

}
