package com.example.cyjquery.service.auto;

import com.example.cyjcommon.entity.Sql;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface SqlService {

    Sql addOne(Sql po);

    void deleteOne(Sql po);

    Sql updateOne(Sql po);

    Page<Sql> findAll(Integer pageNumber);

}
