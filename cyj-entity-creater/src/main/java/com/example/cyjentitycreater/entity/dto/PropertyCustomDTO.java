package com.example.cyjentitycreater.entity.dto;

import com.alibaba.fastjson2.JSONArray;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Noice
 */
@Data
public class PropertyCustomDTO implements Serializable {

    private String id;
    private String propertyCode;
    private String propertyName;
    private String propertyType;
    private String propertyLabel;
    private String propertyWidth;
    private String propertyMode;
    private String propertyDirection;
    private Boolean propertyRequired;
    private Boolean propertyOut;
    private String propertyOutType;
    private String propertyDataSourceType;
    private Boolean propertyEditEnable;
    private JSONArray propertyDataSource;
    private String propertyDefaultValue;
    private Boolean propertyDisplay;
    private String status;
    private String sortCode;

}