package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.FlowGroup;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowGroupService {

    FlowGroup addOne(FlowGroup po);

    void deleteOne(FlowGroup po);

    FlowGroup updateOne(FlowGroup po);

    Page<FlowGroup> findAll(Integer pageNumber);

}
