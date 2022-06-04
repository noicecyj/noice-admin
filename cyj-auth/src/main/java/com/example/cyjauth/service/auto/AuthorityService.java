package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 */
public interface AuthorityService {

    AuthorityPO addOne(AuthorityPO po);

    void deleteOne(AuthorityPO po);

    AuthorityPO updateOne(AuthorityPO po);

    Page<AuthorityPO> findAll(Integer pageNumber);

    Page<AuthorityPO> findAll(Integer pageNumber, AppServicePO appService);

    Page<AuthorityPO> findAll(Integer pageNumber, EntityPO entity);

    Page<AuthorityPO> findAllByUserList(Integer pageNumber, Set<String> userList);

    Page<AuthorityPO> findAllByRoleList(Integer pageNumber, Set<String> roleList);

}
