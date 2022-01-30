package com.example.cyjentitycreater.entity.custom.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class EntityCustomDTO implements Serializable {

    private String id;
    private String pid;
    private String propertyCode;
    private String propertyName;
    private String propertyType;
    private String propertyLabel;
    private String propertyWidth;
    private String propertyMode;
    private String propertyDirection;
    private String propertyRequired;
    private String propertyDataSourceType;
    private List<Map<String, String>> propertyDataSource;
    private String propertyDefaultValue;
    private String propertyDisplay;
    private String status;
    private String sortCode;

}