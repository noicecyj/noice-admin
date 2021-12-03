package com.example.cyjentitycreater.entity.auto.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class EntityVO implements Serializable {

        private String id;
        private String pid;
        private String propertyCode;
        private String propertyType;
        private String propertyLabel;
        private String propertyWidth;
        private String propertyMode;
        private String propertyDirection;
        private String propertyRequired;
        private String propertyDataSourceType;
        private String propertyDataSource;
        private String propertyDefaultValue;
        private String propertyDisplay;
        private Integer pageNumber;

}