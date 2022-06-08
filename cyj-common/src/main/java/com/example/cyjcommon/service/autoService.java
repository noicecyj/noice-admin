package com.example.cyjcommon.service;

import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface autoService <T>{

    T addOne(T t);

    void deleteOne(T t);

    T updateOne(T t);

    Page<T> findAll(Integer pageNumber);

}
