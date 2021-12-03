package com.example.cyjlog.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjlog.entity.po.ServerPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
@Tag(name = "服务相关接口")
public interface ServerController {

        @Operation(summary = "查询所有Server")
        @InterFaceMapping(api = "logApi")
        @PostMapping(value = "serverPage")
        ResultVO serverFindAll(@RequestParam("pageNumber") Integer pageNumber,
                               @RequestParam("pageSize") Integer pageSize,
                               @RequestParam("sortCode") String sortCode);

        @Operation(summary = "保存Server")
        @InterFaceMapping(api = "logApi")
        @PostMapping(value = "serverSave")
        ResultVO serverSave(@RequestBody ServerPO po);

        @Operation(summary = "保存Server")
        @InterFaceMapping(api = "logApi")
        @PostMapping(value = "serverDelete")
        void serverDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询Server")
        @InterFaceMapping(api = "logApi")
        @PostMapping(value = "findServerById")
        ResultVO findServerById(@RequestParam("id") String id);

}
