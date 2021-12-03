package com.example.cyjlog.controller.Impl;

import com.example.cyjlog.controller.IndexController;
import com.example.cyjlog.entity.po.LogPO;
import com.example.cyjlog.service.Impl.IndexServiceImpl;
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
@RequestMapping(value = "logApi")
public class IndexControllerImpl implements IndexController {

        private IndexServiceImpl logService;

        @Autowired
        public void setLogService(IndexServiceImpl logService) {
                this.logService = logService;
        }

        @Override
        public List<LogPO> findLogsByPort(@RequestParam("port") String port) {
                return logService.findLogsByPort(port);
        }

        @Override
        public String findLogsByFile(@RequestParam("serverName") String serverName) {
                return logService.findLogsByFile(serverName);
        }

        @Override
        public List<LogPO> findLogsByName(@RequestParam("name") String name) {
                return logService.findLogsByName(name);
        }

        @Override
        public List<LogPO> findLogsByPortAndTime(@RequestParam("port") String port,
                                                 @RequestParam("time1") String time1,
                                                 @RequestParam("time2") String time2) {
                return logService.findLogsByPortAndTime(port, time1, time2);
        }

        @Override
        public void deleteLogsByPort(@RequestParam("port") String port) {
                logService.deleteLogsByPort(port);
        }

}
