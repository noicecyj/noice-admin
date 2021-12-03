package com.example.cyjauth.service;


import com.example.cyjauth.entity.po.UserPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
public interface UserService {

        @Operation(summary = "添加实体")
        UserPO addOne(UserPO po);

        @Operation(summary = "删除实体")
        void deleteOne(String id);

        @Operation(summary = "更新实体")
        UserPO updateOne(UserPO po);

        @Operation(summary = "查找所有实体(分页排序)")
        Page<UserPO> findAll(Integer pageNumber, Integer pageSize, String sortCode);

        @Operation(summary = "查找实体")
        UserPO findOneById(String id);

}
