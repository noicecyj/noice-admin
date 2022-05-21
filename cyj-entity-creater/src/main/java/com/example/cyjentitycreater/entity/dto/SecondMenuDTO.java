package com.example.cyjentitycreater.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-23
 */
@Data
public class SecondMenuDTO implements Serializable {

    private String id;
    private String menuCode;
    private String component;
    private String path;
    private String pid;
    private String menuName;

}