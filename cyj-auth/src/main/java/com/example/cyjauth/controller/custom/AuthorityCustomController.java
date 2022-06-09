package com.example.cyjauth.controller.custom;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "Authority")
public class AuthorityCustomController {

}
