package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface RoleService {

    RolePO addOne(RolePO po);

    void deleteOne(RolePO po);

    RolePO updateOne(RolePO po);

    Page<RolePO> findAll(Integer pageNumber);

    Page<RolePO> findAll(Integer pageNumber, UserPO user);

}
