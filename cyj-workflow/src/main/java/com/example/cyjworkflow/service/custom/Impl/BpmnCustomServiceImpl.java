package com.example.cyjworkflow.service.custom.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.custom.BpmnCustomService;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.backoff.ExponentialBackoffStrategy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BpmnCustomServiceImpl extends BaseService implements BpmnCustomService {

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8060/engine-rest")
                // long polling timeout
                .asyncResponseTimeout(10000)
                .backoffStrategy(new ExponentialBackoffStrategy(0, 0, 0))
                .build();

        // subscribe to an external task topic as specified in the process
        client.subscribe("charge_card")
                // the default lock duration is 20 seconds, but you can override this
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    // Put your business logic here

                    // Complete the task
                    externalTaskService.complete(externalTask);
                })
                .open();
    }

}
