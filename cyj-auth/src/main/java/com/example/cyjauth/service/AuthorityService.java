package com.example.cyjauth.service;

import com.example.cyjauth.entity.po.AuthorityPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public interface AuthorityService {

        @Operation(summary = "添加实体")
        AuthorityPO addOne(AuthorityPO po);

        @Operation(summary = "删除实体")
        void deleteOne(String id);

        @Operation(summary = "更新实体")
        AuthorityPO updateOne(AuthorityPO po);

        @Operation(summary = "查找所有实体(分页排序)")
        Page<AuthorityPO> findAll(Integer pageNumber, Integer pageSize, String sortCode);

        @Operation(summary = "查找实体")
        AuthorityPO findOneById(String id);

}
