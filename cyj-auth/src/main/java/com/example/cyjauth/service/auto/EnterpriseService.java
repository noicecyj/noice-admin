package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.EnterprisePO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface EnterpriseService {

    EnterprisePO addOne(EnterprisePO po);

    void deleteOne(EnterprisePO po);

    EnterprisePO updateOne(EnterprisePO po);

    Page<EnterprisePO> findAll(Integer pageNumber);

}
