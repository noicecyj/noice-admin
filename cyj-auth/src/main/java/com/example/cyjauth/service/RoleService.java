package com.example.cyjauth.service;

import com.example.cyjauth.entity.po.RolePO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
public interface RoleService {

        @Operation(summary = "添加实体")
        RolePO addOne(RolePO po);

        @Operation(summary = "删除实体")
        void deleteOne(String id);

        @Operation(summary = "更新实体")
        RolePO updateOne(RolePO po);

        @Operation(summary = "查找所有实体(分页排序)")
        Page<RolePO> findAll(Integer pageNumber, Integer pageSize, String sortCode);

        @Operation(summary = "查找实体")
        RolePO findOneById(String id);

}
