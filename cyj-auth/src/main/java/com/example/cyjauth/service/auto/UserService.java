package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.Enterprise;
import com.example.cyjcommon.entity.User;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 */
public interface UserService {

    Page<User> findAll(Integer pageNumber, Enterprise enterprise);

}
