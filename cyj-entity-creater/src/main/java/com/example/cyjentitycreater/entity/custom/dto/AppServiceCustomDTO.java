package com.example.cyjentitycreater.entity.custom.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */

@Data
public class AppServiceCustomDTO implements Serializable {

        private String id;
        private String name;
        private String appApi;
        private String appPort;
        private String appPath;
        private String sortCode;
        private Integer pageNumber;

}