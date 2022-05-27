package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowUserPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowUserService {

    FlowUserPO addOne(FlowUserPO po);

    void deleteOne(FlowUserPO po);

    FlowUserPO updateOne(FlowUserPO po);

    Page<FlowUserPO> findAll(Integer pageNumber);

}
