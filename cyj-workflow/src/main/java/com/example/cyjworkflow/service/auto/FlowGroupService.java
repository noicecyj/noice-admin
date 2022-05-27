package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowGroupPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowGroupService {

    FlowGroupPO addOne(FlowGroupPO po);

    void deleteOne(FlowGroupPO po);

    FlowGroupPO updateOne(FlowGroupPO po);

    Page<FlowGroupPO> findAll(Integer pageNumber);

}
