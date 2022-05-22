package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface AuthorityService {

    AuthorityPO addOne(AuthorityPO po);

    void deleteOne(AuthorityPO po);

    AuthorityPO updateOne(AuthorityPO po);

    Page<AuthorityPO> findAll(Integer pageNumber);

    Page<AuthorityPO> findAll(Integer pageNumber, EntityPO entity);

    Page<AuthorityPO> findAll(Integer pageNumber, AppServicePO appService);

    Page<AuthorityPO> findAll(Integer pageNumber, UserPO user);

    Page<AuthorityPO> findAll(Integer pageNumber, RolePO role);

}
