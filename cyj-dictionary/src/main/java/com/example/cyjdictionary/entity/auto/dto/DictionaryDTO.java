package com.example.cyjdictionary.entity.auto.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Data
public class DictionaryDTO implements Serializable {

        private String id;
        private String dictionaryName;
        private String dictionaryValue;
        private String pid;
        private String sortCode;

}