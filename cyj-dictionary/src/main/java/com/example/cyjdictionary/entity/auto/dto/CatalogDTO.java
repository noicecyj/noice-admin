package com.example.cyjdictionary.entity.auto.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Data
public class CatalogDTO implements Serializable {

        private String id;
        private String catalogName;
        private String description;
        private String catalogValue;
        private String sortCode;

}