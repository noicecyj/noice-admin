package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.FlowUser;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowUserService {

    FlowUser addOne(FlowUser po);

    void deleteOne(FlowUser po);

    FlowUser updateOne(FlowUser po);

    Page<FlowUser> findAll(Integer pageNumber);

}
