package com.example.cyjentitycreater.api;


import com.alibaba.fastjson.JSONArray;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Component
@FeignClient(name = "cyj-user")
public interface AuthorityApiService {

        @Operation(summary = "自动生成基础表单和基础表格")
        @PostMapping(value = "/pageMenuApi/formAndTableGenerate")
        void formAndTableGenerate(@RequestParam("name") String name, @RequestBody JSONArray jsonArray);

}
