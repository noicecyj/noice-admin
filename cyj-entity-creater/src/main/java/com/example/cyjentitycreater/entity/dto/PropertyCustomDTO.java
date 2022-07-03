package com.example.cyjentitycreater.entity.dto;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
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