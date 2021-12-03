package com.example.cyjentitycreater.entity.auto.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class EntityNameVO implements Serializable {

        private String id;
        private String appId;
        private String appName;
        private String entityName;
        private String entityCode;
        private String entityType;
        private Integer entityStatus;
        private Integer pageNumber;

}