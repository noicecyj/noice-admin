package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 */
public interface RoleService {

    RolePO addOne(RolePO po);

    void deleteOne(RolePO po);

    RolePO updateOne(RolePO po);

    Page<RolePO> findAll(Integer pageNumber);

    Page<RolePO> findAllByUserList(Integer pageNumber, Set<UserPO> userList);

}
