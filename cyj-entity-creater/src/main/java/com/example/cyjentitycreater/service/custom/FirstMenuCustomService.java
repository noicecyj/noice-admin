package com.example.cyjentitycreater.service.custom;

import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import com.example.cyjentitycreater.entity.custom.dto.FirstMenuDTO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
public interface FirstMenuCustomService {

    void createMenu();

    List<FirstMenuDTO> getMenu();

}
