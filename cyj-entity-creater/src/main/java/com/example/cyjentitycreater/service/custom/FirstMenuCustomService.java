package com.example.cyjentitycreater.service.custom;

import com.example.cyjentitycreater.entity.dto.FirstMenuDTO;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-20
 */
public interface FirstMenuCustomService {

    void createMenu();

    List<FirstMenuDTO> getMenu();

}
