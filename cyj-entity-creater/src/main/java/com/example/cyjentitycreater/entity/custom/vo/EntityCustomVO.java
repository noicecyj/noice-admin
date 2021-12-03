package com.example.cyjentitycreater.entity.custom.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class EntityCustomVO implements Serializable {

        private String id;
        private String propertyCode;
        private String propertyType;
        private String propertyLabel;
        private String propertyWidth;
        private String propertyMode;
        private String propertyRequired;
        private String propertyDataSourceType;
        private String propertyDataSource;
        private String propertyDefaultValue;
        private Integer pageNumber;

}