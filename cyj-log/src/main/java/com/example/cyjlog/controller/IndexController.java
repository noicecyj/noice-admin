package com.example.cyjlog.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjlog.entity.po.LogPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Tag(name = "自定义相关接口")
public interface IndexController {

    @Operation(summary = "根据端口查询日志")
    @InterFaceMapping(api = "logApi")
    @PostMapping(value = "findLogsByPort")
    List<LogPO> findLogsByPort(@RequestParam("port") String port);

    @Operation(summary = "根据端口查询日志文件")
    @InterFaceMapping(api = "logApi")
    @PostMapping(value = "findLogsByFile")
    String findLogsByFile(@RequestParam("port") String port);

    @Operation(summary = "根据服务查询日志")
    @InterFaceMapping(api = "logApi")
    @PostMapping(value = "findLogsByName")
    List<LogPO> findLogsByName(@RequestParam("name") String name);

    @Operation(summary = "查询所有Server")
    @InterFaceMapping(api = "logApi")
    @PostMapping(value = "findLogsByPortAndTime")
    List<LogPO> findLogsByPortAndTime(@RequestParam("port") String port,
                                      @RequestParam("time1") String time1,
                                      @RequestParam("time2") String time2);

    @Operation(summary = "查询所有Server")
    @InterFaceMapping(api = "logApi")
    @PostMapping(value = "deleteLogsByPort")
    void deleteLogsByPort(@RequestParam("port") String port);

}
