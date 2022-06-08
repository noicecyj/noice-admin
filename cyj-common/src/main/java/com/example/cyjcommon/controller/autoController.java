package com.example.cyjcommon.controller;

import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface autoController<T> {

    ResultVO page(@RequestParam("pageNumber") Integer pageNumber);

    ResultVO save(@RequestBody @Validated T t, BindingResult bindingResult);

    ResultVO delete(@RequestBody T t);

}
