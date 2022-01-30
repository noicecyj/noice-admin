package com.example.cyjlog.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
@Data
public class AuthorityDTO implements Serializable {

    private String id;
    private String name;
    private String path;
    private Integer status;
    private String method;
    private String description;
    private String appApi;
    private String appService;
    private String version;
    private String sortCode;

}