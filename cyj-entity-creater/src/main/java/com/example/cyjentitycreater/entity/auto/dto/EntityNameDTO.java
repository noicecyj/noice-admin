package com.example.cyjentitycreater.entity.auto.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class EntityNameDTO implements Serializable {

        private String id;
        private String pid;
        private String appId;
        private String entityName;
        private String entityCode;
        private String entityType;
        private String entityStatus;
        private String sortCode;

}