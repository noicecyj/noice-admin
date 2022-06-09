package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.Authority;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 */
public interface AuthorityService {

    Set<String> authorityByRole(String role);

    void authoritySaveRole(String role, Set<String> authorityIds);

}
