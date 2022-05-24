package com.example.cyjquery.service.auto;

import com.example.cyjcommon.entity.po.SqlPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface SqlService {

    SqlPO addOne(SqlPO po);

    void deleteOne(SqlPO po);

    SqlPO updateOne(SqlPO po);

    Page<SqlPO> findAll(Integer pageNumber);

}
