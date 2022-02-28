package com.example.cyjentitycreater.entity.custom.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
@Data
public class FirstMenuDTO implements Serializable {

    private String id;
    private String path;
    private String menuCode;
    private String menuName;
    private String layout;
    private String icon;
    private List<SecondMenuDTO> secondMenuDTOList;

}